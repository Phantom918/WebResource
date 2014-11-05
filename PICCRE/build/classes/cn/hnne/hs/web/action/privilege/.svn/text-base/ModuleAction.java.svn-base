package cn.hnne.hs.web.action.privilege;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import cn.hnne.hs.common.PageStatus;
import cn.hnne.hs.model.privilege.Module;
import cn.hnne.hs.model.privilege.Privilege;
import cn.hnne.hs.service.privilege.impl.ModuleServiceImpl;
import cn.hnne.hs.service.privilege.impl.PrivilegeServiceImpl;

import com.opensymphony.xwork2.ActionSupport;

@Results({ @Result(name = "json", type = "json") })
public class ModuleAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	private ModuleServiceImpl moduleServiceImpl;
	@Autowired
	private PrivilegeServiceImpl privilegeServiceImpl;
	/**
	 * 模块信息集合
	 */
	private List<Module> modulesList;
	/**
	 * 父模块Id
	 */
	private Integer parentId;
	/**
	 * 模块名
	 */
	private String moduleName;
	/**
	 * 模块对象
	 */
	private Module module;
	/**
	 * 封装权限集合
	 */
	private List<Privilege> privileges;
	/**
	 * 模块编号
	 */
	private Integer moduleId;
	/**
	 * 标志字符串
	 */
	private String flag;
	/**
	 * 权限对象
	 */
	private Privilege privilege;
	/**
	 * 权限编号
	 */
	private String priId;
	/**
	 * 添加权限页面的隐藏域参数
	 */
	private String addModuleIdPanelName;
	/**
	 * 区分添加权限页面和修改权限页面标志 1:添加权限页面 2：修改权限页面
	 */
	private int fg;
	/**
	 * 网页状态标示
	 */
	private int pageStatus = 0;

	private String jsonModeles;
	/**
	 * 跳转至首页
	 * 
	 * @return
	 */
	public String manage() {
		//modulesList = moduleServiceImpl.findAll();
		jsonModeles = moduleServiceImpl.moduleZtree();
		if(moduleId == null){
			if(module != null &&module.getModuleId() != null){
				moduleId = module.getModuleId();
			}else{
				moduleId = -1;
			}
		}
		exsitPrivileges();
		log.debug(jsonModeles);
		return "manage";
	}

	/**
	 * Ajax请求获得指定父模块的子模块
	 * 
	 * @return
	 */
	public String getChildren() {
		// 查询指定父模块Id的模块信息
		modulesList = moduleServiceImpl.findByParentId(parentId);
		return "json";
	}

	/**
	 * Ajax添加一条模块信息
	 * 
	 * @return
	 */
	public String add() {
		int temp = 1;
		if(module.getModuleLayer() != null){
			temp = module.getModuleLayer() + 1;
		}
		module.setModuleLayer(temp);
		System.out.println(module);
		try {
			moduleServiceImpl.add(module);
			pageStatus = PageStatus.INSERT_SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			pageStatus = PageStatus.OPERATE_FAIL;
		}

		return manage();
	}

	/**
	 * 更新一个模块信息
	 * 
	 * @return
	 */
	public String update() {
		moduleId = module.getModuleId();
		// 需要更新的模块
		Module m = moduleServiceImpl.findById(moduleId);
		// 更新模块的名字（更新模块信息只能更改其模块名）
		m.setModuleName(module.getModuleName());
		try {
			moduleServiceImpl.update(m);
			// 更新成功状态
			pageStatus = PageStatus.UPDATE_SUCCESS;
		} catch (Exception e) {
			// 更新失败状态
			pageStatus = PageStatus.OPERATE_FAIL;
		}
		
		return manage();
	}

	/**
	 * 查询某个模块下的所有权限
	 * 
	 * @return
	 */
	public String exsitPrivileges() {
		privileges = privilegeServiceImpl.findPrivileges(moduleId);
		return "json";
	}

	/**
	 * 
	 * @return
	 */
	public String query() {
		// 查询所有的模块信息
		modulesList = moduleServiceImpl.findAll();
		// 查询指定模块下的权限信息
		privileges = privilegeServiceImpl.findPrivileges(moduleId);
		// 根据模块编号查询模块信息
		module = moduleServiceImpl.findModuleById(moduleId);
		return manage();
	}

	/**
	 * 添加一条权限
	 * 
	 * @param privilege
	 * @return
	 */
	public String addPrivilege() {
		// 将添加权限页面表单上传进来的参数模块编号转换成数值类型
		moduleId = Integer.parseInt(addModuleIdPanelName);
		// 查询所有的模块信息
		modulesList = moduleServiceImpl.findAll();
		// 指定模块下的所有权限
		privileges = privilegeServiceImpl.findPrivileges(moduleId);
		module = moduleServiceImpl.findById(moduleId);
		// 待添加的权限对象
		Privilege pri = new Privilege();
		pri.setModule(module);
		pri.setPrivilegeAction(privilege.getPrivilegeAction());
		pri.setPrivilegeName(privilege.getPrivilegeName());
		if (privileges.size() == 0) {
			// 模块下无权限的时候（即第一次添加权限）权限码设置为1
			pri.setPrivilegeCode(1);
		} else {
			// 当模块下已经存在权限时，权限码设置为2的n次方
			pri.setPrivilegeCode((int) Math.pow(2, privileges.size()));
		}
		try {
			privilegeServiceImpl.add(pri);
			// 添加成功后的状态码
			pageStatus = PageStatus.INSERT_SUCCESS;
		} catch (Exception e) {
			log.debug("action异常", e);
			// 添加失败后的状态码
			pageStatus = PageStatus.OPERATE_FAIL;
		}
		privileges = privilegeServiceImpl.findPrivileges(moduleId);
		return manage();
	}

	/**
	 * 删除权限
	 * 
	 * @return
	 */
	public String deletePrivilege() {
		// 待删除的权限编号（字符串）
		String[] str = priId.split(",");
		List<Integer> ids = new ArrayList<Integer>();
		// 转换成数值类型
		for (int i = 0; i < str.length; i++) {
			ids.add(Integer.parseInt(str[i]));
		}
		try {
			if (ids.size() == 1) {
				// 如果页面上删除的是单个权限
				privilegeServiceImpl.deleteSubjectPrivilege(ids.get(0));
				privilegeServiceImpl.delete(ids.get(0));
			} else {// 如果要删除的是多条权限
				privilegeServiceImpl.deleteSubjectPrivileges(ids);
				privilegeServiceImpl.delete(ids);
			}
			pageStatus = PageStatus.DELETE_SUCCESS;
		} catch (Exception e) {
			pageStatus = PageStatus.OPERATE_FAIL;
		}
		modulesList = moduleServiceImpl.findAll();
		privileges = privilegeServiceImpl.findPrivileges(moduleId);
		module = moduleServiceImpl.findById(moduleId);
		
		return manage();
	}

	/**
	 * Ajax判断父节点下是否有子节点或者权限
	 * 
	 * @return
	 */
	public String isDelete() {
		flag = "false";
		List<Module> list = moduleServiceImpl.findByParentId(moduleId);
		privileges = privilegeServiceImpl.findPrivileges(moduleId);
		if ((list != null && list.size() != 0 )||( privileges != null
				&& privileges.size() != 0)) {
			// 模块下还有子模块或者还有权限
			flag = "true";
		} else {
			flag = "false";
		}
		return "json";
	}

	/**
	 * 删除某个模块和子模块以及这些模块下的所有的权限
	 * 
	 * @return
	 */
	public String delete() {
		try {
			privilegeServiceImpl.deleteSubPriByModuleId(moduleId);
			moduleServiceImpl.delete(moduleId);
			pageStatus = PageStatus.DELETE_SUCCESS;
		} catch (Exception e) {
			log.debug("action层异常:",e);
			pageStatus = PageStatus.OPERATE_FAIL;
		}
		return manage();
	}

	/**
	 * 更新权限
	 * 
	 * @return
	 */
	public String updatePrivilege() {
		privilege.setModule(module);
		try {
			privilegeServiceImpl.updatePrivilege(privilege);
			pageStatus = PageStatus.UPDATE_SUCCESS;
		} catch (Exception e) {
			pageStatus = PageStatus.OPERATE_FAIL;
		}

		privileges = privilegeServiceImpl.findPrivileges(module.getModuleId());
		modulesList = moduleServiceImpl.findAll();
		module = moduleServiceImpl.findById(module.getModuleId());
		return manage();
	}

	/**
	 * 查询权限路径是否重复(用于修改权限和添加权限页面验证)
	 * 
	 * @return
	 * @throws IOException
	 */
	public void actionIsEqual() throws IOException {
		flag = "true";

		privileges = privilegeServiceImpl.findPrivileges(moduleId);
		HttpServletResponse response = ServletActionContext.getResponse();
		PrintWriter writer = response.getWriter();
		if (fg == 1) {// 如果是添加权限页面，需要将权限路径和查询到的所有权限的权限路径进行对比
			for (int i = 0; i < privileges.size(); i++) {
				String priAction = privileges.get(i).getPrivilegeAction();
				if (priAction.equals(privilege.getPrivilegeAction())) {
					flag = "false";
				}
			}
		} else {// 如果是修改权限页面，不能和所有的权限路径进行对比
			int tempId = Integer.parseInt(priId);
			for (int i = 0; i < privileges.size(); i++) {
				if (tempId != privileges.get(i).getPrivilegeId()) {
					String priAction = privileges.get(i).getPrivilegeAction();
					if (priAction.equals(privilege.getPrivilegeAction())) {
						flag = "false";
					}
				}
			}
		}
		writer.print(flag);
		writer.flush();
		writer.close();
	}

	public int getFg() {
		return fg;
	}

	public void setFg(int fg) {
		this.fg = fg;
	}

	public int getPageStatus() {
		return pageStatus;
	}

	public void setPageStatus(int pageStatus) {
		this.pageStatus = pageStatus;
	}

	public String getAddModuleIdPanelName() {
		return addModuleIdPanelName;
	}

	public void setAddModuleIdPanelName(String addModuleIdPanelName) {
		this.addModuleIdPanelName = addModuleIdPanelName;
	}

	public String getPriId() {
		return priId;
	}

	public void setPriId(String priId) {
		this.priId = priId;
	}

	public List<Module> getModulesList() {
		return modulesList;
	}

	public void setModulesList(List<Module> modulesList) {
		this.modulesList = modulesList;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public List<Privilege> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(List<Privilege> privileges) {
		this.privileges = privileges;
	}

	public Integer getModuleId() {
		return moduleId;
	}

	public void setModuleId(Integer moduleId) {
		this.moduleId = moduleId;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public Privilege getPrivilege() {
		return privilege;
	}

	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;
	}

	public String getJsonModeles() {
		return jsonModeles;
	}
	
}

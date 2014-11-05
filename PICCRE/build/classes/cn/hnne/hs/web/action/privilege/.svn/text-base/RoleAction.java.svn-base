package cn.hnne.hs.web.action.privilege;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import cn.hnne.hs.common.PageStatus;
import cn.hnne.hs.model.privilege.Role;
import cn.hnne.hs.model.user.UserBasic;
import cn.hnne.hs.service.privilege.RoleService;
import cn.hnne.pagination.Page;
import cn.hnne.pagination.PageContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 角色管理
 * 
 * @author 马周易
 * 
 */
@Results({ @Result(name = "json", type = "json") })
@SuppressWarnings({ "unchecked", "rawtypes" })
public class RoleAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Autowired
	private RoleService roleService;
	
	//@Autowired
	//private OrganizationService organizationService;

	/**
	 * 角色集合，用于显示所有角色
	 */
	private List<Role> roles;

	/**
	 * 用于获取表单
	 */
	private Role role;

	/**
	 * 选中的主键拼接的字符串，用于批量删除
	 */
	private String ids;

	/**
	 * 获取指定角色的用户集合
	 */
	private List<UserBasic> users;

	/**
	 * 网页状态标示
	 */
	private int pageStatus = 0;
	
	private String flag;
	
	//private List<Org> orgList ;

	/**
	 * 进入角色管理页面
	 */
	public String manage() {
		// 查询出所有角色
		roles = roleService.findAll();
		System.out.println("roles = "+roles.size());
		return "manage";
	}
	/**
	 * Ajax查询所有的角色信息
	 * @return
	 */
	public String checkRole(){
		System.out.println("查询用户的橘色...");
		try {
			roles = roleService.findAll();
			//orgList = organizationService.selectAllCityOrg();
			flag = "true";
			System.out.println("roles = "+roles.size());
		} catch (Exception e) {
			e.printStackTrace();
			flag = "false";
		}
		
		return "json";
	}

	/**
	 * 添加角色
	 */
	public String add() {
		System.out.println("addRole.......");
		try {
			roleService.add(role);
			pageStatus = PageStatus.INSERT_SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			pageStatus = PageStatus.OPERATE_FAIL;
		}
		System.out.println("pageStatus =============== "+pageStatus);
		return manage();
	}

	/**
	 * 批量删除角色
	 */
	public String batchDelete() {
		try {
			// 把要删除的角色ID的字符串解析成整数集合
			List<Integer> roleIds = new ArrayList<Integer>();
			for (String id : ids.split(",")) {
				roleIds.add(Integer.parseInt(id));
			}
			roleService.delete(roleIds);
			pageStatus = PageStatus.DELETE_SUCCESS;
		} catch (Exception e) {
			pageStatus = PageStatus.OPERATE_FAIL;
		}
		return manage();
	}

	/**
	 * 删除一个角色
	 */
	public String delete() {
		try {
			roleService.delete(role.getRoleId());
			pageStatus = PageStatus.DELETE_SUCCESS;
		} catch (Exception e) {
			pageStatus = PageStatus.OPERATE_FAIL;
		}
		return manage();
	}

	/**
	 * 修改角色
	 */
	public String update() {
		try {
			roleService.update(role);
			pageStatus = PageStatus.UPDATE_SUCCESS;
		} catch (Exception e) {
			pageStatus = PageStatus.OPERATE_FAIL;
		}
		return manage();
	}

	/**
	 * 获取未分配给该角色的所有用户并进入已分配页面
	 */
	public String existUsers() {
		Page page = PageContext.getPage();
		Map<String, Object> para = new HashMap<String, Object>();
		para.put("role.roleId", role.getRoleId());
		para.put("role.roleName", role.getRoleName());
		page.setPara(para);
		users = roleService.findUsersByRoleByPage(role.getRoleId());
		return "yuser";
	}

	/**
	 * 获取未分配给该角色的所有用户并进入未分配页面
	 */
	public String nonexistentUsers() {
		Page page = PageContext.getPage();
		Map<String, Object> para = new HashMap<String, Object>();
		para.put("role.roleId", role.getRoleId());
		para.put("role.roleName", role.getRoleName());
		page.setPara(para);
		users = roleService.findUsersByNoRole(role.getRoleId());
		return "nuser";
	}

	/**
	 * 批量给用户分配角色
	 */
	public String assign() {
		// 把要分配给指定的角色的用户ID的字符串解析成整数集合
		List<Integer> userIds = new ArrayList<Integer>();
		for (String id : ids.split(",")) {
			userIds.add(Integer.parseInt(id));
		}
		roleService.assign(userIds, role.getRoleId());
		pageStatus = PageStatus.ASSIGN_SUCCESS;
		return nonexistentUsers();
	}

	/**
	 * 批量取消分配指定角色的用户
	 */
	public String disassign() {
		// 把要取消分配给指定的角色的用户ID的字符串解析成整数集合
		List<Integer> userIds = new ArrayList<Integer>();
		for (String id : ids.split(",")) {
			userIds.add(Integer.parseInt(id));
		}
		roleService.disassign(userIds, role.getRoleId());
		pageStatus = PageStatus.CANCEL_ASSIGN;
		return existUsers();
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Role getRole() {
		return role;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	public List<UserBasic> getUsers() {
		return users;
	}

	public int getPageStatus() {
		return pageStatus;
	}
	
	public String getFlag() {
		return flag;
	}
	
	public void setFlag(String flag) {
		this.flag = flag;
	}
	
//	public List<Org> getOrgList() {
//		return orgList;
//	}
//	
//	public void setOrgList(List<Org> orgList) {
//		this.orgList = orgList;
//	}
	
	
	
}
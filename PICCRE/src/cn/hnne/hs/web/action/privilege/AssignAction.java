package cn.hnne.hs.web.action.privilege;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;
import org.springframework.beans.factory.annotation.Autowired;

import cn.hnne.hs.model.privilege.Group;
import cn.hnne.hs.model.privilege.Module;
import cn.hnne.hs.model.privilege.Role;
import cn.hnne.hs.model.user.UserBasic;
import cn.hnne.hs.service.privilege.GroupService;
import cn.hnne.hs.service.privilege.ModuleService;
import cn.hnne.hs.service.privilege.PrivilegeService;
import cn.hnne.hs.service.privilege.RoleService;
import cn.hnne.hs.service.user.impl.UserServiceImpl;

import com.opensymphony.xwork2.ActionSupport;

@Results({
		@Result(name = "jsonType", type = "json"),
		@Result(name = "redirectName", location = "group!manage.action", type = "redirectAction") })
public class AssignAction extends ActionSupport implements ServletRequestAware,
		SessionAware, ServletContextAware {

	Logger log = Logger.getLogger(getClass());
	private static final long serialVersionUID = 5300996109295181562L;

	@Autowired
	private ModuleService moduleServiceImpl;

	@Autowired
	private PrivilegeService privilegeServiceImpl;

	@Autowired
	private RoleService roleServiceImpl;

	@Autowired
	private GroupService groupServiceImpl;

	// 用于封装主体ID
	private Integer objectId;
	
	// 用于封装主体的名字
	private String objectName;
	
	// 用于封装主体类型
	private Integer objectType;

	// 用于封装主体类型的名字
	private String objectTypeName;

	// 所有的权限信息存入application级会话中
	@SuppressWarnings("unused")
	private ServletContext application;

	// 接受前台的已经选择的权限
	private String checkedAuthorityString;

	/**
	 * 用户集合
	 */
	private List<UserBasic> userList;

	/**
	 * 角色集合
	 */
	private List<Role> roleList;

	/**
	 * 组集合
	 */
	private List<Group> groupList;

	/**
	 * 整个树的模块的集合
	 */
	private List<Module> moduleList;

	/**
	 * 机图某个对象的模块的集合
	 */
	private List<Module> someModuleList;

	// 成功与否的标志位
	private int flag = 1;

	/**
	 * 查询出所有的用户信息
	 * @return String
	 */
	public String manage() {
		userList = userServiceImpl.findActiveAll();
		return "userMessage";
	}

	/**
	 * 生成用户模块的权限信息，（因为要配合权限系统的使用，每个请求都必须有不同的路径，所以经原先的通用方法复制为3份）
	 * @return String
	 */
	public String createPrivilegeMessage1() {
//		Object obj=application.getAttribute("moduleListApplication");
//		if(obj==null)
//		{
			moduleList = moduleServiceImpl.findMoudleWithPriilege();
//			// 将全部的权限信息，送入application级会话中
//			application.setAttribute("moduleListApplication", moduleList);
//		}
		return "privilegeAssign";
	}

	/**
	 * 生成角色模块的权限信息
	 * @return String
	 */
	public String createPrivilegeMessage2() {
		//查询出模块信息
		moduleList = moduleServiceImpl.findMoudleWithPriilege();
		return "privilegeAssign";
	}

	/**
	 * 生成用户组模块的权限信息
	 * @return String
	 */
	public String createPrivilegeMessage3() {
		
		moduleList = moduleServiceImpl.findMoudleWithPriilege();
		return "privilegeAssign";
	}

	/**
	 * 查询出指定对象的权限信息
	 * @return json
	 */
	public String findAuthorityByID() {
		try{
		someModuleList = moduleServiceImpl.findSomeoneMoudleCode(objectType,objectId);
		}catch(Exception e){
			log.debug("询出指定对象的权限信息异常：",e);
		}
		return "jsonType";
	}

	/**
	 * 查询出指定对象的权限信息,（因为要配合权限系统的使用，每个请求都必须有不同的路径，所以经原先的通用方法复制为3份）
	 * @return json
	 */
	public String saveObjectAuthority1() {
		// 分割传过来的数据,并存入list
		String[] checkedAuthorityId = checkedAuthorityString.split(",");
		// 需要添加的id
		List<Integer> addAuthorityIdLsit = new ArrayList<Integer>();
		// 需要删除的的id
		List<Integer> deleteAuthorityIdLsit = new ArrayList<Integer>();
		// 为避免万一，清除原有数据
		addAuthorityIdLsit.clear();
		deleteAuthorityIdLsit.clear();
		// 把传过来字符串转换成List<Integer>，斌存入临时List tempCheckedId
		if(!checkedAuthorityId[0].equals("")){
			for (String temp : checkedAuthorityId) {
				addAuthorityIdLsit.add(Integer.valueOf(temp));
			}
		}
		
		// addAuthorityIdLsit=tempCheckedId;
		// 查询出某个对象的所有权限id
		List<Integer> listPrivilege = privilegeServiceImpl.findSomeonePrivileges(objectType, objectId);
		for (int i = 0; i < listPrivilege.size(); i++) {
			deleteAuthorityIdLsit.add(listPrivilege.get(i));
		}
		// System.out.println("当前传入的数据=="+Arrays.toString(checkedAuthorityId)+"尺寸==="+checkedAuthorityId.length);
		// System.out.println("当前已经存在的数据=="+listPrivilege+"尺寸==="+listPrivilege.size());
		// 整理出需要添加的权限，以及需要删除的权限
		for (int i = addAuthorityIdLsit.size() - 1; i >= 0; i--) {
			for (int j = deleteAuthorityIdLsit.size() - 1; j >= 0; j--) {
				if (addAuthorityIdLsit.get(i).equals(deleteAuthorityIdLsit.get(j))) {
					addAuthorityIdLsit.remove(i);
					deleteAuthorityIdLsit.remove(j);
					break;
				}
			}
		}
		// System.out.println("需要添加的数据===="+addAuthorityIdLsit);
		// System.out.println("需要删除的数据===="+deleteAuthorityIdLsit);
		try {
			//进行添加与删除操作
			privilegeServiceImpl.deleteWithAddPrivileges(objectType, objectId, addAuthorityIdLsit, deleteAuthorityIdLsit);
		} catch (Exception e) {
			e.printStackTrace();
			//操作失败赋予状态码
			flag = 2;
		}
		return "jsonType";	
		}

	/**
	 * 查询出指定对象的权限信息
	 * @return json
	 */
	public String saveObjectAuthority2() {
		// 分割传过来的数据,并存入list
		String[] checkedAuthorityId = checkedAuthorityString.split(",");
		// 需要添加的id
		List<Integer> addAuthorityIdLsit = new ArrayList<Integer>();
		// 需要删除的的id
		List<Integer> deleteAuthorityIdLsit = new ArrayList<Integer>();
		// 清除原有数据
		addAuthorityIdLsit.clear();
		deleteAuthorityIdLsit.clear();
		// 把传过来字符串转换成List<Integer>，斌存入临时List tempCheckedId
		if(!checkedAuthorityId[0].equals("")){
			for (String temp : checkedAuthorityId) {
				addAuthorityIdLsit.add(Integer.valueOf(temp));
			}
		}
		// 查询出某个对象的所有权限id
		List<Integer> listPrivilege = privilegeServiceImpl.findSomeonePrivileges(objectType, objectId);
		for (int i = 0; i < listPrivilege.size(); i++) {
			deleteAuthorityIdLsit.add(listPrivilege.get(i));
		}
		// System.out.println("当前传入的数据=="+Arrays.toString(checkedAuthorityId)+"尺寸==="+checkedAuthorityId.length);
		// System.out.println("当前已经存在的数据=="+listPrivilege+"尺寸==="+listPrivilege.size());
		// 整理出需要添加的权限，以及需要删的权限
		for (int i = addAuthorityIdLsit.size() - 1; i >= 0; i--) {
			for (int j = deleteAuthorityIdLsit.size() - 1; j >= 0; j--) {
				if (addAuthorityIdLsit.get(i).equals(deleteAuthorityIdLsit.get(j))) {
					addAuthorityIdLsit.remove(i);
					deleteAuthorityIdLsit.remove(j);
					break;
				}
			}
		}
		// System.out.println("需要添加的数据===="+addAuthorityIdLsit);
		// System.out.println("需要删除的数据===="+deleteAuthorityIdLsit);
		try {
			//进行添加与删除操作
			privilegeServiceImpl.deleteWithAddPrivileges(objectType, objectId,addAuthorityIdLsit, deleteAuthorityIdLsit);
		} catch (Exception e) {
			e.printStackTrace();
			flag = 2;
		}
		return "jsonType";
	}

	/**
	 * 查询出指定对象的权限信息
	 * @return json
	 */
	public String saveObjectAuthority3() {
		// 分割传过来的数据,并存入list
		String[] checkedAuthorityId = checkedAuthorityString.split(",");
		// 需要添加的id
		List<Integer> addAuthorityIdLsit = new ArrayList<Integer>();
		// 需要删除的的id
		List<Integer> deleteAuthorityIdLsit = new ArrayList<Integer>();
		// 清除原有数据
		addAuthorityIdLsit.clear();
		deleteAuthorityIdLsit.clear();
		// 把传过来字符串转换成List<Integer>，斌存入临时List tempCheckedId
		if(!checkedAuthorityId[0].equals("")){
			for (String temp : checkedAuthorityId) {
				addAuthorityIdLsit.add(Integer.valueOf(temp));
			}
		}
		// 查询出某个对象的所有权限id
		System.out.println("查询出权限id");
		List<Integer> listPrivilege = privilegeServiceImpl.findSomeonePrivileges(objectType, objectId);
		for (int i = 0; i < listPrivilege.size(); i++) {
			deleteAuthorityIdLsit.add(listPrivilege.get(i));
		}
		//System.out.println("当前传入的数据=="+Arrays.toString(checkedAuthorityId)+"尺寸==="+checkedAuthorityId.length);
		//System.out.println("当前已经存在的数据=="+listPrivilege+"尺寸==="+listPrivilege.size());
		// 整理出需要添加的权限，以及需要删的权限
		for (int i = addAuthorityIdLsit.size() - 1; i >= 0; i--) {
			for (int j = deleteAuthorityIdLsit.size() - 1; j >= 0; j--) {
				if (addAuthorityIdLsit.get(i).equals(deleteAuthorityIdLsit.get(j))) {
					addAuthorityIdLsit.remove(i);
					deleteAuthorityIdLsit.remove(j);
					break;
				}
			}
		}
		//System.out.println("需要添加的数据===="+addAuthorityIdLsit);
		//System.out.println("需要删除的数据===="+deleteAuthorityIdLsit);
		try {
			//进行添加与删除操作
			privilegeServiceImpl.deleteWithAddPrivileges(objectType, objectId,addAuthorityIdLsit, deleteAuthorityIdLsit);
		} catch (Exception e) {
			e.printStackTrace();
			flag = 2;
		}
		return "jsonType";
	}

	/**
	 *  查询出所有的用户信息
	 * @return json
	 */
	public String findAllUser() {
		//查出所有的用户信息
		userList = userServiceImpl.findActiveAll();
		return "userMessage";
	}

	// 查询出所有的角色信息
	public String findAllRole() {
		//查出所有的角色信息
		roleList = roleServiceImpl.findAllRole();
		System.out.println(roleList);
		return "roleMessage";
	}

	// 查询出所有的用户组信息
	public String findAllGroup() {
		//查出所有的用户组信息
		groupList = groupServiceImpl.findAllGroup();
		return "groupMessage";
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getCheckedAuthorityString() {
		return checkedAuthorityString;
	}

	public void setCheckedAuthorityString(String checkedAuthorityString) {
		this.checkedAuthorityString = checkedAuthorityString;
	}

	public String getObjectTypeName() {
		return objectTypeName;
	}

	public void setObjectTypeName(String objectTypeName) {
		this.objectTypeName = objectTypeName;
	}

	public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public List<Module> getSomeModuleList() {
		return someModuleList;
	}

	public void setSomeModuleList(List<Module> someModuleList) {
		this.someModuleList = someModuleList;
	}

	public List<Module> getModuleList() {
		return moduleList;
	}

	public void setModuleList(List<Module> moduleList) {
		this.moduleList = moduleList;
	}

	@Autowired
	private UserServiceImpl userServiceImpl;// 用户service实现对象

	public List<UserBasic> getUserList() {
		return userList;
	}

	public void setUserList(List<UserBasic> userList) {
		this.userList = userList;
	}

	public List<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}

	public List<Group> getGroupList() {
		return groupList;
	}

	public void setGroupList(List<Group> groupList) {
		this.groupList = groupList;
	}

	public Integer getObjectType() {
		return objectType;
	}

	public void setObjectType(Integer objectType) {
		this.objectType = objectType;
	}

	public Integer getObjectId() {
		return objectId;
	}

	public void setObjectId(Integer objectId) {
		this.objectId = objectId;
	}

	
	public void setServletContext(ServletContext application) {
		this.application = application;
	}

	
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub

	}

	
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub

	}

}

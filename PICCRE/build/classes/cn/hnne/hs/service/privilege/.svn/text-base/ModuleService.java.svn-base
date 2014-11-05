package cn.hnne.hs.service.privilege;

import java.util.List;

import cn.hnne.hs.model.privilege.Module;
import cn.hnne.hs.model.privilege.Privilege;
import cn.hnne.hs.model.user.UserBasic;
import cn.hnne.hs.service.BaseService;

/**
 * 模块管理业务逻辑接口
 * @author 马周易
 *
 */
public interface ModuleService extends BaseService<Module, Integer> {
	
	/**
	 * 查询所有模块权限
	 */
	List<Module> findModules();
	
	/**
	 * 查询所有用户
	 */
	List<UserBasic> findUsers();
	
	/**
	 * 查询指定用户的所有模块权限
	 * @param userId 用户ID
	 */
	List<Module> findModulesByUser(Integer userId);
	
	/**
	 * 添加用户权限
	 */
	void addUserPrivileges(List<Privilege> privileges, int id);
	
	/**
	 * 查询所有角色
	 */
	List<UserBasic> findRoles();
	
	/**
	 * 查询指定角色的所有模块权限
	 * @param roleId 角色ID
	 */
	List<Module> findModulesByRole(Integer roleId);
	
	/**
	 * 添加角色权限
	 */
	void addRolePrivileges(List<Privilege> privileges, int id);
	
	/**
	 * 查询所有用户组
	 */
	List<UserBasic> findGroups();
	
	/**
	 * 查询指定用户组的模块权限
	 * @param groupId 用户组ID
	 */
	List<Module> findModulesByGroup(Integer groupId);
	
	/**
	 * 添加用户组权限
	 */
	void addGroupPrivileges(List<Privilege> privileges, int id);
	

	/**
	 * 查询出所有模块，和其子模块，以及各模块所包含的多种权限
	 * @return List<Module>
	 */
	public List<Module> findMoudleWithPriilege();
	
	
	/**
	 * 查询出某个对象下的模块，以及每个模块下的对应的权限码
	 */
	public List<Module> findSomeoneMoudleCode(int subjectType,int subjectValue);
	
	/**
	 * 查询带模块动作的所有模块
	 */
	List<Module> getAllModules();
	
	/**
	 * 获取模块的ztree树
	 * @return
	 */
	public String moduleZtree();
}

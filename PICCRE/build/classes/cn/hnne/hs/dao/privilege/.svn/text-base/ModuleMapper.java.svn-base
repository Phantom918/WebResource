package cn.hnne.hs.dao.privilege;

import java.util.List;

import cn.hnne.hs.dao.BaseDao;
import cn.hnne.hs.model.privilege.Module;
import cn.hnne.hs.model.privilege.Privilege;
import cn.hnne.hs.model.user.UserBasic;


/**
 * 模块实体映射器接口
 * @author 马周易
 *
 */
public interface ModuleMapper extends BaseDao<Module, Integer> {
	
	/**
	 * 获得指定用户的指定角色的所有模块
	 * @param userId 用户ID
	 * @param roleId 角色ID
	 */
	List<Module> getModules(int userId, int roleId);
	
	List<Module> getUserModules(int userId);
	
	List<Module> getRoleModules(int userId);
	
	List<Module> getGroupModules(int userId);
	
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
	 * 根据父Id查询模块信息
	 */
	List<Module> findByParentId(Integer parentId);
	/**
	 * 根据模块Id查询模块信息
	 * @param id
	 * @return 
	 */
	Module findModuleById(int moduleId);
	/**
	 * 删除指定的模块
	 */
	void deleteById(Integer priId);
	/**
	 * 批量删除模块
	 * @param listId
	 */
	void deleteList(List<Integer> listId);
	/**
	 * 查询出某个用户下的模块，以及每个模块下的对应的权限码
	 */
	List<Module> findSomeoneModulePrivilegesCode(int subjectType,int subjectValue);
	
	/**
	 * 查询带模块动作的所有模块
	 */
	List<Module> getAllModules();
}

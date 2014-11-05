package cn.hnne.hs.service.privilege;

import java.util.List;
import java.util.Map;

import cn.hnne.hs.model.privilege.Role;
import cn.hnne.hs.model.user.UserBasic;
import cn.hnne.hs.service.BaseService;

/**
 * 角色管理业务逻辑接口
 * @author 马周易
 *
 */
public interface RoleService extends BaseService<Role, Integer> {
	
	/**
	 * 批量指派用户给角色
	 * @param userIds 用户的ID的集合
	 * @param roleId 角色的ID
	 */
	void assign(List<Integer> userIds, int roleId);
	
	/**
	 * 取消指派给指定角色的用户
	 * @param userIds 用户ID的集合
	 * @param roleId 角色ID
	 */
	void disassign(List<Integer> userIds, int roleId);
	
	/**
	 * 查询指定角色的所有用户
	 * @param roleId 角色ID
	 */
	List<UserBasic> findUsersByRole(int roleId);
	
	/**
	 * 查询不属于指定角色的所有用户，用于分配用户角色
	 * @param roleId 角色ID
	 */
	List<UserBasic> findUsersByNoRole(int roleId);
	
	/**
	 * 查询属于指定角色的所有用户，用于分配用户角色，带分页的
	 * @param roleId
	 * @return
	 */
	List<UserBasic> findUsersByRoleByPage(int roleId);
	
	/**
	 * 查询出所有的角色信息
	 */
	List<Role> findAllRole();
	/**
	 * 根据角色名查询角色编号
	 * @param roleName
	 * @return
	 */
	int selectIdByRoleName(String roleName);
	
	/**
	 * 按用户ID查询角色
	 * @param userId 用户ID
	 * @return 指定用户ID的角色集合
	 */
	List<Role> findByUserId(int userId);
	
	void updateUR(Map<String, Integer> map);
	
}

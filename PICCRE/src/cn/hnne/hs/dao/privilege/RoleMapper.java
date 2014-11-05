package cn.hnne.hs.dao.privilege;

import java.util.List;
import java.util.Map;

import cn.hnne.hs.dao.BaseDao;
import cn.hnne.hs.model.privilege.Role;
import cn.hnne.hs.model.user.UserBasic;
import cn.hnne.pagination.mybatis.annotation.Pagination;


/**
 * 角色映射器接口
 * @author 马周易
 *
 */
public interface RoleMapper extends BaseDao<Role, Integer> {
	
	/**
	 * 批量指派角色给用户,实质上是批量添加到关联表
	 * @param para 参数集合。key为roleId时，为角色ID，
	 * key为userIds时，为用户ID的List集合
	 */
	void assign(Map<String, Object> para);
	
	/**
	 * 查询指定角色的所有用户
	 * @param roleId 角色ID
	 */
	List<UserBasic> findUsersByRole(int roleId);
	
	/**
	 * 查询不属于指定角色的所有用户，用于分配用户角色
	 * @param roleId 角色ID
	 */
	@Pagination
	List<UserBasic> findUsersByNoRole(int roleId);

	/**
	 * 批量取消指派给指定角色的用户,实质上是批量删除用户角色关联表的数据
	 * @param para 参数集合。key为roleId时，为角色ID，
	 * key为userIds时，为用户ID的List集合
	 */
	void disassign(Map<String, Object> para);
	
	/**
	 * 查询出所有的角色信息
	 */
	@Pagination
	List<Role> findAllRole();
	
	/**
	 * 批量删除指定角色ID的用户-角色关联数据
	 */
	void deleteUserRole(List<Integer> roleIds);
	
	/**
	 * 批量删除角色权限
	 */
	void deleteRolePrivilege(List<Integer> roleIds);
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
	
	/**
	 * 查询该角色下的所有用户的所有信息
	 * @param roleId 角色编号
	 * @return 用户集合
	 */
	List<UserBasic>findUserApendsByRole(int roleId);
	
	/**
	 * 根据用户名和角色id 查询该用户的信息
	 * @param para roleId:角色id name：用户名
	 * @return
	 */
	List<UserBasic>findUserApendsByRoleOnName(Map<String,String> para);

	/**
	 * 分页查询指定角色用户
	 * @param roleId
	 * @return
	 */
	@Pagination
	List<UserBasic> findUsersByRoleByPage(int roleId);
	
	void updateUR(Map<String, Integer> map);
	
}

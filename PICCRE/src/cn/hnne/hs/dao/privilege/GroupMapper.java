package cn.hnne.hs.dao.privilege;

import java.util.List;
import java.util.Map;

import cn.hnne.hs.dao.BaseDao;
import cn.hnne.hs.model.privilege.Group;
import cn.hnne.hs.model.user.UserBasic;
import cn.hnne.pagination.mybatis.annotation.Pagination;


/**
 * 组映射器接口
 * @author 马周易
 *
 */
public interface GroupMapper extends BaseDao<Group, Integer> {
	
	/**
	 * 批量指派用户组给用户,实质上是批量添加到关联表
	 * @param para 参数集合。key为groupId时，为用户组ID，
	 * key为userIds时，为用户ID的List集合
	 */
	void assign(Map<String, Object> para);
	
	/**
	 * 查询指定用户组的所有用户
	 * @param groupId 用户组ID
	 */
	@Pagination
	List<UserBasic> findUsersByGroup(int groupId);
	
	/**
	 * 查询不属于指定用户组的所有用户，用于分配用户用户组
	 * @param groupId 用户组ID
	 */
	@Pagination
	List<UserBasic> findUsersByNoGroup(int groupId);

	/**
	 * 批量取消指派给指定用户组的用户,实质上是批量删除用户用户组关联表的数据
	 * @param para 参数集合。key为groupId时，为用户组ID，
	 * key为userIds时，为用户ID的List集合
	 */
	void disassign(Map<String, Object> para);
	
	/**
	 * 查询指定父组的所有子组
	 * @param parentId 父组ID
	 */
	List<Group> findByParent(Integer parentId);

	/**
	 * 删除树状结构用户组
	 * @param groupId 根节点ID
	 */
	void deleteTree(int groupId);
	
	/**
	 * 查询所有的用户组
	 */
	@Pagination
	List<Group> findAllGroup();
	
	/**
	 * 批量删除指定用户组ID的用户-用户组关联数据
	 */
	void deleteUserGroup(List<Integer> groupIds);
	
	/**
	 * 批量删除用户组权限
	 */
	void deleteGroupPrivilege(List<Integer> groupIds);
}

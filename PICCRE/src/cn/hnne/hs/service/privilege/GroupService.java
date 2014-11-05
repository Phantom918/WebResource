package cn.hnne.hs.service.privilege;

import java.util.List;

import cn.hnne.hs.model.privilege.Group;
import cn.hnne.hs.model.user.UserBasic;
import cn.hnne.hs.service.BaseService;

/**
 * 组管理业务逻辑接口
 * @author 马周易
 *
 */
public interface GroupService extends BaseService<Group, Integer> {
	
	/**
	 * 批量指派用户给用户组
	 * @param userIds 用户的ID的集合
	 * @param groupId 用户组的ID
	 */
	void assign(List<Integer> userIds, int groupId);
	
	/**
	 * 取消指派给指定用户组的用户
	 * @param userIds 用户ID的集合
	 * @param groupId 用户组ID
	 */
	void disassign(List<Integer> userIds, int groupId);
	
	/**
	 * 查询指定用户组的所有用户
	 * @param groupId 用户组ID
	 */
	List<UserBasic> findUsersByGroup(int groupId);
	
	/**
	 * 查询不属于指定用户组的所有用户，用于分配用户用户组
	 * @param groupId 用户组ID
	 */
	List<UserBasic> findUsersByNoGroup(int groupId);
	
	/**
	 * 查询指定父组的所有子组
	 * @param parentId 父组ID
	 */
	List<Group> findByParent(Integer parentId);
	/**
	 * 查询所有的用户组
	 */
	List<Group> findAllGroup();
}

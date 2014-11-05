package cn.hnne.hs.service.privilege.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hnne.hs.dao.privilege.GroupMapper;
import cn.hnne.hs.model.privilege.Group;
import cn.hnne.hs.model.user.UserBasic;
import cn.hnne.hs.service.privilege.GroupService;

/**
 * 组管理业务逻辑实现类
 * @author 马周易
 *
 */
@Service
public class GroupServiceImpl implements GroupService {
	
	@Autowired
	private GroupMapper groupMapper;

	
	public void add(Group group) {
		groupMapper.add(group);
	}

	
	public void delete(Integer groupId) {
		List<Integer> groupIds = new ArrayList<Integer>();
		groupIds.add(groupId);
		
		// 删除用户-用户组关联表数据
		groupMapper.deleteUserGroup(groupIds);
		// 删除用户组权限
		groupMapper.deleteGroupPrivilege(groupIds);
		
		groupMapper.delete(groupId);
	}

	
	public void delete(List<Integer> groupIds) {
		// 删除用户-用户组关联表数据
		groupMapper.deleteUserGroup(groupIds);
		// 删除用户组权限
		groupMapper.deleteGroupPrivilege(groupIds);
		
		groupMapper.deleteList(groupIds);
	}

	
	public void assign(List<Integer> userIds, int groupId) {
		Map<String, Object> para = new HashMap<String, Object>();
		para.put("groupId", groupId);
		para.put("userIds", userIds);
		groupMapper.assign(para);
	}

	
	public void update(Group group) {
		groupMapper.update(group);
	}

	
	public List<Group> findAll() {
		List<Group> oldList = groupMapper.findAll();
		System.out.println("oldList = "+oldList.size());
		/*List<Group> newList = new LinkedList<Group>();
		for (Group group : oldList) {
			if (group.getParentId() == null) {
				newList.add(group);
			} else {
				for (int i = 0; i < newList.size(); i++) {
					if (group.getParentId() == newList.get(i).getGroupId()) {
						newList.add(i + 1, group);
					}
				}
			}
		}*/
		return oldList;
	}

	
	public List<UserBasic> findUsersByGroup(int groupId) {
		return groupMapper.findUsersByGroup(groupId);
	}

	
	public List<UserBasic> findUsersByNoGroup(int groupId) {
		return groupMapper.findUsersByNoGroup(groupId);
	}

	
	public Group findById(Integer groupId) {
		return groupMapper.findById(groupId);
	}

	
	public void disassign(List<Integer> userIds, int groupId) {
		Map<String, Object> para = new HashMap<String, Object>();
		para.put("groupId", groupId);
		para.put("userIds", userIds);
		groupMapper.disassign(para);
	}

	
	public List<Group> findByParent(Integer parentId) {
		return groupMapper.findByParent(parentId);
	}
	
	
	public List<Group> findAllGroup() {
		return groupMapper.findAllGroup();
	}
}

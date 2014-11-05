package cn.hnne.hs.service.privilege.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hnne.hs.dao.privilege.RoleMapper;
import cn.hnne.hs.model.privilege.Role;
import cn.hnne.hs.model.user.UserBasic;
import cn.hnne.hs.service.privilege.RoleService;

/**
 * 角色管理业务逻辑实现类
 * @author 马周易
 *
 */
@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleMapper roleMapper;

	
	public void add(Role role) {
		roleMapper.add(role);
	}

	
	public void delete(Integer roleId) {
		List<Integer> roleIds = new ArrayList<Integer>();
		roleIds.add(roleId);
		// 删除用户-用户组关联表数据
		roleMapper.deleteUserRole(roleIds);
		// 删除用户组权限
		roleMapper.deleteRolePrivilege(roleIds);
		
		roleMapper.delete(roleId);
	}

	
	public void delete(List<Integer> roleIds) {
		// 删除用户-用户组关联表数据
		roleMapper.deleteUserRole(roleIds);
		// 删除用户组权限
		roleMapper.deleteRolePrivilege(roleIds);
		
		roleMapper.deleteList(roleIds);
	}

	
	public void assign(List<Integer> userIds, int roleId) {
		System.out.println("roleId = "+roleId+"   用户编号:"+userIds.get(0));
		Map<String, Object> para = new HashMap<String, Object>();
		para.put("roleId", roleId);
		para.put("userIds", userIds);
		roleMapper.assign(para);
	}

	
	public void update(Role role) {
		roleMapper.update(role);
	}

	
	public List<Role> findAll() {
		return roleMapper.findAll();
	}

	
	public List<UserBasic> findUsersByRole(int roleId) {
		return roleMapper.findUsersByRole(roleId);
	}

	
	public List<UserBasic> findUsersByNoRole(int roleId) {
		return roleMapper.findUsersByNoRole(roleId);
	}

	
	public Role findById(Integer roleId) {
		return roleMapper.findById(roleId);
	}

	
	public void disassign(List<Integer> userIds, int roleId) {
		Map<String, Object> para = new HashMap<String, Object>();
		para.put("roleId", roleId);
		para.put("userIds", userIds);
		roleMapper.disassign(para);
	}
	
	public List<Role> findAllRole() {
		return roleMapper.findAllRole();
	}
	
	
	public List<Role> findByUserId(int userId) {
		return roleMapper.findByUserId(userId);
	}
	
	
	public int selectIdByRoleName(String roleName) {
		// TODO Auto-generated method stub
		return roleMapper.selectIdByRoleName(roleName);
	}

	
	public List<UserBasic> findUsersByRoleByPage(int roleId) {
		return roleMapper.findUsersByRoleByPage(roleId);
	}

	/* (non-Javadoc)
	 * @see cn.hnne.hs.service.privilege.RoleService#updateUR(java.util.Map)
	 */
	
	public void updateUR(Map<String, Integer> map) {
		roleMapper.updateUR(map);
	}
}

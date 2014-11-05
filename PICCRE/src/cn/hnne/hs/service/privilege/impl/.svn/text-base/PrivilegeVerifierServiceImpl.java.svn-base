package cn.hnne.hs.service.privilege.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hnne.hs.dao.privilege.ModuleMapper;
import cn.hnne.hs.dao.privilege.PrivilegeMapper;
import cn.hnne.hs.model.privilege.Module;
import cn.hnne.hs.model.privilege.Privilege;
import cn.hnne.hs.service.privilege.PrivilegeVerifierService;
import cn.hnne.hs.utils.ComparatorModule;

/**
 * 权限验证业务逻辑实现类
 * 
 * @author 马周易
 * 
 */
@Service
public class PrivilegeVerifierServiceImpl implements PrivilegeVerifierService {

	@Autowired
	private ModuleMapper moduleMapper;

	@Autowired
	private PrivilegeMapper privilegeMapper;

	
	public List<Module> getModules(int userId) {
		// 分别查询用户、角色、用户组的模块集合
		List<Module> userModules = moduleMapper.getUserModules(userId);
		List<Module> roleModules = moduleMapper.getRoleModules(userId);
		List<Module> groupModules = moduleMapper.getGroupModules(userId);
		List<Module> list = new ArrayList<Module>();
		// 将用户和用户组模块集合合并到角色的模块集合中，相同的模块的模块权限码进行或运算
		merger(userModules, list);
		merger(groupModules, list);
		merger(roleModules, list);
		// 按主键排序
		ComparatorModule comparator = new ComparatorModule();
		Collections.sort(list, comparator);
		return list;
	}

	private void merger(List<Module> l1, List<Module> l2) {
		// l1中的指定模块在l2中是否存在
		boolean flag = false;
		for (Module m1 : l1) {
			for (Module m2 : l2) {
				flag = false;
				if (m1.getModuleId().equals(m2.getModuleId())) {
					if (m1.getModulePrivilegeCode() != null
							&& m2.getModulePrivilegeCode() != null) {
						m2.setModulePrivilegeCode(m2.getModulePrivilegeCode()
								| m1.getModulePrivilegeCode());
					}
					flag = true;
					break;
				}
			}
			if (!flag) {
				l2.add(m1);
			}
		}
	}

	
	public Privilege getPrivilegeByAction(String privilegeAction) {
		return privilegeMapper.getPrivilegeByAction(privilegeAction);
	}

}

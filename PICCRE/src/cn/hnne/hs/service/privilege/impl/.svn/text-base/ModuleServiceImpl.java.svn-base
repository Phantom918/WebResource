package cn.hnne.hs.service.privilege.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hnne.hs.dao.privilege.ModuleMapper;
import cn.hnne.hs.model.privilege.Module;
import cn.hnne.hs.model.privilege.Privilege;
import cn.hnne.hs.model.user.UserBasic;
import cn.hnne.hs.service.privilege.ModuleService;

/**
 * 模块管理业务逻辑实现类
 * @author 马周易
 *
 */
@Service
public class ModuleServiceImpl implements ModuleService {
	
	@Autowired
	private ModuleMapper moduleMapper;

	
	public void add(Module model) {
		moduleMapper.add(model);
	}

	
	public void delete(Integer id) {
		moduleMapper.delete(id);
	}

	
	public void delete(List<Integer> ids) {
		moduleMapper.deleteList(ids);
	}

	
	public void update(Module model) {
		moduleMapper.update(model);
	}

	
	public List<Module> findAll() {
		//获得所有的模块
		List<Module> allModules =  moduleMapper.findModules();
		// 将所有模块转换为树结构
		List<Module> rootModules = new ArrayList<Module>();
		for (Module module : allModules) {
			if (module.getParentId() == null) {
			// 根模块直接添加到集合
				rootModules.add(module);
			} else {
			// 将子模块直接添加到对应的父模块的子模块集合中
				for (Module m : allModules) {
					if (module.getParentId().equals(m.getModuleId())) {
						m.getSubModules().add(module);
						break;
						}
					}
				}
			}
		return rootModules;
	}

	
	public Module findById(Integer id) {
		return moduleMapper.findModuleById(id);
	}
	
	public Module findModuleById(int moduleId){
		return moduleMapper.findModuleById(moduleId);
	}

	
	public List<Module> findModules() {
		System.out.println("moduleMapper = "+moduleMapper);
		return moduleMapper.findModules();
	}

	
	public List<UserBasic> findUsers() {
		return moduleMapper.findUsers();
	}

	
	public List<Module> findModulesByUser(Integer userId) {
		return moduleMapper.findModulesByUser(userId);
	}

	
	public void addUserPrivileges(List<Privilege> privileges, int id) {
		moduleMapper.addUserPrivileges(privileges, id);
	}

	
	public List<UserBasic> findRoles() {
		return moduleMapper.findRoles();
	}

	
	public List<Module> findModulesByRole(Integer roleId) {
		return moduleMapper.findModulesByRole(roleId);
	}

	
	public void addRolePrivileges(List<Privilege> privileges, int id) {
		moduleMapper.addRolePrivileges(privileges, id);
	}

	
	public List<UserBasic> findGroups() {
		return moduleMapper.findGroups();
	}

	
	public List<Module> findModulesByGroup(Integer groupId) {
		return moduleMapper.findModulesByGroup(groupId);
	}

	
	public void addGroupPrivileges(List<Privilege> privileges, int id) {
		moduleMapper.addGroupPrivileges(privileges, id);
	}
	
	public List<Module> findByParentId(Integer parentId){
		return moduleMapper.findByParentId(parentId);
	}
	/**
	 * 删除指定的权限
	 * @param id
	 */
	public void deleteId(Integer id){
		moduleMapper.deleteById(id);
	}
	/**
	 * 批量删除权限
	 * @param list
	 */
	public void deleteIds(List<Integer> list){
		moduleMapper.deleteList(list);
	}

	
	public List<Module> findMoudleWithPriilege() {
		List<Module> moduleList=moduleMapper.findAll();
		// 将所有模块转换为树结构
		List<Module> rootModules = new ArrayList<Module>();
		for (Module module : moduleList) {
			if (module.getParentId() == null) {
				// 根模块直接添加到集合
				rootModules.add(module);
			} else {
				// 将子模块直接添加到对应的父模块的子模块集合中
				for (Module m : moduleList) {
					if (module.getParentId().equals(m.getModuleId())) {
						m.getSubModules().add(module);
						break;
					}
				}
			}
		}
		return rootModules;
	}

	
	public List<Module> findSomeoneMoudleCode(int subjectType, int subjectValue) {
		List<Module> moduleList=moduleMapper.findSomeoneModulePrivilegesCode(subjectType, subjectValue);
		return moduleList;
	}

	
	public List<Module> getAllModules() {
		return moduleMapper.getAllModules();
	}

	
	public String moduleZtree() {
		StringBuffer nodes = new StringBuffer("[");
		List<Module> allModules =  moduleMapper.findModules();
		for(int i=0;i<allModules.size();i++){
			if(i>0){
				nodes.append(",");
			}
			nodes.append("{");
			Module module = allModules.get(i);
			nodes.append("\"id\":\"");
			nodes.append(module.getModuleId());
			nodes.append("\",\"pId\":\"");
			nodes.append(module.getParentId());
			nodes.append("\",\"name\":\"");
			nodes.append(module.getModuleName());
			nodes.append("\",\"modulePrivilegeCode\":\"");
			nodes.append(module.getModulePrivilegeCode());
			nodes.append("\",\"moduleAction\":\"");
			nodes.append(module.getModuleAction());
			nodes.append("\",\"moduleLayer\":\"");
			nodes.append(module.getModuleLayer());
			nodes.append("\"}");
		}
		nodes.append("]");
		return new String(nodes);
	}
}

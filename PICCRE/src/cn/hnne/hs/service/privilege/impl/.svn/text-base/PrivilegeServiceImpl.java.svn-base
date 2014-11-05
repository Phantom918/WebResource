package cn.hnne.hs.service.privilege.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hnne.hs.dao.privilege.ModuleMapper;
import cn.hnne.hs.dao.privilege.PrivilegeMapper;
import cn.hnne.hs.model.privilege.Module;
import cn.hnne.hs.model.privilege.Privilege;
import cn.hnne.hs.service.privilege.PrivilegeService;

/**
 * 权限管理业务逻辑接口
 * @author 马周易
 *
 */
@Service
public class PrivilegeServiceImpl implements PrivilegeService {

	private Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	private PrivilegeMapper privilegeMapper;
	
	@Autowired
	private ModuleMapper moduleMapper;
	
	
	public void add(Privilege model) {
		privilegeMapper.add(model);
	}

	
	public void delete(Integer id) {
		privilegeMapper.delete(id);
	}

	
	public void delete(List<Integer> ids) {
		privilegeMapper.deleteList(ids);
	}

	
	public void update(Privilege model) {
		privilegeMapper.update(model);
	}

	
	public List<Privilege> findAll() {
		return privilegeMapper.findAll();
	}

	
	public Privilege findById(Integer id) {
		return privilegeMapper.findById(id);
	}

	
	public List<Privilege> findPrivileges(Integer moduleId) {
		return privilegeMapper.findPrivileges(moduleId);
	}
	
	public List<Integer> findSomeonePrivileges(Integer objectType,
			Integer objectId) {
		return privilegeMapper.findSomeonePrivileges(objectType, objectId);
	}

	
	public void deleteWithAddPrivileges(Integer objectType,
			Integer objectId, List<Integer> addId, List<Integer> deleteId) {
		try {
			Map<String , Object> map=new HashMap<String, Object>();
			map.put("objectType", objectType);
			map.put("objectId", objectId);
			map.put("addId", addId);
			map.put("deleteId", deleteId);
			if(addId.size()>0 && addId!=null )
			{
				privilegeMapper.addSomeonePrivileges(map);
			}
			if(deleteId.size()>0 && deleteId!=null )
			{
				privilegeMapper.deledteSomeonePrivileges(map);
			}
		} catch (Exception e) {
			log.debug("deleteWithAddPrivileges:",e);
		}
		
		
		
	}
	
	public void deleteSubjectPrivilege(Integer id){
		privilegeMapper.deleteSubjectPrivilege(id);
	}
	
	public void deleteSubjectPrivileges(List<Integer> ids){
		privilegeMapper.deleteSubjectPrivileges(ids);
	}
	
	public void updatePrivilege(Privilege privilege){
		privilegeMapper.updatePrivilege(privilege);
	}
	
	public void deleteSubPriByModuleId(Integer moduleId){
		List<Module> list = moduleMapper.findByParentId(moduleId);
		for (int i = 0; i < list.size(); i++) {
			privilegeMapper.deleteSubPriByModuleId(list.get(i)
					.getModuleId());
			
			privilegeMapper.delete(list.get(i).getModuleId());
			moduleMapper.delete(list.get(i).getModuleId());
			
		}
		int flag = privilegeMapper.deleteSubPriByModuleId(moduleId);
		if(flag == -1){
			privilegeMapper.deletePriByModuleId(moduleId);
		}
	}
	

}

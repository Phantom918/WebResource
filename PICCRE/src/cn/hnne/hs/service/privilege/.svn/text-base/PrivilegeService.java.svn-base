package cn.hnne.hs.service.privilege;

import java.util.List;

import cn.hnne.hs.model.privilege.Privilege;
import cn.hnne.hs.service.BaseService;

/**
 * 权限管理业务逻辑接口
 * 
 * @author 马周易
 * 
 */
public interface PrivilegeService extends BaseService<Privilege, Integer> {

	/**
	 * 查询一个模块的所有权限
	 * 
	 * @param moduleId
	 *            模块ID
	 */
	List<Privilege> findPrivileges(Integer moduleId);
	/**
	 * 查询出指定对象的所有的privageId
	 */
	List<Integer> findSomeonePrivileges(Integer objectType,Integer objectId);
	
	
	/**
	 * 批量对一个对象的权限进行删除与添加
	 */
	void deleteWithAddPrivileges(Integer objectType,Integer objectId,List<Integer> addId,List<Integer> deleteId);
}

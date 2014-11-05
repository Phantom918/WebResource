package cn.hnne.hs.dao.privilege;

import java.util.List;
import java.util.Map;

import cn.hnne.hs.dao.BaseDao;
import cn.hnne.hs.model.privilege.Privilege;


/**
 * 权限映射器
 * @author 马周易
 *
 */
public interface PrivilegeMapper extends BaseDao<Privilege, Integer> {

	/**
	 * 根据权限动作查询权限
	 * @param privilegeAction 权限动作
	 */
	Privilege getPrivilegeByAction(String privilegeAction);

	/**
	 * 查询一个模块的所有权限
	 * 
	 * @param moduleId
	 *            模块ID
	 */
	List<Privilege> findPrivileges(Integer moduleId);
	
	/**
	 * 根据对象的类型和id查询出所对应的权限信息
	 */
	List<Integer> findSomeonePrivileges(Integer objectType,Integer objectId);
	
	/**
	 * 批量添加某个对象的多个权限
	 */
	void addSomeonePrivileges(Map<String , Object> message);
	
	/**
	 * 批量删除某个对象的多个权限
	 */
	void deledteSomeonePrivileges(Map<String , Object> message);
	/**
	 * 删除拥有指定权限的实体引用
	 * @param id
	 */
	void deleteSubjectPrivilege(Integer id);
	/**
	 * 批量删除拥有指定权限的实体引用
	 * @param ids
	 */
	void deleteSubjectPrivileges(List<Integer> ids);
	/**
	 * 更新某条权限
	 * @param privilege
	 */
	void updatePrivilege(Privilege privilege);
	/**
	 * 根据模块编号删除主体权限表下Subject表中的相关信息
	 * @param moduleId
	 */
	int deleteSubPriByModuleId(Integer moduleId);
	/**
	 * 根据模块编号删除主体权限表和权限表中的相关信息
	 * @param moduleId
	 */
	int deletePriByModuleId(Integer moduleId);
}

package cn.hnne.hs.pc.datasource;

import java.util.List;

import cn.hnne.hs.model.privilege.Module;
import cn.hnne.hs.model.privilege.Privilege;

/**
 * 权限的数据源接口，提供权限的信息
 * @author 马周易
 *
 */
public interface DataSource {
	
	/**
	 * 获得指定用户的指定角色的模块集合
	 * @param userId 用户ID
	 */
	List<Module> getModules(int userId);
	
	/**
	 * 根据权限动作获得权限
	 * @param privilegeAction 权限动作
	 * @return
	 */
	Privilege getPrivilegeByAction(String privilegeAction);
}

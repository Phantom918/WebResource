package cn.hnne.hs.pc.verifier;

import java.util.Map;

import cn.hnne.hs.pc.datasource.DataSource;


/**
 * 权限验证器接口
 * 
 * @author 马周易
 * 
 */
public interface PrivilegeVerifier {

	/**
	 * 指定用户的指定角色是否有指定权限动作对应的权限
	 * 
	 * @param userId
	 *            用户ID
	 * @param privilegeAction
	 *            权限动作
	 */
	boolean hasPrivilege(int userId, String privilegeAction, Map<String ,Object> context);

	/**
	 * 设置权限的数据源
	 * @param dataSource 权限的数据源
	 */
	void setDataSource(DataSource dataSource);
	
	
}

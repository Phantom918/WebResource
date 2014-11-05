package cn.hnne.hs.pc.verifier;

import java.util.List;
import java.util.Map;

import cn.hnne.hs.model.privilege.Module;
import cn.hnne.hs.model.privilege.Privilege;
import cn.hnne.hs.pc.datasource.DataSource;

/**
 * 简单的权限验证器实现类
 * 
 * @author 马周易
 * 
 */
public class SimplePrivilegeVerifier implements PrivilegeVerifier {

	private DataSource dataSource;

	@SuppressWarnings("unchecked")
	
	public boolean hasPrivilege(int userId, String privilegeAction, Map<String ,Object> context) {
		// 根据权限动作查询权限
		Privilege privilege = dataSource.getPrivilegeByAction(privilegeAction);
		if (privilege == null) {
			return true;
			//throw new RuntimeException("没有为权限动作“" + privilegeAction + "”在数据库中配置权限！");
		}
		// 获得所有的模块
		Object obj = context.get("modules");
		List<Module> modules;
		if (obj == null) {
			modules = dataSource.getModules(userId);
			context.put("modules", modules);
		} else {
			modules = (List<Module>) obj;
		}
		// 获得指定权限对应的模块
		Module module = searchModule(privilege.getModule().getModuleId(),
				modules);
		// 根据模块权限码与权限码判断是否有权限
		if (module != null
				&& (module.getModulePrivilegeCode() & privilege
						.getPrivilegeCode()) == privilege.getPrivilegeCode()) {
			context.put("modulePrivilegeCode", module.getModulePrivilegeCode());
			return true;
		}
		return false;
	}

	/**
	 * 在模块集合中搜素指定id的模块
	 * 
	 * @param moduleId
	 *            模块id
	 * @param modules
	 *            模块集合
	 */
	private Module searchModule(int moduleId, List<Module> modules) {
		for (Module module : modules) {
			if (module.getModuleId() == moduleId) {
				return module;
			}
		}
		return null;
	}

	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}

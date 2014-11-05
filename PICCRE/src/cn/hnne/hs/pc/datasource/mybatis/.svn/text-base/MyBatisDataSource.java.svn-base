package cn.hnne.hs.pc.datasource.mybatis;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.hnne.hs.model.privilege.Module;
import cn.hnne.hs.model.privilege.Privilege;
import cn.hnne.hs.pc.Admin;
import cn.hnne.hs.pc.datasource.DataSource;
import cn.hnne.hs.service.privilege.ModuleService;
import cn.hnne.hs.service.privilege.PrivilegeVerifierService;


public class MyBatisDataSource implements DataSource {

	private PrivilegeVerifierService pvs;

	private ModuleService ms;

	@SuppressWarnings("resource")
	public MyBatisDataSource() {
		pvs = (PrivilegeVerifierService) new ClassPathXmlApplicationContext(
				"applicationContext.xml")
				.getBean("privilegeVerifierServiceImpl");
		ms = (ModuleService) new ClassPathXmlApplicationContext(
				"applicationContext.xml").getBean("moduleServiceImpl");
	}

	
	public List<Module> getModules(int userId) {
		// 超级管理员
		if (userId == Admin.USER_ID) {
			return ms.getAllModules();
		}
		return pvs.getModules(userId);
	}

	
	public Privilege getPrivilegeByAction(String privilegeAction) {
		return pvs.getPrivilegeByAction(privilegeAction);
	}

}

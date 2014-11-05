package cn.hnne.hs.model.privilege;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Module implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer moduleId;
	
	private String moduleName;
	
	private Integer modulePrivilegeCode;
	
	private List<Privilege> privileges = new ArrayList<Privilege>();
	
	private String moduleAction;
	
	private List<Module> subModules = new ArrayList<Module>();
	
	private Integer parentId;
	
	private Integer moduleLayer;
	
	public Integer getModuleLayer() {
		return moduleLayer;
	}

	public void setModuleLayer(Integer moduleLayer) {
		this.moduleLayer = moduleLayer;
	}

	public Integer getModuleId() {
		return moduleId;
	}

	public void setModuleId(Integer moduleId) {
		this.moduleId = moduleId;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public Integer getModulePrivilegeCode() {
		return modulePrivilegeCode;
	}

	public void setModulePrivilegeCode(Integer modulePrivilegeCode) {
		this.modulePrivilegeCode = modulePrivilegeCode;
	}

	public String getModuleAction() {
		return moduleAction;
	}

	public void setModuleAction(String moduleAction) {
		this.moduleAction = moduleAction;
	}

	public List<Privilege> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(List<Privilege> privileges) {
		this.privileges = privileges;
	}

	public List<Module> getSubModules() {
		return subModules;
	}

	public void setSubModules(List<Module> subModules) {
		this.subModules = subModules;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	@Override
	public String toString() {
		return "Module [moduleId=" + moduleId + ", moduleName=" + moduleName
				+ ", modulePrivilegeCode=" + modulePrivilegeCode
				+ ", privileges=" + privileges + ", moduleAction="
				+ moduleAction + ", subModules=" + subModules + ", parentId="
				+ parentId + ", moduleLayer=" + moduleLayer + "]";
	}
	
	
}

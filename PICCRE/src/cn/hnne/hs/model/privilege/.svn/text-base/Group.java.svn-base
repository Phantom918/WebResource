package cn.hnne.hs.model.privilege;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Group implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer groupId;
	
	private String groupName;
	
	private String groupDescribe;
	
	private Integer parentId;
	
	/**
	 * 层数
	 */
	private int groupLayer;
	
	private List<Module> modules = new ArrayList<Module>();
	
	private List<Group> subGroups = new ArrayList<Group>();

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupDescribe() {
		return groupDescribe;
	}

	public void setGroupDescribe(String groupDescribe) {
		this.groupDescribe = groupDescribe;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public List<Module> getModules() {
		return modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}

	public List<Group> getSubGroups() {
		return subGroups;
	}

	public void setSubGroups(List<Group> subGroups) {
		this.subGroups = subGroups;
	}

	public int getGroupLayer() {
		return groupLayer;
	}

	public void setGroupLayer(int groupLayer) {
		this.groupLayer = groupLayer;
	}
}

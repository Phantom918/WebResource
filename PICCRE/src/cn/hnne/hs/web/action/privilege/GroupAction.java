package cn.hnne.hs.web.action.privilege;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import cn.hnne.hs.common.PageStatus;
import cn.hnne.hs.model.privilege.Group;
import cn.hnne.hs.model.user.UserBasic;
import cn.hnne.hs.service.privilege.GroupService;
import cn.hnne.hs.utils.ListUtil;
import cn.hnne.pagination.Page;
import cn.hnne.pagination.PageContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 用户组管理
 * 
 * @author 马周易
 * 
 */
@Results({ @Result(name = "json", type = "json") })
@SuppressWarnings({ "unchecked", "rawtypes" })
public class GroupAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Autowired
	private GroupService groupService;

	/**
	 * 用于接收表单输入
	 */
	private Group group;

	/**
	 * 用户组集合
	 */
	private List<Group> groups;

	/**
	 * 用户集合
	 */
	private List<UserBasic> users;

	/**
	 * 用户ID集合
	 */
	private String ids;

	/**
	 * 网页状态标示
	 */
	private int pageStatus = 0;
	
	/**
	 * 一组用户组ID的字符串,用于批量分配用户给用户组
	 */
	private String groupIds;
	
	/**
	 * 用于批量取消分配用户给用户组
	 */
	private String groupIds2;

	/**
	 * 进入用户组管理页面
	 */
	public String manage() {
		groups = groupService.findAll();
		return "manage";
	}

	/**
	 * 添加用户组
	 */
	public String add() {
		System.out.println("幅度爽啦防静电 = "+group.getParentId());
		try {
			Group parent = null;
			int groupLayer = 1;
			if(group.getParentId()!=null){
				parent = groupService.findById(group.getParentId());
				if (parent != null) {
					groupLayer = parent.getGroupLayer() + 1;
				}
			}
			group.setGroupLayer(groupLayer);
			groupService.add(group);
			pageStatus = PageStatus.INSERT_SUCCESS;
		} catch (Exception e) {
			pageStatus = PageStatus.OPERATE_FAIL;
		}
		return manage();
	}

	/**
	 * 批量删除用户组
	 */
	public String batchDelete() {
		try {
			List<Integer> groupIds = new ArrayList<Integer>();
			for (String id : ids.split(",")) {
				groupIds.add(Integer.parseInt(id));
			}
			groupService.delete(groupIds);
			pageStatus = PageStatus.DELETE_SUCCESS;
		} catch (Exception e) {
			pageStatus = PageStatus.OPERATE_FAIL;
		}
		return manage();
	}

	/**
	 * 删除用户组
	 */
	public String delete() {
		try {
			List<Integer> list = new ArrayList<Integer>();
			for (String id : groupIds.split(",")) {
				list.add(Integer.parseInt(id));
			}
			groupService.delete(list);
			pageStatus = PageStatus.DELETE_SUCCESS;
		} catch (Exception e) {
			pageStatus = PageStatus.OPERATE_FAIL;
		}
		return manage();
	}

	/**
	 * 修改用户组
	 */
	public String update() {
		System.out.println("update group ......."+group.getGroupId());
		try {
			groupService.update(group);
			System.out.println("update end .......");
			pageStatus = PageStatus.UPDATE_SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			pageStatus = PageStatus.OPERATE_FAIL;
		}
		return manage();
	}

	/**
	 * 获取属于该用户组的所有用户
	 */
	public String existUsers() {
		Page page = PageContext.getPage();
		Map<String, Object> para = new HashMap<String, Object>();
		para.put("group.groupId", group.getGroupId());
		para.put("group.groupName", group.getGroupName());
		para.put("groupIds2", groupIds2);
		page.setPara(para);
		users = groupService.findUsersByGroup(group.getGroupId());
		return "yuser";
	}

	/**
	 * 获取不属于该用户组的所有用户
	 */
	public String nonexistentUsers() {
		Page page = PageContext.getPage();
		Map<String, Object> para = new HashMap<String, Object>();
		para.put("group.groupId", group.getGroupId());
		para.put("group.groupName", group.getGroupName());
		para.put("groupIds2", groupIds2);
		page.setPara(para);
		users = groupService.findUsersByNoGroup(group.getGroupId());
		return "nuser";
	}

	/**
	 * 批量给用户分配用户组
	 */
	public String assign() {
		try {
			// 把要分配给指定的用户组的用户ID的字符串解析成整数集合
			List<Integer> userIds = ListUtil.stringToList(ids);
			List<Integer> list = ListUtil.stringToList(groupIds);
			for (Integer id : list) {
				groupService.disassign(userIds, id);
				groupService.assign(userIds, id);
			}
			groupService.assign(userIds, group.getGroupId());
			pageStatus = PageStatus.ASSIGN_SUCCESS;
		} catch (Exception e) {
			pageStatus = PageStatus.OPERATE_FAIL;
		}
		return nonexistentUsers();
	}

	/**
	 * 批量取消分配指定用户组的用户
	 */
	public String disassign() {
		try {
			// 把要取消分配给指定的用户组的用户ID的字符串解析成整数集合
			List<Integer> userIds = ListUtil.stringToList(ids);
			List<Integer> list = ListUtil.stringToList(groupIds2);
			for (Integer id : list) {
				groupService.disassign(userIds, id);
			}
			groupService.disassign(userIds, group.getGroupId());
			pageStatus = PageStatus.CANCEL_ASSIGN;
		} catch (Exception e) {
			pageStatus = PageStatus.OPERATE_FAIL;
		}
		return existUsers();
	}

	public List<Group> getGroups() {
		return groups;
	}

	public List<UserBasic> getUsers() {
		return users;
	}

	public void setIds(String ids) {
		this.ids = ids;
	}

	public int getPageStatus() {
		return pageStatus;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public void setGroupIds(String groupIds) {
		this.groupIds = groupIds;
	}

	public String getGroupIds() {
		return groupIds;
	}

	public String getGroupIds2() {
		return groupIds2;
	}

	public void setGroupIds2(String groupIds2) {
		this.groupIds2 = groupIds2;
	}
}

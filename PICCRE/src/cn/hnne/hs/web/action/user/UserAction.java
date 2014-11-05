/*
 * 文件名：UserAction.java
 * 版权：Copyright HNNE All Rights Reserved.
 * 描述：用户管理模块的action
 * 修改人：袁秀夫
 * 修改时间：2013年8月16日
 * 修改内容：新增
 */
package cn.hnne.hs.web.action.user;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.InterceptorRefs;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.hnne.hs.common.PageStatus;
import cn.hnne.hs.model.user.UserBasic;
import cn.hnne.hs.service.privilege.RoleService;
import cn.hnne.hs.service.user.IUserService;
import cn.hnne.pagination.Page;
import cn.hnne.pagination.PageContext;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 用户管理模块的action
 * 
 * @author 袁秀夫
 * @version 1.0, 2013年8月16日
 */
@Results({ @Result(name = "invalid.token", location = "user!allActiveUser", type = "redirectAction") })
@InterceptorRefs({
		@InterceptorRef(value = "token", params = { "includeMethods",
				"add, update" }), @InterceptorRef("myStack") })
public class UserAction extends ActionSupport {

	private static final long serialVersionUID = 6066905338856269931L;

	/**
	 * slf4j日志
	 */
	Logger logger = LoggerFactory.getLogger(UserAction.class);

	/**
	 * 用户管理的service层接口
	 */
	@Autowired
	private IUserService iUserService;
	
	@Autowired
	private RoleService roleService;
	
	//@Autowired
	//private OrganizationService organizationService;

	/**
	 * 用户基本信息model
	 */
	private UserBasic userBasic;

	/**
	 * 用户基本信息model的list
	 */
	private List<UserBasic> userBasics;

	/**
	 * 用户印章的文件
	 */
	private File stamp;

	/**
	 * 用户印章的文件名
	 */
	private String stampFileName;

	/**
	 * 用户印章的文件类型
	 */
	private String stampContentType;

	/**
	 * 用于批量删除的一组ID
	 */
	private String userIds;

	/**
	 * 雇佣日期开始
	 */
	private String hiredDateBegin;

	/**
	 * 雇佣日期结束
	 */
	private String hiredDateEnd;

	/**
	 * 雇佣日期开始
	 */
	private String createdTimeBegin;

	/**
	 * 雇佣日期结束
	 */
	private String createdTimeEnd;

	/**
	 * 分页请求的页数
	 */
	private int pageNo = 1;

	/**
	 * 网页状态标示
	 */
	private int pageStatus = 0;

	/**
	 * 活跃用户一览表总入口。 如果查询条件全为空，则查询所活跃有用户记录； 否则，查询符合条件的活跃用户记录。
	 * 
	 * @return 活跃用户一览表
	 */
	public String activeIndex() {
		logger.info("用户参数是否为空：" + (userBasic == null));
		if (userBasic == null) { // 如果查询条件为空
			return this.allActiveUser();
		} else {
			logger.info("用户参数详情：" + userBasic);
			return this.searchActiveUser();
		}
	}

	/**
	 * 用户管理模块首页，显示所有活跃用户
	 * 
	 * @return 用户管理首页地址
	 */
	public String allActiveUser() {
		try {
			userBasics = iUserService.findActiveAll();
			for(UserBasic ub : userBasics){
				System.out.println("用户名："+ub.getName()+"    用户角色："+ub.getRoleName());
			}
			System.out.println("查询到的用户个数为="+userBasics.size());
			Page<?> page = PageContext.getPage();
			page.setPageNo(pageNo);
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("用户管理的Action层：活跃用户一览显示异常！" + e);
		}
		return "activeIndex";
	}

	/**
	 * 按参数查询活跃用户
	 * 
	 * @return 用户管理首页地址
	 */
	public String searchActiveUser() {
		try {
			// 用于查询的参数
/*			Map<String, Object> searchParams = new HashMap<String, Object>();
			searchParams.put("user", userBasic);
			searchParams.put("hiredDateBegin", hiredDateBegin);
			searchParams.put("hiredDateEnd", hiredDateEnd);
			searchParams.put("createdTimeBegin", createdTimeBegin);
			searchParams.put("createdTimeEnd", createdTimeEnd);*/
			userBasics = iUserService.findActiveByParams(userBasic);

			// 用于分页的参数
			Map<String, Object> pageParams = new HashMap<String, Object>();
			pageParams.put("userBasic.loginId", userBasic.getLoginId());
			pageParams.put("userBasic.name", userBasic.getName());
			pageParams.put("userBasic.nameYomi", userBasic.getNameYomi());
			pageParams.put("userBasic.emailAddr", userBasic.getEmailAddr());
			pageParams.put("userBasic.userTel", userBasic.getUserTel());
			/*pageParams.put("hiredDateBegin", hiredDateBegin);
			pageParams.put("hiredDateEnd", hiredDateEnd);
			pageParams.put("createdTimeBegin", createdTimeBegin);
			pageParams.put("createdTimeEnd", createdTimeEnd);*/
			Page<?> page = PageContext.getPage();
			page.setPara(pageParams);
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("用户管理的Action层：活跃用户查询异常！");
		}
		return "activeIndex";
	}

	/**
	 * 禁用用户一览表总入口。 如果查询条件全为空，则查询所禁用有用户记录； 否则，查询符合条件的禁用用户记录。
	 * 
	 * @return 禁用用户一览表
	 */
	public String bannedIndex() {
		logger.info("用户参数是否为空：" + (userBasic == null));
		if (userBasic == null) { // 如果查询条件为空
			return this.allBannedUser();
		} else {
			logger.info("用户参数详情：" + userBasic);
			return this.searchBannedUser();
		}
	}

	/**
	 * 进入显示所有禁用用户的页面
	 * 
	 * @return 禁用用户管理地址
	 */
	public String allBannedUser() {
		Page<?> page = PageContext.getPage();
		page.setPageNo(pageNo);
		
		userBasics = iUserService.findBannedAll();
		return "bannedIndex";
	}

	/**
	 * 按参数查询被禁用的用户
	 * 
	 * @return 禁用用户管理页面地址
	 */
	public String searchBannedUser() {
		// 设置用于查询的参数
		/*Map<String, Object> searchParams = new HashMap<String, Object>();
		searchParams.put("user", userBasic);
		searchParams.put("hiredDateBegin", hiredDateBegin);
		searchParams.put("hiredDateEnd", hiredDateEnd);
		searchParams.put("createdTimeBegin", createdTimeBegin);
		searchParams.put("createdTimeEnd", createdTimeEnd);*/
		
		// 设置用于分页的参数
		Map<String, Object> pageParams = new HashMap<String, Object>();
		pageParams.put("userBasic.loginId", userBasic.getLoginId());
		pageParams.put("userBasic.name", userBasic.getName());
		pageParams.put("userBasic.nameYomi", userBasic.getNameYomi());
		pageParams.put("userBasic.emailAddr", userBasic.getEmailAddr());
		pageParams.put("userBasic.userTel", userBasic.getUserTel());
		/*pageParams.put("hiredDateBegin", hiredDateBegin);
		pageParams.put("hiredDateEnd", hiredDateEnd);
		pageParams.put("createdTimeBegin", createdTimeBegin);
		pageParams.put("createdTimeEnd", createdTimeEnd);*/
		Page<?> page = PageContext.getPage();
		page.setPara(pageParams);
		
		userBasics = iUserService.findBannedByParams(userBasic);

		return "bannedIndex";
	}

	/**
	 * 添加用户
	 * 
	 * @return 用户管理首页地址
	 */
	public String add() {
		System.out.println("用户的角色编号："+userBasic.getRoleId());
		// 保存文件的真实路径
		String realPath = ServletActionContext.getServletContext().getRealPath("/img/iclt/stamp");
		try {
			if (stamp != null) {
				// 重命名印章：用户账户+当前系统时间
				stampFileName = userBasic.getLoginId() + System.currentTimeMillis() + stampFileName;
				File tempFile = new File(new File(realPath), stampFileName);
				if (!tempFile.getParentFile().exists()) {
					tempFile.getParentFile().mkdirs();
				}
				FileUtils.copyFile(stamp, tempFile);
				// 保存用户印章的文件名
				//userBasic.getUserAppend().setStamp(stampFileName);
			}
			// 新建用户默认为活跃状态，即状态码为1
			userBasic.setUserState(1);
			//String orgName = organizationService.findOrgNameByOrgCode(userBasic.getOrgCode());
			//userBasic.setOrgName(orgName);
			iUserService.add(userBasic);
			List<Integer> list = new ArrayList<Integer>();
			list.add(userBasic.getUserId());
			roleService.assign(list, userBasic.getRoleId());
			userBasic = null;
			pageStatus = PageStatus.INSERT_SUCCESS;
		} catch (Exception e) {
			pageStatus = PageStatus.OPERATE_FAIL;
			logger.info("action层：用户添加异常！" + e);
		}
		return activeIndex();
	}

	/**
	 * 批量删除用户
	 * 
	 * @return 用户管理首页地址
	 */
	public String batchDelete() {
		try {
			String[] tempStr = userIds.split(",");
			int[] tempInt = new int[tempStr.length];
			for (int i = 0; i < tempInt.length; i++) {
				tempInt[i] = Integer.parseInt(tempStr[i]);
			}
			iUserService.batchLogicDelete(tempInt);
			pageStatus = PageStatus.DELETE_SUCCESS;
		} catch (Exception e) {
			pageStatus = PageStatus.OPERATE_FAIL;
			logger.info("action层：用户批量逻辑删除异常！" + e);
		}
		return activeIndex();
	}

	/**
	 * 修改用户
	 * 
	 * @return 用户管理首页地址
	 */
	public String update() {
		try {
			logger.info(userBasic.getUserId()+"dfjdslkjfdl------------"+userBasic.getRoleId());
			//String orgName = organizationService.findOrgNameByOrgCode(userBasic.getOrgCode());
			//userBasic.setOrgName(orgName);
			iUserService.update(userBasic);
			Map<String,Integer> map = new HashMap<String,Integer>();
			map.put("roleId", userBasic.getRoleId());
			map.put("userId", userBasic.getUserId());
			roleService.updateUR(map);
			System.out.println("userBasic="+userBasic);
			userBasic = null;
			pageStatus = PageStatus.UPDATE_SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			pageStatus = PageStatus.OPERATE_FAIL;
			logger.info("action层：用户修改异常！" + e);
		}
		return activeIndex();
	}

	/**
	 * 批量禁用
	 * 
	 * @return 用户管理首页地址
	 */
	public String batchBan() {
		try {
			if (userIds != null) {
				String[] tempStr = userIds.split(",");
				int[] tempInt = new int[tempStr.length];
				for (int i = 0; i < tempInt.length; i++) {
					tempInt[i] = Integer.parseInt(tempStr[i]);
				}
				iUserService.batchBan(tempInt);
				pageStatus = PageStatus.BAN_SUCCESS;
			}
		} catch (Exception e) {
			pageStatus = PageStatus.OPERATE_FAIL;
		}
		return activeIndex();
	}

	/**
	 * 批量启用
	 * 
	 * @return 禁用用户管理页面地址
	 */
	public String batchRestart() {
		try {
			String[] tempStr = userIds.split(",");
			int[] tempInt = new int[tempStr.length];
			for (int i = 0; i < tempInt.length; i++) {
				tempInt[i] = Integer.parseInt(tempStr[i]);
			}
			iUserService.batchRestart(tempInt);
			pageStatus = PageStatus.RESTART_SUCCESS;
		} catch (Exception e) {
			pageStatus = PageStatus.OPERATE_FAIL;
		}
		return bannedIndex();
	}

	/**
	 * 重置用户密码为123456
	 */
	public void resetPassword() {
		HttpServletResponse response = ServletActionContext.getResponse();
		PrintWriter writer = null;
		userBasic.setLoginPwd("123456");
		try {
			writer = response.getWriter();
			logger.info("重置密码参数：" + userBasic);
			iUserService.update(userBasic);
			userBasic = null;
			writer.print("true");
		} catch (Exception e) {
			logger.info("用户管理Action层：密码重置异常！" + e);
			e.printStackTrace();
		} finally {
			if (writer != null) {
				writer.close();
			}
		}
	}

	/**
	 * 验证用户名是否存在，无论用户是否活跃
	 */
	public void checkLoginId() {
		HttpServletResponse response = ServletActionContext.getResponse();
		PrintWriter writer = null;
		if (iUserService.checkLoginId(userBasic) == null) {
			try {
				writer = response.getWriter();
				writer.print("true");
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				if (writer != null) {
					writer.close();
				}
			}
		}
	}

	/**
	 * 验证邮箱地址是否存在，只验证活跃用户
	 */
	public void checkEmail() throws IOException {
		if (iUserService.checkEmail(userBasic) == null) {
			HttpServletResponse response = ServletActionContext.getResponse();
			PrintWriter writer = response.getWriter();
			writer.print("true");
			writer.flush();
			writer.close();
		}
	}

	public UserBasic getUserBasic() {
		return userBasic;
	}

	public void setUserBasic(UserBasic userBasic) {
		this.userBasic = userBasic;
	}

	public List<UserBasic> getUserBasics() {
		return userBasics;
	}

	public void setUserBasics(List<UserBasic> userBasics) {
		this.userBasics = userBasics;
	}

	public String getUserIds() {
		return userIds;
	}

	public void setUserIds(String userIds) {
		this.userIds = userIds;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageStatus() {
		return pageStatus;
	}

	public void setPageStatus(int pageStatus) {
		this.pageStatus = pageStatus;
	}

	public String getHiredDateBegin() {
		return hiredDateBegin;
	}

	public void setHiredDateBegin(String hiredDateBegin) {
		this.hiredDateBegin = hiredDateBegin;
	}

	public String getHiredDateEnd() {
		return hiredDateEnd;
	}

	public void setHiredDateEnd(String hiredDateEnd) {
		this.hiredDateEnd = hiredDateEnd;
	}

	public String getCreatedTimeBegin() {
		return createdTimeBegin;
	}

	public void setCreatedTimeBegin(String createdTimeBegin) {
		this.createdTimeBegin = createdTimeBegin;
	}

	public String getCreatedTimeEnd() {
		return createdTimeEnd;
	}

	public void setCreatedTimeEnd(String createdTimeEnd) {
		this.createdTimeEnd = createdTimeEnd;
	}

	public File getStamp() {
		return stamp;
	}

	public void setStamp(File stamp) {
		this.stamp = stamp;
	}

	public String getStampFileName() {
		return stampFileName;
	}

	public void setStampFileName(String stampFileName) {
		this.stampFileName = stampFileName;
	}

	public String getStampContentType() {
		return stampContentType;
	}

	public void setStampContentType(String stampContentType) {
		this.stampContentType = stampContentType;
	}

}

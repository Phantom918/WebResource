/*
 * 文件名：UserBasic.java
 * 版权：Copyright HNNE All Rights Reserved.
 * 描述：用户基本信息model
 * 修改人：袁秀夫
 * 修改时间：2013年8月16日
 * 修改内容：新增
 */
package cn.hnne.hs.model.user;

/**
 * 用户基本信息model
 * 
 * @author 袁秀夫
 * @version 1.0, 2013年8月16日
 */
public class UserBasic {

	/**
	 * 主键
	 */
	private int userId;

	/**
	 * 登录账号
	 */
	private String loginId;

	/**
	 * 登录密码
	 */
	private String loginPwd;

	/**
	 * 真实姓名
	 */
	private String name;

	/**
	 * 真实姓名的读音
	 */
	private String nameYomi;

	/**
	 * 电子邮件地址
	 */
	private String emailAddr;
	
	/**
	 * 用户电话,谭磊追加
	 */
	private String userTel;

	/**
	 * 状态
	 */
	private int userState;
	
	/**
	 * 用来存储用户的角色编号
	 */
	private int roleId;
	
	private String roleName;
	
	private String orgCode;//机构简码
	
	private String orgName;//机构名称
	
	
	

	public UserBasic() {
		
	}
	
	public UserBasic(String loginId, String loginPwd, String name,
			String nameYomi, String emailAddr, int userState,int roleId,String roleName,String orgCode,String orgName) {
		super();
		this.loginId = loginId;
		this.loginPwd = loginPwd;
		this.name = name;
		this.nameYomi = nameYomi;
		this.emailAddr = emailAddr;
		this.userState = userState;
		this.roleId = roleId;
		this.roleName = roleName;
		this.orgCode = orgCode;
		this.orgName = orgName;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginPwd() {
		return loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameYomi() {
		return nameYomi;
	}

	public void setNameYomi(String nameYomi) {
		this.nameYomi = nameYomi;
	}

	public String getEmailAddr() {
		return emailAddr;
	}

	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}

	public int getUserState() {
		return userState;
	}

	public void setUserState(int userState) {
		this.userState = userState;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}
	
	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	@Override
	public String toString() {
		return "UserBasic [userId=" + userId + ", loginId=" + loginId
				+ ", loginPwd=" + loginPwd + ", name=" + name + ", nameYomi="
				+ nameYomi + ", emailAddr=" + emailAddr + ", userTel="
				+ userTel + ", userState=" + userState +",orgCode="+orgCode+ ",orgName="+orgName+"]";
	}


	
}
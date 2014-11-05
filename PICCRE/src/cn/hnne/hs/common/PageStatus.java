package cn.hnne.hs.common;

/**
 * 装载用于表示网页状态的常量
 * @author yxf
 */
public interface PageStatus {
	/**
	 * 普通状态
	 */
	final static public int COMMON_STATUS = 0;
	
	/**
	 * 添加成功
	 */
	final static public int INSERT_SUCCESS = 1;
	
	/**
	 * 删除成功
	 */
	final static public int DELETE_SUCCESS = 2;
	
	/**
	 * 修改成功
	 */
	final static public int UPDATE_SUCCESS = 3;
	
	/**
	 * 分配成功
	 */
	final static public int ASSIGN_SUCCESS = 4;
	
	/**
	 * 取消分配
	 */
	final static public int CANCEL_ASSIGN = 5;
	
	/**
	 * 禁用成功
	 */
	final static public int BAN_SUCCESS = 6;
	
	/**
	 * 启用成功
	 */
	final static public int RESTART_SUCCESS = 7;
	
	/**
	 * 登录失败
	 */
	final static public int LOGIN_FALI = 8;
	
	/**
	 * 非法操作，比如通过地址栏直接访问
	 */
	int ILLEGAL_OPERATION = 9;
	
	/**
	 * 操作成功，如上传操作成功等
	 */
	int OPERATE_SUCCESS = 10;
	
	/**
	 * 文件类型错误
	 */
	int FILE_TYPE_ERROR = 11;
	
	/**
	 * 模板正在被使用中，所以拒绝请求
	 */
	int IS_USERD = 12;
	
	/**
	 * 下载时，路径没有找到
	 */
	int PATH_NOT_FOUND = 13;
	
	/**
	 * 子系统正在被使用中，所以拒绝请求
	 */
	int SYS_IS_USERD = 14;
	
	/**
	 * 操作失败
	 */
	final static public int OPERATE_FAIL = 101;
	
	/**
	 * 审核成功
	 */
	final static public int ALL_ADUIT =15 ;
	/**
	 * 驳回成功
	 */
	final static public int TURNED_SECCESS =16 ;
	/**
	 * 分配成功
	 */
	final static public int  ALLCATION_SECCESS=17 ;
	/**
	 * 子系统下有任务关联
	 */
	final static public int  SUBSYSTEM_HASTASK=18;
	/**
	 * 子系统禁用成功
	 */
	final static public int SUBSYSTEM_DISABLE_SUCCESS = 19;
	/**
	 * 作业次数必须填写
	 */
	int JOB_NUMBER_IS_NULL=20;
	
	/**
	 * 多个Excel sheet表，暂时不支持。
	 */
	final static public int MULTI_EXCELSHEET = 123;
	
	/**
	 * 作业内容为空
	 */
	final static public int work_content_null = 124;
	
	/**
	 * 作业内容格式格式错误。
	 */
	final static public int work_content_errot = 125;
	/**
	 * 用户名和密码不正确
	 */
	final static public int NAME_PASS_NOT = 204;
	/**
	 * 更新成功
	 */
	final static public int UPDATE_FAIL = 201;
	/**
	 * 注册成功
	 */
	final static public int REGIST_SUCCESS = 401;
	/**
	 * 注册失败
	 */
	final static public int REGIST_FAIL = 402;
}

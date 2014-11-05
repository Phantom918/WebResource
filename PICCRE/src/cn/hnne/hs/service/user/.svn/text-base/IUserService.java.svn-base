/*
 * 文件名：IUserService.java
 * 版权：Copyright HNNE All Rights Reserved.
 * 描述：用户管理模块service层接口
 * 修改人：袁秀夫
 * 修改时间：2013年8月16日
 * 修改内容：新增
 */
package cn.hnne.hs.service.user;

import java.util.List;

import cn.hnne.hs.model.user.UserBasic;

/**
 * 用户管理模块service层接口
 * @author 袁秀夫
 * @version 1.0, 2013年8月16日
 */
public interface IUserService {
	
	/**
	 * 添加一条用户记录
	 * @param userBasic 被添加的用户model
	 */
	void add(UserBasic userBasic);
	
	/**
	 * 物理删除一条用户记录
	 * @param userBasic 被删除的用户model
	 */
	@Deprecated
	void delete(UserBasic userBasic);
	
	/**
	 * 物理删除多条用户记录
	 * @param userIds 被删除的用户主键数组
	 */
	void batchDelete(int[] userIds);
	
	/**
	 * 逻辑删除多条用户记录
	 * @param userIds 被逻辑删除的用户主键数组
	 */
	void batchLogicDelete(int[] userIds);
	
	/**
	 * 禁用一名用户
	 * @param userBasic 被禁用的用户
	 */
	@Deprecated
	void ban(UserBasic userBasic);
	
	/**
	 * 禁用多名用户
	 * @param userIds 被禁用的用户主键数组
	 */
	void batchBan(int[] userIds);
	
	/**
	 * 启用多么用户
	 * @param userIds 被启用的用户主键数组
	 */
	void batchRestart(int[] userIds);
	
	/**
	 * 修改一名用户
	 * @param userBasic 被修改的用户model
	 */
	void update(UserBasic userBasic);
	
	/**
	 * 根据用户名和密码判断某用户是否存在，只判断活跃用户
	 * @param userBasic 被判断的用户model
	 * @return 存在，返回该用户；不存在，返回空
	 */
	UserBasic isExist(UserBasic userBasic);
	
	/**
	 * 根据用户名判断用户是否存在，无论该用户名是否活跃
	 * @param userBasic 被判断的用户model
	 * @return 存在，返回该用户；不存在，返回空
	 */
	UserBasic checkLoginId(UserBasic userBasic);
	
	/**
	 * 根据邮箱地址判断用户是否存在，只判断活跃用户
	 * @param userBasic 被判断的用户model
	 * @return 存在，返回该用户；不存在，返回空
	 */
	UserBasic checkEmail(UserBasic userBasic);
	
	/**
	 * 根据主键查询一名活跃用户
	 * @param id 用于查询的主键
	 * @return 查询结果
	 */
	UserBasic findActiveById(int id);
	
	/**
	 * 查询所有活跃用户
	 * @return 所有活跃用户
	 */
	List<UserBasic> findActiveAll();
	
	/**
	 * 查询所有禁用用户
	 * @return 所有禁用用户
	 */
	List<UserBasic> findBannedAll();
	
	/**
	 * 查询符合条件的活跃用户
	 * @param params 参数map
	 * @return 查询结果
	 */
	List<UserBasic> findActiveByParams(UserBasic us);

	/**
	 * 查询符合条件的禁用用户
	 * @param params 参数map
	 * @return 查询结果
	 */
	List<UserBasic> findBannedByParams(UserBasic us);
	
}







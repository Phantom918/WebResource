/*
 * 文件名：UserBasicMapper.java
 * 版权：Copyright HNNE All Rights Reserved.
 * 描述：用户基本信息model的dao层接口
 * 修改人：袁秀夫
 * 修改时间：2013年8月16日
 * 修改内容：新增
 */
package cn.hnne.hs.dao.user;

import java.util.List;
import java.util.Map;

import cn.hnne.hs.dao.Dao;
import cn.hnne.hs.model.user.UserBasic;
import cn.hnne.pagination.mybatis.annotation.Pagination;


/**
 * 用户基本信息model的dao层接口
 * 
 * @author 袁秀夫
 * @version 1.0, 2013年8月16日
 */
public interface UserBasicMapper extends Dao{
	
	/**
	 * 添加一条用户基本信息记录
	 * @param record 被添加的用户基本信息model
	 * @return 添加时自动生成的主键
	 */
    int insertSelective(UserBasic record);
    
    /**
     * 删除一条用户基本信息记录
     * @param userId 用于删除的主键
     * @return 被删除的记录的主键
     */
    @Deprecated
    int deleteByPrimaryKey(Integer userId);
    
    /**
	 * 删除多条用户基本信息的记录
	 * 
	 * @param userIds
	 *            用于删除的主键数组
	 */
    void deleteByPrimaryKeys(int[] ids);
    
    /**
     * 逻辑删除多条用户记录
	 * @param userIds 被逻辑删除的用户主键数组
     */
    void batchLogicDelete(int[] userIds);
    
    /**
     * 禁用用户
     * @param userId
     * @return 被禁用户的主键
     */
    @Deprecated
    int banByPrimaryKey(Integer userId);
    
    /**
     * 批量禁用用户
     * @param ids 被禁用的主键数组
     */
	void banByPrimaryKeys(int[] ids);
    
   /**
    * 批量启用用户
    * @param ids 被启用的主键数组
    */
    void restartByPrimaryKeys(int[] ids);
	
    /**
     * 修改一条用户基本信息记录，只修改值不为空的字段
     * @param record 用于修改的用户基本信息model
     * @return 被修改的主键
     */
    int updateByPrimaryKeySelective(UserBasic record);
    
   /**
    * 查询所有活跃用户
    * @return 查询结果
    */
    @Pagination // 标示会被分页拦截器拦截
    List<UserBasic> selectAll();
    
    /**
     * 查询所有的禁用用户
     * @return 查询结果
     */
    @Pagination
    List<UserBasic> selectBannedAll();
    
    /**
     * 按参数查询活跃用户
     * @param params 参数map
     * @return 活跃用户的主键list
     */
    @Pagination
    List<Integer> selectIdsByParams(Map<String, Object> params);
    
    /**
     * 按主键list查询活跃用户
     * @param ids 主键list 
     * @return 活跃用户list
     */
    List<UserBasic> selectByIds(List<Integer> ids);
    
    /**
     * 按参数查询禁用用户
     * @param params 参数mao
     * @return 禁用用户的主键list
     */
    @Pagination
    List<Integer> selectBannedIdsByParams(Map<String, Object> params);
    
    /**
     * 按主键list查询禁用用户
     * @param ids 主键list 
     * @return 禁用用户list
     */
    List<UserBasic> selectBannedByIds(List<Integer> ids);
    
    /**
     * 按主键查询活跃用户
     * @param userId 用户主键
     * @return 查询结果
     */
    UserBasic selectByPrimaryKey(Integer userId);
    
    /**
     * 根据登录账号查询所有用户，包括活跃用户和禁用用户
     * @param userBasic 装有用户名的用户model
     * @return 查询结果
     */
    UserBasic selectByLoginId(UserBasic userBasic);
    
    /**
     * 根据登录账号和登录密码查询活跃用户
     * @param userBasic 装有用户名和密码的用户model
     * @return 查询结果
     */
    UserBasic selectByLoginIdAndPwd(UserBasic userBasic);
    
    /**
     * 根据邮箱地址查询活跃用户
     * @param userBasic 装有邮箱地址的用户model
     * @return 查询结果
     */
    UserBasic selectByEmailAddr(UserBasic userBasic);
    
    List<UserBasic> selectActiveByParams(UserBasic userBasic);
    List<UserBasic> selectBannedByParams(UserBasic userBasic);

}
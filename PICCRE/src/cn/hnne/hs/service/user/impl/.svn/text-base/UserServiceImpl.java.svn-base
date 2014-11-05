/*
 * 文件名：IUserService.java
 * 版权：Copyright HNNE All Rights Reserved.
 * 描述：用户管理模块service层实现类
 * 修改人：袁秀夫
 * 修改时间：2013年8月16日
 * 修改内容：新增
 */
package cn.hnne.hs.service.user.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hnne.hs.dao.user.UserBasicMapper;
import cn.hnne.hs.model.user.UserBasic;
import cn.hnne.hs.service.user.IUserService;
import cn.hnne.hs.utils.UserUtils;

/**
 * 用户管理模块service层实现类
 * 
 * @author 袁秀夫
 * @version 1.0, 2013年8月16日
 */
@Service
public class UserServiceImpl implements IUserService {

	private Logger log = Logger.getLogger(this.getClass());
	
	/**
	 * 用户基础信息dao层接口
	 */
	@Autowired
	private UserBasicMapper userBasicMapper;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cn.hnne.hs.service.user.impl.IUserService#add(cn.hnne.hs.model.user.UserBasic
	 * )
	 */
	
	public void add(UserBasic userBasic) {
		userBasic.setLoginPwd(UserUtils.md5Encode(userBasic.getLoginPwd()));
		userBasicMapper.insertSelective(userBasic);
		//userBasic.getUserAppend().setUserId(userBasic.getUserId());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cn.hnne.hs.service.user.impl.IUserService#delete(cn.hnne.hs.model.user
	 * .UserBasic)
	 */
	
	@Deprecated
	public void delete(UserBasic userBasic) {
		userBasicMapper.deleteByPrimaryKey(userBasic.getUserId());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.hnne.hs.service.user.impl.IUserService#batchDelete(int[])
	 */
	
	public void batchDelete(int[] userIds) {
		userBasicMapper.deleteByPrimaryKeys(userIds);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.hnne.hs.service.user.impl.IUserService#batchLogicDelete(int[])
	 */
	
	public void batchLogicDelete(int[] userIds) {
		userBasicMapper.batchLogicDelete(userIds);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cn.hnne.hs.service.user.impl.IUserService#ban(cn.hnne.hs.model.user.UserBasic
	 * )
	 */
	
	@Deprecated
	public void ban(UserBasic userBasic) {
		userBasicMapper.banByPrimaryKey(userBasic.getUserId());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.hnne.hs.service.user.impl.IUserService#batchBan(int[])
	 */
	
	public void batchBan(int[] userIds) {
		userBasicMapper.banByPrimaryKeys(userIds);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.hnne.hs.service.user.impl.IUserService#batchRestart(int[])
	 */
	
	public void batchRestart(int[] userIds) {
		userBasicMapper.restartByPrimaryKeys(userIds);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cn.hnne.hs.service.user.impl.IUserService#update(cn.hnne.hs.model.user
	 * .UserBasic)
	 */
	
	public void update(UserBasic userBasic) {
		if (userBasic.getLoginPwd() != null) {
			userBasic.setLoginPwd(UserUtils.md5Encode(userBasic.getLoginPwd()));
		}
		userBasicMapper.updateByPrimaryKeySelective(userBasic);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cn.hnne.hs.service.user.impl.IUserService#isExist(cn.hnne.hs.model.user
	 * .UserBasic)
	 */
	
	public UserBasic isExist(UserBasic userBasic) {
		log.debug("进入isExist..");
		if (userBasic != null) {
			log.debug("进入isExist..1");
			if (userBasic.getLoginPwd() != null) {
				log.debug("进入isExist..2");
				userBasic.setLoginPwd(UserUtils.md5Encode(userBasic.getLoginPwd()));
			}
		}
		log.debug("进入isExist..3");
		return userBasicMapper.selectByLoginIdAndPwd(userBasic);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cn.hnne.hs.service.user.impl.IUserService#checkLoginId(cn.hnne.hs.model
	 * .user.UserBasic)
	 */
	
	public UserBasic checkLoginId(UserBasic userBasic) {
		return userBasicMapper.selectByLoginId(userBasic);
	}

	/**
	 * 根据邮箱地址判断用户是否存在，只判断活跃用户
	 * 
	 * @return true：不存在；false：存在
	 */
	
	public UserBasic checkEmail(UserBasic userBasic) {
		return userBasicMapper.selectByEmailAddr(userBasic);
	}

	/**
	 * 根据主键查询一名活跃用户
	 */
	
	public UserBasic findActiveById(int id) {
		UserBasic temp = userBasicMapper.selectByPrimaryKey(id);
		return temp;
	}

	/**
	 * 查询所有活跃用户
	 */
	
	public List<UserBasic> findActiveAll() {
		List<UserBasic> temps = userBasicMapper.selectAll();
		return temps;
	}

	/**
	 * 查询所有禁用用户
	 */
	
	public List<UserBasic> findBannedAll() {
		List<UserBasic> temps = userBasicMapper.selectBannedAll();
		return temps;
	}

	/**
	 * 查询符合条件的活跃用户的集合
	 */
	
	public List<UserBasic> findActiveByParams(UserBasic us) {
		List<UserBasic> uss = userBasicMapper.selectActiveByParams(us);
//		List<Integer> ids = userBasicMapper.selectIdsByParams(params);
//		if (ids !=null && ids.size() != 0) {
//			List<UserBasic> temps = userBasicMapper.selectByIds(ids);
//			return temps;
//		}
		if (uss !=null && uss.size() != 0) {
			return uss;
		}
		return null;
	}

	/**
	 * 查询符合条件的禁用用户的主键集合
	 */
	
	public List<UserBasic> findBannedByParams(UserBasic us) {
		/*List<Integer> ids = userBasicMapper.selectBannedIdsByParams(us);
		if (ids.size() != 0) {
			List<UserBasic> temps = userBasicMapper.selectBannedByIds(ids);
			return temps;
		}*/
		
		List<UserBasic> uss = userBasicMapper.selectBannedByParams(us);
		if (uss !=null && uss.size() != 0) {
			return uss;
		}
		return null;
	}

}

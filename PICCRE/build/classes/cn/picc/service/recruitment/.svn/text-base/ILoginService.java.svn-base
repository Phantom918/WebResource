package cn.picc.service.recruitment;

import cn.picc.model.Login;

public interface ILoginService {

	/**
	 * 根据用户名和用户密码查询用户
	 * @param name 用户名
	 * @param pass 密码
	 * @return 登录用户
	 */
	public Login findByNameAndPass(String name,String pass);
	/**
	 * 插入一条用户信息
	 * @param login 登录用户
	 * @return 插入的条数
	 */
	public int insert(Login login);
	/**
	 * 验证用户名是否唯一
	 * @param name 用户名
	 * @return true(唯一) false(不唯一)
	 */
	public boolean nameIsUnique(String name);
	/**
	 * 验证邮箱是否唯一
	 * @param email 邮箱地址
	 * @return true(唯一) false(不唯一)
	 */
	public boolean emailIsUnique(String email);
	/**
	 * 根据用户Id查询用户信息
	 * @param id 用户编号
	 * @return
	 */
	public Login findById(Integer id);
	/**
	 * 根据登录用户对象查询用户信息
	 * @param login 登录用户
	 * @return
	 */
	public Login findByLogin(Login login);
	/**
	 * 更新登录用户信息
	 * @param login 登录用户
	 * @return
	 */
	public int update(Login login);
	/**
	 * 根据Id查询用户记录
	 * @param id
	 * @return
	 */
	int countUser(Integer id);
}

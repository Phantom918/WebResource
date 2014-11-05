package cn.hnne.pagination.mybatis.replacement;

import org.apache.ibatis.plugin.Invocation;

/**
 * sql语句替换接口
 * 
 * @author 马周易
 * 
 */
public interface Replacement {

	/**
	 * 将分页处理后的sql语句替换原有的sql语句
	 */
	void replace(String paginationSql, Invocation invocation) throws Throwable;
}

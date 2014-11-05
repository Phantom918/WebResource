package cn.hnne.pagination.mybatis.dialect;


/**
 * 数据库方言接口
 * @author 马周易
 *
 */
public interface Dialect {

	/**
	 * 获得分页处理后的SQL语句
	 * @param sql 原有的SQL语句
	 * @param offset 起始记录偏移索引，从0开始
	 * @param limit 最大记录条数
	 */
	String getPaginationSql(String sql, int offset, int limit);
	
	/**
	 * 数据库是否支持分页
	 */
	boolean supportPagination();
}

package cn.hnne.pagination.mybatis.dialect;


/**
 * MySql数据库方言类
 * @author 马周易
 *
 */
public class MySqlDialect implements Dialect {

	public String getPaginationSql(String sql, int offset, int limit) {
		StringBuffer paginationSql = new StringBuffer(sql);
		paginationSql.append(" limit ");
		paginationSql.append(offset);
		paginationSql.append(" ,");
		paginationSql.append(limit);
		return paginationSql.toString();
	}

	public boolean supportPagination() {
		return true;
	}

}

package cn.hnne.pagination.mybatis.dialect;

public class OracleDialect implements Dialect {

	public String getPaginationSql(String sql, int offset, int limit) {
		StringBuffer paginationSql = new StringBuffer();
		paginationSql.append("SELECT a.* FROM (SELECT t.*,rownum AS rowNumber FROM (");
		paginationSql.append(sql);
		paginationSql.append(") t WHERE rownum <= ");
		paginationSql.append(offset + limit);
		paginationSql.append(") a WHERE a.rowNumber > ");
		paginationSql.append(offset);
		return paginationSql.toString();
	}

	public boolean supportPagination() {
		return true;
	}

}
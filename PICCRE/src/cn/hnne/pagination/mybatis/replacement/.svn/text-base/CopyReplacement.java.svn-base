package cn.hnne.pagination.mybatis.replacement;

import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.mapping.MappedStatement.Builder;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.session.RowBounds;
import org.springframework.util.StringUtils;

/**
 * 基于复制的sql语句替换类
 * 
 * @author 马周易
 * 
 */
public class CopyReplacement implements Replacement {

	public void replace(String paginationSql, Invocation invocation)
			throws Throwable {
		// mapper描述类，主要属性如下：
		// id：*mapper接口名+方法名
		// resource：*mapper.xml的绝对路径
		// sqlCommandType：方法类型，如SELECT
		// boundSql：sql对象
		MappedStatement mappedStatement = (MappedStatement) invocation
				.getArgs()[0];
		// 方法参数
		Object parameterObject = invocation.getArgs()[1];
		// sql对象
		BoundSql boundSql = mappedStatement.getBoundSql(parameterObject);
		invocation.getArgs()[2] = new RowBounds(RowBounds.NO_ROW_OFFSET,
				RowBounds.NO_ROW_LIMIT);
		BoundSql newBoundSql = new BoundSql(
				mappedStatement.getConfiguration(), paginationSql,
				boundSql.getParameterMappings(),
				boundSql.getParameterObject());
		MappedStatement newMs = copyFromMappedStatement(mappedStatement,
				new BoundSqlSqlSource(newBoundSql));
		invocation.getArgs()[0] = newMs;
	}

	private MappedStatement copyFromMappedStatement(MappedStatement ms,
			SqlSource newSqlSource) {
		Builder builder = new MappedStatement.Builder(ms.getConfiguration(),
				ms.getId(), newSqlSource, ms.getSqlCommandType());
		builder.resource(ms.getResource());
		builder.fetchSize(ms.getFetchSize());
		builder.statementType(ms.getStatementType());
		builder.keyGenerator(ms.getKeyGenerator());
		builder.keyProperty(StringUtils.arrayToCommaDelimitedString(ms
				.getKeyProperties()));
		builder.timeout(ms.getTimeout());
		builder.parameterMap(ms.getParameterMap());
		builder.resultMaps(ms.getResultMaps());
		builder.cache(ms.getCache());
		MappedStatement newMs = builder.build();
		return newMs;
	}

	public static class BoundSqlSqlSource implements SqlSource {
		BoundSql boundSql;

		public BoundSqlSqlSource(BoundSql boundSql) {
			this.boundSql = boundSql;
		}

		public BoundSql getBoundSql(Object parameterObject) {
			return boundSql;
		}
	}

}

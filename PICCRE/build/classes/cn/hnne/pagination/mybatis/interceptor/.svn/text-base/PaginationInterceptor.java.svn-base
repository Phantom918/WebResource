package cn.hnne.pagination.mybatis.interceptor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import org.apache.ibatis.builder.xml.dynamic.ForEachSqlNode;
import org.apache.ibatis.executor.ErrorContext;
import org.apache.ibatis.executor.ExecutorException;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.mapping.ParameterMode;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.property.PropertyTokenizer;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.type.TypeHandler;
import org.apache.ibatis.type.TypeHandlerRegistry;

import cn.hnne.pagination.BeanFactory;
import cn.hnne.pagination.Page;
import cn.hnne.pagination.PageContext;
import cn.hnne.pagination.mybatis.dialect.Dialect;
import cn.hnne.pagination.mybatis.replacement.Replacement;

/**
 * 分页拦截器抽象类，封装了分页拦截器通用的属性和方法
 * 
 * @author 马周易
 * 
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public abstract class PaginationInterceptor implements Interceptor {

	/**
	 * 数据库方言，根据不同的数据库做不同的分页处理
	 */
	private Dialect dialect;

	/**
	 * sql语句替换类
	 */
	private Replacement replacement;

	/**
	 * 默认的sql语句替换类
	 */
	private static final String DEFAULT_REPLACEMENT_CLASS = "cn.hnne.pagination.mybatis.replacement.CopyReplacement";

	public Object intercept(Invocation invocation) throws Throwable {
		// 判断数据是否支持分页
		if (!dialect.supportPagination()) {
			return invocation.proceed();
		}

		// 判断是否需要拦截
		if (needIntercept(invocation)) {
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
			// 获得原有的sql语句
			String sql = boundSql.getSql();
			// 页面实体
			Page page = PageContext.getPage();

			// 查询总记录条数
			int totalRecord = getTotalRecord(invocation);
			page.setTotalRecord(totalRecord);

			// 分页处理后的sql语句
			String paginationSql = dialect.getPaginationSql(sql,
					page.getOffset(), page.getLimit());
			// 将分页处理后的sql语句替换原有的sql语句
			replacement.replace(paginationSql, invocation);
		}

		return invocation.proceed();
	}

	/**
	 * 获得总记录条数
	 */
	private int getTotalRecord(Invocation invocation) throws Throwable {
		int totalRecord = 0;
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
		// 获得原有的sql语句
		String sql = boundSql.getSql();
		// 查询总记录条数的sql语句
		StringBuffer countSql = new StringBuffer();
		countSql.append("SELECT COUNT(1) FROM (").append(sql).append(") T");
		Connection connection = mappedStatement.getConfiguration()
				.getEnvironment().getDataSource().getConnection();
		PreparedStatement countStmt = connection.prepareStatement(countSql
				.toString());
		BoundSql countBS = new BoundSql(mappedStatement.getConfiguration(),
				countSql.toString(), boundSql.getParameterMappings(),
				parameterObject);
		setParameters(countStmt, mappedStatement, countBS, parameterObject);
		ResultSet rs = countStmt.executeQuery();
		if (rs.next()) {
			totalRecord = rs.getInt(1);
		}
		rs.close();
		countStmt.close();
		connection.close();
		return totalRecord;
	}

	private void setParameters(PreparedStatement ps,
			MappedStatement mappedStatement, BoundSql boundSql,
			Object parameterObject) throws SQLException {
		ErrorContext.instance().activity("setting parameters")
				.object(mappedStatement.getParameterMap().getId());
		List<ParameterMapping> parameterMappings = boundSql
				.getParameterMappings();
		if (parameterMappings != null) {
			Configuration configuration = mappedStatement.getConfiguration();
			TypeHandlerRegistry typeHandlerRegistry = configuration
					.getTypeHandlerRegistry();
			MetaObject metaObject = parameterObject == null ? null
					: configuration.newMetaObject(parameterObject);
			for (int i = 0; i < parameterMappings.size(); i++) {
				ParameterMapping parameterMapping = parameterMappings.get(i);
				if (parameterMapping.getMode() != ParameterMode.OUT) {
					Object value;
					String propertyName = parameterMapping.getProperty();
					PropertyTokenizer prop = new PropertyTokenizer(propertyName);
					if (parameterObject == null) {
						value = null;
					} else if (typeHandlerRegistry
							.hasTypeHandler(parameterObject.getClass())) {
						value = parameterObject;
					} else if (boundSql.hasAdditionalParameter(propertyName)) {
						value = boundSql.getAdditionalParameter(propertyName);
					} else if (propertyName
							.startsWith(ForEachSqlNode.ITEM_PREFIX)
							&& boundSql.hasAdditionalParameter(prop.getName())) {
						value = boundSql.getAdditionalParameter(prop.getName());
						if (value != null) {
							value = configuration.newMetaObject(value)
									.getValue(
											propertyName.substring(prop
													.getName().length()));
						}
					} else {
						value = metaObject == null ? null : metaObject
								.getValue(propertyName);
					}
					TypeHandler typeHandler = parameterMapping.getTypeHandler();
					if (typeHandler == null) {
						throw new ExecutorException(
								"There was no TypeHandler found for parameter "
										+ propertyName + " of statement "
										+ mappedStatement.getId());
					}
					typeHandler.setParameter(ps, i + 1, value,
							parameterMapping.getJdbcType());
				}
			}
		}
	}

	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	/**
	 * 加载配置，并根据配置初始化数据库方言
	 */
	public void setProperties(Properties properties) {
		String dialectClass = properties.getProperty("dialectClass");
		if (dialectClass != null) {
			dialect = (Dialect) BeanFactory.newInstance().getBean(dialectClass);
		}
		String replacementClass = properties.getProperty("replacementClass");
		if (replacementClass == null) {
			replacement = (Replacement) BeanFactory.newInstance().getBean(
					DEFAULT_REPLACEMENT_CLASS);
		} else {
			replacement = (Replacement) BeanFactory.newInstance().getBean(
					replacementClass);
		}
	}

	/**
	 * 是否需要拦截
	 */
	protected abstract boolean needIntercept(Invocation invocation)
			throws Throwable;
}

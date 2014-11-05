package cn.hnne.pagination.mybatis.interceptor;

import java.util.Properties;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

/**
 * 基于方法名后缀的Mybatis分页拦截器
 * 
 * @author 马周易
 * 
 */
@Intercepts({ @Signature(type = Executor.class, method = "query", args = {
		MappedStatement.class, Object.class, RowBounds.class,
		ResultHandler.class }) })
public class PaginationSuffixInterceptor extends PaginationInterceptor {

	/**
	 * 方法名后缀
	 */
	private String suffix;
	
	/**
	 * 通过方法名是否以指定字符串结尾判断是否需要拦截
	 */
	@Override
	protected boolean needIntercept(Invocation invocation) throws Throwable {
		// mapper描述类，主要属性如下：
		// id：*mapper接口名+方法名
		// resource：*mapper.xml的绝对路径
		// sqlCommandType：方法类型，如SELECT
		// boundSql：sql对象
		MappedStatement mappedStatement = (MappedStatement) invocation
				.getArgs()[0];
		// *mapper接口名+方法名
		String id = mappedStatement.getId();
		if (id.endsWith(suffix)) {
			return true;
		}
		return false;
	}

	@Override
	public void setProperties(Properties properties) {
		super.setProperties(properties);
		suffix = properties.getProperty("suffix");
		// 默认拦截ByPage结尾的方法
		if (suffix == null) {
			suffix = "ByPage";
		}
	}

}

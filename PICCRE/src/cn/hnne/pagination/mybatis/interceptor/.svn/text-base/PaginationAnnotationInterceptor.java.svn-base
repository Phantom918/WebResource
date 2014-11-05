package cn.hnne.pagination.mybatis.interceptor;

import java.lang.reflect.Method;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

import cn.hnne.pagination.mybatis.annotation.Pagination;

/**
 * 基于注解的Mybatis分页拦截器
 * 
 * @author 马周易
 * 
 */
@Intercepts({ @Signature(type = Executor.class, method = "query", args = {
		MappedStatement.class, Object.class, RowBounds.class,
		ResultHandler.class }) })
@SuppressWarnings({ "rawtypes"})
public class PaginationAnnotationInterceptor extends PaginationInterceptor {

	/**
	 * 通过方法上是否有Pagination注解判断是否需要拦截
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
		// 接口名和方法名的分隔符的索引
		int dotIndex = id.lastIndexOf(".");
		// 接口名
		String className = id.substring(0, dotIndex);
		// 方法名
		String methodName = id.substring(dotIndex + 1, id.length());
		// 接口类
		Class clazz = Class.forName(className);
		// 找到指定方法
		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			if (method.getName().equals(methodName)) {
				// 方法上有pagination注解才被拦截
				if (method.isAnnotationPresent(Pagination.class)) {
					return true;
				}
				return false;
			}
		}
		return false;
	}

}

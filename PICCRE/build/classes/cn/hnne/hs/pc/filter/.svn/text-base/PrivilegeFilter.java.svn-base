package cn.hnne.hs.pc.filter;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.hnne.hs.pc.Admin;
import cn.hnne.hs.pc.datasource.DataSource;
import cn.hnne.hs.pc.verifier.PrivilegeVerifier;
import cn.hnne.hs.pc.verifier.SimplePrivilegeVerifier;
import cn.hnne.pagination.BeanFactory;

/**
 * 权限过滤器
 * 
 * @author 马周易
 * 
 */
public class PrivilegeFilter implements Filter {

	/**
	 * 权限的数据源
	 */
	private DataSource dataSource;

	/**
	 * 权限验证器
	 */
	private PrivilegeVerifier verifier;

	/**
	 * 没有权限时跳转的路径
	 */
	private String denied;

	
	public void destroy() {

	}

	
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		// 权限动作
		String privilegeAction = getPrivilegeAction(req);
		HttpSession session = req.getSession();
		// 用户ID
		int userId = 1;
		try {
			userId = (Integer) session.getAttribute("userId");
		} catch (Exception e) {
			String root = req.getContextPath() + "/";
			resp.sendRedirect(root + "login!login");
			return;
		}
		// 超级管理员
		if (userId == Admin.USER_ID) {
			chain.doFilter(request, response);
			return;
		}
		
		// 上下文
		Map<String, Object> context = new HashMap<String, Object>();
		context.put("modules", session.getAttribute("modules"));
		// 判断是否有权限
		if (verifier.hasPrivilege(userId, privilegeAction, context)) {
			// 如果上下文中的模块权限码不为空，则保存到session级会话中
			Object modulePrivilegeCode = context.get("modulePrivilegeCode");
			if (modulePrivilegeCode != null) {
				session.setAttribute("modulePrivilegeCode", modulePrivilegeCode);
				session.setAttribute("modules", context.get("modules"));
			}
			chain.doFilter(request, response);
		} else {
			// 跳转到拒绝访问页面
			RequestDispatcher dispatcher = request.getRequestDispatcher("/"+denied);
			dispatcher.forward(request, response);
		}
	}

	/**
	 * 获得权限动作权限
	 * 
	 * @param request
	 *            请求对象
	 */
	private String getPrivilegeAction(HttpServletRequest request) {
		// 根路径
		String root = request.getContextPath() + "/";
		// 请求路径
		String uri = request.getRequestURI();
		// 截取根路径和后缀（.action/.do）之间的字符串作为权限动作
		int beginIndex = uri.indexOf(root) + root.length();
		int endIndex = uri.lastIndexOf("[.]");
		if (endIndex == -1) {
			return uri.substring(beginIndex);
		}
		return uri.substring(beginIndex, endIndex);
	}

	
	public void init(FilterConfig config) throws ServletException {
		// 权限数据源路径
		String dataSourcePath = config.getInitParameter("dataSourcePath");
		if (dataSourcePath == null) {
			throw new RuntimeException(
					"请指定权限过滤器启动参数dataSourcePath，该参数用于指定权限的数据源路径！");
		}
		try {
			dataSource = (DataSource) BeanFactory.newInstance().getBean(
					dataSourcePath);
		} catch (Exception e) {
			throw new RuntimeException("找不到" + dataSourcePath + "对应的权限数据源！");
		}
		// 权限验证器路径
		String privilegeVerifierPath = config
				.getInitParameter("privilegeVerifierPath");
		if (privilegeVerifierPath == null) {
			// 默认权限验证器
			verifier = new SimplePrivilegeVerifier();
		} else {
			try {
				verifier = (PrivilegeVerifier) BeanFactory.newInstance()
						.getBean(privilegeVerifierPath);
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException("找不到" + privilegeVerifierPath
						+ "对应的权限验证器！");
			}
		}
		// 设置权限的数据源给权限验证器
		verifier.setDataSource(dataSource);
		// 没有权限时跳转的路径
		denied = config.getInitParameter("denied");
		if (denied == null) {
			throw new RuntimeException("请指定权限过滤器启动参数denied，该参数用于指定没有权限时跳转的路径！");
		}
	}

}

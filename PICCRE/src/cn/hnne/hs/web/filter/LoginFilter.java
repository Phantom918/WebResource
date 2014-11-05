package cn.hnne.hs.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 登录过滤器,过滤没有登录的用户
 * 
 * @author 马周易
 * 
 */
public class LoginFilter implements Filter {

	/**
	 * 白名单，这个名单的路径没有登录也不会被拦截
	 */
	private String whiteList;

	
	public void destroy() {

	}

	
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;

		// 根路径
		String root = req.getContextPath() + "/";
		// 本次请求的路径
		String uri = getPrivilegeAction(req);
		// 两端加入逗号，区分有相同部分的字符串
		uri = "," + uri + ",";
		if (whiteList != null) {
			whiteList = "," + whiteList + ",";
			if (whiteList.indexOf(uri) != -1) {
				// 如果是白名单中的uri，也不拦截
				chain.doFilter(request, response);
				return;
			}
		}
		HttpSession session = req.getSession();
		Object userId = session.getAttribute("userId");
		// 拦截没有登录的用户
		if (userId != null) {
			chain.doFilter(request, response);
		} else {
			resp.sendRedirect(root + "login!login");
		}
	}

	
	public void init(FilterConfig filterConfig) throws ServletException {
		whiteList = filterConfig.getInitParameter("whiteList");
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
		//添加[]，转义字符
		int endIndex = uri.lastIndexOf("[.]");
		if (endIndex == -1) {
			return uri.substring(beginIndex);
		}
		return uri.substring(beginIndex, endIndex);
	}

}

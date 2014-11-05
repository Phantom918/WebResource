package cn.hnne.pagination.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import cn.hnne.pagination.Page;
import cn.hnne.pagination.PageContext;

/**
 * 分页过滤器，过滤页码
 * @author 马周易
 *
 */
@SuppressWarnings("rawtypes")
public class PageFilter implements Filter {
	
	private String limit;

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		String pageNo = request.getParameter(Page.PAGE_NO);
		Page page = PageContext.getPage();
		if (pageNo != null) {
			try {
				page.setPageNo(Integer.valueOf(pageNo));
			} catch (Exception e) {
				// 类型转换错误，不不设置页码，让用户查询第一页
			}
		}
		if (limit != null) {
			try {
				page.setLimit(Integer.valueOf(limit));
			} catch (Exception e) {
				throw new RuntimeException("分页过滤器的启动参数limit必须为数字", e);
			}
		}
		chain.doFilter(request, response);
	}

	public void init(FilterConfig config) throws ServletException {
		limit = config.getInitParameter("limit");
	}

}

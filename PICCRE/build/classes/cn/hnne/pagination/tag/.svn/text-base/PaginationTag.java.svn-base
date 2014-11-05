package cn.hnne.pagination.tag;

import java.io.IOException;
import java.util.Map;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import cn.hnne.pagination.Page;
import cn.hnne.pagination.PageContext;


/**
 * 分页标签类
 * 
 * @author 马周易
 * 
 */
@SuppressWarnings("rawtypes")
public class PaginationTag extends TagSupport {

	private static final long serialVersionUID = 1L;

	/**
	 * 请求路径
	 */
	private String href;

	@Override
	public int doStartTag() throws JspException {
		// 将项目根路径加到请求路径头部
		String path = pageContext.getServletContext().getContextPath();
		href = path + href;
		// 分页实体
		Page page = PageContext.getPage();
		// 页码
		int pageNo = page.getPageNo();
		// 总页数
		int totalPage = page.getTotalPage();
		
		
		// 如果没有一页，那么分页标签就不显示
		if (totalPage <= 0) {
			return super.doStartTag();
		}
				
		// 页码个数
		int size = totalPage < 5 ? totalPage : 5;
		// 开始的页码
		int start = 1;
		if (totalPage > 5) {
			if (pageNo > 3) {
				if (pageNo > totalPage - 2) {
					start = totalPage - 4;
				} else {
					start = pageNo - 2;
				}
			}
		}
		// 结束的页码
		int end = start + size - 1 < totalPage ? start + size - 1 : totalPage;

		JspWriter out = pageContext.getOut();

		try {
			out.print("<div class=\"pagination\"><ul><li");
			// 如果当前页为第一页，那么就“上一页”就不能点击
			if (pageNo == 1) {
				out.print(" class=\"disabled\"><a>上一页</a></li>");
			} else {
				out.print("><a href=\"#\" onclick=\"pagination('");
				out.print(page.getPrevious());
				out.print("');\">上一页</a></li>");
			}
			// 如果当前页码大于3，并且总页数大于5，那么需要显示第一页的超链接
			if (totalPage > 5 && pageNo > 3) {
				out.print("<li><a href=\"#\" onclick=\"pagination('");
				out.print(1);
				out.print("');\">1</a></li><li class=\"disabled\"><a>...</a></li>");
			}
			for (int i = start; i <= end; i++) {
				out.print("<li");
				if (i == pageNo) {
					out.print(" class=\"active\"><a>");
					out.print(i);
				} else {
					out.print("><a href=\"#\" onclick=\"pagination('");
					out.print(i);
					out.print("');\">");
					out.print(i);
				}
				out.print("</a></li>");
			}
			// 如果当前页码小于总页面-3，并且总页数大于5，那么需要显最后一页的超链接
			if (totalPage > 5 && pageNo <= totalPage - 3) {
				out.print("<li class=\"disabled\"><a>...</a></li><li><a href=\"#\" onclick=\"pagination('");
				out.print(totalPage);
				out.print("');\">");
				out.print(totalPage);
				out.print("</a></li>");
			}
			out.print("<li");
			// 如果当前页为最后一页，那么就“下一页”就不能点击
			if (pageNo >= totalPage) {
				out.print(" class=\"disabled\"><a>下一页</a></li>");
			} else {
				out.print("><a href=\"#\" onclick=\"pagination('");
				out.print(page.getNext());
				out.print("');\">下一页</a></li>");
			}
			out.print("</ul></div>");
			
			//处理参数
			StringBuffer pageForm = new StringBuffer("<form action=\"");
			pageForm.append(href);
			pageForm.append("\" name=\"paginationform\" method=\"post\" > <input id=\"paginationformpageNo\" type=\"hidden\" value=\"1\" name=\"pageNo\"/>");
			
			// 查询条件
			@SuppressWarnings("unchecked")
			Map<String, Object> para = page.getPara();
			if (para != null && !para.isEmpty() && !para.equals("null")) {
				for (String key : para.keySet()) {
					if(para.get(key)!=null && !para.get(key).equals(""))
					pageForm.append("<input type=\"hidden\" value=\""+para.get(key)+"\" name=\""+key+"\"/>");
				}
			}
			pageForm.append("</form><script type=\"text/javascript\">function pagination(pageNo){var idInput = document.getElementById(\"paginationformpageNo\");idInput.setAttribute(\"value\",pageNo);document.paginationform.submit();}</script>");
			out.print(pageForm);
		} catch (IOException e) {
			e.printStackTrace();
		}
		PageContext.remove();
		return super.doStartTag();
	}

	public void setHref(String href) {
		this.href = href;
	}
}

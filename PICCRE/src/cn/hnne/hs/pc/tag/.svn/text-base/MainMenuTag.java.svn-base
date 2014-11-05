package cn.hnne.hs.pc.tag;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import cn.hnne.hs.model.privilege.Module;
import cn.hnne.hs.pc.datasource.DataSource;
import cn.hnne.pagination.BeanFactory;

public class MainMenuTag extends TagSupport {

	private static final long serialVersionUID = 1L;

	private DataSource dataSource;
	
	private String index;
	
	private String logout;

	@Override
	public int doEndTag() throws JspException {
		dataSource = (DataSource) BeanFactory.newInstance().getBean(
				"cn.hnne.hs.pc.datasource.mybatis.MyBatisDataSource");
		HttpSession session = pageContext.getSession();
		
		// 获得国际化
		/*HttpServletRequest request = (HttpServletRequest) pageContext.getRequest();
		ResourceBundle rb = ResourceBundle.getBundle("resource", request.getLocale());;
		logout = rb.getString("menu.logout");
		index = rb.getString("menu.index");*/
		
		// 用户ID
		int userId = 1;
		try {
			userId = (Integer) session.getAttribute("userId");
		} catch (Exception e) {
			throw new RuntimeException(
					"在session级会话中找不到用户ID，请将以userId为key将用户ID设置到在session级会话中!");
		}
		List<Module> modules = dataSource.getModules(userId);
		List<Module> tree = new ArrayList<Module>();
		for (Module module : modules) {
			if (module.getParentId() == null) {
				tree.add(module);
			} else {
				for (Module m : modules) {
					if (m.getModuleId().equals(module.getParentId())) {
						m.getSubModules().add(module);
					}
				}
			}
		}
		StringBuffer html = new StringBuffer();
		String root = pageContext.getServletContext().getContextPath();
		html.append("<ul id='menubarUl' class='nav' role='navigation'>");
		html.append("<li id='indexPage'><a href=\"");
		html.append(root);
		html.append("/login!index\"><i class='icon-home'></i>&nbsp;&nbsp;");
		html.append(index);
		html.append("</a></li>");
		for (Module module : tree) {
			html.append("<li id='module");
			html.append(module.getModuleId());
			html.append("'");
			if (module.getSubModules().size() == 0) {
				html.append("><a href=\"");
				html.append(root);
				html.append("/");
				html.append(module.getModuleAction());
				html.append("\"><i id='i");
				html.append(module.getModuleId());
				html.append("'></i>&nbsp;&nbsp;");
				html.append(module.getModuleName());
				html.append("</a>");
			} else {
				html.append(" class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">");
				html.append("<i id='i");
				html.append(module.getModuleId());
				html.append("'></i>&nbsp;&nbsp;");
				html.append(module.getModuleName());
				html.append("<b class=\"caret\"></b>");
				html.append("</a>");
				html.append("<ul class=\"dropdown-menu\">");
				for (Module m : module.getSubModules()) {
					if (m.getSubModules().size() == 0) {
						html.append("<li><a href=\"");
						html.append(root);
						html.append("/");
						html.append(m.getModuleAction());
						html.append("\"><i id='i");
						html.append(m.getModuleId());
						html.append("'></i>&nbsp;&nbsp;");
						html.append(m.getModuleName());
						html.append("</a></li>");
					} else {
						html.append("<li class=\"dropdown-submenu\"><a>");
						html.append("<i id='i");
						html.append(m.getModuleId());
						html.append("'></i>&nbsp;&nbsp;");
						html.append(m.getModuleName());
						html.append("</a>");
						html.append("<ul class=\"dropdown-menu\">");
						for (Module m2 : m.getSubModules()) {
							html.append("<li><a href=\"");
							html.append(root);
							html.append("/");
							html.append(m2.getModuleAction());
							html.append("\"><i id='i");
							html.append(m2.getModuleId());
							html.append("'></i>&nbsp;&nbsp;");
							html.append(m2.getModuleName());
							html.append("</a></li>");
						}
						html.append("</ul>");
						html.append("</li>");
					}
				}
				html.append("</ul>");
			}
			html.append("</li>");
		}
		html.append("<li><a href=\"");
		html.append(root);
		html.append("/login!logout\"><i class='icon-off'></i>&nbsp;&nbsp;");
		html.append(logout);
		html.append("</a></li>");
		html.append("</ul>");
		try {
			pageContext.getOut().write(html.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.doEndTag();
	}
}

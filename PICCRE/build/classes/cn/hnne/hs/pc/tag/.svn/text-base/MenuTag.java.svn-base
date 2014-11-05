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

public class MenuTag extends TagSupport {

	private static final long serialVersionUID = 1L;

	private DataSource dataSource;

	@Override
	public int doEndTag() throws JspException {
		dataSource = (DataSource) BeanFactory.newInstance().getBean(
				"cn.hnne.hs.pc.datasource.mybatis.MyBatisDataSource");
		HttpSession session = pageContext.getSession();
		// 用户ID
		int userId = 1;
		try {
			userId = (Integer) session.getAttribute("userId");
		} catch (Exception e) {
			throw new RuntimeException("在session级会话中找不到用户ID，请将以userId为key将用户ID设置到在session级会话中!");
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
		createMenu(html, tree);
		try {
			pageContext.getOut().write(html.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.doEndTag();
	}
	
	/**
	 * 递归生成菜单
	 * @param menu 要生成的菜单的字符串
	 * @param modules 用户的所有模块，树形
	 */
	private void createMenu(StringBuffer menu, List<Module> modules) {
		menu.append("<ul>");
		for (Module module : modules) {
			menu.append("<li><a");
			if (module.getModuleAction() != null) {
				menu.append(" href=\"");
				menu.append(module.getModuleAction());
				menu.append("\"");
			}
			menu.append(">");
			menu.append(module.getModuleName());
			menu.append("</a>");
			if (module.getSubModules().size() > 0) {
				createMenu(menu, module.getSubModules());
			}
			menu.append("</li>");
		}
		menu.append("</ul>");
	}
}

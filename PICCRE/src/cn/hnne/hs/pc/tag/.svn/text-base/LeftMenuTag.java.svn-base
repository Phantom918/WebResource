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

public class LeftMenuTag extends TagSupport {

	private static final long serialVersionUID = 1L;

	private DataSource dataSource;

	private String pageRoot ;
	@Override
	public int doEndTag() throws JspException {
		dataSource = (DataSource) BeanFactory.newInstance().getBean(
				"cn.hnne.hs.pc.datasource.mybatis.MyBatisDataSource");
		HttpSession session = pageContext.getSession();
		try{
			pageRoot = pageContext.getServletContext().getContextPath();//项目路径
		}catch(Exception e){
			pageRoot = ".";
		}
		pageRoot +="/"; 
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
		html.append("<div class='margin_top panel-group' id='accordion'>");
        html.append("<div class='panel'>");
		for (Module module : tree) {
			if (module.getSubModules().size() == 0){
				html.append("<div class=\"row menu_f\" data-toggle=\"collapse\" data-parent=\"#accordion\" onclick=\"addTab('");
				html.append(module.getModuleId());
				html.append("','");
				html.append(module.getModuleName());
				html.append("','");
				html.append(pageRoot);
				html.append(module.getModuleAction());
				html.append("')\" href=\"#K");
				html.append(module.getModuleId());
				html.append("\">&nbsp;");
				html.append(module.getModuleName());
				html.append("</div>");
			}else{
				html.append("<div class=\"row menu_f\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#K");
				html.append(module.getModuleId());
				html.append("\"><span class=\"glyphicon glyphicon-th-large text-info\"></span>&nbsp;");
				html.append(module.getModuleName());
	            html.append("</div>");
	            
				html.append("<div id=\"K");
				html.append(module.getModuleId());
				html.append("\" class=\"panel-collapse collapse\">");
	            for(Module subModule:module.getSubModules()){
					addModule(html, subModule);
				}
	            html.append("</div>");
			}
		}
		html.append("</div></div>");
		try {
			pageContext.getOut().write(html.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.doEndTag();
	}
	private void addModule(StringBuffer html,Module module){
		float paddingLeft = 2.4f;
		if(module == null || module.getModuleLayer() == null){
			paddingLeft = 2.4f ;
		}else if(module.getModuleLayer()>2){
			paddingLeft = 2.4f - 0.6f;
		}
		if (module.getSubModules().size() == 0) {//没有子菜单
				html.append("<div class=\"row menu_c \" style=\"padding:0.3em 0 0 ");
				html.append(paddingLeft);
				html.append("em\" onclick=\"addTab('");
				html.append(module.getModuleId());
				html.append("','");
				html.append(module.getModuleName());
				html.append("','");
				html.append(pageRoot);
				html.append(module.getModuleAction());
				html.append("')\"><span class=\"glyphicon glyphicon-list-alt\"></span>&nbsp;");
				html.append(module.getModuleName());
				html.append("</div>");
		}else {//有子菜单
				html.append("<div class=\"row menu_c\" style=\"padding:0.3em 0 0 ");
				html.append(paddingLeft);
				html.append("em\" data-toggle=\"collapse\" data-parent=\"#k");
				html.append(module.getParentId());
				html.append("\" href=\"#k");
				html.append(module.getModuleId());
				html.append("\"><span class=\"glyphicon glyphicon-th-large text-info\"></span>&nbsp;");
				html.append(module.getModuleName());
           	    html.append("</div>");
			html.append("<div class=\"panel-collapse collapse\" style=\"padding:0.3em 0 0 ");
			html.append(paddingLeft);
			html.append("em\" id=\"k");
			html.append(module.getModuleId());
			html.append("\">");
			for(Module subModule:module.getSubModules()){
				addModule(html, subModule);
			}
			html.append("</div>");
		}
	}
}

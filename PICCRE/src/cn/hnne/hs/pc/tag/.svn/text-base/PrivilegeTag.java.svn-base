package cn.hnne.hs.pc.tag;

import java.io.IOException;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

import cn.hnne.hs.pc.Admin;

public class PrivilegeTag extends BodyTagSupport {

	private static final long serialVersionUID = 1L;

	private int code;

	@Override
	public int doEndTag() throws JspException {
		int modulePrivilegeCode = 0;
		try {
			modulePrivilegeCode = (Integer) pageContext.getSession()
					.getAttribute("modulePrivilegeCode");
		} catch (Exception e) {
			new RuntimeException("使用权限标签的页面必须在进入页面前提供对应模块的模块权限码！", e);
		}
		HttpSession session = pageContext.getSession();
		// 用户ID
		int userId = 1;
		try {
			userId = (Integer) session.getAttribute("userId");
		} catch (Exception e) {
			throw new RuntimeException(
					"在session级会话中找不到用户ID，请将以userId为key将用户ID设置到在session级会话中!");
		}
		if ((userId == Admin.USER_ID) || ((code & modulePrivilegeCode) == code)) {
			try {
				if (bodyContent != null) {
					pageContext.getOut().write(bodyContent.getString().trim());
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return super.doEndTag();
	}

	public void setCode(int code) {
		this.code = code;
	}

}

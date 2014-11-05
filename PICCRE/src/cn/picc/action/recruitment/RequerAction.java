package cn.picc.action.recruitment;


import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import cn.hnne.hs.common.PageStatus;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import cn.hnne.hs.service.user.IUserService;
import cn.picc.model.Login;
import cn.picc.model.Recruitment;
import cn.picc.service.recruitment.ILoginService;
import cn.picc.service.recruitment.IRequerService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
@Results({@Result(name = "download", type = "stream", params = {  
        "contentType", "application/octet-stream",  
        "inputName", "inputStream", "contentDisposition",  
        "attachment;filename=\"${downloadFileName}\"", "bufferSize",  
        "4096" }),
        @Result(name = "json", type = "json")
}) 
public class RequerAction extends ActionSupport{
	private Logger logger =Logger.getLogger(getClass());
	@Autowired
	IRequerService iRequerService;
	
	private Recruitment recruitment;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	ILoginService iLoginService;
	@Autowired
	IUserService iUserService;
	
	private Login loginUser;
	
	/**
	 * 网页状态标示
	 */
	private int pageStatus = 0;
	/**
	 * 招聘介绍
	 * @return
	 */
	public String index(){
		recruitment = iRequerService.selectById(recruitment.getPkAppDem());
		return "introduce";
	}
	/**
	 * 用户注册
	 * @return
	 */
	public String regist(){
		logger.info("用户名："+loginUser.getName());
		try {
			if(loginUser!=null){
				iLoginService.insert(loginUser);
				pageStatus = PageStatus.REGIST_SUCCESS;
			}
		} catch (Exception e) {
			logger.info("注册时出现异常！",e);
			pageStatus = PageStatus.REGIST_FAIL;
		}
		return index();
	}
	

	/**
	 * 登录
	 */
	public String isExist() {
		try{
			pageStatus = 0;
			logger.debug("进入login！isExist.action");
			logger.debug("进入login！isExist.action");
			Map<String, Object> session = ActionContext.getContext().getSession();
			logger.info("用户："+loginUser);
			Login user = iLoginService.findByLogin(loginUser);
			logger.debug("2");
			if (user != null) {
				session.put("id", user.getId().intValue());
				session.put("name", user.getName());
				/*if(o!=null){
					logger.debug("3");
					Object userId=ServletActionContext.getContext().getSession().get("id");
					if(userId == null){
						pageStatus = PageStatus.LOGIN_FALI;
						return "login";
					}
					loginUser = iLoginService.findById(user.getId().intValue());
					int count = iLoginService.countUser(user.getId().intValue());
				}else{
				}*/
				
			} else {
				pageStatus = PageStatus.NAME_PASS_NOT;
				logger.debug("204");
			}
		}catch(Exception e){
			logger.debug("登录异常：",e);
			pageStatus = PageStatus.LOGIN_FALI;
		}
		return index();
	}
	
	/**
	 * 验证用户名是否唯一
	 * @return
	 */
	public String checkName(){
		boolean isName = false;
		HttpServletResponse response = ServletActionContext.getResponse();
		//PrintWriter writer = null;
		ServletOutputStream out = null;
		try {
			out = response.getOutputStream();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		if(loginUser!=null){
			isName = iLoginService.nameIsUnique(loginUser.getName());
		}
		try {
			if(isName){
				out.print("true");
			}else{
				out.print("false");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 判断用户是否登录
	 * @return
	 */
	public String isLogin(){
		try {
			Object userId=ServletActionContext.getContext().getSession().get("id");
			logger.info("userId = "+userId);
			HttpServletResponse response = ServletActionContext.getResponse();
			PrintWriter writer = response.getWriter();
			if(userId == null){
				logger.info("userId = null"+userId);
				writer.write("true");
				return null;
			}else{
				ServletActionContext.getContext().getSession().put("pkApp", recruitment.getPkAppDem());
				ServletActionContext.getContext().getSession().put("appName", recruitment.getDemName());
				int count = iLoginService.countUser((Integer)userId);
				//String str = "false;"+String.valueOf(count);
				JSONObject jsonArray = new JSONObject();
				jsonArray.put("count", count);
				String message = jsonArray.toString();
				logger.info("userId ！= null"+userId);
				writer.write(message);
				return null;
			}
		} catch (Exception e) {
			logger.error("出错了！", e);
			return null;
		}
		
	}
	
	/**
	 * 点击个人中心执行的操作，如果用户已经登录，直接跳转至个人中心，如果用户没有登录停留本页面
	 * @return
	 */
	public String isLoginTurnToPersonal(){
		try {
			Object userId=ServletActionContext.getContext().getSession().get("id");
			logger.info("userId = "+userId);
			HttpServletResponse response = ServletActionContext.getResponse();
			PrintWriter writer = response.getWriter();
			if(userId == null){
				logger.info("userId = null"+userId);
				writer.write("true");
				return null;
			}else{
				logger.info("userId ！= null"+userId);
				writer.write("false");
				return null;
			}
		} catch (Exception e) {
			logger.error("出错了！", e);
			return null;
		}
		
	}
	
	/**
	 * 下载招聘附件
	 * @return
	 */
	public String dowload(){
		logger.info("下载附件:"+recruitment.getPkAppDem());
		return "download";
	}
	
	public InputStream getInputStream() throws Exception {  
		 return iRequerService.downloadEmp(recruitment.getPkAppDem());  
	}
	
	public String getDownloadFileName() {  
	       try {
				return new String("PICC招聘需求.xls".getBytes("UTF-8"),"ISO8859-1");
			} catch (UnsupportedEncodingException e) {
				logger.debug("DutymanagerAction--index异常",e);
				e.printStackTrace();
				return "file.xls";
			}
	}
	
	public Recruitment getRecruitment() {
		return recruitment;
	}
	
	public void setRecruitment(Recruitment recruitment) {
		this.recruitment = recruitment;
	}
	
	public Login getLoginUser() {
		return loginUser;
	}
	
	public void setLoginUser(Login loginUser) {
		this.loginUser = loginUser;
	}
	
	public int getPageStatus() {
		return pageStatus;
	}
	
	public void setPageStatus(int pageStatus) {
		this.pageStatus = pageStatus;
	}

}

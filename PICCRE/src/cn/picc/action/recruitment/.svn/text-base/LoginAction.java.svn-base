package cn.picc.action.recruitment;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

import cn.hnne.hs.common.PageStatus;
import cn.hnne.hs.service.user.IUserService;
import cn.picc.model.Login;
import cn.picc.model.Recruitment;
import cn.picc.service.recruitment.ILoginService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 登录Action
 * 
 * @author
 * ,"recruitment.pkAppDem","${pkApp}","recruitment.demName","${appName}"
 */
@Results({ 
	@Result(name = "redirectIndex", location = "job!recruitWrite", type = "redirectAction",params={"namespace", "/recruitment"}) ,
	@Result(name = "redirectRecruitIndex", location = "job!queryAllDem", type = "redirectAction",params={"namespace", "/recruitment"}) ,
	@Result(name = "redirectLogin", location = "login!login", type = "redirectAction"),
	@Result(name = "redirectHaveWrite", location = "job!haveWriteBaseMessage", type = "redirectAction",params={"namespace", "/recruitment"}),
	@Result(name = "redirectLogout", location = "job!queryAllDem", type = "redirectAction",params={"namespace", "/recruitment"})
})
public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = -3371682698547180480L;

	private Logger logger =Logger.getLogger(getClass());
	
	@Autowired
	ILoginService iLoginService;
	@Autowired
	IUserService iUserService;
	
	private Login loginUser;
	
	private String name;
	
	private String email;
	
	private String password;
	
	private boolean flag;
	
	private Integer pkId;
	
	private String pkName;
	
	private Recruitment recruitment;
	
	
	
	/**
	 * 网页状态标示
	 */
	private int pageStatus = 0;

	/**
	 * 进入登录页面
	 */
	public String login() {
		logger.debug("进入login!login.action");
		// 相应的操作
		if(String.valueOf(recruitment.getPkAppDem())!=null&&!"".equals(String.valueOf(recruitment.getPkAppDem()))){
			ServletActionContext.getContext().getSession().put("pkApp", recruitment.getPkAppDem());
			ServletActionContext.getContext().getSession().put("appName", recruitment.getDemName());
		}
		return "redirectRecruitIndex";
	}
	
	/**
	 * 进入登录后的首页
	 */
	public String index() {
		// 相应的操作
		logger.debug("进入login！index.action");
		Map<String, Object> session = ActionContext.getContext().getSession();
		Object userId=ServletActionContext.getContext().getSession().get("id");
		if(userId == null){
			//pageStatus = PageStatus.LOGIN_FALI;
			return "login";
		}else{
			session.put("id", userId);
			loginUser = iLoginService.findById((Integer)userId);
			return "index";
		}
		
		
	}

	/**
	 * 登出
	 */
	public String logout() {
		// 　清空会话
		pageStatus = 0;
		logger.debug("进入login！logout.action");
		ActionContext.getContext().getSession().clear();
		return "redirectLogout";
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
			Object o = session.get("pkApp");
			logger.debug("2");
			if (user != null) {
				session.put("id", user.getId().intValue());
				session.put("name", user.getName());
				if(o!=null){
					logger.debug("3");
					/*Object userId=ServletActionContext.getContext().getSession().get("id");
					if(userId == null){
						pageStatus = PageStatus.LOGIN_FALI;
						return "login";
					}*/
					loginUser = iLoginService.findById(user.getId().intValue());
					int count = iLoginService.countUser(user.getId().intValue());
					/*if(count>0){
						return "redirectHaveWrite";
					}else{
						return "redirectIndex";
					}*/
				}else{
					//return "redirectRecruitIndex";
				}
				
			} else {
				pageStatus = PageStatus.NAME_PASS_NOT;
				logger.debug("204");
				//return "login";
			}
		}catch(Exception e){
			logger.debug("登录异常：",e);
			pageStatus = PageStatus.LOGIN_FALI;
			//return "login";
		}
		return "redirectRecruitIndex";
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
	 * 验证用户名和密码是否正确，ajax返回验证结果
	 * @throws IOException 
	 */
	public void checkIdAndPassword() throws IOException {
		System.out.println("进入login！checkIdAndPassword.action");
		Login user = iLoginService.findByLogin(loginUser);
		if (user != null) {
			HttpServletResponse response = ServletActionContext.getResponse();
			PrintWriter writer = response.getWriter();
			writer.print(user.getId());
			writer.flush();
			writer.close();
		}
	}
	
	/**
	 * 修改密码
	 */
	public String updatePassword() {
		System.out.println("进入login！updatePassword.action");
		//pageStatus = 0;
		try{
			iLoginService.update(loginUser);
			pageStatus = PageStatus.UPDATE_SUCCESS;
		} catch(Exception e) {
			pageStatus = PageStatus.UPDATE_FAIL;
		}
		return "login";
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
		return "redirectRecruitIndex";
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
	
	public Integer getPkId() {
		return pkId;
	}

	public void setPkId(Integer pkId) {
		this.pkId = pkId;
	}

	public String getPkName() {
		return pkName;
	}

	public void setPkName(String pkName) {
		this.pkName = pkName;
	}

	public Recruitment getRecruitment() {
		return recruitment;
	}

	public void setRecruitment(Recruitment recruitment) {
		this.recruitment = recruitment;
	}

	public int getPageStatus() {
		return pageStatus;
	}

	public void setPageStatus(int pageStatus) {
		this.pageStatus = pageStatus;
	}

	public Login getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(Login loginUser) {
		this.loginUser = loginUser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}

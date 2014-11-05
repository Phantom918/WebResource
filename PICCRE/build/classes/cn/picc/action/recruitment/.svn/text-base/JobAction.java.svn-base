package cn.picc.action.recruitment;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
import cn.hnne.pagination.Page;
import cn.hnne.pagination.PageContext;
import cn.picc.model.Education;
import cn.picc.model.Experience;
import cn.picc.model.Family;
import cn.picc.model.Login;
import cn.picc.model.Organization;
import cn.picc.model.Recruitment;
import cn.picc.model.RecruitmentDetail;
import cn.picc.model.Reward;
import cn.picc.model.Technical;
import cn.picc.model.User;
import cn.picc.service.recruitment.ILoginService;
import cn.picc.service.recruitment.JobService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


@Results({
		@Result(name = "jsonType", type = "json"),
		@Result(name = "redirectRecruitIndex", location = "job!queryAllDem", type = "redirectAction",params={"namespace", "/recruitment"})
	})

public class JobAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	
	private Logger logger =Logger.getLogger(getClass());
	
	@Autowired
	private JobService jobService;
	
	@Autowired
	ILoginService iLoginService;
	
	@Autowired
	IUserService iUserService;
	
	/**
	 * 分页请求的页数
	 */
	private int pageNo = 1;
	
	/**
	 * 分页标签页数
	 */
	private Page<?> page;
	
	/**
	 * 封装招聘信息查询结果
	 */
	private List<Recruitment> recruitmentList;
	
	/**
	 * 封装招聘信息的主键
	 */
	private Recruitment recruitment;
	
	/**
	 * 封装所有的市公司的信息
	 */
	private List<Organization> organizationList;
	
	/**
	 * 招聘需求详细的查询封装条件
	 */
	private RecruitmentDetail recruitmentDetail;
	
	/**
	 * 招聘需求详细的查询结果集
	 */
	private List<RecruitmentDetail> recruitmentDetailList;
	
	/**
	 * 应聘人员基本信息的表单数据
	 */
	private User user;
	
	/**
	 * 学历信息
	 */
	private Education education;
	
	/**
	 * 履历信息
	 */
	private Experience experience;
	
	/**
	 * 家庭成员信息
	 */
	private Family family;
	
	/**
	 * 奖惩信息
	 */
	private Reward reward;
	
	/**
	 * 技术职称信息
	 */
	private Technical technical;
	
	/**
	 * 提示信息标志位
	 */
	private int messageFlag = 0;
	
	/**
	 * 出生日期
	 */
	private String birthTime;
	
	/**
	 * 参加工作时间
	 */
	private String startWorkTime;
	
	/**
	 * 入党时间
	 */
	private String inPartyTime;
	
	/**
	 * 入党转正时间
	 */
	private String startPartyTime;
	
	/**
	 * 入学时间
	 */
	private String toSchoolTime;
	
	/**
	 * 毕业时间
	 */
	private String grduateTime;
	
	/**
	 * 履历其实时间
	 */
	private String experienceStartTime;
	
	/**
	 * 履历结束时间
	 */
	private String experienceEndTime;
	
	/**
	 * 家庭成员出生日期
	 */
	private String familyBirthTime;
	
	/**
	 * 奖励时间
	 */
	private String rewardTime;
	
	/************************用所有户信息*****************************/
	//个人账户信息
	private Login loginMessage;
	
	//个人基本信息
	private User userMessage;
	
	//个人学历信息
	private List<Education> educationMessage;
	
	//个人履历信息
	private List<Experience> experienceMessage;
		
	//个人奖励与处分信息
	private	List<Reward> rewardMessage;
	
	//个人家庭信息
	private List<Family> familyMessage;
	
	//用于接收简历ID
	private Integer resumeId;
	
	//用于封装用户所有的简历信息
	private List<User> userList;
	
	//学历信息的三个对象（查看详细的时候用）
	private Education education_1; 
	
	private Education education_2; 
	
	private Education education_3; 
	
	//履历信息的三个对象（查看详细的时候用）
	private Experience experience_1;
	
	private Experience experience_2;
	
	private Experience experience_3;
	
	//奖励信息的三个对象（查看详细的时候用）
	private Reward reward_1;
	
	private Reward reward_2;
	
	private Reward reward_3;
	
	//处分信息的三个对象（查看详细的时候用）
	private Reward punish_1;
	
	private Reward punish_2;
	
	private Reward punish_3;
	
	//家庭信息的四个对象（查看详细的时候用）
	private Family family_1;
	
	private Family family_2;
	
	private Family family_3;
	
	private Family family_4;
	
	private Login loginUser;
	
	/**
	 * 网页状态标示
	 */
	private int pageStatus = 0;
	
	//删除信息
	private int deleteFlag = 0;
	
	
	
	/**
	 * 查询出所有的招聘信息
	 * @return
	 */
	public String queryAllDem(){
		logger.info("进入JobAction --> queryAllDem()");
		try {
			page = PageContext.getPage();
			page.setPageNo(pageNo);
			recruitmentList = jobService.findRecruitment();
			
		} catch (Exception e) {
			logger.info("JobAction --> queryAllDem()异常..", e);
		}
		
		return "index";
	}
	
	//时间转换方法
	public String turnDateToString(Date date){
		SimpleDateFormat formatDate = new SimpleDateFormat("yyyy年MM月dd日");
		return formatDate.format(date);
	}
	
	//时间转换方法
	public String turnDateToString_1(Date date){
		SimpleDateFormat formatDate = new SimpleDateFormat("yyyy/MM/dd");
		return formatDate.format(date);
	}
	
	/**
	 * 进入招聘申请页面
	 * @return
	 */
	public String recruitWrite(){
		//logger.info("进入JobAction --> recruitWrite(),主键==="+recruitment.getPkAppDem()+";需求名字"+recruitment.getDemName());
		try {
			//从session取出招聘需求信息
			if(recruitment == null){
				recruitment = new Recruitment();
				BigDecimal pkApp = (BigDecimal)ServletActionContext.getContext().getSession().get("pkApp");
				String pkName = (String)ServletActionContext.getContext().getSession().get("appName");
				recruitment.setPkAppDem(pkApp);
				recruitment.setDemName(pkName);
			}
			//Map<String, Object> session = ServletActionContext.getContext().getSession();
			//session.put("loginId",1);
			organizationList = jobService.selectAllCity();
			
		} catch (Exception e) {
			logger.info("JobAction --> recruitWrite()异常..", e);
		}
		
		return "write";
	}
	
	/**
	 * 进入招聘申请页面(已经填写过基本信息的路线)
	 * @return
	 */
	public String haveWriteBaseMessage(){
		//logger.info("进入JobAction --> recruitWrite(),主键==="+recruitment.getPkAppDem()+";需求名字"+recruitment.getDemName());
		//拿到用户id
		Object temp = (Integer)ServletActionContext.getContext().getSession().get("id");
		logger.info("登录ＩＤ＝＝"+temp);
		try {
			//拿到用户登陆id
			int userId = (Integer)temp;
			//从session取出招聘需求信息
			if(recruitment == null){
				recruitment = new Recruitment();
				BigDecimal pkApp = (BigDecimal)ServletActionContext.getContext().getSession().get("pkApp");
				String pkName = (String)ServletActionContext.getContext().getSession().get("appName");
				recruitment.setPkAppDem(pkApp);
				recruitment.setDemName(pkName);
			}
			//Map<String, Object> session = ServletActionContext.getContext().getSession();
			//session.put("loginId",1);
			organizationList = jobService.selectAllCity();
			//得到用户所有的简历信息
			userList =  jobService.selectResumeByLoginId(userId);
			logger.info("查询到的信息====="+userList.size());
		} catch (Exception e) {
			logger.info("JobAction --> recruitWrite()异常..", e);
		}
		
		return "choice";
	}
	
	
	/**
	 * ajax请求,通过公司编码查询出下面的部门信息，以及通过公司编编码和部门信息查询出他下面的岗位信息
	 * @return
	 */
	public String getAllByRecruit(){
		logger.info("进入JobAction --> getDeptByCompCode()"+"需求主键=="+recruitmentDetail.getPkAppDem()+";公司id=="+recruitmentDetail.getCompCode()+";部门名："+recruitmentDetail.getDeptName());
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter writer = null;
		try {
			if(recruitmentDetail != null){
				recruitmentDetailList = jobService.selectByRecruitment(recruitmentDetail);
				//将对象转换为json格式
				JSONObject jsonArray = new JSONObject();
				jsonArray.put("content", recruitmentDetailList);
				String message = jsonArray.toString();
				writer = response.getWriter();
				writer.write(message);
			}
		} catch (Exception e) {
			logger.info("JobAction --> getDeptByCompCode()异常..", e);
		}finally {
			if (writer != null) {
				writer.close();
			}
		}
		return null;
	}
	
	/**
	 * 新建或者修改用户基本信息
	 * @return
	 */
	public String saveJobMessage(){
		//拿到session中的用户id
		logger.info("进入JobAction --> saveJobMessage()");
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter writer = null;
		try {
			writer = response.getWriter();
			//拿到用户id
			int userId = (Integer)ServletActionContext.getContext().getSession().get("id");
			SimpleDateFormat formatDate = new SimpleDateFormat("yyyy/MM/dd");
	        if(user != null && birthTime != null && !birthTime.equals("")){
	        	Date tm1 = formatDate.parse(birthTime);
	        	user.setBirth(tm1);
	        }
	        if(user != null && startWorkTime != null && !startWorkTime.equals("")){
	        	Date tm1 = formatDate.parse(startWorkTime);
	        	user.setWorkTime(tm1);
	        }
	        if(user != null && inPartyTime != null && !inPartyTime.equals("")){
	        	Date tm1 = formatDate.parse(inPartyTime);
	        	user.setJoinParty(tm1);
	        }
	        if(user != null && startPartyTime != null && !startPartyTime.equals("")){
	        	Date tm1 = formatDate.parse(startPartyTime);
	        	user.setJoinPartyTime(tm1);
	        }
	        //得到简历ID
			int recruitmentID = jobService.insertUserMessage(user, userId);
			logger.info("");
			if(recruitmentID != -1){
				messageFlag = recruitmentID;//操作成功,返回id
			}else{
				messageFlag = -1;//操作失败
			}
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("messageFlag", messageFlag);
			String message = jsonObject.toString();
			writer.write(message);
		} catch (Exception e) {
			logger.info("进入JobAction --> saveJobMessage()异常！！！", e);
		}finally {
			if (writer != null) {
				writer.close();
			}
		}
		return null;
	}
	
	/**
	 * 新建一条求职申报信息
	 * @return
	 */
	public String saveRequirementMessage(){
		//拿到session中的用户id
		logger.info("进入JobAction --> saveRequirementMessage()");
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter writer = null;
		try {
			writer = response.getWriter();
			//拿到用户id
			int userId = (Integer)ServletActionContext.getContext().getSession().get("id");
	        //得到简历ID
			int recruitmentID = jobService.insertRequirementMessage(user, userId);
			logger.info("");
			if(recruitmentID != -1){
				messageFlag = recruitmentID;//操作成功,返回id
			}else{
				messageFlag = -1;//操作失败
			}
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("messageFlag", messageFlag);
			String message = jsonObject.toString();
			writer.write(message);
		} catch (Exception e) {
			logger.info("进入JobAction --> saveRequirementMessage()异常！！！", e);
		}finally {
			if (writer != null) {
				writer.close();
			}
		}
		return null;
	}
	
	/**
	 * 新建或者修改用户学历信息
	 * @return
	 */
	public String saveEducationMessage(){
		logger.info("进入JobAction --> saveJobMessage()");
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter writer = null;
		try {
			writer = response.getWriter();
			SimpleDateFormat formatDate = new SimpleDateFormat("yyyy/MM/dd");
	        if(education != null && toSchoolTime != null && !toSchoolTime.equals("")){  //toSchoolTime grduateTime
	        	Date tm1 = formatDate.parse(toSchoolTime);
	        	education.setEntranceTime(tm1);
	        }
	        if(education != null && grduateTime != null && !grduateTime.equals("")){
	        	Date tm1 = formatDate.parse(grduateTime);
	        	education.setGradTime(tm1);
	        }
			int count = jobService.changeUserEducation(education);
			logger.info("");
			if(count != -1){
				messageFlag = count;//操作成功
			}else{
				messageFlag = -1;//操作失败
			}
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("messageFlag", messageFlag);
			String message = jsonObject.toString();
			writer.write(message);
		} catch (Exception e) {
			logger.info("进入JobAction --> saveJobMessage()异常！！！", e);
		}finally {
			if (writer != null) {
				writer.close();
			}
		}
		return null;
	}
	
	/**
	 * 新建或者修改用户履历信息
	 * @return
	 */
	public String saveExperienceMessage(){
		logger.info("进入JobAction --> saveExperienceMessage()");
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter writer = null;
		try {
			writer = response.getWriter();
			SimpleDateFormat formatDate = new SimpleDateFormat("yyyy/MM/dd");
	        if(experience != null && experienceStartTime != null && !experienceStartTime.equals("")){  //toSchoolTime grduateTime
	        	Date tm1 = formatDate.parse(experienceStartTime);
	        	experience.setBegainTime(tm1);
	        }
	        if(experience != null && experienceEndTime != null && !experienceEndTime.equals("")){
	        	Date tm1 = formatDate.parse(experienceEndTime);
	        	experience.setEndTime(tm1);
	        }
			int count = jobService.changeUserExperience(experience);
			logger.info("");
			if(count != -1){
				messageFlag = count;//操作成功
			}else{
				messageFlag = -1;//操作失败
			}
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("messageFlag", messageFlag);
			String message = jsonObject.toString();
			writer.write(message);
		} catch (Exception e) {
			logger.info("进入JobAction --> saveExperienceMessage()异常！！！", e);
		}finally {
			if (writer != null) {
				writer.close();
			}
		}
		return null;
	}
	
	/**
	 * 新建或者修改用户家庭信息
	 * @return
	 */
	public String saveFamilyMessage(){
		logger.info("进入JobAction --> saveFamilyMessage()");
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter writer = null;
		try {
			writer = response.getWriter();
			SimpleDateFormat formatDate = new SimpleDateFormat("yyyy/MM/dd");
	        if(family != null && familyBirthTime != null && !familyBirthTime.equals("")){  //toSchoolTime grduateTime
	        	Date tm1 = formatDate.parse(familyBirthTime);
	        	family.setBirth(tm1);
	        }
			int count = jobService.changeUserFamily(family);
			if(count != -1){
				messageFlag = count;//操作成功
			}else{
				messageFlag = -1;//操作失败
			}
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("messageFlag", messageFlag);
			String message = jsonObject.toString();
			writer.write(message);
		} catch (Exception e) {
			logger.info("进入JobAction --> saveFamilyMessage()异常！！！", e);
		}finally {
			if (writer != null) {
				writer.close();
			}
		}
		return null;
	}
	
	/**
	 * 新建或者修改用户奖励信息
	 * @return
	 */
	public String saveRewardMessage(){
		logger.info("进入JobAction --> saveRewardMessage()");
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter writer = null;
		try {
			writer = response.getWriter();
			SimpleDateFormat formatDate = new SimpleDateFormat("yyyy/MM/dd");
	        if(reward != null && rewardTime != null && !rewardTime.equals("")){  //toSchoolTime grduateTime
	        	Date tm1 = formatDate.parse(rewardTime);
	        	reward.setRpDate(tm1);
	        }
			int count = jobService.changeUserReword(reward);
			logger.info("");
			if(count != -1){
				messageFlag = count;//操作成功
			}else{
				messageFlag = -1;//操作失败
			}
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("messageFlag", messageFlag);
			String message = jsonObject.toString();
			writer.write(message);
		} catch (Exception e) {
			logger.info("进入JobAction --> saveRewardMessage()异常！！！", e);
		}finally {
			if (writer != null) {
				writer.close();
			}
		}
		return null;
	}
	
	/**
	 * 修改账户信息
	 * @return
	 */
	public String changeLoginMessage(){
		logger.info("进入JobAction --> changeLoginMessage()");
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		PrintWriter writer = null;
		try {
			writer = response.getWriter();
			//拿到用户id
			int userId = (Integer)ServletActionContext.getContext().getSession().get("id");
			loginMessage.setId(BigDecimal.valueOf(userId));
			int count = jobService.updateLoginMessage(loginMessage);
			logger.info("");
			if(count != -1){
				messageFlag = count;//操作成功
			}else{
				messageFlag = 2;//操作失败
			}
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("messageFlag", messageFlag);
			String message = jsonObject.toString();
			writer.write(message);
		} catch (Exception e) {
			logger.info("进入JobAction --> changeLoginMessage()异常！！！", e);
		}finally {
			if (writer != null) {
				writer.close();
			}
		}
		return null;
	}
	
	
	
	/**
	 * 填写完所有信息后,更改用户的状态 
	 * @return
	 */
	public String commitAllMessage(){
		try {
			jobService.changeUserState("1", resumeId);
		} catch (Exception e) {
			logger.info("进入JobAction --> commitAllMessage()异常！！！", e);
		}
		return showPresonalMessage();
	}
	
	/**
	 * 查询出当前用户的所有信息
	 * @return
	 */
	public String showPresonalMessage(){
		logger.info("进入JobAction --> showPresonalMessage()异常！！！");
		// loginMessage userMessage educationMessage experienceMessage rewardMessage familyMessage
		//拿到用户id
		Object temp = (Integer)ServletActionContext.getContext().getSession().get("id");
		logger.info("登录ＩＤ＝＝"+temp);
		if(temp != null){
			try {
				//拿到用户登陆id
				int userId = (Integer)temp;
				//得到账户信息
				loginMessage = jobService.getLoginMessage(userId);
				//得到用户所有的简历信息
				userList =  jobService.selectUserByLoginId(userId);
			} catch (Exception e) {
				logger.info("进入JobAction --> showPresonalMessage()异常！！！", e);
			}
			return "personal";
		}else{//如果用户未登录则跳转到用临时界面
			return "redirectRecruitIndex";
		}
	}
	
	/**
	 * 查看用户的指定简历的详细信息
	 * @return
	 */
	public String seeResumeDetail(){
		//拿到用户id
		Object temp = (Integer)ServletActionContext.getContext().getSession().get("id");
		try {
			//拿到用户登陆id
			int userId = (Integer)temp;
			//得到账户信息
			loginMessage = jobService.getLoginMessage(userId);
			//得到用户基本信息
			userMessage = jobService.getUserMessage(resumeId);
			//得到用户学历信息
			educationMessage = jobService.getEducationMessage(resumeId);
			//将学历信息拆分单独封装
			for (int i = 0; i < educationMessage.size(); i++) {
				if(i == 0){
					education_1 = educationMessage.get(i);
				}else if(i == 1){
					education_2 = educationMessage.get(i);
				}else if(i == 2){
					education_3 = educationMessage.get(i);
				}
			}
			//得到用户履历信息
			experienceMessage = jobService.getExperienceMessage(resumeId);
			//将学历信息拆分单独封装
			for (int i = 0; i < experienceMessage.size(); i++) {
				if(i == 0){
					experience_1 = experienceMessage.get(i);
				}else if(i == 1){
					experience_2 = experienceMessage.get(i);
				}else if(i == 2){
					experience_3 = experienceMessage.get(i);
				}
			}
			//得到用户奖励与处分信息
			rewardMessage = jobService.getRewardMessage(resumeId);
			List<Reward> rewardList_temp1 =new ArrayList<Reward>();//用于封装奖励信息
			List<Reward> rewardList_temp2 =new ArrayList<Reward>();//用于封装惩罚信息
			//将学历信息拆分单独封装
			for (int i = 0; i < rewardMessage.size(); i++) {
				int statue = Integer.valueOf(rewardMessage.get(i).getStatus());
				if(statue == 1){
					rewardList_temp1.add(rewardMessage.get(i));
				}else{
					rewardList_temp2.add(rewardMessage.get(i));
				}
			}
			//拆分奖励信息
			for (int i = 0; i < rewardList_temp1.size(); i++) {
				if(i == 0){
					reward_1 = rewardList_temp1.get(i);
				}else if(i == 1){
					reward_2 = rewardList_temp1.get(i);
				}else if(i == 2){
					reward_3 = rewardList_temp1.get(i);
				}
			}
			//拆分处罚信息
			for (int i = 0; i < rewardList_temp2.size(); i++) {
				if(i == 0){
					punish_1 = rewardList_temp2.get(i);
				}else if(i == 1){
					punish_2 = rewardList_temp2.get(i);
				}else if(i == 2){
					punish_3 = rewardList_temp2.get(i);
				}
			}
			//得到用户家庭信息
			familyMessage = jobService.getFamilyMessage(resumeId);
			for (int i = 0; i < familyMessage.size(); i++) {
				if(i == 0){
					family_1 = familyMessage.get(i);
				}else if(i == 1){
					family_2 = familyMessage.get(i);
				}else if(i == 2){
					family_3 = familyMessage.get(i);
				}else if(i == 3){
					family_4 = familyMessage.get(i);
				}
			}
		} catch (Exception e) {
			logger.info("进入JobAction --> showPresonalMessage()异常！！！", e);
		}
		
		return "detail";
	}
	
	/**
	 * 物理删除指定简历
	 * @return
	 */
	public String deleteSomeRecruit(){
		logger.info("进入JobAction --> deleteSomeRecruit();resumeId=="+resumeId);
		try {//deleteSomeRecruit
			int count = jobService.deleteSomeRecruit(resumeId);
			if(count > 0){
				deleteFlag = 1;
			}else{
				deleteFlag = 2;
			}
		} catch (Exception e) {
			logger.info("JobAction --> deleteSomeRecruit()异常！！！",e);
			deleteFlag = 2;
		}
		return showPresonalMessage();
	}
	
	
	/**
	 * 跳转到新建简历页面
	 * @return
	 */
	public String createResume(){
		logger.info("进入JobAction --> createResume()");
		return "createResume";
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
		return queryAllDem();
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
		return queryAllDem();
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
	
	
	
	
	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public Page<?> getPage() {
		return page;
	}

	public void setPage(Page<?> page) {
		this.page = page;
	}

	public List<Recruitment> getRecruitmentList() {
		return recruitmentList;
	}

	public void setRecruitmentList(List<Recruitment> recruitmentList) {
		this.recruitmentList = recruitmentList;
	}

	public List<Organization> getOrganizationList() {
		return organizationList;
	}

	public void setOrganizationList(List<Organization> organizationList) {
		this.organizationList = organizationList;
	}

	public RecruitmentDetail getRecruitmentDetail() {
		return recruitmentDetail;
	}

	public void setRecruitmentDetail(RecruitmentDetail recruitmentDetail) {
		this.recruitmentDetail = recruitmentDetail;
	}

	public List<RecruitmentDetail> getRecruitmentDetailList() {
		return recruitmentDetailList;
	}

	public void setRecruitmentDetailList(
			List<RecruitmentDetail> recruitmentDetailList) {
		this.recruitmentDetailList = recruitmentDetailList;
	}

	public Recruitment getRecruitment() {
		return recruitment;
	}

	public void setRecruitment(Recruitment recruitment) {
		this.recruitment = recruitment;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Education getEducation() {
		return education;
	}

	public void setEducation(Education education) {
		this.education = education;
	}

	public Experience getExperience() {
		return experience;
	}

	public void setExperience(Experience experience) {
		this.experience = experience;
	}

	public Family getFamily() {
		return family;
	}

	public void setFamily(Family family) {
		this.family = family;
	}

	public Reward getReward() {
		return reward;
	}

	public void setReward(Reward reward) {
		this.reward = reward;
	}

	public Technical getTechnical() {
		return technical;
	}

	public void setTechnical(Technical technical) {
		this.technical = technical;
	}

	public int getMessageFlag() {
		return messageFlag;
	}

	public void setMessageFlag(int messageFlag) {
		this.messageFlag = messageFlag;
	}

	public String getBirthTime() {
		return birthTime;
	}

	public void setBirthTime(String birthTime) {
		this.birthTime = birthTime;
	}

	public String getStartWorkTime() {
		return startWorkTime;
	}

	public void setStartWorkTime(String startWorkTime) {
		this.startWorkTime = startWorkTime;
	}

	public String getInPartyTime() {
		return inPartyTime;
	}

	public void setInPartyTime(String inPartyTime) {
		this.inPartyTime = inPartyTime;
	}

	public String getStartPartyTime() {
		return startPartyTime;
	}

	public void setStartPartyTime(String startPartyTime) {
		this.startPartyTime = startPartyTime;
	}

	public String getToSchoolTime() {
		return toSchoolTime;
	}

	public void setToSchoolTime(String toSchoolTime) {
		this.toSchoolTime = toSchoolTime;
	}

	public String getGrduateTime() {
		return grduateTime;
	}

	public void setGrduateTime(String grduateTime) {
		this.grduateTime = grduateTime;
	}

	public String getExperienceStartTime() {
		return experienceStartTime;
	}

	public void setExperienceStartTime(String experienceStartTime) {
		this.experienceStartTime = experienceStartTime;
	}

	public String getExperienceEndTime() {
		return experienceEndTime;
	}

	public void setExperienceEndTime(String experienceEndTime) {
		this.experienceEndTime = experienceEndTime;
	}

	public String getFamilyBirthTime() {
		return familyBirthTime;
	}

	public void setFamilyBirthTime(String familyBirthTime) {
		this.familyBirthTime = familyBirthTime;
	}

	public String getRewardTime() {
		return rewardTime;
	}

	public void setRewardTime(String rewardTime) {
		this.rewardTime = rewardTime;
	}

	public Login getLoginMessage() {
		return loginMessage;
	}

	public void setLoginMessage(Login loginMessage) {
		this.loginMessage = loginMessage;
	}

	public User getUserMessage() {
		return userMessage;
	}

	public void setUserMessage(User userMessage) {
		this.userMessage = userMessage;
	}

	public List<Education> getEducationMessage() {
		return educationMessage;
	}

	public void setEducationMessage(List<Education> educationMessage) {
		this.educationMessage = educationMessage;
	}

	public List<Experience> getExperienceMessage() {
		return experienceMessage;
	}

	public void setExperienceMessage(List<Experience> experienceMessage) {
		this.experienceMessage = experienceMessage;
	}

	public List<Reward> getRewardMessage() {
		return rewardMessage;
	}

	public void setRewardMessage(List<Reward> rewardMessage) {
		this.rewardMessage = rewardMessage;
	}

	public List<Family> getFamilyMessage() {
		return familyMessage;
	}

	public void setFamilyMessage(List<Family> familyMessage) {
		this.familyMessage = familyMessage;
	}

	public Integer getResumeId() {
		return resumeId;
	}

	public void setResumeId(Integer resumeId) {
		this.resumeId = resumeId;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
	public Education getEducation_1() {
		return education_1;
	}

	public void setEducation_1(Education education_1) {
		this.education_1 = education_1;
	}

	public Education getEducation_2() {
		return education_2;
	}

	public void setEducation_2(Education education_2) {
		this.education_2 = education_2;
	}

	public Education getEducation_3() {
		return education_3;
	}

	public void setEducation_3(Education education_3) {
		this.education_3 = education_3;
	}

	public Experience getExperience_1() {
		return experience_1;
	}

	public void setExperience_1(Experience experience_1) {
		this.experience_1 = experience_1;
	}

	public Experience getExperience_2() {
		return experience_2;
	}

	public void setExperience_2(Experience experience_2) {
		this.experience_2 = experience_2;
	}

	public Experience getExperience_3() {
		return experience_3;
	}

	public void setExperience_3(Experience experience_3) {
		this.experience_3 = experience_3;
	}

	public Reward getReward_1() {
		return reward_1;
	}

	public void setReward_1(Reward reward_1) {
		this.reward_1 = reward_1;
	}

	public Reward getReward_2() {
		return reward_2;
	}

	public void setReward_2(Reward reward_2) {
		this.reward_2 = reward_2;
	}

	public Reward getReward_3() {
		return reward_3;
	}

	public void setReward_3(Reward reward_3) {
		this.reward_3 = reward_3;
	}

	public Reward getPunish_1() {
		return punish_1;
	}

	public void setPunish_1(Reward punish_1) {
		this.punish_1 = punish_1;
	}

	public Reward getPunish_2() {
		return punish_2;
	}

	public void setPunish_2(Reward punish_2) {
		this.punish_2 = punish_2;
	}

	public Reward getPunish_3() {
		return punish_3;
	}

	public void setPunish_3(Reward punish_3) {
		this.punish_3 = punish_3;
	}

	public Family getFamily_1() {
		return family_1;
	}

	public void setFamily_1(Family family_1) {
		this.family_1 = family_1;
	}

	public Family getFamily_2() {
		return family_2;
	}

	public void setFamily_2(Family family_2) {
		this.family_2 = family_2;
	}

	public Family getFamily_3() {
		return family_3;
	}

	public void setFamily_3(Family family_3) {
		this.family_3 = family_3;
	}

	public Family getFamily_4() {
		return family_4;
	}

	public void setFamily_4(Family family_4) {
		this.family_4 = family_4;
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

	public int getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(int deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	

	

	
	
	
	
	
	
	
}

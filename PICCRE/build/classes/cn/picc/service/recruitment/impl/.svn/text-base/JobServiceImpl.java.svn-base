package cn.picc.service.recruitment.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.picc.dao.EducationMapper;
import cn.picc.dao.ExperienceMapper;
import cn.picc.dao.FamilyMapper;
import cn.picc.dao.LoginMapper;
import cn.picc.dao.OrganizationMapper;
import cn.picc.dao.RecruitmentDetailMapper;
import cn.picc.dao.RecruitmentMapper;
import cn.picc.dao.RewardMapper;
import cn.picc.dao.UserMapper;
import cn.picc.model.Education;
import cn.picc.model.EducationExample;
import cn.picc.model.Experience;
import cn.picc.model.ExperienceExample;
import cn.picc.model.Family;
import cn.picc.model.FamilyExample;
import cn.picc.model.Login;
import cn.picc.model.Organization;
import cn.picc.model.Recruitment;
import cn.picc.model.RecruitmentDetail;
import cn.picc.model.Reward;
import cn.picc.model.RewardExample;
import cn.picc.model.User;
import cn.picc.model.UserExample;
import cn.picc.service.recruitment.JobService;

@Service
public class JobServiceImpl implements JobService {

	private Logger logger = Logger.getLogger(getClass()); 
	
	@Autowired
	RecruitmentMapper recruitmentMapper;
	
	@Autowired
	OrganizationMapper organizationMapper;
	
	@Autowired
	RecruitmentDetailMapper recruitmentDetailMapper;
	
	@Autowired
	UserMapper userMapper;
	
	@Autowired
	ExperienceMapper experienceMapper;
	
	@Autowired
	FamilyMapper familyMapper;
	
	@Autowired
	RewardMapper rewardMapper;
	
	@Autowired
	EducationMapper educationMapper;
	
	@Autowired
	LoginMapper loginMapper;
	
	
	public List<Recruitment> findRecruitment() {
		List<Recruitment> recruitments = null;
		try {
			recruitments= recruitmentMapper.selectAllRecruit();
		} catch (Exception e) {
			logger.info("JobServiceImpl --> findRecruitment()异常....", e);
		}
		return recruitments;
	}


	public List<Organization> selectAllCity() {
		List<Organization> orgList = null ;
		try {
			logger.info("进入DAO --> selectAllCity()");
			orgList = organizationMapper.selectAllCityOrg();
		} catch (Exception e) {
			logger.info("JobServiceImpl --> selectAllCity()异常....", e);
		}
		return orgList;
	}

	
	public List<RecruitmentDetail> selectByRecruitment(RecruitmentDetail recruitmentDetail) {
		logger.info("进入JobServiceImpl --> selectByRecruitment方法.....");
		List<RecruitmentDetail> temp = null;
		try {
			temp = recruitmentDetailMapper.selectByRecruitment(recruitmentDetail);
		} catch (Exception e) {
			logger.info("JobServiceImpl --> selectByRecruitment()异常....", e);
		}
		return temp;
	}


	public int findUserCountByUserId(int userId) {
		logger.info("进入JobServiceImpl --> findUserCountByUserId()方法.....");
		int count  = 0;
		try {
			UserExample example = new UserExample();
			example.createCriteria().andPkEmpEqualTo(BigDecimal.valueOf(userId));
			count = userMapper.countByExample(example);
			logger.info("查询到的用户个数为："+count);
		} catch (Exception e) {
			logger.info("JobServiceImpl --> findUserCountByUserId()异常....", e);
		}
		return count;
	}


	public int insertUserMessage(User user, int userId) {
		logger.info("进入JobServiceImpl --> findUserCountByUserId()方法.....");
		int dataCount = -1;
		try {
			if(user.getDemPk() != null){
				user.setStatus("1");//设置状态为1，表示这是简历模板
			}else{
				user.setStatus("10");//设置状态为10，表示这是应聘简历
			}
			//如果传进来的用户的简历id不为空，则进行更新操作
			if(user.getPkEmp() != null && !user.getPkEmp().equals("")){
				logger.info("进入更新操作user.getPkEmp()=="+user.getPkEmp());
				UserExample example = new UserExample();
				example.createCriteria().andPkEmpEqualTo(user.getPkEmp());
				userMapper.updateByExampleSelective(user, example);
				//将主键返回回去
				dataCount = user.getPkEmp().intValue();
			}else{//否则为新建记录操作
				userMapper.insert(user);
				logger.info("新建记录后得到的主键为：" + user.getPkEmp());
				//给简历和登陆账户的中间表插入新纪录
				userMapper.insertToUserLogin(user.getPkEmp().intValue(), userId);
				dataCount = user.getPkEmp().intValue();
				/*
				//如果用户先前已经填写过相关的简历基本信息，则不用再次填写（只需要填写想要应聘的部门信息），直接查询出先前的信息复制给他
				List<Integer> ids = userMapper.selectUserIdByLoginId(userId);
				logger.info("简历表ＩＤ＝＝＝"+ids);
				//如果不是初次插入的用户职位选择信息
				if(ids.size() > 0){
					UserExample example = new UserExample();
					example.createCriteria().andPkEmpEqualTo(BigDecimal.valueOf(ids.get(0)));
					List<User> list = userMapper.selectByExample(example);
					User temp = list.get(0);
					temp.setPkEmp(null);
					temp.setSocialNo(user.getSocialNo());//设置简历名
					temp.setDemName(user.getDemName());//设置招聘需求名
					temp.setDemPk(user.getDemPk());//设置招聘需求id
					temp.setApplyUnitCode(user.getApplyUnitCode());//设置招聘市公司简码
					temp.setApplyUnit(user.getApplyUnit());//设置招聘市公司名
					temp.setApplyDept(user.getApplyDept());//设置招聘部门
					temp.setApplyPost(user.getApplyPost());//设置招聘岗位
					//将新的设置好的用户建立信息对象插入数据库
					userMapper.insert(temp);
					logger.info("新建记录后得到的主键为：" + temp.getPkEmp());
					//给简历和登陆账户的中间表插入新纪录
					userMapper.insertToUserLogin(temp.getPkEmp().intValue(), userId);
					dataCount = temp.getPkEmp().intValue();
				}else{//如果用户先前没填写过一份简历信息，则直接将当前所填写的信息插入数据库
					userMapper.insert(user);
					logger.info("新建记录后得到的主键为：" + user.getPkEmp());
					//给简历和登陆账户的中间表插入新纪录
					userMapper.insertToUserLogin(user.getPkEmp().intValue(), userId);
					dataCount = user.getPkEmp().intValue();
				}
				*/
			}
		} catch (Exception e) {
			logger.info("JobServiceImpl --> findUserCountByUserId()异常....", e);
			dataCount = -1;
		}
		return dataCount;
	}


	public int changeUserEducation(Education education) {
		logger.info("进入JobServiceImpl --> changeUserEducation()方法.....");
		int dataCount = -1;
		try {
			EducationExample example = new EducationExample();
			if(education.getPkEducation() != null){
				example.createCriteria().andPkEducationEqualTo(education.getPkEducation());
				educationMapper.updateByExampleSelective(education, example);
				dataCount = education.getPkEducation().intValue();
			}else{
				educationMapper.insert(education);
				dataCount = education.getPkEducation().intValue();
			}
		} catch (Exception e) {
			logger.info("JobServiceImpl --> changeUserEducation()异常....", e);
			dataCount = -1;
		}
		return dataCount;
	}


	public int changeUserReword(Reward reward) {
		logger.info("进入JobServiceImpl --> changeUserReword()方法.....");
		int dataCount = -1;
		try {
			RewardExample example = new RewardExample();
			if(reward.getPkRewPun() != null){
				example.createCriteria().andPkRewPunEqualTo(reward.getPkRewPun());
				rewardMapper.updateByExampleSelective(reward, example);
				dataCount = reward.getPkRewPun().intValue();
			}else{
				rewardMapper.insert(reward);
				dataCount = reward.getPkRewPun().intValue();
			}
		} catch (Exception e) {
			logger.info("JobServiceImpl --> changeUserReword()异常....", e);
			dataCount = -1;
		}
		return dataCount;
	}


	public int changeUserExperience(Experience experience) {
		logger.info("进入JobServiceImpl --> changeUserExperience()方法.....");
		int dataCount = -1;
		try {
			ExperienceExample example = new ExperienceExample();
			if(experience.getPkExp() != null){
				example.createCriteria().andPkExpEqualTo(experience.getPkExp());
				experienceMapper.updateByExampleSelective(experience, example);
				dataCount = experience.getPkExp().intValue();
			}else{
				experienceMapper.insert(experience);
				dataCount = experience.getPkExp().intValue();
			}
		} catch (Exception e) {
			logger.info("JobServiceImpl --> changeUserExperience()异常....", e);
			dataCount = -1;
		}
		return dataCount;
	}


	public int changeUserFamily(Family family) {
		logger.info("进入JobServiceImpl --> changeUserFamily()方法.....");
		int dataCount = -1;
		try {
			FamilyExample example = new FamilyExample();
			if(family.getPkFamily() != null){
				example.createCriteria().andPkFamilyEqualTo(family.getPkFamily());
				familyMapper.updateByExampleSelective(family, example);
				dataCount = family.getPkFamily().intValue();
			}else{
				familyMapper.insert(family);
				dataCount =  family.getPkFamily().intValue();
			}
		} catch (Exception e) {
			logger.info("JobServiceImpl --> changeUserFamily()异常....", e);
			dataCount = -1;
		}
		return dataCount;
	}


	public int changeUserState(String statue, int userId) {
		logger.info("进入JobServiceImpl --> changeUserState()方法.....");
		int count = 0;
		try {
			UserExample example = new UserExample();
			example.createCriteria().andPkEmpEqualTo(BigDecimal.valueOf(userId));
			User user = new User();
			user.setStatus(statue);
			user.setPkEmp(BigDecimal.valueOf(userId));
			count = userMapper.updateByExampleSelective(user, example);
		} catch (Exception e) {
			logger.info("JobServiceImpl --> changeUserState()异常....", e);
		}
		return count;
	}


	public Login getLoginMessage(int userId) {
		return loginMapper.selectByPrimaryKey(BigDecimal.valueOf(userId));
	}


	public User getUserMessage(int userId) {
		List<User> user = null;
		User userMessage = null;
		try {
			UserExample example = new UserExample();
			example.createCriteria().andPkEmpEqualTo(BigDecimal.valueOf(userId));
			user = userMapper.selectByExample(example);
			if (user.size() != 0) {
				userMessage = user.get(0);
			}
		} catch (Exception e) {
			logger.info("JobServiceImpl --> getUserMessage()异常....", e);
		}
		
		return userMessage;
	}


	public List<Education> getEducationMessage(int userId) {
		List<Education> educations = null;
		try {
			EducationExample example = new EducationExample();
			example.createCriteria().andPkEmpEqualTo(BigDecimal.valueOf(userId));
			educations = educationMapper.selectByExample(example);
		} catch (Exception e) {
			logger.info("JobServiceImpl --> getEducationMessage()异常....", e);
		}
		return educations;
	}


	public List<Experience> getExperienceMessage(int userId) {
		List<Experience> experiences = null;
		try {
			ExperienceExample example = new ExperienceExample();
			example.createCriteria().andPkEmpEqualTo(BigDecimal.valueOf(userId));
			experiences = experienceMapper.selectByExample(example);
		} catch (Exception e) {
			logger.info("JobServiceImpl --> getExperienceMessage()异常....", e);
		}
		return experiences;
	}


	public List<Reward> getRewardMessage(int userId) {
		List<Reward> rewards = null;
		try {
			RewardExample example = new RewardExample();
			example.createCriteria().andPkEmpEqualTo(BigDecimal.valueOf(userId));
			rewards = rewardMapper.selectByExample(example);
		} catch (Exception e) {
			logger.info("JobServiceImpl --> getRewardMessage()异常....", e);
		}
		return rewards;
	}


	public List<Family> getFamilyMessage(int userId) {
		List<Family> families = null;
		try {
			FamilyExample example = new FamilyExample();
			example.createCriteria().andPkEmpEqualTo(BigDecimal.valueOf(userId));
			families = familyMapper.selectByExample(example);
		} catch (Exception e) {
			logger.info("JobServiceImpl --> getFamilyMessage()异常....", e);
		}
		return families;
	}


	public int updateLoginMessage(Login login) {
		int count = 0;
		try {
			count = loginMapper.updateByPrimaryKeySelective(login);
		} catch (Exception e) {
			logger.info("JobServiceImpl --> updateLoginMessage()异常....", e);
		}
		return count;
	}


	public List<User> selectUserByLoginId(int loginId) {
		List<User> list = null;
		logger.info("进入JobServiceImpl --> selectUserByLoginId()方法.....");
		try {
			List<Integer> ids = userMapper.selectUserIdByLoginId(loginId);
			list = userMapper.selectUserByPkList(ids);
		} catch (Exception e) {
			logger.info("JobServiceImpl --> selectUserByLoginId()异常....", e);
		}
		return list;
	}


	public int insertRequirementMessage(User user, int userId) {
		logger.info("进入JobServiceImpl --> findUserCountByUserId()方法.....");
		int dataCount = 0;
		try {
			//查询出所选简历模板的个人信息
			UserExample userExample = new UserExample();
			userExample.createCriteria().andPkEmpEqualTo(user.getPkEmp());
			List<User> userList = userMapper.selectByExample(userExample);
			//查询出所选建立模板的家庭成员信息
			FamilyExample  familyExample = new FamilyExample();
			familyExample.createCriteria().andPkEmpEqualTo(user.getPkEmp());
			List<Family> familyList = familyMapper.selectByExample(familyExample);
			//查询出所选建立模板的学历信息
			EducationExample  educationExample = new EducationExample();
			educationExample.createCriteria().andPkEmpEqualTo(user.getPkEmp());
			List<Education> educationList = educationMapper.selectByExample(educationExample);
			//查询出所选建立模板的履历信息
			ExperienceExample  experienceExample = new ExperienceExample();
			experienceExample.createCriteria().andPkEmpEqualTo(user.getPkEmp());
			List<Experience> experienceList = experienceMapper.selectByExample(experienceExample);
			//查询出所选建立模板的奖惩信息
			RewardExample  rewardExample = new RewardExample();
			rewardExample.createCriteria().andPkEmpEqualTo(user.getPkEmp());
			List<Reward> rewardList = rewardMapper.selectByExample(rewardExample);
			//先将基础数据插入简历主表
			User temp = userList.get(0);
			temp.setPkEmp(null);
			temp.setStatus("1");//设置状态为1，表示这是已经投递的简历
			temp.setDemName(user.getDemName());//设置招聘需求名
			temp.setDemPk(user.getDemPk());//设置招聘需求id
			temp.setApplyUnitCode(user.getApplyUnitCode());//设置招聘市公司简码
			temp.setApplyUnit(user.getApplyUnit());//设置招聘市公司名
			//设置招聘部门
			if(user.getApplyDept().equals("") || user.getApplyDept().equals("null")){
				temp.setApplyDept(null);
			}else{
				temp.setApplyDept(user.getApplyDept());//设置招聘部门
			}
			//设置招聘岗位
			if(user.getApplyPost().equals("") || user.getApplyPost().equals("null")){
				temp.setApplyPost(null);
			}else{
				temp.setApplyPost(user.getApplyPost());//设置招聘岗位
			}
			//temp.setApplyDept(user.getApplyDept());//设置招聘部门
			//temp.setApplyPost(user.getApplyPost());//设置招聘岗位
			//将新的设置好的用户建立信息对象插入数据库
			userMapper.insert(temp);
			//取得刚刚生成的主键
			BigDecimal resumeId = temp.getPkEmp();
			logger.info("新建记录后得到的主键为：" + resumeId);
			//插入新的家庭表信息
			for (int i = 0; i < familyList.size(); i++) {
				Family temp1 = familyList.get(i);
				temp1.setPkEmp(resumeId);
				temp1.setPkFamily(null);
				familyMapper.insert(temp1);
			}
			//插入新的履历表信息
			for (int i = 0; i < experienceList.size(); i++) {
				Experience temp1 = experienceList.get(i);
				temp1.setPkEmp(resumeId);
				temp1.setPkExp(null);
				experienceMapper.insert(temp1);
			}
			//插入新的学历表信息
			for (int i = 0; i < educationList.size(); i++) {
				Education temp1 = educationList.get(i);
				temp1.setPkEmp(resumeId);
				temp1.setPkEducation(null);
				educationMapper.insert(temp1);
			}
			//插入新的奖惩表信息
			for (int i = 0; i < rewardList.size(); i++) {
				Reward temp1 = rewardList.get(i);
				temp1.setPkEmp(resumeId);
				temp1.setPkRewPun(null);
				rewardMapper.insert(temp1);
			}
			//给简历和登陆账户的中间表插入新纪录
			userMapper.insertToUserLogin(resumeId.intValue(), userId);
			dataCount = resumeId.intValue();
		} catch (Exception e) {
			logger.info("JobServiceImpl --> findUserCountByUserId()异常....", e);
			dataCount = -1;
		}
		return dataCount;
	}


	public int deleteSomeRecruit(int recruitId) {
		logger.info("JobServiceImpl --> deleteSomeRecruit()");
		int count = 0;
		try {
			UserExample example = new UserExample();
			example.createCriteria().andPkEmpEqualTo(BigDecimal.valueOf(recruitId));
			List<User> users = userMapper.selectByExample(example);
			User temp = users.get(0);
			temp.setStatus("100");
			count = userMapper.updateByExample(temp, example);
		} catch (Exception e) {
			logger.info("JobServiceImpl --> deleteSomeRecruit()异常....", e);
		}
		return count;
	}


	public List<User> selectResumeByLoginId(int loginId) {
		List<User> list = null;
		logger.info("进入JobServiceImpl --> selectUserByLoginId()方法.....");
		try {
			List<Integer> ids = userMapper.selectUserIdByLoginId(loginId);
			list = userMapper.selectResumeByLoginId(ids);
		} catch (Exception e) {
			logger.info("JobServiceImpl --> selectUserByLoginId()异常....", e);
		}
		return list;
	}


	

}

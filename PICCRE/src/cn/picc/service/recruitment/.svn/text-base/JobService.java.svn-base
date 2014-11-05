package cn.picc.service.recruitment;

import java.util.List;

import cn.picc.model.Education;
import cn.picc.model.Experience;
import cn.picc.model.Family;
import cn.picc.model.Login;
import cn.picc.model.Organization;
import cn.picc.model.Recruitment;
import cn.picc.model.RecruitmentDetail;
import cn.picc.model.Reward;
import cn.picc.model.User;

/**
 * 职位信息查询action
 * @author 飘云羽逸
 *
 */
public interface JobService {

	
	/**
	 * 查询出已经发布的招聘需求
	 * @param ApplyDem 需求表参数
	 * @return
	 */
	public List<Recruitment> findRecruitment(); 
	
	/**
	 * 查出所有的市公司信息
	 * @return 是公司信息的集合
	 */
	public List<Organization> selectAllCity();
	
	/**
     * 根据详细需求对象的信息,查询出需要的对象
     * @param recruitmentDetail 详细需求查询条件
     * @return
     */
    public List<RecruitmentDetail> selectByRecruitment(RecruitmentDetail recruitmentDetail);
	
	
    /**
     * 根据用户id查询用户记录
     */
    public int findUserCountByUserId(int userId);
    
    
    
    /**
	 * 插入或者更新一条用户简历的数据信息
	 * @param user 用户的简历对象
	 * @param userId 用户登录id
	 * @return 新插入的或者更新的主键
	 */
    public int insertUserMessage(User user, int userId);
    
    /**
	 * 插入或者更新一条用户学历信息
	 * @param user
	 * @return
	 */
    public int changeUserEducation(Education education);
    
    /**
	 * 插入或者更新一条用户奖励或者处分信息
	 * @param user
	 * @return
	 */
    public int changeUserReword(Reward reward);
    
    /**
	 * 插入或者更新一条用户的履历信息
	 * @param user
	 * @return
	 */
    public int changeUserExperience(Experience experience);
    
    /**
	 * 插入或者更新一条用户家庭成员的信息
	 * @param user
	 * @return
	 */
    public int changeUserFamily(Family family);
    
    /**
     * 填写完所有的表单后,更改用户的状态信息
     * @param statue 希望更改的状态
     * @param userId 用户ID
     * @return 更新的条数
     */
    public int changeUserState(String statue, int userId);
    
    /*********************************************************/
    /**
     * 根据用户ID查询出个人账户信息
     * @param userId 用户ID
     * @return 个人账户信息
     */
    public Login getLoginMessage(int userId);
    
    /**
     * 根据用户ID查询出个人基本信息
     * @param userId 用户ID
     * @return 个人基本信息
     */
    public User getUserMessage(int userId);
    
    /**
     * 根据用户ID查询出个人学历信息
     * @param userId 用户ID
     * @return 个人学历信息
     */
    public List<Education> getEducationMessage(int userId);
    
    /**
     * 根据用户ID查询出个人履历信息
     * @param userId 用户ID
     * @return 个人履历信息
     */
    public List<Experience> getExperienceMessage(int userId);
    
    /**
     * 根据用户ID查询出个人奖励与处分信息
     * @param userId 用户ID
     * @return 个人奖励与处分信息
     */
    public List<Reward> getRewardMessage(int userId);
    
    /**
     * 根据用户ID查询出个人家庭信息
     * @param userId 用户ID
     * @return 个人家庭信息
     */
    public List<Family> getFamilyMessage(int userId);
    
    /**
     * 修改用户的账户信息
     * @param login 账户封装实体
     * @return 修改成功条数
     */
    public int updateLoginMessage(Login login);
    
    /**
     * 根据用户的登陆ID查询出他所有简历信息,用于显示个人中心中的全部简历（包括已经申请的简历，和模板简历）
     * @param loginId 登陆ID
     * @return 建立信息的集合
     */
    public List<User> selectUserByLoginId(int loginId);
    
    /**
   	 * 插入一条用户求职申报信息
   	 * @param user 用户的简历对象
   	 * @param userId 用户登录id
   	 * @return 新插入的或者更新的主键
   	 */
    public int insertRequirementMessage(User user, int userId);
       
    /**
     * 根据简历ＩＤ物理删除简历信息，删除状态就是设置状态为：100
     * @param recruitId 
     * @return 删除记录成功条数
     */
    public int deleteSomeRecruit(int recruitId);
    
    /**
     * 根据用户的登陆ID查询出他所有模板简历信息
     * @param loginId 登陆ID
     * @return 模板信息的集合
     */
    public List<User> selectResumeByLoginId(int loginId);
    
}

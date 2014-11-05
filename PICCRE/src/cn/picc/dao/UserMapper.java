package cn.picc.dao;

import cn.hnne.hs.dao.Dao;
import cn.picc.model.User;
import cn.picc.model.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper   extends Dao   {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);
    
    /**
     * 新建用户基本 信息表后，将用户简历主键和登陆主键存入中间表
     * @param userId
     * @param loginId
     * @return 成功的条数
     */
    int insertToUserLogin(int userId, int loginId);
    
    /**
     * 根据账户登陆id,查询出相关联的简历的id集合
     * @param loginId 登陆id
     * @return 简历id的集合
     */
    List<Integer> selectUserIdByLoginId(int loginId);
    
    /**
     * 根据用户传入的简历id结合，查询出所有的简历
     * @param ids
     * @return 简历信息的集合
     */
    List<User> selectUserByPkList(List<Integer> ids);
    
    /**
     * 根据用户传入的简历id集合，查询出所有的模板简历
     * @param ids
     * @return 简历信息的集合
     */
    List<User> selectResumeByLoginId(List<Integer> ids);
    
}
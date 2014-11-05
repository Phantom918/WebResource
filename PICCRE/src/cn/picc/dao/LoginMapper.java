package cn.picc.dao;

import cn.hnne.hs.dao.Dao;
import cn.picc.model.Login;
import cn.picc.model.LoginExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginMapper extends Dao{
    int countByExample(LoginExample example);

    int deleteByExample(LoginExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(Login record);

    int insertSelective(Login record);

    List<Login> selectByExample(LoginExample example);

    Login selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") Login record, @Param("example") LoginExample example);

    int updateByExample(@Param("record") Login record, @Param("example") LoginExample example);

    int updateByPrimaryKeySelective(Login record);

    int updateByPrimaryKey(Login record);
    
}
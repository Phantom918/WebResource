package cn.picc.dao;

import cn.hnne.hs.dao.Dao;
import cn.picc.model.Experience;
import cn.picc.model.ExperienceExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExperienceMapper extends Dao {
    int countByExample(ExperienceExample example);

    int deleteByExample(ExperienceExample example);

    int deleteByPrimaryKey(BigDecimal pkExp);

    int insert(Experience record);

    int insertSelective(Experience record);

    List<Experience> selectByExample(ExperienceExample example);

    Experience selectByPrimaryKey(BigDecimal pkExp);

    int updateByExampleSelective(@Param("record") Experience record, @Param("example") ExperienceExample example);

    int updateByExample(@Param("record") Experience record, @Param("example") ExperienceExample example);

    int updateByPrimaryKeySelective(Experience record);

    int updateByPrimaryKey(Experience record);
}
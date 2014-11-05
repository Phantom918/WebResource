package cn.picc.dao;

import cn.hnne.hs.dao.Dao;
import cn.picc.model.Education;
import cn.picc.model.EducationExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EducationMapper  extends Dao {
    int countByExample(EducationExample example);

    int deleteByExample(EducationExample example);

    int deleteByPrimaryKey(BigDecimal pkEducation);

    int insert(Education record);

    int insertSelective(Education record);

    List<Education> selectByExample(EducationExample example);

    Education selectByPrimaryKey(BigDecimal pkEducation);

    int updateByExampleSelective(@Param("record") Education record, @Param("example") EducationExample example);

    int updateByExample(@Param("record") Education record, @Param("example") EducationExample example);

    int updateByPrimaryKeySelective(Education record);

    int updateByPrimaryKey(Education record);
}
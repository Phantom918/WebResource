package cn.picc.dao;

import cn.hnne.hs.dao.Dao;
import cn.picc.model.Family;
import cn.picc.model.FamilyExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FamilyMapper extends Dao {
    int countByExample(FamilyExample example);

    int deleteByExample(FamilyExample example);

    int deleteByPrimaryKey(BigDecimal pkFamily);

    int insert(Family record);

    int insertSelective(Family record);

    List<Family> selectByExample(FamilyExample example);

    Family selectByPrimaryKey(BigDecimal pkFamily);

    int updateByExampleSelective(@Param("record") Family record, @Param("example") FamilyExample example);

    int updateByExample(@Param("record") Family record, @Param("example") FamilyExample example);

    int updateByPrimaryKeySelective(Family record);

    int updateByPrimaryKey(Family record);
}
package cn.picc.dao;

import cn.hnne.hs.dao.Dao;
import cn.picc.model.Technical;
import cn.picc.model.TechnicalExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TechnicalMapper  extends Dao  {
    int countByExample(TechnicalExample example);

    int deleteByExample(TechnicalExample example);

    int deleteByPrimaryKey(BigDecimal pkTechTitle);

    int insert(Technical record);

    int insertSelective(Technical record);

    List<Technical> selectByExample(TechnicalExample example);

    Technical selectByPrimaryKey(BigDecimal pkTechTitle);

    int updateByExampleSelective(@Param("record") Technical record, @Param("example") TechnicalExample example);

    int updateByExample(@Param("record") Technical record, @Param("example") TechnicalExample example);

    int updateByPrimaryKeySelective(Technical record);

    int updateByPrimaryKey(Technical record);
}
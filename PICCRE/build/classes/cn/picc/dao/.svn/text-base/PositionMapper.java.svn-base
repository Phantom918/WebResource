package cn.picc.dao;

import cn.hnne.hs.dao.Dao;
import cn.picc.model.Position;
import cn.picc.model.PositionExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PositionMapper extends Dao  {
    int countByExample(PositionExample example);

    int deleteByExample(PositionExample example);

    int deleteByPrimaryKey(BigDecimal pkPost);

    int insert(Position record);

    int insertSelective(Position record);

    List<Position> selectByExample(PositionExample example);

    Position selectByPrimaryKey(BigDecimal pkPost);

    int updateByExampleSelective(@Param("record") Position record, @Param("example") PositionExample example);

    int updateByExample(@Param("record") Position record, @Param("example") PositionExample example);

    int updateByPrimaryKeySelective(Position record);

    int updateByPrimaryKey(Position record);
}
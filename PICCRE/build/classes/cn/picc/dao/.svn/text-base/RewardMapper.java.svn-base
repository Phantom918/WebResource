package cn.picc.dao;

import cn.hnne.hs.dao.Dao;
import cn.picc.model.Reward;
import cn.picc.model.RewardExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RewardMapper extends Dao  {
    int countByExample(RewardExample example);

    int deleteByExample(RewardExample example);

    int deleteByPrimaryKey(BigDecimal pkRewPun);

    int insert(Reward record);

    int insertSelective(Reward record);

    List<Reward> selectByExample(RewardExample example);

    Reward selectByPrimaryKey(BigDecimal pkRewPun);

    int updateByExampleSelective(@Param("record") Reward record, @Param("example") RewardExample example);

    int updateByExample(@Param("record") Reward record, @Param("example") RewardExample example);

    int updateByPrimaryKeySelective(Reward record);

    int updateByPrimaryKey(Reward record);
}
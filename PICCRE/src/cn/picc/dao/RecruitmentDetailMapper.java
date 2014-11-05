package cn.picc.dao;

import cn.hnne.hs.dao.Dao;
import cn.picc.model.RecruitmentDetail;
import cn.picc.model.RecruitmentDetailExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecruitmentDetailMapper extends Dao  {
    int countByExample(RecruitmentDetailExample example);

    int deleteByExample(RecruitmentDetailExample example);

    int deleteByPrimaryKey(BigDecimal pkAppDemOj);

    int insert(RecruitmentDetail record);

    int insertSelective(RecruitmentDetail record);

    List<RecruitmentDetail> selectByExample(RecruitmentDetailExample example);

    RecruitmentDetail selectByPrimaryKey(BigDecimal pkAppDemOj);

    int updateByExampleSelective(@Param("record") RecruitmentDetail record, @Param("example") RecruitmentDetailExample example);

    int updateByExample(@Param("record") RecruitmentDetail record, @Param("example") RecruitmentDetailExample example);

    int updateByPrimaryKeySelective(RecruitmentDetail record);

    int updateByPrimaryKey(RecruitmentDetail record);
    
    /**
     * 根据详细需求对象的信息,查询出需要的对象
     * @param recruitmentDetail
     * @return
     */
    List<RecruitmentDetail> selectByRecruitment(RecruitmentDetail recruitmentDetail);
    
    
    
    
}
package cn.picc.dao;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.hnne.hs.dao.Dao;
import cn.hnne.pagination.mybatis.annotation.Pagination;
import cn.picc.model.Recruitment;
import cn.picc.model.RecruitmentExample;

public interface RecruitmentMapper extends Dao {
    int countByExample(RecruitmentExample example);

    int deleteByExample(RecruitmentExample example);

    int deleteByPrimaryKey(BigDecimal pkAppDem);

    int insert(Recruitment record);

    int insertSelective(Recruitment record);

    List<Recruitment> selectByExample(RecruitmentExample example);

    Recruitment selectByPrimaryKey(BigDecimal pkAppDem);

    int updateByExampleSelective(@Param("record") Recruitment record, @Param("example") RecruitmentExample example);

    int updateByExample(@Param("record") Recruitment record, @Param("example") RecruitmentExample example);

    int updateByPrimaryKeySelective(Recruitment record);

    int updateByPrimaryKey(Recruitment record);
    
    /**
     * 分页查询出状态大于等于5的招聘需求
     * @return
     */
    @Pagination
    List<Recruitment> selectAllRecruit();
    
    Recruitment selectById(BigDecimal pkAppDem);
}
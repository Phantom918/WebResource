package cn.picc.dao;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.hnne.hs.dao.Dao;
import cn.picc.model.Organization;
import cn.picc.model.OrganizationExample;

public interface OrganizationMapper extends Dao  {
    int countByExample(OrganizationExample example);

    int deleteByExample(OrganizationExample example);

    int deleteByPrimaryKey(BigDecimal pkOrg);

    int insert(Organization record);

    int insertSelective(Organization record);

    List<Organization> selectByExample(OrganizationExample example);

    Organization selectByPrimaryKey(BigDecimal pkOrg);

    int updateByExampleSelective(@Param("record") Organization record, @Param("example") OrganizationExample example);

    int updateByExample(@Param("record") Organization record, @Param("example") OrganizationExample example);

    int updateByPrimaryKeySelective(Organization record);

    int updateByPrimaryKey(Organization record);
    
    /**
     * 查询所有市级公司
     * @return 市级公司的信息集合
     */
    List<Organization> selectAllCityOrg();
}
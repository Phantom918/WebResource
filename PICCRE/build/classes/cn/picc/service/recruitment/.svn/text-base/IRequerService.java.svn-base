package cn.picc.service.recruitment;

import java.io.ByteArrayInputStream;
import java.math.BigDecimal;
import java.util.List;

import cn.picc.model.Recruitment;
import cn.picc.model.RecruitmentDetail;

public interface IRequerService {
	/**
	 * 根据应聘需求主键查询应聘信息
	 * @param id
	 * @return
	 */
	public Recruitment findById(BigDecimal pkAppDem);
	/**
	 * 查询某次招聘下所有公司的招聘需求信息
	 */
	public List<RecruitmentDetail> findAllApply(BigDecimal applyId);
	
	public ByteArrayInputStream downloadEmp(BigDecimal applyId);
	
	public Recruitment selectById(BigDecimal pkAppDem);
}

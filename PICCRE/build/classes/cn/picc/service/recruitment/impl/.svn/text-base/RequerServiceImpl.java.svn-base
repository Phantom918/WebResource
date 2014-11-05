package cn.picc.service.recruitment.impl;

import java.io.ByteArrayInputStream;
import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.picc.dao.RecruitmentDetailMapper;
import cn.picc.dao.RecruitmentMapper;
import cn.picc.model.Recruitment;
import cn.picc.model.RecruitmentDetail;
import cn.picc.model.RecruitmentDetailExample;
import cn.picc.service.recruitment.IRequerService;
import cn.picc.util.excelutil.ExportExcelUtil;
@Service
public class RequerServiceImpl implements IRequerService{
	@Autowired
	RecruitmentMapper recruitmentMapper;
	@Autowired
	RecruitmentDetailMapper recruitmentDetailMapper;
	public Recruitment findById(BigDecimal pkAppDem) {
		return recruitmentMapper.selectByPrimaryKey(pkAppDem);
	}

	public List<RecruitmentDetail> findAllApply(BigDecimal applyId) {
		RecruitmentDetailExample example = new RecruitmentDetailExample();
		example.createCriteria().andPkAppDemEqualTo(applyId);
		return recruitmentDetailMapper.selectByExample(example);
	}
	
	/**
	 * 导出数据
	 * @param downloadCode
	 * @param duty
	 * @return
	 */
	public ByteArrayInputStream downloadEmp(BigDecimal applyId) {
		List<RecruitmentDetail> dutys = null;
		dutys = findAllApply(applyId);
		System.out.println("查询出来的数据大小为:"+dutys.size());
		ExportExcelUtil<RecruitmentDetail> eeu = new ExportExcelUtil<RecruitmentDetail>();
		return eeu.exportExcel("PICC招聘需求", 
				new String[]{"招聘批次","公司名","部门名","岗位名","人员类别","文化程度","专业要求","必备上岗资格证","其他要求","拟聘人数","工作地点","备注"}, 
				dutys, "2003", false, null);
	}

	public Recruitment selectById(BigDecimal pkAppDem) {
		return recruitmentMapper.selectById(pkAppDem);
	}

}

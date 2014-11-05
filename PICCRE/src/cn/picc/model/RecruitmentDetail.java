package cn.picc.model;

import java.math.BigDecimal;
import java.util.Date;

import cn.picc.util.excelutil.ExcelAnnotation;

public class RecruitmentDetail {
	
	private String ojName;

    private String compName;

    private String deptName;

    private String postName;

    private String ojType;

    private String culLevel;

    private String proCred;

    private String dutyCrert;

    private String otherCert;

    private Integer hireNum;

    private String workAddr;
    
    private String remark;
    @ExcelAnnotation(unChecked = true)
    private String postCode;
    @ExcelAnnotation(unChecked = true)
    private Date commitTime;
    @ExcelAnnotation(unChecked = true)
    private String status;
    @ExcelAnnotation(unChecked = true)
    private Date modifyTime;
    @ExcelAnnotation(unChecked = true)
    private String ojTableName;
    @ExcelAnnotation(unChecked = true)
	private String compCode;
	@ExcelAnnotation(unChecked = true)
    private String deptCode;
	@ExcelAnnotation(unChecked = true)
    private BigDecimal pkAppDemOj;
	@ExcelAnnotation(unChecked = true)
    private BigDecimal pkAppDem;

    public BigDecimal getPkAppDemOj() {
        return pkAppDemOj;
    }

    public void setPkAppDemOj(BigDecimal pkAppDemOj) {
        this.pkAppDemOj = pkAppDemOj;
    }

    public BigDecimal getPkAppDem() {
        return pkAppDem;
    }

    public void setPkAppDem(BigDecimal pkAppDem) {
        this.pkAppDem = pkAppDem;
    }

    public String getOjType() {
        return ojType;
    }

    public void setOjType(String ojType) {
        this.ojType = ojType;
    }

    public String getCulLevel() {
        return culLevel;
    }

    public void setCulLevel(String culLevel) {
        this.culLevel = culLevel;
    }

    public String getProCred() {
        return proCred;
    }

    public void setProCred(String proCred) {
        this.proCred = proCred;
    }

    public String getDutyCrert() {
        return dutyCrert;
    }

    public void setDutyCrert(String dutyCrert) {
        this.dutyCrert = dutyCrert;
    }

    public String getOtherCert() {
        return otherCert;
    }

    public void setOtherCert(String otherCert) {
        this.otherCert = otherCert;
    }

    public Integer getHireNum() {
        return hireNum;
    }

    public void setHireNum(Integer hireNum) {
        this.hireNum = hireNum;
    }

    public String getWorkAddr() {
        return workAddr;
    }

    public void setWorkAddr(String workAddr) {
        this.workAddr = workAddr;
    }

    public Date getCommitTime() {
        return commitTime;
    }

    public void setCommitTime(Date commitTime) {
        this.commitTime = commitTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getCompCode() {
        return compCode;
    }

    public void setCompCode(String compCode) {
        this.compCode = compCode;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getOjName() {
        return ojName;
    }

    public void setOjName(String ojName) {
        this.ojName = ojName;
    }

    public String getOjTableName() {
        return ojTableName;
    }

    public void setOjTableName(String ojTableName) {
        this.ojTableName = ojTableName;
    }
}
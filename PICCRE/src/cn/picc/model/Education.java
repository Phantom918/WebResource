package cn.picc.model;

import java.math.BigDecimal;
import java.util.Date;

public class Education {
    private BigDecimal pkEducation; //学历主键

    private BigDecimal pkEmp; //员工主键

    private String heighEdu; //是否最高学历

    private String dayEdu; //是否最高全日制学历

    private Date entranceTime; //入学时间

    private Date gradTime; //毕业时间

    private String school; //学校

    private String pec; //专业

    private String pecType; //学历专业类别

    private String edu; //学历

    private String degree; //学位

    private String eduLength; //学制

    private String schoolType; //学校类型

    private String eduType; //学习方式

    private String eduCode; //学历证书编号

    private String degreeCode; //学位证书编号

    private Date modifyTime; //上传/修改时间

    public BigDecimal getPkEducation() {
        return pkEducation;
    }

    public void setPkEducation(BigDecimal pkEducation) {
        this.pkEducation = pkEducation;
    }

    public BigDecimal getPkEmp() {
        return pkEmp;
    }

    public void setPkEmp(BigDecimal pkEmp) {
        this.pkEmp = pkEmp;
    }

    public String getHeighEdu() {
        return heighEdu;
    }

    public void setHeighEdu(String heighEdu) {
        this.heighEdu = heighEdu;
    }

    public String getDayEdu() {
        return dayEdu;
    }

    public void setDayEdu(String dayEdu) {
        this.dayEdu = dayEdu;
    }

    public Date getEntranceTime() {
        return entranceTime;
    }

    public void setEntranceTime(Date entranceTime) {
        this.entranceTime = entranceTime;
    }

    public Date getGradTime() {
        return gradTime;
    }

    public void setGradTime(Date gradTime) {
        this.gradTime = gradTime;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getPec() {
        return pec;
    }

    public void setPec(String pec) {
        this.pec = pec;
    }

    public String getPecType() {
        return pecType;
    }

    public void setPecType(String pecType) {
        this.pecType = pecType;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getEduLength() {
        return eduLength;
    }

    public void setEduLength(String eduLength) {
        this.eduLength = eduLength;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    public String getEduType() {
        return eduType;
    }

    public void setEduType(String eduType) {
        this.eduType = eduType;
    }

    public String getEduCode() {
        return eduCode;
    }

    public void setEduCode(String eduCode) {
        this.eduCode = eduCode;
    }

    public String getDegreeCode() {
        return degreeCode;
    }

    public void setDegreeCode(String degreeCode) {
        this.degreeCode = degreeCode;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}
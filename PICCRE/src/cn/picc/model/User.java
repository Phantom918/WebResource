package cn.picc.model;

import java.math.BigDecimal;
import java.util.Date;

public class User {
	
	private BigDecimal pkEmp; //员工主键

    private String name; //姓名

    private String oldName; //曾用命

    private String id; //身份证号

    private String gender; //性别

    private Date birth; //出生日期

    private String ation; //名族

    private String blood; //血型

    private String ps; //政治面貌

    private String household; //家庭出生

    private String nation; //籍贯

    private String birthplace; //出生地

    private String marriage; //婚姻状况

    private String health; //健康状况

    private String archiveAddr; //档案地

    private Date workTime; //参加工作时间

    private String householdNatrue; //户口性质

    private String householdAddr; //户口所在地

    private String houseAddr; //家庭住址

    private String priPhone; //手机

    private String officePhone; //办公电话

    private String linkmanPhone; //联系人电话

    private String housePhone; //家庭电话

    private String postcode; //邮编

    private String email; //邮箱

    private Date joinParty; //入党时间

    private String joinPartyComp; //入党时所在单位

    private Date joinPartyTime; //入党转正时间

    private Date fullTime; //

    private String specialty; //专业特长

    private String photo; //照片

    private String empArchive; //附件

    private String socialNo; //社保编号（暂时作为简历名）

    private Date modifyTime; //上传/修改时间

    private String applyUnit; //应聘单位

    private String applyDept; //应聘部门

    private String applyPost; //应聘岗位

    private String applyDePost; //兼岗信息

    private String status; //状态

    private String penGrage; //笔试成绩

    private String faceGrade; //面试成绩

    private String planUnit; //拟聘单位

    private String planDept; //拟聘部门

    private String planPost; //拟聘岗位

    private String applyUnitCode; //应聘单位编码

    private String planUnitCode; //拟聘单位编码

    private String applyPostCode; //应聘岗位编码

    private String planPostCode; //拟聘岗位编码

    private String applyDeptCode; //应聘部门编码

    private String planDeptCode; //拟聘部门编码

    private String applyDutyCode; //应聘职位编码

    private String applyDuty; //应聘职务

    private String planDutyCode; //拟聘职务编码

    private String planDuty; //拟聘职务

    private BigDecimal demPk; //招聘需求编号

    private String demName; //招聘需求名

    private String isSale; //是否营销员

    private String isLipei; //是否理赔员

    private String planUserStyle; //拟用工形式

    private String age; //年龄
    
    private String resumeName; //简历名称

    public BigDecimal getPkEmp() {
        return pkEmp;
    }

    public void setPkEmp(BigDecimal pkEmp) {
        this.pkEmp = pkEmp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getAtion() {
        return ation;
    }

    public void setAtion(String ation) {
        this.ation = ation;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getPs() {
        return ps;
    }

    public void setPs(String ps) {
        this.ps = ps;
    }

    public String getHousehold() {
        return household;
    }

    public void setHousehold(String household) {
        this.household = household;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getArchiveAddr() {
        return archiveAddr;
    }

    public void setArchiveAddr(String archiveAddr) {
        this.archiveAddr = archiveAddr;
    }

    public Date getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Date workTime) {
        this.workTime = workTime;
    }

    public String getHouseholdNatrue() {
        return householdNatrue;
    }

    public void setHouseholdNatrue(String householdNatrue) {
        this.householdNatrue = householdNatrue;
    }

    public String getHouseholdAddr() {
        return householdAddr;
    }

    public void setHouseholdAddr(String householdAddr) {
        this.householdAddr = householdAddr;
    }

    public String getHouseAddr() {
        return houseAddr;
    }

    public void setHouseAddr(String houseAddr) {
        this.houseAddr = houseAddr;
    }

    public String getPriPhone() {
        return priPhone;
    }

    public void setPriPhone(String priPhone) {
        this.priPhone = priPhone;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getLinkmanPhone() {
        return linkmanPhone;
    }

    public void setLinkmanPhone(String linkmanPhone) {
        this.linkmanPhone = linkmanPhone;
    }

    public String getHousePhone() {
        return housePhone;
    }

    public void setHousePhone(String housePhone) {
        this.housePhone = housePhone;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getJoinParty() {
        return joinParty;
    }

    public void setJoinParty(Date joinParty) {
        this.joinParty = joinParty;
    }

    public String getJoinPartyComp() {
        return joinPartyComp;
    }

    public void setJoinPartyComp(String joinPartyComp) {
        this.joinPartyComp = joinPartyComp;
    }

    public Date getJoinPartyTime() {
        return joinPartyTime;
    }

    public void setJoinPartyTime(Date joinPartyTime) {
        this.joinPartyTime = joinPartyTime;
    }

    public Date getFullTime() {
        return fullTime;
    }

    public void setFullTime(Date fullTime) {
        this.fullTime = fullTime;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getEmpArchive() {
        return empArchive;
    }

    public void setEmpArchive(String empArchive) {
        this.empArchive = empArchive;
    }

    public String getSocialNo() {
        return socialNo;
    }

    public void setSocialNo(String socialNo) {
        this.socialNo = socialNo;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getApplyUnit() {
        return applyUnit;
    }

    public void setApplyUnit(String applyUnit) {
        this.applyUnit = applyUnit;
    }

    public String getApplyDept() {
        return applyDept;
    }

    public void setApplyDept(String applyDept) {
        this.applyDept = applyDept;
    }

    public String getApplyPost() {
        return applyPost;
    }

    public void setApplyPost(String applyPost) {
        this.applyPost = applyPost;
    }

    public String getApplyDePost() {
        return applyDePost;
    }

    public void setApplyDePost(String applyDePost) {
        this.applyDePost = applyDePost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPenGrage() {
        return penGrage;
    }

    public void setPenGrage(String penGrage) {
        this.penGrage = penGrage;
    }

    public String getFaceGrade() {
        return faceGrade;
    }

    public void setFaceGrade(String faceGrade) {
        this.faceGrade = faceGrade;
    }

    public String getPlanUnit() {
        return planUnit;
    }

    public void setPlanUnit(String planUnit) {
        this.planUnit = planUnit;
    }

    public String getPlanDept() {
        return planDept;
    }

    public void setPlanDept(String planDept) {
        this.planDept = planDept;
    }

    public String getPlanPost() {
        return planPost;
    }

    public void setPlanPost(String planPost) {
        this.planPost = planPost;
    }

    public String getApplyUnitCode() {
        return applyUnitCode;
    }

    public void setApplyUnitCode(String applyUnitCode) {
        this.applyUnitCode = applyUnitCode;
    }

    public String getPlanUnitCode() {
        return planUnitCode;
    }

    public void setPlanUnitCode(String planUnitCode) {
        this.planUnitCode = planUnitCode;
    }

    public String getApplyPostCode() {
        return applyPostCode;
    }

    public void setApplyPostCode(String applyPostCode) {
        this.applyPostCode = applyPostCode;
    }

    public String getPlanPostCode() {
        return planPostCode;
    }

    public void setPlanPostCode(String planPostCode) {
        this.planPostCode = planPostCode;
    }

    public String getApplyDeptCode() {
        return applyDeptCode;
    }

    public void setApplyDeptCode(String applyDeptCode) {
        this.applyDeptCode = applyDeptCode;
    }

    public String getPlanDeptCode() {
        return planDeptCode;
    }

    public void setPlanDeptCode(String planDeptCode) {
        this.planDeptCode = planDeptCode;
    }

    public String getApplyDutyCode() {
        return applyDutyCode;
    }

    public void setApplyDutyCode(String applyDutyCode) {
        this.applyDutyCode = applyDutyCode;
    }

    public String getApplyDuty() {
        return applyDuty;
    }

    public void setApplyDuty(String applyDuty) {
        this.applyDuty = applyDuty;
    }

    public String getPlanDutyCode() {
        return planDutyCode;
    }

    public void setPlanDutyCode(String planDutyCode) {
        this.planDutyCode = planDutyCode;
    }

    public String getPlanDuty() {
        return planDuty;
    }

    public void setPlanDuty(String planDuty) {
        this.planDuty = planDuty;
    }

    public BigDecimal getDemPk() {
        return demPk;
    }

    public void setDemPk(BigDecimal demPk) {
        this.demPk = demPk;
    }

    public String getDemName() {
        return demName;
    }

    public void setDemName(String demName) {
        this.demName = demName;
    }

    public String getIsSale() {
        return isSale;
    }

    public void setIsSale(String isSale) {
        this.isSale = isSale;
    }

    public String getIsLipei() {
        return isLipei;
    }

    public void setIsLipei(String isLipei) {
        this.isLipei = isLipei;
    }

    public String getPlanUserStyle() {
        return planUserStyle;
    }

    public void setPlanUserStyle(String planUserStyle) {
        this.planUserStyle = planUserStyle;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getResumeName() {
        return resumeName;
    }

    public void setResumeName(String resumeName) {
        this.resumeName = resumeName;
    }
}
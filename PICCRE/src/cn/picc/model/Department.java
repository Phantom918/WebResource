package cn.picc.model;

import java.math.BigDecimal;
import java.util.Date;

public class Department {
    private BigDecimal pkDept;

    private String deptName;

    private String deptCode;

    private String deptType;

    private BigDecimal supDept;

    private Date modifyTime;

    private String profCode;

    private String isSonunit;

    private String profKey;

    public BigDecimal getPkDept() {
        return pkDept;
    }

    public void setPkDept(BigDecimal pkDept) {
        this.pkDept = pkDept;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptType() {
        return deptType;
    }

    public void setDeptType(String deptType) {
        this.deptType = deptType;
    }

    public BigDecimal getSupDept() {
        return supDept;
    }

    public void setSupDept(BigDecimal supDept) {
        this.supDept = supDept;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getProfCode() {
        return profCode;
    }

    public void setProfCode(String profCode) {
        this.profCode = profCode;
    }

    public String getIsSonunit() {
        return isSonunit;
    }

    public void setIsSonunit(String isSonunit) {
        this.isSonunit = isSonunit;
    }

    public String getProfKey() {
        return profKey;
    }

    public void setProfKey(String profKey) {
        this.profKey = profKey;
    }
}
package cn.picc.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RecruitmentDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecruitmentDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPkAppDemOjIsNull() {
            addCriterion("PK_APP_DEM_OJ is null");
            return (Criteria) this;
        }

        public Criteria andPkAppDemOjIsNotNull() {
            addCriterion("PK_APP_DEM_OJ is not null");
            return (Criteria) this;
        }

        public Criteria andPkAppDemOjEqualTo(BigDecimal value) {
            addCriterion("PK_APP_DEM_OJ =", value, "pkAppDemOj");
            return (Criteria) this;
        }

        public Criteria andPkAppDemOjNotEqualTo(BigDecimal value) {
            addCriterion("PK_APP_DEM_OJ <>", value, "pkAppDemOj");
            return (Criteria) this;
        }

        public Criteria andPkAppDemOjGreaterThan(BigDecimal value) {
            addCriterion("PK_APP_DEM_OJ >", value, "pkAppDemOj");
            return (Criteria) this;
        }

        public Criteria andPkAppDemOjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PK_APP_DEM_OJ >=", value, "pkAppDemOj");
            return (Criteria) this;
        }

        public Criteria andPkAppDemOjLessThan(BigDecimal value) {
            addCriterion("PK_APP_DEM_OJ <", value, "pkAppDemOj");
            return (Criteria) this;
        }

        public Criteria andPkAppDemOjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PK_APP_DEM_OJ <=", value, "pkAppDemOj");
            return (Criteria) this;
        }

        public Criteria andPkAppDemOjIn(List<BigDecimal> values) {
            addCriterion("PK_APP_DEM_OJ in", values, "pkAppDemOj");
            return (Criteria) this;
        }

        public Criteria andPkAppDemOjNotIn(List<BigDecimal> values) {
            addCriterion("PK_APP_DEM_OJ not in", values, "pkAppDemOj");
            return (Criteria) this;
        }

        public Criteria andPkAppDemOjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PK_APP_DEM_OJ between", value1, value2, "pkAppDemOj");
            return (Criteria) this;
        }

        public Criteria andPkAppDemOjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PK_APP_DEM_OJ not between", value1, value2, "pkAppDemOj");
            return (Criteria) this;
        }

        public Criteria andPkAppDemIsNull() {
            addCriterion("PK_APP_DEM is null");
            return (Criteria) this;
        }

        public Criteria andPkAppDemIsNotNull() {
            addCriterion("PK_APP_DEM is not null");
            return (Criteria) this;
        }

        public Criteria andPkAppDemEqualTo(BigDecimal value) {
            addCriterion("PK_APP_DEM =", value, "pkAppDem");
            return (Criteria) this;
        }

        public Criteria andPkAppDemNotEqualTo(BigDecimal value) {
            addCriterion("PK_APP_DEM <>", value, "pkAppDem");
            return (Criteria) this;
        }

        public Criteria andPkAppDemGreaterThan(BigDecimal value) {
            addCriterion("PK_APP_DEM >", value, "pkAppDem");
            return (Criteria) this;
        }

        public Criteria andPkAppDemGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PK_APP_DEM >=", value, "pkAppDem");
            return (Criteria) this;
        }

        public Criteria andPkAppDemLessThan(BigDecimal value) {
            addCriterion("PK_APP_DEM <", value, "pkAppDem");
            return (Criteria) this;
        }

        public Criteria andPkAppDemLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PK_APP_DEM <=", value, "pkAppDem");
            return (Criteria) this;
        }

        public Criteria andPkAppDemIn(List<BigDecimal> values) {
            addCriterion("PK_APP_DEM in", values, "pkAppDem");
            return (Criteria) this;
        }

        public Criteria andPkAppDemNotIn(List<BigDecimal> values) {
            addCriterion("PK_APP_DEM not in", values, "pkAppDem");
            return (Criteria) this;
        }

        public Criteria andPkAppDemBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PK_APP_DEM between", value1, value2, "pkAppDem");
            return (Criteria) this;
        }

        public Criteria andPkAppDemNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PK_APP_DEM not between", value1, value2, "pkAppDem");
            return (Criteria) this;
        }

        public Criteria andOjTypeIsNull() {
            addCriterion("OJ_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOjTypeIsNotNull() {
            addCriterion("OJ_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOjTypeEqualTo(String value) {
            addCriterion("OJ_TYPE =", value, "ojType");
            return (Criteria) this;
        }

        public Criteria andOjTypeNotEqualTo(String value) {
            addCriterion("OJ_TYPE <>", value, "ojType");
            return (Criteria) this;
        }

        public Criteria andOjTypeGreaterThan(String value) {
            addCriterion("OJ_TYPE >", value, "ojType");
            return (Criteria) this;
        }

        public Criteria andOjTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OJ_TYPE >=", value, "ojType");
            return (Criteria) this;
        }

        public Criteria andOjTypeLessThan(String value) {
            addCriterion("OJ_TYPE <", value, "ojType");
            return (Criteria) this;
        }

        public Criteria andOjTypeLessThanOrEqualTo(String value) {
            addCriterion("OJ_TYPE <=", value, "ojType");
            return (Criteria) this;
        }

        public Criteria andOjTypeLike(String value) {
            addCriterion("OJ_TYPE like", value, "ojType");
            return (Criteria) this;
        }

        public Criteria andOjTypeNotLike(String value) {
            addCriterion("OJ_TYPE not like", value, "ojType");
            return (Criteria) this;
        }

        public Criteria andOjTypeIn(List<String> values) {
            addCriterion("OJ_TYPE in", values, "ojType");
            return (Criteria) this;
        }

        public Criteria andOjTypeNotIn(List<String> values) {
            addCriterion("OJ_TYPE not in", values, "ojType");
            return (Criteria) this;
        }

        public Criteria andOjTypeBetween(String value1, String value2) {
            addCriterion("OJ_TYPE between", value1, value2, "ojType");
            return (Criteria) this;
        }

        public Criteria andOjTypeNotBetween(String value1, String value2) {
            addCriterion("OJ_TYPE not between", value1, value2, "ojType");
            return (Criteria) this;
        }

        public Criteria andCulLevelIsNull() {
            addCriterion("CUL_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCulLevelIsNotNull() {
            addCriterion("CUL_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCulLevelEqualTo(String value) {
            addCriterion("CUL_LEVEL =", value, "culLevel");
            return (Criteria) this;
        }

        public Criteria andCulLevelNotEqualTo(String value) {
            addCriterion("CUL_LEVEL <>", value, "culLevel");
            return (Criteria) this;
        }

        public Criteria andCulLevelGreaterThan(String value) {
            addCriterion("CUL_LEVEL >", value, "culLevel");
            return (Criteria) this;
        }

        public Criteria andCulLevelGreaterThanOrEqualTo(String value) {
            addCriterion("CUL_LEVEL >=", value, "culLevel");
            return (Criteria) this;
        }

        public Criteria andCulLevelLessThan(String value) {
            addCriterion("CUL_LEVEL <", value, "culLevel");
            return (Criteria) this;
        }

        public Criteria andCulLevelLessThanOrEqualTo(String value) {
            addCriterion("CUL_LEVEL <=", value, "culLevel");
            return (Criteria) this;
        }

        public Criteria andCulLevelLike(String value) {
            addCriterion("CUL_LEVEL like", value, "culLevel");
            return (Criteria) this;
        }

        public Criteria andCulLevelNotLike(String value) {
            addCriterion("CUL_LEVEL not like", value, "culLevel");
            return (Criteria) this;
        }

        public Criteria andCulLevelIn(List<String> values) {
            addCriterion("CUL_LEVEL in", values, "culLevel");
            return (Criteria) this;
        }

        public Criteria andCulLevelNotIn(List<String> values) {
            addCriterion("CUL_LEVEL not in", values, "culLevel");
            return (Criteria) this;
        }

        public Criteria andCulLevelBetween(String value1, String value2) {
            addCriterion("CUL_LEVEL between", value1, value2, "culLevel");
            return (Criteria) this;
        }

        public Criteria andCulLevelNotBetween(String value1, String value2) {
            addCriterion("CUL_LEVEL not between", value1, value2, "culLevel");
            return (Criteria) this;
        }

        public Criteria andProCredIsNull() {
            addCriterion("PRO_CRED is null");
            return (Criteria) this;
        }

        public Criteria andProCredIsNotNull() {
            addCriterion("PRO_CRED is not null");
            return (Criteria) this;
        }

        public Criteria andProCredEqualTo(String value) {
            addCriterion("PRO_CRED =", value, "proCred");
            return (Criteria) this;
        }

        public Criteria andProCredNotEqualTo(String value) {
            addCriterion("PRO_CRED <>", value, "proCred");
            return (Criteria) this;
        }

        public Criteria andProCredGreaterThan(String value) {
            addCriterion("PRO_CRED >", value, "proCred");
            return (Criteria) this;
        }

        public Criteria andProCredGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_CRED >=", value, "proCred");
            return (Criteria) this;
        }

        public Criteria andProCredLessThan(String value) {
            addCriterion("PRO_CRED <", value, "proCred");
            return (Criteria) this;
        }

        public Criteria andProCredLessThanOrEqualTo(String value) {
            addCriterion("PRO_CRED <=", value, "proCred");
            return (Criteria) this;
        }

        public Criteria andProCredLike(String value) {
            addCriterion("PRO_CRED like", value, "proCred");
            return (Criteria) this;
        }

        public Criteria andProCredNotLike(String value) {
            addCriterion("PRO_CRED not like", value, "proCred");
            return (Criteria) this;
        }

        public Criteria andProCredIn(List<String> values) {
            addCriterion("PRO_CRED in", values, "proCred");
            return (Criteria) this;
        }

        public Criteria andProCredNotIn(List<String> values) {
            addCriterion("PRO_CRED not in", values, "proCred");
            return (Criteria) this;
        }

        public Criteria andProCredBetween(String value1, String value2) {
            addCriterion("PRO_CRED between", value1, value2, "proCred");
            return (Criteria) this;
        }

        public Criteria andProCredNotBetween(String value1, String value2) {
            addCriterion("PRO_CRED not between", value1, value2, "proCred");
            return (Criteria) this;
        }

        public Criteria andDutyCrertIsNull() {
            addCriterion("DUTY_CRERT is null");
            return (Criteria) this;
        }

        public Criteria andDutyCrertIsNotNull() {
            addCriterion("DUTY_CRERT is not null");
            return (Criteria) this;
        }

        public Criteria andDutyCrertEqualTo(String value) {
            addCriterion("DUTY_CRERT =", value, "dutyCrert");
            return (Criteria) this;
        }

        public Criteria andDutyCrertNotEqualTo(String value) {
            addCriterion("DUTY_CRERT <>", value, "dutyCrert");
            return (Criteria) this;
        }

        public Criteria andDutyCrertGreaterThan(String value) {
            addCriterion("DUTY_CRERT >", value, "dutyCrert");
            return (Criteria) this;
        }

        public Criteria andDutyCrertGreaterThanOrEqualTo(String value) {
            addCriterion("DUTY_CRERT >=", value, "dutyCrert");
            return (Criteria) this;
        }

        public Criteria andDutyCrertLessThan(String value) {
            addCriterion("DUTY_CRERT <", value, "dutyCrert");
            return (Criteria) this;
        }

        public Criteria andDutyCrertLessThanOrEqualTo(String value) {
            addCriterion("DUTY_CRERT <=", value, "dutyCrert");
            return (Criteria) this;
        }

        public Criteria andDutyCrertLike(String value) {
            addCriterion("DUTY_CRERT like", value, "dutyCrert");
            return (Criteria) this;
        }

        public Criteria andDutyCrertNotLike(String value) {
            addCriterion("DUTY_CRERT not like", value, "dutyCrert");
            return (Criteria) this;
        }

        public Criteria andDutyCrertIn(List<String> values) {
            addCriterion("DUTY_CRERT in", values, "dutyCrert");
            return (Criteria) this;
        }

        public Criteria andDutyCrertNotIn(List<String> values) {
            addCriterion("DUTY_CRERT not in", values, "dutyCrert");
            return (Criteria) this;
        }

        public Criteria andDutyCrertBetween(String value1, String value2) {
            addCriterion("DUTY_CRERT between", value1, value2, "dutyCrert");
            return (Criteria) this;
        }

        public Criteria andDutyCrertNotBetween(String value1, String value2) {
            addCriterion("DUTY_CRERT not between", value1, value2, "dutyCrert");
            return (Criteria) this;
        }

        public Criteria andOtherCertIsNull() {
            addCriterion("OTHER_CERT is null");
            return (Criteria) this;
        }

        public Criteria andOtherCertIsNotNull() {
            addCriterion("OTHER_CERT is not null");
            return (Criteria) this;
        }

        public Criteria andOtherCertEqualTo(String value) {
            addCriterion("OTHER_CERT =", value, "otherCert");
            return (Criteria) this;
        }

        public Criteria andOtherCertNotEqualTo(String value) {
            addCriterion("OTHER_CERT <>", value, "otherCert");
            return (Criteria) this;
        }

        public Criteria andOtherCertGreaterThan(String value) {
            addCriterion("OTHER_CERT >", value, "otherCert");
            return (Criteria) this;
        }

        public Criteria andOtherCertGreaterThanOrEqualTo(String value) {
            addCriterion("OTHER_CERT >=", value, "otherCert");
            return (Criteria) this;
        }

        public Criteria andOtherCertLessThan(String value) {
            addCriterion("OTHER_CERT <", value, "otherCert");
            return (Criteria) this;
        }

        public Criteria andOtherCertLessThanOrEqualTo(String value) {
            addCriterion("OTHER_CERT <=", value, "otherCert");
            return (Criteria) this;
        }

        public Criteria andOtherCertLike(String value) {
            addCriterion("OTHER_CERT like", value, "otherCert");
            return (Criteria) this;
        }

        public Criteria andOtherCertNotLike(String value) {
            addCriterion("OTHER_CERT not like", value, "otherCert");
            return (Criteria) this;
        }

        public Criteria andOtherCertIn(List<String> values) {
            addCriterion("OTHER_CERT in", values, "otherCert");
            return (Criteria) this;
        }

        public Criteria andOtherCertNotIn(List<String> values) {
            addCriterion("OTHER_CERT not in", values, "otherCert");
            return (Criteria) this;
        }

        public Criteria andOtherCertBetween(String value1, String value2) {
            addCriterion("OTHER_CERT between", value1, value2, "otherCert");
            return (Criteria) this;
        }

        public Criteria andOtherCertNotBetween(String value1, String value2) {
            addCriterion("OTHER_CERT not between", value1, value2, "otherCert");
            return (Criteria) this;
        }

        public Criteria andHireNumIsNull() {
            addCriterion("HIRE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andHireNumIsNotNull() {
            addCriterion("HIRE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andHireNumEqualTo(Integer value) {
            addCriterion("HIRE_NUM =", value, "hireNum");
            return (Criteria) this;
        }

        public Criteria andHireNumNotEqualTo(Integer value) {
            addCriterion("HIRE_NUM <>", value, "hireNum");
            return (Criteria) this;
        }

        public Criteria andHireNumGreaterThan(Integer value) {
            addCriterion("HIRE_NUM >", value, "hireNum");
            return (Criteria) this;
        }

        public Criteria andHireNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("HIRE_NUM >=", value, "hireNum");
            return (Criteria) this;
        }

        public Criteria andHireNumLessThan(Integer value) {
            addCriterion("HIRE_NUM <", value, "hireNum");
            return (Criteria) this;
        }

        public Criteria andHireNumLessThanOrEqualTo(Integer value) {
            addCriterion("HIRE_NUM <=", value, "hireNum");
            return (Criteria) this;
        }

        public Criteria andHireNumIn(List<Integer> values) {
            addCriterion("HIRE_NUM in", values, "hireNum");
            return (Criteria) this;
        }

        public Criteria andHireNumNotIn(List<Integer> values) {
            addCriterion("HIRE_NUM not in", values, "hireNum");
            return (Criteria) this;
        }

        public Criteria andHireNumBetween(Integer value1, Integer value2) {
            addCriterion("HIRE_NUM between", value1, value2, "hireNum");
            return (Criteria) this;
        }

        public Criteria andHireNumNotBetween(Integer value1, Integer value2) {
            addCriterion("HIRE_NUM not between", value1, value2, "hireNum");
            return (Criteria) this;
        }

        public Criteria andWorkAddrIsNull() {
            addCriterion("WORK_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andWorkAddrIsNotNull() {
            addCriterion("WORK_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andWorkAddrEqualTo(String value) {
            addCriterion("WORK_ADDR =", value, "workAddr");
            return (Criteria) this;
        }

        public Criteria andWorkAddrNotEqualTo(String value) {
            addCriterion("WORK_ADDR <>", value, "workAddr");
            return (Criteria) this;
        }

        public Criteria andWorkAddrGreaterThan(String value) {
            addCriterion("WORK_ADDR >", value, "workAddr");
            return (Criteria) this;
        }

        public Criteria andWorkAddrGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_ADDR >=", value, "workAddr");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLessThan(String value) {
            addCriterion("WORK_ADDR <", value, "workAddr");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLessThanOrEqualTo(String value) {
            addCriterion("WORK_ADDR <=", value, "workAddr");
            return (Criteria) this;
        }

        public Criteria andWorkAddrLike(String value) {
            addCriterion("WORK_ADDR like", value, "workAddr");
            return (Criteria) this;
        }

        public Criteria andWorkAddrNotLike(String value) {
            addCriterion("WORK_ADDR not like", value, "workAddr");
            return (Criteria) this;
        }

        public Criteria andWorkAddrIn(List<String> values) {
            addCriterion("WORK_ADDR in", values, "workAddr");
            return (Criteria) this;
        }

        public Criteria andWorkAddrNotIn(List<String> values) {
            addCriterion("WORK_ADDR not in", values, "workAddr");
            return (Criteria) this;
        }

        public Criteria andWorkAddrBetween(String value1, String value2) {
            addCriterion("WORK_ADDR between", value1, value2, "workAddr");
            return (Criteria) this;
        }

        public Criteria andWorkAddrNotBetween(String value1, String value2) {
            addCriterion("WORK_ADDR not between", value1, value2, "workAddr");
            return (Criteria) this;
        }

        public Criteria andCommitTimeIsNull() {
            addCriterion("COMMIT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCommitTimeIsNotNull() {
            addCriterion("COMMIT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCommitTimeEqualTo(Date value) {
            addCriterionForJDBCDate("COMMIT_TIME =", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("COMMIT_TIME <>", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("COMMIT_TIME >", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("COMMIT_TIME >=", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeLessThan(Date value) {
            addCriterionForJDBCDate("COMMIT_TIME <", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("COMMIT_TIME <=", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeIn(List<Date> values) {
            addCriterionForJDBCDate("COMMIT_TIME in", values, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("COMMIT_TIME not in", values, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("COMMIT_TIME between", value1, value2, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("COMMIT_TIME not between", value1, value2, "commitTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("MODIFY_TIME =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("MODIFY_TIME <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("MODIFY_TIME >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("MODIFY_TIME <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("MODIFY_TIME in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("MODIFY_TIME not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andCompCodeIsNull() {
            addCriterion("COMP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCompCodeIsNotNull() {
            addCriterion("COMP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCompCodeEqualTo(String value) {
            addCriterion("COMP_CODE =", value, "compCode");
            return (Criteria) this;
        }

        public Criteria andCompCodeNotEqualTo(String value) {
            addCriterion("COMP_CODE <>", value, "compCode");
            return (Criteria) this;
        }

        public Criteria andCompCodeGreaterThan(String value) {
            addCriterion("COMP_CODE >", value, "compCode");
            return (Criteria) this;
        }

        public Criteria andCompCodeGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_CODE >=", value, "compCode");
            return (Criteria) this;
        }

        public Criteria andCompCodeLessThan(String value) {
            addCriterion("COMP_CODE <", value, "compCode");
            return (Criteria) this;
        }

        public Criteria andCompCodeLessThanOrEqualTo(String value) {
            addCriterion("COMP_CODE <=", value, "compCode");
            return (Criteria) this;
        }

        public Criteria andCompCodeLike(String value) {
            addCriterion("COMP_CODE like", value, "compCode");
            return (Criteria) this;
        }

        public Criteria andCompCodeNotLike(String value) {
            addCriterion("COMP_CODE not like", value, "compCode");
            return (Criteria) this;
        }

        public Criteria andCompCodeIn(List<String> values) {
            addCriterion("COMP_CODE in", values, "compCode");
            return (Criteria) this;
        }

        public Criteria andCompCodeNotIn(List<String> values) {
            addCriterion("COMP_CODE not in", values, "compCode");
            return (Criteria) this;
        }

        public Criteria andCompCodeBetween(String value1, String value2) {
            addCriterion("COMP_CODE between", value1, value2, "compCode");
            return (Criteria) this;
        }

        public Criteria andCompCodeNotBetween(String value1, String value2) {
            addCriterion("COMP_CODE not between", value1, value2, "compCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNull() {
            addCriterion("DEPT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNotNull() {
            addCriterion("DEPT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeEqualTo(String value) {
            addCriterion("DEPT_CODE =", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotEqualTo(String value) {
            addCriterion("DEPT_CODE <>", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThan(String value) {
            addCriterion("DEPT_CODE >", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_CODE >=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThan(String value) {
            addCriterion("DEPT_CODE <", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThanOrEqualTo(String value) {
            addCriterion("DEPT_CODE <=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLike(String value) {
            addCriterion("DEPT_CODE like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotLike(String value) {
            addCriterion("DEPT_CODE not like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIn(List<String> values) {
            addCriterion("DEPT_CODE in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotIn(List<String> values) {
            addCriterion("DEPT_CODE not in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeBetween(String value1, String value2) {
            addCriterion("DEPT_CODE between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotBetween(String value1, String value2) {
            addCriterion("DEPT_CODE not between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andCompNameIsNull() {
            addCriterion("COMP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCompNameIsNotNull() {
            addCriterion("COMP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCompNameEqualTo(String value) {
            addCriterion("COMP_NAME =", value, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameNotEqualTo(String value) {
            addCriterion("COMP_NAME <>", value, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameGreaterThan(String value) {
            addCriterion("COMP_NAME >", value, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameGreaterThanOrEqualTo(String value) {
            addCriterion("COMP_NAME >=", value, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameLessThan(String value) {
            addCriterion("COMP_NAME <", value, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameLessThanOrEqualTo(String value) {
            addCriterion("COMP_NAME <=", value, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameLike(String value) {
            addCriterion("COMP_NAME like", value, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameNotLike(String value) {
            addCriterion("COMP_NAME not like", value, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameIn(List<String> values) {
            addCriterion("COMP_NAME in", values, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameNotIn(List<String> values) {
            addCriterion("COMP_NAME not in", values, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameBetween(String value1, String value2) {
            addCriterion("COMP_NAME between", value1, value2, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameNotBetween(String value1, String value2) {
            addCriterion("COMP_NAME not between", value1, value2, "compName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("DEPT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("DEPT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("DEPT_NAME =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("DEPT_NAME <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("DEPT_NAME >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_NAME >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("DEPT_NAME <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("DEPT_NAME <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("DEPT_NAME like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("DEPT_NAME not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("DEPT_NAME in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("DEPT_NAME not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("DEPT_NAME between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("DEPT_NAME not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNull() {
            addCriterion("POST_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNotNull() {
            addCriterion("POST_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPostCodeEqualTo(String value) {
            addCriterion("POST_CODE =", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotEqualTo(String value) {
            addCriterion("POST_CODE <>", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThan(String value) {
            addCriterion("POST_CODE >", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("POST_CODE >=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThan(String value) {
            addCriterion("POST_CODE <", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThanOrEqualTo(String value) {
            addCriterion("POST_CODE <=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLike(String value) {
            addCriterion("POST_CODE like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotLike(String value) {
            addCriterion("POST_CODE not like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeIn(List<String> values) {
            addCriterion("POST_CODE in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotIn(List<String> values) {
            addCriterion("POST_CODE not in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeBetween(String value1, String value2) {
            addCriterion("POST_CODE between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotBetween(String value1, String value2) {
            addCriterion("POST_CODE not between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostNameIsNull() {
            addCriterion("POST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPostNameIsNotNull() {
            addCriterion("POST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPostNameEqualTo(String value) {
            addCriterion("POST_NAME =", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameNotEqualTo(String value) {
            addCriterion("POST_NAME <>", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameGreaterThan(String value) {
            addCriterion("POST_NAME >", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameGreaterThanOrEqualTo(String value) {
            addCriterion("POST_NAME >=", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameLessThan(String value) {
            addCriterion("POST_NAME <", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameLessThanOrEqualTo(String value) {
            addCriterion("POST_NAME <=", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameLike(String value) {
            addCriterion("POST_NAME like", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameNotLike(String value) {
            addCriterion("POST_NAME not like", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameIn(List<String> values) {
            addCriterion("POST_NAME in", values, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameNotIn(List<String> values) {
            addCriterion("POST_NAME not in", values, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameBetween(String value1, String value2) {
            addCriterion("POST_NAME between", value1, value2, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameNotBetween(String value1, String value2) {
            addCriterion("POST_NAME not between", value1, value2, "postName");
            return (Criteria) this;
        }

        public Criteria andOjNameIsNull() {
            addCriterion("OJ_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOjNameIsNotNull() {
            addCriterion("OJ_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOjNameEqualTo(String value) {
            addCriterion("OJ_NAME =", value, "ojName");
            return (Criteria) this;
        }

        public Criteria andOjNameNotEqualTo(String value) {
            addCriterion("OJ_NAME <>", value, "ojName");
            return (Criteria) this;
        }

        public Criteria andOjNameGreaterThan(String value) {
            addCriterion("OJ_NAME >", value, "ojName");
            return (Criteria) this;
        }

        public Criteria andOjNameGreaterThanOrEqualTo(String value) {
            addCriterion("OJ_NAME >=", value, "ojName");
            return (Criteria) this;
        }

        public Criteria andOjNameLessThan(String value) {
            addCriterion("OJ_NAME <", value, "ojName");
            return (Criteria) this;
        }

        public Criteria andOjNameLessThanOrEqualTo(String value) {
            addCriterion("OJ_NAME <=", value, "ojName");
            return (Criteria) this;
        }

        public Criteria andOjNameLike(String value) {
            addCriterion("OJ_NAME like", value, "ojName");
            return (Criteria) this;
        }

        public Criteria andOjNameNotLike(String value) {
            addCriterion("OJ_NAME not like", value, "ojName");
            return (Criteria) this;
        }

        public Criteria andOjNameIn(List<String> values) {
            addCriterion("OJ_NAME in", values, "ojName");
            return (Criteria) this;
        }

        public Criteria andOjNameNotIn(List<String> values) {
            addCriterion("OJ_NAME not in", values, "ojName");
            return (Criteria) this;
        }

        public Criteria andOjNameBetween(String value1, String value2) {
            addCriterion("OJ_NAME between", value1, value2, "ojName");
            return (Criteria) this;
        }

        public Criteria andOjNameNotBetween(String value1, String value2) {
            addCriterion("OJ_NAME not between", value1, value2, "ojName");
            return (Criteria) this;
        }

        public Criteria andOjTableNameIsNull() {
            addCriterion("OJ_TABLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOjTableNameIsNotNull() {
            addCriterion("OJ_TABLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOjTableNameEqualTo(String value) {
            addCriterion("OJ_TABLE_NAME =", value, "ojTableName");
            return (Criteria) this;
        }

        public Criteria andOjTableNameNotEqualTo(String value) {
            addCriterion("OJ_TABLE_NAME <>", value, "ojTableName");
            return (Criteria) this;
        }

        public Criteria andOjTableNameGreaterThan(String value) {
            addCriterion("OJ_TABLE_NAME >", value, "ojTableName");
            return (Criteria) this;
        }

        public Criteria andOjTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("OJ_TABLE_NAME >=", value, "ojTableName");
            return (Criteria) this;
        }

        public Criteria andOjTableNameLessThan(String value) {
            addCriterion("OJ_TABLE_NAME <", value, "ojTableName");
            return (Criteria) this;
        }

        public Criteria andOjTableNameLessThanOrEqualTo(String value) {
            addCriterion("OJ_TABLE_NAME <=", value, "ojTableName");
            return (Criteria) this;
        }

        public Criteria andOjTableNameLike(String value) {
            addCriterion("OJ_TABLE_NAME like", value, "ojTableName");
            return (Criteria) this;
        }

        public Criteria andOjTableNameNotLike(String value) {
            addCriterion("OJ_TABLE_NAME not like", value, "ojTableName");
            return (Criteria) this;
        }

        public Criteria andOjTableNameIn(List<String> values) {
            addCriterion("OJ_TABLE_NAME in", values, "ojTableName");
            return (Criteria) this;
        }

        public Criteria andOjTableNameNotIn(List<String> values) {
            addCriterion("OJ_TABLE_NAME not in", values, "ojTableName");
            return (Criteria) this;
        }

        public Criteria andOjTableNameBetween(String value1, String value2) {
            addCriterion("OJ_TABLE_NAME between", value1, value2, "ojTableName");
            return (Criteria) this;
        }

        public Criteria andOjTableNameNotBetween(String value1, String value2) {
            addCriterion("OJ_TABLE_NAME not between", value1, value2, "ojTableName");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
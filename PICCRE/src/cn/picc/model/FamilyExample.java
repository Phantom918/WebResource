package cn.picc.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FamilyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FamilyExample() {
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

        public Criteria andPkFamilyIsNull() {
            addCriterion("PK_FAMILY is null");
            return (Criteria) this;
        }

        public Criteria andPkFamilyIsNotNull() {
            addCriterion("PK_FAMILY is not null");
            return (Criteria) this;
        }

        public Criteria andPkFamilyEqualTo(BigDecimal value) {
            addCriterion("PK_FAMILY =", value, "pkFamily");
            return (Criteria) this;
        }

        public Criteria andPkFamilyNotEqualTo(BigDecimal value) {
            addCriterion("PK_FAMILY <>", value, "pkFamily");
            return (Criteria) this;
        }

        public Criteria andPkFamilyGreaterThan(BigDecimal value) {
            addCriterion("PK_FAMILY >", value, "pkFamily");
            return (Criteria) this;
        }

        public Criteria andPkFamilyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PK_FAMILY >=", value, "pkFamily");
            return (Criteria) this;
        }

        public Criteria andPkFamilyLessThan(BigDecimal value) {
            addCriterion("PK_FAMILY <", value, "pkFamily");
            return (Criteria) this;
        }

        public Criteria andPkFamilyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PK_FAMILY <=", value, "pkFamily");
            return (Criteria) this;
        }

        public Criteria andPkFamilyIn(List<BigDecimal> values) {
            addCriterion("PK_FAMILY in", values, "pkFamily");
            return (Criteria) this;
        }

        public Criteria andPkFamilyNotIn(List<BigDecimal> values) {
            addCriterion("PK_FAMILY not in", values, "pkFamily");
            return (Criteria) this;
        }

        public Criteria andPkFamilyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PK_FAMILY between", value1, value2, "pkFamily");
            return (Criteria) this;
        }

        public Criteria andPkFamilyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PK_FAMILY not between", value1, value2, "pkFamily");
            return (Criteria) this;
        }

        public Criteria andPkEmpIsNull() {
            addCriterion("PK_EMP is null");
            return (Criteria) this;
        }

        public Criteria andPkEmpIsNotNull() {
            addCriterion("PK_EMP is not null");
            return (Criteria) this;
        }

        public Criteria andPkEmpEqualTo(BigDecimal value) {
            addCriterion("PK_EMP =", value, "pkEmp");
            return (Criteria) this;
        }

        public Criteria andPkEmpNotEqualTo(BigDecimal value) {
            addCriterion("PK_EMP <>", value, "pkEmp");
            return (Criteria) this;
        }

        public Criteria andPkEmpGreaterThan(BigDecimal value) {
            addCriterion("PK_EMP >", value, "pkEmp");
            return (Criteria) this;
        }

        public Criteria andPkEmpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PK_EMP >=", value, "pkEmp");
            return (Criteria) this;
        }

        public Criteria andPkEmpLessThan(BigDecimal value) {
            addCriterion("PK_EMP <", value, "pkEmp");
            return (Criteria) this;
        }

        public Criteria andPkEmpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PK_EMP <=", value, "pkEmp");
            return (Criteria) this;
        }

        public Criteria andPkEmpIn(List<BigDecimal> values) {
            addCriterion("PK_EMP in", values, "pkEmp");
            return (Criteria) this;
        }

        public Criteria andPkEmpNotIn(List<BigDecimal> values) {
            addCriterion("PK_EMP not in", values, "pkEmp");
            return (Criteria) this;
        }

        public Criteria andPkEmpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PK_EMP between", value1, value2, "pkEmp");
            return (Criteria) this;
        }

        public Criteria andPkEmpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PK_EMP not between", value1, value2, "pkEmp");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andRelationIsNull() {
            addCriterion("RELATION is null");
            return (Criteria) this;
        }

        public Criteria andRelationIsNotNull() {
            addCriterion("RELATION is not null");
            return (Criteria) this;
        }

        public Criteria andRelationEqualTo(String value) {
            addCriterion("RELATION =", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotEqualTo(String value) {
            addCriterion("RELATION <>", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThan(String value) {
            addCriterion("RELATION >", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThanOrEqualTo(String value) {
            addCriterion("RELATION >=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThan(String value) {
            addCriterion("RELATION <", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThanOrEqualTo(String value) {
            addCriterion("RELATION <=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLike(String value) {
            addCriterion("RELATION like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotLike(String value) {
            addCriterion("RELATION not like", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationIn(List<String> values) {
            addCriterion("RELATION in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotIn(List<String> values) {
            addCriterion("RELATION not in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationBetween(String value1, String value2) {
            addCriterion("RELATION between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotBetween(String value1, String value2) {
            addCriterion("RELATION not between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceIsNull() {
            addCriterion("WORK_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceIsNotNull() {
            addCriterion("WORK_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceEqualTo(String value) {
            addCriterion("WORK_PLACE =", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceNotEqualTo(String value) {
            addCriterion("WORK_PLACE <>", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceGreaterThan(String value) {
            addCriterion("WORK_PLACE >", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_PLACE >=", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceLessThan(String value) {
            addCriterion("WORK_PLACE <", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceLessThanOrEqualTo(String value) {
            addCriterion("WORK_PLACE <=", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceLike(String value) {
            addCriterion("WORK_PLACE like", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceNotLike(String value) {
            addCriterion("WORK_PLACE not like", value, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceIn(List<String> values) {
            addCriterion("WORK_PLACE in", values, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceNotIn(List<String> values) {
            addCriterion("WORK_PLACE not in", values, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceBetween(String value1, String value2) {
            addCriterion("WORK_PLACE between", value1, value2, "workPlace");
            return (Criteria) this;
        }

        public Criteria andWorkPlaceNotBetween(String value1, String value2) {
            addCriterion("WORK_PLACE not between", value1, value2, "workPlace");
            return (Criteria) this;
        }

        public Criteria andDutyIsNull() {
            addCriterion("DUTY is null");
            return (Criteria) this;
        }

        public Criteria andDutyIsNotNull() {
            addCriterion("DUTY is not null");
            return (Criteria) this;
        }

        public Criteria andDutyEqualTo(String value) {
            addCriterion("DUTY =", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotEqualTo(String value) {
            addCriterion("DUTY <>", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyGreaterThan(String value) {
            addCriterion("DUTY >", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyGreaterThanOrEqualTo(String value) {
            addCriterion("DUTY >=", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLessThan(String value) {
            addCriterion("DUTY <", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLessThanOrEqualTo(String value) {
            addCriterion("DUTY <=", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyLike(String value) {
            addCriterion("DUTY like", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotLike(String value) {
            addCriterion("DUTY not like", value, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyIn(List<String> values) {
            addCriterion("DUTY in", values, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotIn(List<String> values) {
            addCriterion("DUTY not in", values, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyBetween(String value1, String value2) {
            addCriterion("DUTY between", value1, value2, "duty");
            return (Criteria) this;
        }

        public Criteria andDutyNotBetween(String value1, String value2) {
            addCriterion("DUTY not between", value1, value2, "duty");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("GENDER is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("GENDER =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("GENDER <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("GENDER >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("GENDER >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("GENDER <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("GENDER <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("GENDER like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("GENDER not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("GENDER in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("GENDER not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("GENDER between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("GENDER not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andBirthIsNull() {
            addCriterion("BIRTH is null");
            return (Criteria) this;
        }

        public Criteria andBirthIsNotNull() {
            addCriterion("BIRTH is not null");
            return (Criteria) this;
        }

        public Criteria andBirthEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTH =", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTH <>", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThan(Date value) {
            addCriterionForJDBCDate("BIRTH >", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTH >=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThan(Date value) {
            addCriterionForJDBCDate("BIRTH <", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTH <=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTH in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTH not in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTH between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTH not between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andPoloticsIsNull() {
            addCriterion("POLOTICS is null");
            return (Criteria) this;
        }

        public Criteria andPoloticsIsNotNull() {
            addCriterion("POLOTICS is not null");
            return (Criteria) this;
        }

        public Criteria andPoloticsEqualTo(String value) {
            addCriterion("POLOTICS =", value, "polotics");
            return (Criteria) this;
        }

        public Criteria andPoloticsNotEqualTo(String value) {
            addCriterion("POLOTICS <>", value, "polotics");
            return (Criteria) this;
        }

        public Criteria andPoloticsGreaterThan(String value) {
            addCriterion("POLOTICS >", value, "polotics");
            return (Criteria) this;
        }

        public Criteria andPoloticsGreaterThanOrEqualTo(String value) {
            addCriterion("POLOTICS >=", value, "polotics");
            return (Criteria) this;
        }

        public Criteria andPoloticsLessThan(String value) {
            addCriterion("POLOTICS <", value, "polotics");
            return (Criteria) this;
        }

        public Criteria andPoloticsLessThanOrEqualTo(String value) {
            addCriterion("POLOTICS <=", value, "polotics");
            return (Criteria) this;
        }

        public Criteria andPoloticsLike(String value) {
            addCriterion("POLOTICS like", value, "polotics");
            return (Criteria) this;
        }

        public Criteria andPoloticsNotLike(String value) {
            addCriterion("POLOTICS not like", value, "polotics");
            return (Criteria) this;
        }

        public Criteria andPoloticsIn(List<String> values) {
            addCriterion("POLOTICS in", values, "polotics");
            return (Criteria) this;
        }

        public Criteria andPoloticsNotIn(List<String> values) {
            addCriterion("POLOTICS not in", values, "polotics");
            return (Criteria) this;
        }

        public Criteria andPoloticsBetween(String value1, String value2) {
            addCriterion("POLOTICS between", value1, value2, "polotics");
            return (Criteria) this;
        }

        public Criteria andPoloticsNotBetween(String value1, String value2) {
            addCriterion("POLOTICS not between", value1, value2, "polotics");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("EDUCATION is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("EDUCATION is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("EDUCATION =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("EDUCATION <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("EDUCATION >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("EDUCATION >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("EDUCATION <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("EDUCATION <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("EDUCATION like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("EDUCATION not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("EDUCATION in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("EDUCATION not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("EDUCATION between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("EDUCATION not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andConnectionIsNull() {
            addCriterion("CONNECTION is null");
            return (Criteria) this;
        }

        public Criteria andConnectionIsNotNull() {
            addCriterion("CONNECTION is not null");
            return (Criteria) this;
        }

        public Criteria andConnectionEqualTo(String value) {
            addCriterion("CONNECTION =", value, "connection");
            return (Criteria) this;
        }

        public Criteria andConnectionNotEqualTo(String value) {
            addCriterion("CONNECTION <>", value, "connection");
            return (Criteria) this;
        }

        public Criteria andConnectionGreaterThan(String value) {
            addCriterion("CONNECTION >", value, "connection");
            return (Criteria) this;
        }

        public Criteria andConnectionGreaterThanOrEqualTo(String value) {
            addCriterion("CONNECTION >=", value, "connection");
            return (Criteria) this;
        }

        public Criteria andConnectionLessThan(String value) {
            addCriterion("CONNECTION <", value, "connection");
            return (Criteria) this;
        }

        public Criteria andConnectionLessThanOrEqualTo(String value) {
            addCriterion("CONNECTION <=", value, "connection");
            return (Criteria) this;
        }

        public Criteria andConnectionLike(String value) {
            addCriterion("CONNECTION like", value, "connection");
            return (Criteria) this;
        }

        public Criteria andConnectionNotLike(String value) {
            addCriterion("CONNECTION not like", value, "connection");
            return (Criteria) this;
        }

        public Criteria andConnectionIn(List<String> values) {
            addCriterion("CONNECTION in", values, "connection");
            return (Criteria) this;
        }

        public Criteria andConnectionNotIn(List<String> values) {
            addCriterion("CONNECTION not in", values, "connection");
            return (Criteria) this;
        }

        public Criteria andConnectionBetween(String value1, String value2) {
            addCriterion("CONNECTION between", value1, value2, "connection");
            return (Criteria) this;
        }

        public Criteria andConnectionNotBetween(String value1, String value2) {
            addCriterion("CONNECTION not between", value1, value2, "connection");
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
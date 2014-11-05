package cn.picc.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EducationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EducationExample() {
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

        public Criteria andPkEducationIsNull() {
            addCriterion("PK_EDUCATION is null");
            return (Criteria) this;
        }

        public Criteria andPkEducationIsNotNull() {
            addCriterion("PK_EDUCATION is not null");
            return (Criteria) this;
        }

        public Criteria andPkEducationEqualTo(BigDecimal value) {
            addCriterion("PK_EDUCATION =", value, "pkEducation");
            return (Criteria) this;
        }

        public Criteria andPkEducationNotEqualTo(BigDecimal value) {
            addCriterion("PK_EDUCATION <>", value, "pkEducation");
            return (Criteria) this;
        }

        public Criteria andPkEducationGreaterThan(BigDecimal value) {
            addCriterion("PK_EDUCATION >", value, "pkEducation");
            return (Criteria) this;
        }

        public Criteria andPkEducationGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PK_EDUCATION >=", value, "pkEducation");
            return (Criteria) this;
        }

        public Criteria andPkEducationLessThan(BigDecimal value) {
            addCriterion("PK_EDUCATION <", value, "pkEducation");
            return (Criteria) this;
        }

        public Criteria andPkEducationLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PK_EDUCATION <=", value, "pkEducation");
            return (Criteria) this;
        }

        public Criteria andPkEducationIn(List<BigDecimal> values) {
            addCriterion("PK_EDUCATION in", values, "pkEducation");
            return (Criteria) this;
        }

        public Criteria andPkEducationNotIn(List<BigDecimal> values) {
            addCriterion("PK_EDUCATION not in", values, "pkEducation");
            return (Criteria) this;
        }

        public Criteria andPkEducationBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PK_EDUCATION between", value1, value2, "pkEducation");
            return (Criteria) this;
        }

        public Criteria andPkEducationNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PK_EDUCATION not between", value1, value2, "pkEducation");
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

        public Criteria andHeighEduIsNull() {
            addCriterion("HEIGH_EDU is null");
            return (Criteria) this;
        }

        public Criteria andHeighEduIsNotNull() {
            addCriterion("HEIGH_EDU is not null");
            return (Criteria) this;
        }

        public Criteria andHeighEduEqualTo(String value) {
            addCriterion("HEIGH_EDU =", value, "heighEdu");
            return (Criteria) this;
        }

        public Criteria andHeighEduNotEqualTo(String value) {
            addCriterion("HEIGH_EDU <>", value, "heighEdu");
            return (Criteria) this;
        }

        public Criteria andHeighEduGreaterThan(String value) {
            addCriterion("HEIGH_EDU >", value, "heighEdu");
            return (Criteria) this;
        }

        public Criteria andHeighEduGreaterThanOrEqualTo(String value) {
            addCriterion("HEIGH_EDU >=", value, "heighEdu");
            return (Criteria) this;
        }

        public Criteria andHeighEduLessThan(String value) {
            addCriterion("HEIGH_EDU <", value, "heighEdu");
            return (Criteria) this;
        }

        public Criteria andHeighEduLessThanOrEqualTo(String value) {
            addCriterion("HEIGH_EDU <=", value, "heighEdu");
            return (Criteria) this;
        }

        public Criteria andHeighEduLike(String value) {
            addCriterion("HEIGH_EDU like", value, "heighEdu");
            return (Criteria) this;
        }

        public Criteria andHeighEduNotLike(String value) {
            addCriterion("HEIGH_EDU not like", value, "heighEdu");
            return (Criteria) this;
        }

        public Criteria andHeighEduIn(List<String> values) {
            addCriterion("HEIGH_EDU in", values, "heighEdu");
            return (Criteria) this;
        }

        public Criteria andHeighEduNotIn(List<String> values) {
            addCriterion("HEIGH_EDU not in", values, "heighEdu");
            return (Criteria) this;
        }

        public Criteria andHeighEduBetween(String value1, String value2) {
            addCriterion("HEIGH_EDU between", value1, value2, "heighEdu");
            return (Criteria) this;
        }

        public Criteria andHeighEduNotBetween(String value1, String value2) {
            addCriterion("HEIGH_EDU not between", value1, value2, "heighEdu");
            return (Criteria) this;
        }

        public Criteria andDayEduIsNull() {
            addCriterion("DAY_EDU is null");
            return (Criteria) this;
        }

        public Criteria andDayEduIsNotNull() {
            addCriterion("DAY_EDU is not null");
            return (Criteria) this;
        }

        public Criteria andDayEduEqualTo(String value) {
            addCriterion("DAY_EDU =", value, "dayEdu");
            return (Criteria) this;
        }

        public Criteria andDayEduNotEqualTo(String value) {
            addCriterion("DAY_EDU <>", value, "dayEdu");
            return (Criteria) this;
        }

        public Criteria andDayEduGreaterThan(String value) {
            addCriterion("DAY_EDU >", value, "dayEdu");
            return (Criteria) this;
        }

        public Criteria andDayEduGreaterThanOrEqualTo(String value) {
            addCriterion("DAY_EDU >=", value, "dayEdu");
            return (Criteria) this;
        }

        public Criteria andDayEduLessThan(String value) {
            addCriterion("DAY_EDU <", value, "dayEdu");
            return (Criteria) this;
        }

        public Criteria andDayEduLessThanOrEqualTo(String value) {
            addCriterion("DAY_EDU <=", value, "dayEdu");
            return (Criteria) this;
        }

        public Criteria andDayEduLike(String value) {
            addCriterion("DAY_EDU like", value, "dayEdu");
            return (Criteria) this;
        }

        public Criteria andDayEduNotLike(String value) {
            addCriterion("DAY_EDU not like", value, "dayEdu");
            return (Criteria) this;
        }

        public Criteria andDayEduIn(List<String> values) {
            addCriterion("DAY_EDU in", values, "dayEdu");
            return (Criteria) this;
        }

        public Criteria andDayEduNotIn(List<String> values) {
            addCriterion("DAY_EDU not in", values, "dayEdu");
            return (Criteria) this;
        }

        public Criteria andDayEduBetween(String value1, String value2) {
            addCriterion("DAY_EDU between", value1, value2, "dayEdu");
            return (Criteria) this;
        }

        public Criteria andDayEduNotBetween(String value1, String value2) {
            addCriterion("DAY_EDU not between", value1, value2, "dayEdu");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeIsNull() {
            addCriterion("ENTRANCE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeIsNotNull() {
            addCriterion("ENTRANCE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeEqualTo(Date value) {
            addCriterionForJDBCDate("ENTRANCE_TIME =", value, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ENTRANCE_TIME <>", value, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ENTRANCE_TIME >", value, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENTRANCE_TIME >=", value, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeLessThan(Date value) {
            addCriterionForJDBCDate("ENTRANCE_TIME <", value, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENTRANCE_TIME <=", value, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeIn(List<Date> values) {
            addCriterionForJDBCDate("ENTRANCE_TIME in", values, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ENTRANCE_TIME not in", values, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENTRANCE_TIME between", value1, value2, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andEntranceTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENTRANCE_TIME not between", value1, value2, "entranceTime");
            return (Criteria) this;
        }

        public Criteria andGradTimeIsNull() {
            addCriterion("GRAD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andGradTimeIsNotNull() {
            addCriterion("GRAD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andGradTimeEqualTo(Date value) {
            addCriterionForJDBCDate("GRAD_TIME =", value, "gradTime");
            return (Criteria) this;
        }

        public Criteria andGradTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("GRAD_TIME <>", value, "gradTime");
            return (Criteria) this;
        }

        public Criteria andGradTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("GRAD_TIME >", value, "gradTime");
            return (Criteria) this;
        }

        public Criteria andGradTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GRAD_TIME >=", value, "gradTime");
            return (Criteria) this;
        }

        public Criteria andGradTimeLessThan(Date value) {
            addCriterionForJDBCDate("GRAD_TIME <", value, "gradTime");
            return (Criteria) this;
        }

        public Criteria andGradTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GRAD_TIME <=", value, "gradTime");
            return (Criteria) this;
        }

        public Criteria andGradTimeIn(List<Date> values) {
            addCriterionForJDBCDate("GRAD_TIME in", values, "gradTime");
            return (Criteria) this;
        }

        public Criteria andGradTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("GRAD_TIME not in", values, "gradTime");
            return (Criteria) this;
        }

        public Criteria andGradTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GRAD_TIME between", value1, value2, "gradTime");
            return (Criteria) this;
        }

        public Criteria andGradTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GRAD_TIME not between", value1, value2, "gradTime");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNull() {
            addCriterion("SCHOOL is null");
            return (Criteria) this;
        }

        public Criteria andSchoolIsNotNull() {
            addCriterion("SCHOOL is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolEqualTo(String value) {
            addCriterion("SCHOOL =", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotEqualTo(String value) {
            addCriterion("SCHOOL <>", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThan(String value) {
            addCriterion("SCHOOL >", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOL >=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThan(String value) {
            addCriterion("SCHOOL <", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLessThanOrEqualTo(String value) {
            addCriterion("SCHOOL <=", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolLike(String value) {
            addCriterion("SCHOOL like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotLike(String value) {
            addCriterion("SCHOOL not like", value, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolIn(List<String> values) {
            addCriterion("SCHOOL in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotIn(List<String> values) {
            addCriterion("SCHOOL not in", values, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolBetween(String value1, String value2) {
            addCriterion("SCHOOL between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andSchoolNotBetween(String value1, String value2) {
            addCriterion("SCHOOL not between", value1, value2, "school");
            return (Criteria) this;
        }

        public Criteria andPecIsNull() {
            addCriterion("PEC is null");
            return (Criteria) this;
        }

        public Criteria andPecIsNotNull() {
            addCriterion("PEC is not null");
            return (Criteria) this;
        }

        public Criteria andPecEqualTo(String value) {
            addCriterion("PEC =", value, "pec");
            return (Criteria) this;
        }

        public Criteria andPecNotEqualTo(String value) {
            addCriterion("PEC <>", value, "pec");
            return (Criteria) this;
        }

        public Criteria andPecGreaterThan(String value) {
            addCriterion("PEC >", value, "pec");
            return (Criteria) this;
        }

        public Criteria andPecGreaterThanOrEqualTo(String value) {
            addCriterion("PEC >=", value, "pec");
            return (Criteria) this;
        }

        public Criteria andPecLessThan(String value) {
            addCriterion("PEC <", value, "pec");
            return (Criteria) this;
        }

        public Criteria andPecLessThanOrEqualTo(String value) {
            addCriterion("PEC <=", value, "pec");
            return (Criteria) this;
        }

        public Criteria andPecLike(String value) {
            addCriterion("PEC like", value, "pec");
            return (Criteria) this;
        }

        public Criteria andPecNotLike(String value) {
            addCriterion("PEC not like", value, "pec");
            return (Criteria) this;
        }

        public Criteria andPecIn(List<String> values) {
            addCriterion("PEC in", values, "pec");
            return (Criteria) this;
        }

        public Criteria andPecNotIn(List<String> values) {
            addCriterion("PEC not in", values, "pec");
            return (Criteria) this;
        }

        public Criteria andPecBetween(String value1, String value2) {
            addCriterion("PEC between", value1, value2, "pec");
            return (Criteria) this;
        }

        public Criteria andPecNotBetween(String value1, String value2) {
            addCriterion("PEC not between", value1, value2, "pec");
            return (Criteria) this;
        }

        public Criteria andPecTypeIsNull() {
            addCriterion("PEC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPecTypeIsNotNull() {
            addCriterion("PEC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPecTypeEqualTo(String value) {
            addCriterion("PEC_TYPE =", value, "pecType");
            return (Criteria) this;
        }

        public Criteria andPecTypeNotEqualTo(String value) {
            addCriterion("PEC_TYPE <>", value, "pecType");
            return (Criteria) this;
        }

        public Criteria andPecTypeGreaterThan(String value) {
            addCriterion("PEC_TYPE >", value, "pecType");
            return (Criteria) this;
        }

        public Criteria andPecTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PEC_TYPE >=", value, "pecType");
            return (Criteria) this;
        }

        public Criteria andPecTypeLessThan(String value) {
            addCriterion("PEC_TYPE <", value, "pecType");
            return (Criteria) this;
        }

        public Criteria andPecTypeLessThanOrEqualTo(String value) {
            addCriterion("PEC_TYPE <=", value, "pecType");
            return (Criteria) this;
        }

        public Criteria andPecTypeLike(String value) {
            addCriterion("PEC_TYPE like", value, "pecType");
            return (Criteria) this;
        }

        public Criteria andPecTypeNotLike(String value) {
            addCriterion("PEC_TYPE not like", value, "pecType");
            return (Criteria) this;
        }

        public Criteria andPecTypeIn(List<String> values) {
            addCriterion("PEC_TYPE in", values, "pecType");
            return (Criteria) this;
        }

        public Criteria andPecTypeNotIn(List<String> values) {
            addCriterion("PEC_TYPE not in", values, "pecType");
            return (Criteria) this;
        }

        public Criteria andPecTypeBetween(String value1, String value2) {
            addCriterion("PEC_TYPE between", value1, value2, "pecType");
            return (Criteria) this;
        }

        public Criteria andPecTypeNotBetween(String value1, String value2) {
            addCriterion("PEC_TYPE not between", value1, value2, "pecType");
            return (Criteria) this;
        }

        public Criteria andEduIsNull() {
            addCriterion("EDU is null");
            return (Criteria) this;
        }

        public Criteria andEduIsNotNull() {
            addCriterion("EDU is not null");
            return (Criteria) this;
        }

        public Criteria andEduEqualTo(String value) {
            addCriterion("EDU =", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduNotEqualTo(String value) {
            addCriterion("EDU <>", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduGreaterThan(String value) {
            addCriterion("EDU >", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduGreaterThanOrEqualTo(String value) {
            addCriterion("EDU >=", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduLessThan(String value) {
            addCriterion("EDU <", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduLessThanOrEqualTo(String value) {
            addCriterion("EDU <=", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduLike(String value) {
            addCriterion("EDU like", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduNotLike(String value) {
            addCriterion("EDU not like", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduIn(List<String> values) {
            addCriterion("EDU in", values, "edu");
            return (Criteria) this;
        }

        public Criteria andEduNotIn(List<String> values) {
            addCriterion("EDU not in", values, "edu");
            return (Criteria) this;
        }

        public Criteria andEduBetween(String value1, String value2) {
            addCriterion("EDU between", value1, value2, "edu");
            return (Criteria) this;
        }

        public Criteria andEduNotBetween(String value1, String value2) {
            addCriterion("EDU not between", value1, value2, "edu");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNull() {
            addCriterion("DEGREE is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNotNull() {
            addCriterion("DEGREE is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeEqualTo(String value) {
            addCriterion("DEGREE =", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotEqualTo(String value) {
            addCriterion("DEGREE <>", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThan(String value) {
            addCriterion("DEGREE >", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("DEGREE >=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThan(String value) {
            addCriterion("DEGREE <", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThanOrEqualTo(String value) {
            addCriterion("DEGREE <=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLike(String value) {
            addCriterion("DEGREE like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotLike(String value) {
            addCriterion("DEGREE not like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeIn(List<String> values) {
            addCriterion("DEGREE in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotIn(List<String> values) {
            addCriterion("DEGREE not in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeBetween(String value1, String value2) {
            addCriterion("DEGREE between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotBetween(String value1, String value2) {
            addCriterion("DEGREE not between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andEduLengthIsNull() {
            addCriterion("EDU_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andEduLengthIsNotNull() {
            addCriterion("EDU_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andEduLengthEqualTo(String value) {
            addCriterion("EDU_LENGTH =", value, "eduLength");
            return (Criteria) this;
        }

        public Criteria andEduLengthNotEqualTo(String value) {
            addCriterion("EDU_LENGTH <>", value, "eduLength");
            return (Criteria) this;
        }

        public Criteria andEduLengthGreaterThan(String value) {
            addCriterion("EDU_LENGTH >", value, "eduLength");
            return (Criteria) this;
        }

        public Criteria andEduLengthGreaterThanOrEqualTo(String value) {
            addCriterion("EDU_LENGTH >=", value, "eduLength");
            return (Criteria) this;
        }

        public Criteria andEduLengthLessThan(String value) {
            addCriterion("EDU_LENGTH <", value, "eduLength");
            return (Criteria) this;
        }

        public Criteria andEduLengthLessThanOrEqualTo(String value) {
            addCriterion("EDU_LENGTH <=", value, "eduLength");
            return (Criteria) this;
        }

        public Criteria andEduLengthLike(String value) {
            addCriterion("EDU_LENGTH like", value, "eduLength");
            return (Criteria) this;
        }

        public Criteria andEduLengthNotLike(String value) {
            addCriterion("EDU_LENGTH not like", value, "eduLength");
            return (Criteria) this;
        }

        public Criteria andEduLengthIn(List<String> values) {
            addCriterion("EDU_LENGTH in", values, "eduLength");
            return (Criteria) this;
        }

        public Criteria andEduLengthNotIn(List<String> values) {
            addCriterion("EDU_LENGTH not in", values, "eduLength");
            return (Criteria) this;
        }

        public Criteria andEduLengthBetween(String value1, String value2) {
            addCriterion("EDU_LENGTH between", value1, value2, "eduLength");
            return (Criteria) this;
        }

        public Criteria andEduLengthNotBetween(String value1, String value2) {
            addCriterion("EDU_LENGTH not between", value1, value2, "eduLength");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeIsNull() {
            addCriterion("SCHOOL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeIsNotNull() {
            addCriterion("SCHOOL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeEqualTo(String value) {
            addCriterion("SCHOOL_TYPE =", value, "schoolType");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeNotEqualTo(String value) {
            addCriterion("SCHOOL_TYPE <>", value, "schoolType");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeGreaterThan(String value) {
            addCriterion("SCHOOL_TYPE >", value, "schoolType");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SCHOOL_TYPE >=", value, "schoolType");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeLessThan(String value) {
            addCriterion("SCHOOL_TYPE <", value, "schoolType");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeLessThanOrEqualTo(String value) {
            addCriterion("SCHOOL_TYPE <=", value, "schoolType");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeLike(String value) {
            addCriterion("SCHOOL_TYPE like", value, "schoolType");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeNotLike(String value) {
            addCriterion("SCHOOL_TYPE not like", value, "schoolType");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeIn(List<String> values) {
            addCriterion("SCHOOL_TYPE in", values, "schoolType");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeNotIn(List<String> values) {
            addCriterion("SCHOOL_TYPE not in", values, "schoolType");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeBetween(String value1, String value2) {
            addCriterion("SCHOOL_TYPE between", value1, value2, "schoolType");
            return (Criteria) this;
        }

        public Criteria andSchoolTypeNotBetween(String value1, String value2) {
            addCriterion("SCHOOL_TYPE not between", value1, value2, "schoolType");
            return (Criteria) this;
        }

        public Criteria andEduTypeIsNull() {
            addCriterion("EDU_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andEduTypeIsNotNull() {
            addCriterion("EDU_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEduTypeEqualTo(String value) {
            addCriterion("EDU_TYPE =", value, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduTypeNotEqualTo(String value) {
            addCriterion("EDU_TYPE <>", value, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduTypeGreaterThan(String value) {
            addCriterion("EDU_TYPE >", value, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduTypeGreaterThanOrEqualTo(String value) {
            addCriterion("EDU_TYPE >=", value, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduTypeLessThan(String value) {
            addCriterion("EDU_TYPE <", value, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduTypeLessThanOrEqualTo(String value) {
            addCriterion("EDU_TYPE <=", value, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduTypeLike(String value) {
            addCriterion("EDU_TYPE like", value, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduTypeNotLike(String value) {
            addCriterion("EDU_TYPE not like", value, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduTypeIn(List<String> values) {
            addCriterion("EDU_TYPE in", values, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduTypeNotIn(List<String> values) {
            addCriterion("EDU_TYPE not in", values, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduTypeBetween(String value1, String value2) {
            addCriterion("EDU_TYPE between", value1, value2, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduTypeNotBetween(String value1, String value2) {
            addCriterion("EDU_TYPE not between", value1, value2, "eduType");
            return (Criteria) this;
        }

        public Criteria andEduCodeIsNull() {
            addCriterion("EDU_CODE is null");
            return (Criteria) this;
        }

        public Criteria andEduCodeIsNotNull() {
            addCriterion("EDU_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andEduCodeEqualTo(String value) {
            addCriterion("EDU_CODE =", value, "eduCode");
            return (Criteria) this;
        }

        public Criteria andEduCodeNotEqualTo(String value) {
            addCriterion("EDU_CODE <>", value, "eduCode");
            return (Criteria) this;
        }

        public Criteria andEduCodeGreaterThan(String value) {
            addCriterion("EDU_CODE >", value, "eduCode");
            return (Criteria) this;
        }

        public Criteria andEduCodeGreaterThanOrEqualTo(String value) {
            addCriterion("EDU_CODE >=", value, "eduCode");
            return (Criteria) this;
        }

        public Criteria andEduCodeLessThan(String value) {
            addCriterion("EDU_CODE <", value, "eduCode");
            return (Criteria) this;
        }

        public Criteria andEduCodeLessThanOrEqualTo(String value) {
            addCriterion("EDU_CODE <=", value, "eduCode");
            return (Criteria) this;
        }

        public Criteria andEduCodeLike(String value) {
            addCriterion("EDU_CODE like", value, "eduCode");
            return (Criteria) this;
        }

        public Criteria andEduCodeNotLike(String value) {
            addCriterion("EDU_CODE not like", value, "eduCode");
            return (Criteria) this;
        }

        public Criteria andEduCodeIn(List<String> values) {
            addCriterion("EDU_CODE in", values, "eduCode");
            return (Criteria) this;
        }

        public Criteria andEduCodeNotIn(List<String> values) {
            addCriterion("EDU_CODE not in", values, "eduCode");
            return (Criteria) this;
        }

        public Criteria andEduCodeBetween(String value1, String value2) {
            addCriterion("EDU_CODE between", value1, value2, "eduCode");
            return (Criteria) this;
        }

        public Criteria andEduCodeNotBetween(String value1, String value2) {
            addCriterion("EDU_CODE not between", value1, value2, "eduCode");
            return (Criteria) this;
        }

        public Criteria andDegreeCodeIsNull() {
            addCriterion("DEGREE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDegreeCodeIsNotNull() {
            addCriterion("DEGREE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeCodeEqualTo(String value) {
            addCriterion("DEGREE_CODE =", value, "degreeCode");
            return (Criteria) this;
        }

        public Criteria andDegreeCodeNotEqualTo(String value) {
            addCriterion("DEGREE_CODE <>", value, "degreeCode");
            return (Criteria) this;
        }

        public Criteria andDegreeCodeGreaterThan(String value) {
            addCriterion("DEGREE_CODE >", value, "degreeCode");
            return (Criteria) this;
        }

        public Criteria andDegreeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEGREE_CODE >=", value, "degreeCode");
            return (Criteria) this;
        }

        public Criteria andDegreeCodeLessThan(String value) {
            addCriterion("DEGREE_CODE <", value, "degreeCode");
            return (Criteria) this;
        }

        public Criteria andDegreeCodeLessThanOrEqualTo(String value) {
            addCriterion("DEGREE_CODE <=", value, "degreeCode");
            return (Criteria) this;
        }

        public Criteria andDegreeCodeLike(String value) {
            addCriterion("DEGREE_CODE like", value, "degreeCode");
            return (Criteria) this;
        }

        public Criteria andDegreeCodeNotLike(String value) {
            addCriterion("DEGREE_CODE not like", value, "degreeCode");
            return (Criteria) this;
        }

        public Criteria andDegreeCodeIn(List<String> values) {
            addCriterion("DEGREE_CODE in", values, "degreeCode");
            return (Criteria) this;
        }

        public Criteria andDegreeCodeNotIn(List<String> values) {
            addCriterion("DEGREE_CODE not in", values, "degreeCode");
            return (Criteria) this;
        }

        public Criteria andDegreeCodeBetween(String value1, String value2) {
            addCriterion("DEGREE_CODE between", value1, value2, "degreeCode");
            return (Criteria) this;
        }

        public Criteria andDegreeCodeNotBetween(String value1, String value2) {
            addCriterion("DEGREE_CODE not between", value1, value2, "degreeCode");
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
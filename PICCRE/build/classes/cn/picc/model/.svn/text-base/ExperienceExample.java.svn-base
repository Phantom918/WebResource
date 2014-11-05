package cn.picc.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ExperienceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExperienceExample() {
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

        public Criteria andPkExpIsNull() {
            addCriterion("PK_EXP is null");
            return (Criteria) this;
        }

        public Criteria andPkExpIsNotNull() {
            addCriterion("PK_EXP is not null");
            return (Criteria) this;
        }

        public Criteria andPkExpEqualTo(BigDecimal value) {
            addCriterion("PK_EXP =", value, "pkExp");
            return (Criteria) this;
        }

        public Criteria andPkExpNotEqualTo(BigDecimal value) {
            addCriterion("PK_EXP <>", value, "pkExp");
            return (Criteria) this;
        }

        public Criteria andPkExpGreaterThan(BigDecimal value) {
            addCriterion("PK_EXP >", value, "pkExp");
            return (Criteria) this;
        }

        public Criteria andPkExpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PK_EXP >=", value, "pkExp");
            return (Criteria) this;
        }

        public Criteria andPkExpLessThan(BigDecimal value) {
            addCriterion("PK_EXP <", value, "pkExp");
            return (Criteria) this;
        }

        public Criteria andPkExpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PK_EXP <=", value, "pkExp");
            return (Criteria) this;
        }

        public Criteria andPkExpIn(List<BigDecimal> values) {
            addCriterion("PK_EXP in", values, "pkExp");
            return (Criteria) this;
        }

        public Criteria andPkExpNotIn(List<BigDecimal> values) {
            addCriterion("PK_EXP not in", values, "pkExp");
            return (Criteria) this;
        }

        public Criteria andPkExpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PK_EXP between", value1, value2, "pkExp");
            return (Criteria) this;
        }

        public Criteria andPkExpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PK_EXP not between", value1, value2, "pkExp");
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

        public Criteria andBegainTimeIsNull() {
            addCriterion("BEGAIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBegainTimeIsNotNull() {
            addCriterion("BEGAIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBegainTimeEqualTo(Date value) {
            addCriterionForJDBCDate("BEGAIN_TIME =", value, "begainTime");
            return (Criteria) this;
        }

        public Criteria andBegainTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("BEGAIN_TIME <>", value, "begainTime");
            return (Criteria) this;
        }

        public Criteria andBegainTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("BEGAIN_TIME >", value, "begainTime");
            return (Criteria) this;
        }

        public Criteria andBegainTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BEGAIN_TIME >=", value, "begainTime");
            return (Criteria) this;
        }

        public Criteria andBegainTimeLessThan(Date value) {
            addCriterionForJDBCDate("BEGAIN_TIME <", value, "begainTime");
            return (Criteria) this;
        }

        public Criteria andBegainTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BEGAIN_TIME <=", value, "begainTime");
            return (Criteria) this;
        }

        public Criteria andBegainTimeIn(List<Date> values) {
            addCriterionForJDBCDate("BEGAIN_TIME in", values, "begainTime");
            return (Criteria) this;
        }

        public Criteria andBegainTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("BEGAIN_TIME not in", values, "begainTime");
            return (Criteria) this;
        }

        public Criteria andBegainTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BEGAIN_TIME between", value1, value2, "begainTime");
            return (Criteria) this;
        }

        public Criteria andBegainTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BEGAIN_TIME not between", value1, value2, "begainTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_TIME not between", value1, value2, "endTime");
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

        public Criteria andDeptIsNull() {
            addCriterion("DEPT is null");
            return (Criteria) this;
        }

        public Criteria andDeptIsNotNull() {
            addCriterion("DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andDeptEqualTo(String value) {
            addCriterion("DEPT =", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotEqualTo(String value) {
            addCriterion("DEPT <>", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThan(String value) {
            addCriterion("DEPT >", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT >=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThan(String value) {
            addCriterion("DEPT <", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLessThanOrEqualTo(String value) {
            addCriterion("DEPT <=", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptLike(String value) {
            addCriterion("DEPT like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotLike(String value) {
            addCriterion("DEPT not like", value, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptIn(List<String> values) {
            addCriterion("DEPT in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotIn(List<String> values) {
            addCriterion("DEPT not in", values, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptBetween(String value1, String value2) {
            addCriterion("DEPT between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andDeptNotBetween(String value1, String value2) {
            addCriterion("DEPT not between", value1, value2, "dept");
            return (Criteria) this;
        }

        public Criteria andPostIsNull() {
            addCriterion("POST is null");
            return (Criteria) this;
        }

        public Criteria andPostIsNotNull() {
            addCriterion("POST is not null");
            return (Criteria) this;
        }

        public Criteria andPostEqualTo(String value) {
            addCriterion("POST =", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotEqualTo(String value) {
            addCriterion("POST <>", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThan(String value) {
            addCriterion("POST >", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThanOrEqualTo(String value) {
            addCriterion("POST >=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThan(String value) {
            addCriterion("POST <", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThanOrEqualTo(String value) {
            addCriterion("POST <=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLike(String value) {
            addCriterion("POST like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotLike(String value) {
            addCriterion("POST not like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostIn(List<String> values) {
            addCriterion("POST in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotIn(List<String> values) {
            addCriterion("POST not in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostBetween(String value1, String value2) {
            addCriterion("POST between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotBetween(String value1, String value2) {
            addCriterion("POST not between", value1, value2, "post");
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
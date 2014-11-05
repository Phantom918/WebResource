package cn.picc.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TechnicalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TechnicalExample() {
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

        public Criteria andPkTechTitleIsNull() {
            addCriterion("PK_TECH_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andPkTechTitleIsNotNull() {
            addCriterion("PK_TECH_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andPkTechTitleEqualTo(BigDecimal value) {
            addCriterion("PK_TECH_TITLE =", value, "pkTechTitle");
            return (Criteria) this;
        }

        public Criteria andPkTechTitleNotEqualTo(BigDecimal value) {
            addCriterion("PK_TECH_TITLE <>", value, "pkTechTitle");
            return (Criteria) this;
        }

        public Criteria andPkTechTitleGreaterThan(BigDecimal value) {
            addCriterion("PK_TECH_TITLE >", value, "pkTechTitle");
            return (Criteria) this;
        }

        public Criteria andPkTechTitleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PK_TECH_TITLE >=", value, "pkTechTitle");
            return (Criteria) this;
        }

        public Criteria andPkTechTitleLessThan(BigDecimal value) {
            addCriterion("PK_TECH_TITLE <", value, "pkTechTitle");
            return (Criteria) this;
        }

        public Criteria andPkTechTitleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PK_TECH_TITLE <=", value, "pkTechTitle");
            return (Criteria) this;
        }

        public Criteria andPkTechTitleIn(List<BigDecimal> values) {
            addCriterion("PK_TECH_TITLE in", values, "pkTechTitle");
            return (Criteria) this;
        }

        public Criteria andPkTechTitleNotIn(List<BigDecimal> values) {
            addCriterion("PK_TECH_TITLE not in", values, "pkTechTitle");
            return (Criteria) this;
        }

        public Criteria andPkTechTitleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PK_TECH_TITLE between", value1, value2, "pkTechTitle");
            return (Criteria) this;
        }

        public Criteria andPkTechTitleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PK_TECH_TITLE not between", value1, value2, "pkTechTitle");
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

        public Criteria andTitleNameIsNull() {
            addCriterion("TITLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTitleNameIsNotNull() {
            addCriterion("TITLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTitleNameEqualTo(String value) {
            addCriterion("TITLE_NAME =", value, "titleName");
            return (Criteria) this;
        }

        public Criteria andTitleNameNotEqualTo(String value) {
            addCriterion("TITLE_NAME <>", value, "titleName");
            return (Criteria) this;
        }

        public Criteria andTitleNameGreaterThan(String value) {
            addCriterion("TITLE_NAME >", value, "titleName");
            return (Criteria) this;
        }

        public Criteria andTitleNameGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE_NAME >=", value, "titleName");
            return (Criteria) this;
        }

        public Criteria andTitleNameLessThan(String value) {
            addCriterion("TITLE_NAME <", value, "titleName");
            return (Criteria) this;
        }

        public Criteria andTitleNameLessThanOrEqualTo(String value) {
            addCriterion("TITLE_NAME <=", value, "titleName");
            return (Criteria) this;
        }

        public Criteria andTitleNameLike(String value) {
            addCriterion("TITLE_NAME like", value, "titleName");
            return (Criteria) this;
        }

        public Criteria andTitleNameNotLike(String value) {
            addCriterion("TITLE_NAME not like", value, "titleName");
            return (Criteria) this;
        }

        public Criteria andTitleNameIn(List<String> values) {
            addCriterion("TITLE_NAME in", values, "titleName");
            return (Criteria) this;
        }

        public Criteria andTitleNameNotIn(List<String> values) {
            addCriterion("TITLE_NAME not in", values, "titleName");
            return (Criteria) this;
        }

        public Criteria andTitleNameBetween(String value1, String value2) {
            addCriterion("TITLE_NAME between", value1, value2, "titleName");
            return (Criteria) this;
        }

        public Criteria andTitleNameNotBetween(String value1, String value2) {
            addCriterion("TITLE_NAME not between", value1, value2, "titleName");
            return (Criteria) this;
        }

        public Criteria andGetTimeIsNull() {
            addCriterion("GET_TIME is null");
            return (Criteria) this;
        }

        public Criteria andGetTimeIsNotNull() {
            addCriterion("GET_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andGetTimeEqualTo(Date value) {
            addCriterionForJDBCDate("GET_TIME =", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("GET_TIME <>", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("GET_TIME >", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GET_TIME >=", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeLessThan(Date value) {
            addCriterionForJDBCDate("GET_TIME <", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GET_TIME <=", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeIn(List<Date> values) {
            addCriterionForJDBCDate("GET_TIME in", values, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("GET_TIME not in", values, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GET_TIME between", value1, value2, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GET_TIME not between", value1, value2, "getTime");
            return (Criteria) this;
        }

        public Criteria andHeighTitleIsNull() {
            addCriterion("HEIGH_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andHeighTitleIsNotNull() {
            addCriterion("HEIGH_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andHeighTitleEqualTo(String value) {
            addCriterion("HEIGH_TITLE =", value, "heighTitle");
            return (Criteria) this;
        }

        public Criteria andHeighTitleNotEqualTo(String value) {
            addCriterion("HEIGH_TITLE <>", value, "heighTitle");
            return (Criteria) this;
        }

        public Criteria andHeighTitleGreaterThan(String value) {
            addCriterion("HEIGH_TITLE >", value, "heighTitle");
            return (Criteria) this;
        }

        public Criteria andHeighTitleGreaterThanOrEqualTo(String value) {
            addCriterion("HEIGH_TITLE >=", value, "heighTitle");
            return (Criteria) this;
        }

        public Criteria andHeighTitleLessThan(String value) {
            addCriterion("HEIGH_TITLE <", value, "heighTitle");
            return (Criteria) this;
        }

        public Criteria andHeighTitleLessThanOrEqualTo(String value) {
            addCriterion("HEIGH_TITLE <=", value, "heighTitle");
            return (Criteria) this;
        }

        public Criteria andHeighTitleLike(String value) {
            addCriterion("HEIGH_TITLE like", value, "heighTitle");
            return (Criteria) this;
        }

        public Criteria andHeighTitleNotLike(String value) {
            addCriterion("HEIGH_TITLE not like", value, "heighTitle");
            return (Criteria) this;
        }

        public Criteria andHeighTitleIn(List<String> values) {
            addCriterion("HEIGH_TITLE in", values, "heighTitle");
            return (Criteria) this;
        }

        public Criteria andHeighTitleNotIn(List<String> values) {
            addCriterion("HEIGH_TITLE not in", values, "heighTitle");
            return (Criteria) this;
        }

        public Criteria andHeighTitleBetween(String value1, String value2) {
            addCriterion("HEIGH_TITLE between", value1, value2, "heighTitle");
            return (Criteria) this;
        }

        public Criteria andHeighTitleNotBetween(String value1, String value2) {
            addCriterion("HEIGH_TITLE not between", value1, value2, "heighTitle");
            return (Criteria) this;
        }

        public Criteria andIssAuthIsNull() {
            addCriterion("ISS_AUTH is null");
            return (Criteria) this;
        }

        public Criteria andIssAuthIsNotNull() {
            addCriterion("ISS_AUTH is not null");
            return (Criteria) this;
        }

        public Criteria andIssAuthEqualTo(String value) {
            addCriterion("ISS_AUTH =", value, "issAuth");
            return (Criteria) this;
        }

        public Criteria andIssAuthNotEqualTo(String value) {
            addCriterion("ISS_AUTH <>", value, "issAuth");
            return (Criteria) this;
        }

        public Criteria andIssAuthGreaterThan(String value) {
            addCriterion("ISS_AUTH >", value, "issAuth");
            return (Criteria) this;
        }

        public Criteria andIssAuthGreaterThanOrEqualTo(String value) {
            addCriterion("ISS_AUTH >=", value, "issAuth");
            return (Criteria) this;
        }

        public Criteria andIssAuthLessThan(String value) {
            addCriterion("ISS_AUTH <", value, "issAuth");
            return (Criteria) this;
        }

        public Criteria andIssAuthLessThanOrEqualTo(String value) {
            addCriterion("ISS_AUTH <=", value, "issAuth");
            return (Criteria) this;
        }

        public Criteria andIssAuthLike(String value) {
            addCriterion("ISS_AUTH like", value, "issAuth");
            return (Criteria) this;
        }

        public Criteria andIssAuthNotLike(String value) {
            addCriterion("ISS_AUTH not like", value, "issAuth");
            return (Criteria) this;
        }

        public Criteria andIssAuthIn(List<String> values) {
            addCriterion("ISS_AUTH in", values, "issAuth");
            return (Criteria) this;
        }

        public Criteria andIssAuthNotIn(List<String> values) {
            addCriterion("ISS_AUTH not in", values, "issAuth");
            return (Criteria) this;
        }

        public Criteria andIssAuthBetween(String value1, String value2) {
            addCriterion("ISS_AUTH between", value1, value2, "issAuth");
            return (Criteria) this;
        }

        public Criteria andIssAuthNotBetween(String value1, String value2) {
            addCriterion("ISS_AUTH not between", value1, value2, "issAuth");
            return (Criteria) this;
        }

        public Criteria andIssCodeIsNull() {
            addCriterion("ISS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andIssCodeIsNotNull() {
            addCriterion("ISS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andIssCodeEqualTo(String value) {
            addCriterion("ISS_CODE =", value, "issCode");
            return (Criteria) this;
        }

        public Criteria andIssCodeNotEqualTo(String value) {
            addCriterion("ISS_CODE <>", value, "issCode");
            return (Criteria) this;
        }

        public Criteria andIssCodeGreaterThan(String value) {
            addCriterion("ISS_CODE >", value, "issCode");
            return (Criteria) this;
        }

        public Criteria andIssCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ISS_CODE >=", value, "issCode");
            return (Criteria) this;
        }

        public Criteria andIssCodeLessThan(String value) {
            addCriterion("ISS_CODE <", value, "issCode");
            return (Criteria) this;
        }

        public Criteria andIssCodeLessThanOrEqualTo(String value) {
            addCriterion("ISS_CODE <=", value, "issCode");
            return (Criteria) this;
        }

        public Criteria andIssCodeLike(String value) {
            addCriterion("ISS_CODE like", value, "issCode");
            return (Criteria) this;
        }

        public Criteria andIssCodeNotLike(String value) {
            addCriterion("ISS_CODE not like", value, "issCode");
            return (Criteria) this;
        }

        public Criteria andIssCodeIn(List<String> values) {
            addCriterion("ISS_CODE in", values, "issCode");
            return (Criteria) this;
        }

        public Criteria andIssCodeNotIn(List<String> values) {
            addCriterion("ISS_CODE not in", values, "issCode");
            return (Criteria) this;
        }

        public Criteria andIssCodeBetween(String value1, String value2) {
            addCriterion("ISS_CODE between", value1, value2, "issCode");
            return (Criteria) this;
        }

        public Criteria andIssCodeNotBetween(String value1, String value2) {
            addCriterion("ISS_CODE not between", value1, value2, "issCode");
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
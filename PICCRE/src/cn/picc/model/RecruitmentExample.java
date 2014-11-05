package cn.picc.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RecruitmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecruitmentExample() {
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

        public Criteria andDemCodeIsNull() {
            addCriterion("DEM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDemCodeIsNotNull() {
            addCriterion("DEM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDemCodeEqualTo(String value) {
            addCriterion("DEM_CODE =", value, "demCode");
            return (Criteria) this;
        }

        public Criteria andDemCodeNotEqualTo(String value) {
            addCriterion("DEM_CODE <>", value, "demCode");
            return (Criteria) this;
        }

        public Criteria andDemCodeGreaterThan(String value) {
            addCriterion("DEM_CODE >", value, "demCode");
            return (Criteria) this;
        }

        public Criteria andDemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEM_CODE >=", value, "demCode");
            return (Criteria) this;
        }

        public Criteria andDemCodeLessThan(String value) {
            addCriterion("DEM_CODE <", value, "demCode");
            return (Criteria) this;
        }

        public Criteria andDemCodeLessThanOrEqualTo(String value) {
            addCriterion("DEM_CODE <=", value, "demCode");
            return (Criteria) this;
        }

        public Criteria andDemCodeLike(String value) {
            addCriterion("DEM_CODE like", value, "demCode");
            return (Criteria) this;
        }

        public Criteria andDemCodeNotLike(String value) {
            addCriterion("DEM_CODE not like", value, "demCode");
            return (Criteria) this;
        }

        public Criteria andDemCodeIn(List<String> values) {
            addCriterion("DEM_CODE in", values, "demCode");
            return (Criteria) this;
        }

        public Criteria andDemCodeNotIn(List<String> values) {
            addCriterion("DEM_CODE not in", values, "demCode");
            return (Criteria) this;
        }

        public Criteria andDemCodeBetween(String value1, String value2) {
            addCriterion("DEM_CODE between", value1, value2, "demCode");
            return (Criteria) this;
        }

        public Criteria andDemCodeNotBetween(String value1, String value2) {
            addCriterion("DEM_CODE not between", value1, value2, "demCode");
            return (Criteria) this;
        }

        public Criteria andDemCreareTimeIsNull() {
            addCriterion("DEM_CREARE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDemCreareTimeIsNotNull() {
            addCriterion("DEM_CREARE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDemCreareTimeEqualTo(Date value) {
            addCriterionForJDBCDate("DEM_CREARE_TIME =", value, "demCreareTime");
            return (Criteria) this;
        }

        public Criteria andDemCreareTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("DEM_CREARE_TIME <>", value, "demCreareTime");
            return (Criteria) this;
        }

        public Criteria andDemCreareTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("DEM_CREARE_TIME >", value, "demCreareTime");
            return (Criteria) this;
        }

        public Criteria andDemCreareTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DEM_CREARE_TIME >=", value, "demCreareTime");
            return (Criteria) this;
        }

        public Criteria andDemCreareTimeLessThan(Date value) {
            addCriterionForJDBCDate("DEM_CREARE_TIME <", value, "demCreareTime");
            return (Criteria) this;
        }

        public Criteria andDemCreareTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DEM_CREARE_TIME <=", value, "demCreareTime");
            return (Criteria) this;
        }

        public Criteria andDemCreareTimeIn(List<Date> values) {
            addCriterionForJDBCDate("DEM_CREARE_TIME in", values, "demCreareTime");
            return (Criteria) this;
        }

        public Criteria andDemCreareTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("DEM_CREARE_TIME not in", values, "demCreareTime");
            return (Criteria) this;
        }

        public Criteria andDemCreareTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DEM_CREARE_TIME between", value1, value2, "demCreareTime");
            return (Criteria) this;
        }

        public Criteria andDemCreareTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DEM_CREARE_TIME not between", value1, value2, "demCreareTime");
            return (Criteria) this;
        }

        public Criteria andDemPublishTimeIsNull() {
            addCriterion("DEM_PUBLISH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDemPublishTimeIsNotNull() {
            addCriterion("DEM_PUBLISH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDemPublishTimeEqualTo(Date value) {
            addCriterionForJDBCDate("DEM_PUBLISH_TIME =", value, "demPublishTime");
            return (Criteria) this;
        }

        public Criteria andDemPublishTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("DEM_PUBLISH_TIME <>", value, "demPublishTime");
            return (Criteria) this;
        }

        public Criteria andDemPublishTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("DEM_PUBLISH_TIME >", value, "demPublishTime");
            return (Criteria) this;
        }

        public Criteria andDemPublishTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DEM_PUBLISH_TIME >=", value, "demPublishTime");
            return (Criteria) this;
        }

        public Criteria andDemPublishTimeLessThan(Date value) {
            addCriterionForJDBCDate("DEM_PUBLISH_TIME <", value, "demPublishTime");
            return (Criteria) this;
        }

        public Criteria andDemPublishTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DEM_PUBLISH_TIME <=", value, "demPublishTime");
            return (Criteria) this;
        }

        public Criteria andDemPublishTimeIn(List<Date> values) {
            addCriterionForJDBCDate("DEM_PUBLISH_TIME in", values, "demPublishTime");
            return (Criteria) this;
        }

        public Criteria andDemPublishTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("DEM_PUBLISH_TIME not in", values, "demPublishTime");
            return (Criteria) this;
        }

        public Criteria andDemPublishTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DEM_PUBLISH_TIME between", value1, value2, "demPublishTime");
            return (Criteria) this;
        }

        public Criteria andDemPublishTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DEM_PUBLISH_TIME not between", value1, value2, "demPublishTime");
            return (Criteria) this;
        }

        public Criteria andDemEndTimeIsNull() {
            addCriterion("DEM_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDemEndTimeIsNotNull() {
            addCriterion("DEM_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDemEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("DEM_END_TIME =", value, "demEndTime");
            return (Criteria) this;
        }

        public Criteria andDemEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("DEM_END_TIME <>", value, "demEndTime");
            return (Criteria) this;
        }

        public Criteria andDemEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("DEM_END_TIME >", value, "demEndTime");
            return (Criteria) this;
        }

        public Criteria andDemEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DEM_END_TIME >=", value, "demEndTime");
            return (Criteria) this;
        }

        public Criteria andDemEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("DEM_END_TIME <", value, "demEndTime");
            return (Criteria) this;
        }

        public Criteria andDemEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DEM_END_TIME <=", value, "demEndTime");
            return (Criteria) this;
        }

        public Criteria andDemEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("DEM_END_TIME in", values, "demEndTime");
            return (Criteria) this;
        }

        public Criteria andDemEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("DEM_END_TIME not in", values, "demEndTime");
            return (Criteria) this;
        }

        public Criteria andDemEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DEM_END_TIME between", value1, value2, "demEndTime");
            return (Criteria) this;
        }

        public Criteria andDemEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DEM_END_TIME not between", value1, value2, "demEndTime");
            return (Criteria) this;
        }

        public Criteria andDemContentIsNull() {
            addCriterion("DEM_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andDemContentIsNotNull() {
            addCriterion("DEM_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andDemContentEqualTo(String value) {
            addCriterion("DEM_CONTENT =", value, "demContent");
            return (Criteria) this;
        }

        public Criteria andDemContentNotEqualTo(String value) {
            addCriterion("DEM_CONTENT <>", value, "demContent");
            return (Criteria) this;
        }

        public Criteria andDemContentGreaterThan(String value) {
            addCriterion("DEM_CONTENT >", value, "demContent");
            return (Criteria) this;
        }

        public Criteria andDemContentGreaterThanOrEqualTo(String value) {
            addCriterion("DEM_CONTENT >=", value, "demContent");
            return (Criteria) this;
        }

        public Criteria andDemContentLessThan(String value) {
            addCriterion("DEM_CONTENT <", value, "demContent");
            return (Criteria) this;
        }

        public Criteria andDemContentLessThanOrEqualTo(String value) {
            addCriterion("DEM_CONTENT <=", value, "demContent");
            return (Criteria) this;
        }

        public Criteria andDemContentLike(String value) {
            addCriterion("DEM_CONTENT like", value, "demContent");
            return (Criteria) this;
        }

        public Criteria andDemContentNotLike(String value) {
            addCriterion("DEM_CONTENT not like", value, "demContent");
            return (Criteria) this;
        }

        public Criteria andDemContentIn(List<String> values) {
            addCriterion("DEM_CONTENT in", values, "demContent");
            return (Criteria) this;
        }

        public Criteria andDemContentNotIn(List<String> values) {
            addCriterion("DEM_CONTENT not in", values, "demContent");
            return (Criteria) this;
        }

        public Criteria andDemContentBetween(String value1, String value2) {
            addCriterion("DEM_CONTENT between", value1, value2, "demContent");
            return (Criteria) this;
        }

        public Criteria andDemContentNotBetween(String value1, String value2) {
            addCriterion("DEM_CONTENT not between", value1, value2, "demContent");
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

        public Criteria andDemNameIsNull() {
            addCriterion("DEM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDemNameIsNotNull() {
            addCriterion("DEM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDemNameEqualTo(String value) {
            addCriterion("DEM_NAME =", value, "demName");
            return (Criteria) this;
        }

        public Criteria andDemNameNotEqualTo(String value) {
            addCriterion("DEM_NAME <>", value, "demName");
            return (Criteria) this;
        }

        public Criteria andDemNameGreaterThan(String value) {
            addCriterion("DEM_NAME >", value, "demName");
            return (Criteria) this;
        }

        public Criteria andDemNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEM_NAME >=", value, "demName");
            return (Criteria) this;
        }

        public Criteria andDemNameLessThan(String value) {
            addCriterion("DEM_NAME <", value, "demName");
            return (Criteria) this;
        }

        public Criteria andDemNameLessThanOrEqualTo(String value) {
            addCriterion("DEM_NAME <=", value, "demName");
            return (Criteria) this;
        }

        public Criteria andDemNameLike(String value) {
            addCriterion("DEM_NAME like", value, "demName");
            return (Criteria) this;
        }

        public Criteria andDemNameNotLike(String value) {
            addCriterion("DEM_NAME not like", value, "demName");
            return (Criteria) this;
        }

        public Criteria andDemNameIn(List<String> values) {
            addCriterion("DEM_NAME in", values, "demName");
            return (Criteria) this;
        }

        public Criteria andDemNameNotIn(List<String> values) {
            addCriterion("DEM_NAME not in", values, "demName");
            return (Criteria) this;
        }

        public Criteria andDemNameBetween(String value1, String value2) {
            addCriterion("DEM_NAME between", value1, value2, "demName");
            return (Criteria) this;
        }

        public Criteria andDemNameNotBetween(String value1, String value2) {
            addCriterion("DEM_NAME not between", value1, value2, "demName");
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
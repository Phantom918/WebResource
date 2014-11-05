package cn.picc.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartmentExample() {
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

        public Criteria andPkDeptIsNull() {
            addCriterion("PK_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andPkDeptIsNotNull() {
            addCriterion("PK_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andPkDeptEqualTo(BigDecimal value) {
            addCriterion("PK_DEPT =", value, "pkDept");
            return (Criteria) this;
        }

        public Criteria andPkDeptNotEqualTo(BigDecimal value) {
            addCriterion("PK_DEPT <>", value, "pkDept");
            return (Criteria) this;
        }

        public Criteria andPkDeptGreaterThan(BigDecimal value) {
            addCriterion("PK_DEPT >", value, "pkDept");
            return (Criteria) this;
        }

        public Criteria andPkDeptGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PK_DEPT >=", value, "pkDept");
            return (Criteria) this;
        }

        public Criteria andPkDeptLessThan(BigDecimal value) {
            addCriterion("PK_DEPT <", value, "pkDept");
            return (Criteria) this;
        }

        public Criteria andPkDeptLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PK_DEPT <=", value, "pkDept");
            return (Criteria) this;
        }

        public Criteria andPkDeptIn(List<BigDecimal> values) {
            addCriterion("PK_DEPT in", values, "pkDept");
            return (Criteria) this;
        }

        public Criteria andPkDeptNotIn(List<BigDecimal> values) {
            addCriterion("PK_DEPT not in", values, "pkDept");
            return (Criteria) this;
        }

        public Criteria andPkDeptBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PK_DEPT between", value1, value2, "pkDept");
            return (Criteria) this;
        }

        public Criteria andPkDeptNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PK_DEPT not between", value1, value2, "pkDept");
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

        public Criteria andDeptTypeIsNull() {
            addCriterion("DEPT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIsNotNull() {
            addCriterion("DEPT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDeptTypeEqualTo(String value) {
            addCriterion("DEPT_TYPE =", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNotEqualTo(String value) {
            addCriterion("DEPT_TYPE <>", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeGreaterThan(String value) {
            addCriterion("DEPT_TYPE >", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_TYPE >=", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeLessThan(String value) {
            addCriterion("DEPT_TYPE <", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeLessThanOrEqualTo(String value) {
            addCriterion("DEPT_TYPE <=", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeLike(String value) {
            addCriterion("DEPT_TYPE like", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNotLike(String value) {
            addCriterion("DEPT_TYPE not like", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIn(List<String> values) {
            addCriterion("DEPT_TYPE in", values, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNotIn(List<String> values) {
            addCriterion("DEPT_TYPE not in", values, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeBetween(String value1, String value2) {
            addCriterion("DEPT_TYPE between", value1, value2, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNotBetween(String value1, String value2) {
            addCriterion("DEPT_TYPE not between", value1, value2, "deptType");
            return (Criteria) this;
        }

        public Criteria andSupDeptIsNull() {
            addCriterion("SUP_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andSupDeptIsNotNull() {
            addCriterion("SUP_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andSupDeptEqualTo(BigDecimal value) {
            addCriterion("SUP_DEPT =", value, "supDept");
            return (Criteria) this;
        }

        public Criteria andSupDeptNotEqualTo(BigDecimal value) {
            addCriterion("SUP_DEPT <>", value, "supDept");
            return (Criteria) this;
        }

        public Criteria andSupDeptGreaterThan(BigDecimal value) {
            addCriterion("SUP_DEPT >", value, "supDept");
            return (Criteria) this;
        }

        public Criteria andSupDeptGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUP_DEPT >=", value, "supDept");
            return (Criteria) this;
        }

        public Criteria andSupDeptLessThan(BigDecimal value) {
            addCriterion("SUP_DEPT <", value, "supDept");
            return (Criteria) this;
        }

        public Criteria andSupDeptLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUP_DEPT <=", value, "supDept");
            return (Criteria) this;
        }

        public Criteria andSupDeptIn(List<BigDecimal> values) {
            addCriterion("SUP_DEPT in", values, "supDept");
            return (Criteria) this;
        }

        public Criteria andSupDeptNotIn(List<BigDecimal> values) {
            addCriterion("SUP_DEPT not in", values, "supDept");
            return (Criteria) this;
        }

        public Criteria andSupDeptBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUP_DEPT between", value1, value2, "supDept");
            return (Criteria) this;
        }

        public Criteria andSupDeptNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUP_DEPT not between", value1, value2, "supDept");
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

        public Criteria andProfCodeIsNull() {
            addCriterion("PROF_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProfCodeIsNotNull() {
            addCriterion("PROF_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProfCodeEqualTo(String value) {
            addCriterion("PROF_CODE =", value, "profCode");
            return (Criteria) this;
        }

        public Criteria andProfCodeNotEqualTo(String value) {
            addCriterion("PROF_CODE <>", value, "profCode");
            return (Criteria) this;
        }

        public Criteria andProfCodeGreaterThan(String value) {
            addCriterion("PROF_CODE >", value, "profCode");
            return (Criteria) this;
        }

        public Criteria andProfCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROF_CODE >=", value, "profCode");
            return (Criteria) this;
        }

        public Criteria andProfCodeLessThan(String value) {
            addCriterion("PROF_CODE <", value, "profCode");
            return (Criteria) this;
        }

        public Criteria andProfCodeLessThanOrEqualTo(String value) {
            addCriterion("PROF_CODE <=", value, "profCode");
            return (Criteria) this;
        }

        public Criteria andProfCodeLike(String value) {
            addCriterion("PROF_CODE like", value, "profCode");
            return (Criteria) this;
        }

        public Criteria andProfCodeNotLike(String value) {
            addCriterion("PROF_CODE not like", value, "profCode");
            return (Criteria) this;
        }

        public Criteria andProfCodeIn(List<String> values) {
            addCriterion("PROF_CODE in", values, "profCode");
            return (Criteria) this;
        }

        public Criteria andProfCodeNotIn(List<String> values) {
            addCriterion("PROF_CODE not in", values, "profCode");
            return (Criteria) this;
        }

        public Criteria andProfCodeBetween(String value1, String value2) {
            addCriterion("PROF_CODE between", value1, value2, "profCode");
            return (Criteria) this;
        }

        public Criteria andProfCodeNotBetween(String value1, String value2) {
            addCriterion("PROF_CODE not between", value1, value2, "profCode");
            return (Criteria) this;
        }

        public Criteria andIsSonunitIsNull() {
            addCriterion("IS_SONUNIT is null");
            return (Criteria) this;
        }

        public Criteria andIsSonunitIsNotNull() {
            addCriterion("IS_SONUNIT is not null");
            return (Criteria) this;
        }

        public Criteria andIsSonunitEqualTo(String value) {
            addCriterion("IS_SONUNIT =", value, "isSonunit");
            return (Criteria) this;
        }

        public Criteria andIsSonunitNotEqualTo(String value) {
            addCriterion("IS_SONUNIT <>", value, "isSonunit");
            return (Criteria) this;
        }

        public Criteria andIsSonunitGreaterThan(String value) {
            addCriterion("IS_SONUNIT >", value, "isSonunit");
            return (Criteria) this;
        }

        public Criteria andIsSonunitGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SONUNIT >=", value, "isSonunit");
            return (Criteria) this;
        }

        public Criteria andIsSonunitLessThan(String value) {
            addCriterion("IS_SONUNIT <", value, "isSonunit");
            return (Criteria) this;
        }

        public Criteria andIsSonunitLessThanOrEqualTo(String value) {
            addCriterion("IS_SONUNIT <=", value, "isSonunit");
            return (Criteria) this;
        }

        public Criteria andIsSonunitLike(String value) {
            addCriterion("IS_SONUNIT like", value, "isSonunit");
            return (Criteria) this;
        }

        public Criteria andIsSonunitNotLike(String value) {
            addCriterion("IS_SONUNIT not like", value, "isSonunit");
            return (Criteria) this;
        }

        public Criteria andIsSonunitIn(List<String> values) {
            addCriterion("IS_SONUNIT in", values, "isSonunit");
            return (Criteria) this;
        }

        public Criteria andIsSonunitNotIn(List<String> values) {
            addCriterion("IS_SONUNIT not in", values, "isSonunit");
            return (Criteria) this;
        }

        public Criteria andIsSonunitBetween(String value1, String value2) {
            addCriterion("IS_SONUNIT between", value1, value2, "isSonunit");
            return (Criteria) this;
        }

        public Criteria andIsSonunitNotBetween(String value1, String value2) {
            addCriterion("IS_SONUNIT not between", value1, value2, "isSonunit");
            return (Criteria) this;
        }

        public Criteria andProfKeyIsNull() {
            addCriterion("PROF_KEY is null");
            return (Criteria) this;
        }

        public Criteria andProfKeyIsNotNull() {
            addCriterion("PROF_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andProfKeyEqualTo(String value) {
            addCriterion("PROF_KEY =", value, "profKey");
            return (Criteria) this;
        }

        public Criteria andProfKeyNotEqualTo(String value) {
            addCriterion("PROF_KEY <>", value, "profKey");
            return (Criteria) this;
        }

        public Criteria andProfKeyGreaterThan(String value) {
            addCriterion("PROF_KEY >", value, "profKey");
            return (Criteria) this;
        }

        public Criteria andProfKeyGreaterThanOrEqualTo(String value) {
            addCriterion("PROF_KEY >=", value, "profKey");
            return (Criteria) this;
        }

        public Criteria andProfKeyLessThan(String value) {
            addCriterion("PROF_KEY <", value, "profKey");
            return (Criteria) this;
        }

        public Criteria andProfKeyLessThanOrEqualTo(String value) {
            addCriterion("PROF_KEY <=", value, "profKey");
            return (Criteria) this;
        }

        public Criteria andProfKeyLike(String value) {
            addCriterion("PROF_KEY like", value, "profKey");
            return (Criteria) this;
        }

        public Criteria andProfKeyNotLike(String value) {
            addCriterion("PROF_KEY not like", value, "profKey");
            return (Criteria) this;
        }

        public Criteria andProfKeyIn(List<String> values) {
            addCriterion("PROF_KEY in", values, "profKey");
            return (Criteria) this;
        }

        public Criteria andProfKeyNotIn(List<String> values) {
            addCriterion("PROF_KEY not in", values, "profKey");
            return (Criteria) this;
        }

        public Criteria andProfKeyBetween(String value1, String value2) {
            addCriterion("PROF_KEY between", value1, value2, "profKey");
            return (Criteria) this;
        }

        public Criteria andProfKeyNotBetween(String value1, String value2) {
            addCriterion("PROF_KEY not between", value1, value2, "profKey");
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
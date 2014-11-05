package cn.picc.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RewardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RewardExample() {
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

        public Criteria andPkRewPunIsNull() {
            addCriterion("PK_REW_PUN is null");
            return (Criteria) this;
        }

        public Criteria andPkRewPunIsNotNull() {
            addCriterion("PK_REW_PUN is not null");
            return (Criteria) this;
        }

        public Criteria andPkRewPunEqualTo(BigDecimal value) {
            addCriterion("PK_REW_PUN =", value, "pkRewPun");
            return (Criteria) this;
        }

        public Criteria andPkRewPunNotEqualTo(BigDecimal value) {
            addCriterion("PK_REW_PUN <>", value, "pkRewPun");
            return (Criteria) this;
        }

        public Criteria andPkRewPunGreaterThan(BigDecimal value) {
            addCriterion("PK_REW_PUN >", value, "pkRewPun");
            return (Criteria) this;
        }

        public Criteria andPkRewPunGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PK_REW_PUN >=", value, "pkRewPun");
            return (Criteria) this;
        }

        public Criteria andPkRewPunLessThan(BigDecimal value) {
            addCriterion("PK_REW_PUN <", value, "pkRewPun");
            return (Criteria) this;
        }

        public Criteria andPkRewPunLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PK_REW_PUN <=", value, "pkRewPun");
            return (Criteria) this;
        }

        public Criteria andPkRewPunIn(List<BigDecimal> values) {
            addCriterion("PK_REW_PUN in", values, "pkRewPun");
            return (Criteria) this;
        }

        public Criteria andPkRewPunNotIn(List<BigDecimal> values) {
            addCriterion("PK_REW_PUN not in", values, "pkRewPun");
            return (Criteria) this;
        }

        public Criteria andPkRewPunBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PK_REW_PUN between", value1, value2, "pkRewPun");
            return (Criteria) this;
        }

        public Criteria andPkRewPunNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PK_REW_PUN not between", value1, value2, "pkRewPun");
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

        public Criteria andPkOrgIsNull() {
            addCriterion("PK_ORG is null");
            return (Criteria) this;
        }

        public Criteria andPkOrgIsNotNull() {
            addCriterion("PK_ORG is not null");
            return (Criteria) this;
        }

        public Criteria andPkOrgEqualTo(BigDecimal value) {
            addCriterion("PK_ORG =", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgNotEqualTo(BigDecimal value) {
            addCriterion("PK_ORG <>", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgGreaterThan(BigDecimal value) {
            addCriterion("PK_ORG >", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PK_ORG >=", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgLessThan(BigDecimal value) {
            addCriterion("PK_ORG <", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PK_ORG <=", value, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgIn(List<BigDecimal> values) {
            addCriterion("PK_ORG in", values, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgNotIn(List<BigDecimal> values) {
            addCriterion("PK_ORG not in", values, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PK_ORG between", value1, value2, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andPkOrgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PK_ORG not between", value1, value2, "pkOrg");
            return (Criteria) this;
        }

        public Criteria andRpTypeIsNull() {
            addCriterion("RP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRpTypeIsNotNull() {
            addCriterion("RP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRpTypeEqualTo(String value) {
            addCriterion("RP_TYPE =", value, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeNotEqualTo(String value) {
            addCriterion("RP_TYPE <>", value, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeGreaterThan(String value) {
            addCriterion("RP_TYPE >", value, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RP_TYPE >=", value, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeLessThan(String value) {
            addCriterion("RP_TYPE <", value, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeLessThanOrEqualTo(String value) {
            addCriterion("RP_TYPE <=", value, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeLike(String value) {
            addCriterion("RP_TYPE like", value, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeNotLike(String value) {
            addCriterion("RP_TYPE not like", value, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeIn(List<String> values) {
            addCriterion("RP_TYPE in", values, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeNotIn(List<String> values) {
            addCriterion("RP_TYPE not in", values, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeBetween(String value1, String value2) {
            addCriterion("RP_TYPE between", value1, value2, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpTypeNotBetween(String value1, String value2) {
            addCriterion("RP_TYPE not between", value1, value2, "rpType");
            return (Criteria) this;
        }

        public Criteria andRpDateIsNull() {
            addCriterion("RP_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRpDateIsNotNull() {
            addCriterion("RP_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRpDateEqualTo(Date value) {
            addCriterionForJDBCDate("RP_DATE =", value, "rpDate");
            return (Criteria) this;
        }

        public Criteria andRpDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("RP_DATE <>", value, "rpDate");
            return (Criteria) this;
        }

        public Criteria andRpDateGreaterThan(Date value) {
            addCriterionForJDBCDate("RP_DATE >", value, "rpDate");
            return (Criteria) this;
        }

        public Criteria andRpDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RP_DATE >=", value, "rpDate");
            return (Criteria) this;
        }

        public Criteria andRpDateLessThan(Date value) {
            addCriterionForJDBCDate("RP_DATE <", value, "rpDate");
            return (Criteria) this;
        }

        public Criteria andRpDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RP_DATE <=", value, "rpDate");
            return (Criteria) this;
        }

        public Criteria andRpDateIn(List<Date> values) {
            addCriterionForJDBCDate("RP_DATE in", values, "rpDate");
            return (Criteria) this;
        }

        public Criteria andRpDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("RP_DATE not in", values, "rpDate");
            return (Criteria) this;
        }

        public Criteria andRpDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RP_DATE between", value1, value2, "rpDate");
            return (Criteria) this;
        }

        public Criteria andRpDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RP_DATE not between", value1, value2, "rpDate");
            return (Criteria) this;
        }

        public Criteria andRpVasueIsNull() {
            addCriterion("RP_VASUE is null");
            return (Criteria) this;
        }

        public Criteria andRpVasueIsNotNull() {
            addCriterion("RP_VASUE is not null");
            return (Criteria) this;
        }

        public Criteria andRpVasueEqualTo(String value) {
            addCriterion("RP_VASUE =", value, "rpVasue");
            return (Criteria) this;
        }

        public Criteria andRpVasueNotEqualTo(String value) {
            addCriterion("RP_VASUE <>", value, "rpVasue");
            return (Criteria) this;
        }

        public Criteria andRpVasueGreaterThan(String value) {
            addCriterion("RP_VASUE >", value, "rpVasue");
            return (Criteria) this;
        }

        public Criteria andRpVasueGreaterThanOrEqualTo(String value) {
            addCriterion("RP_VASUE >=", value, "rpVasue");
            return (Criteria) this;
        }

        public Criteria andRpVasueLessThan(String value) {
            addCriterion("RP_VASUE <", value, "rpVasue");
            return (Criteria) this;
        }

        public Criteria andRpVasueLessThanOrEqualTo(String value) {
            addCriterion("RP_VASUE <=", value, "rpVasue");
            return (Criteria) this;
        }

        public Criteria andRpVasueLike(String value) {
            addCriterion("RP_VASUE like", value, "rpVasue");
            return (Criteria) this;
        }

        public Criteria andRpVasueNotLike(String value) {
            addCriterion("RP_VASUE not like", value, "rpVasue");
            return (Criteria) this;
        }

        public Criteria andRpVasueIn(List<String> values) {
            addCriterion("RP_VASUE in", values, "rpVasue");
            return (Criteria) this;
        }

        public Criteria andRpVasueNotIn(List<String> values) {
            addCriterion("RP_VASUE not in", values, "rpVasue");
            return (Criteria) this;
        }

        public Criteria andRpVasueBetween(String value1, String value2) {
            addCriterion("RP_VASUE between", value1, value2, "rpVasue");
            return (Criteria) this;
        }

        public Criteria andRpVasueNotBetween(String value1, String value2) {
            addCriterion("RP_VASUE not between", value1, value2, "rpVasue");
            return (Criteria) this;
        }

        public Criteria andRpGistIsNull() {
            addCriterion("RP_GIST is null");
            return (Criteria) this;
        }

        public Criteria andRpGistIsNotNull() {
            addCriterion("RP_GIST is not null");
            return (Criteria) this;
        }

        public Criteria andRpGistEqualTo(String value) {
            addCriterion("RP_GIST =", value, "rpGist");
            return (Criteria) this;
        }

        public Criteria andRpGistNotEqualTo(String value) {
            addCriterion("RP_GIST <>", value, "rpGist");
            return (Criteria) this;
        }

        public Criteria andRpGistGreaterThan(String value) {
            addCriterion("RP_GIST >", value, "rpGist");
            return (Criteria) this;
        }

        public Criteria andRpGistGreaterThanOrEqualTo(String value) {
            addCriterion("RP_GIST >=", value, "rpGist");
            return (Criteria) this;
        }

        public Criteria andRpGistLessThan(String value) {
            addCriterion("RP_GIST <", value, "rpGist");
            return (Criteria) this;
        }

        public Criteria andRpGistLessThanOrEqualTo(String value) {
            addCriterion("RP_GIST <=", value, "rpGist");
            return (Criteria) this;
        }

        public Criteria andRpGistLike(String value) {
            addCriterion("RP_GIST like", value, "rpGist");
            return (Criteria) this;
        }

        public Criteria andRpGistNotLike(String value) {
            addCriterion("RP_GIST not like", value, "rpGist");
            return (Criteria) this;
        }

        public Criteria andRpGistIn(List<String> values) {
            addCriterion("RP_GIST in", values, "rpGist");
            return (Criteria) this;
        }

        public Criteria andRpGistNotIn(List<String> values) {
            addCriterion("RP_GIST not in", values, "rpGist");
            return (Criteria) this;
        }

        public Criteria andRpGistBetween(String value1, String value2) {
            addCriterion("RP_GIST between", value1, value2, "rpGist");
            return (Criteria) this;
        }

        public Criteria andRpGistNotBetween(String value1, String value2) {
            addCriterion("RP_GIST not between", value1, value2, "rpGist");
            return (Criteria) this;
        }

        public Criteria andRpMeasureIsNull() {
            addCriterion("RP_MEASURE is null");
            return (Criteria) this;
        }

        public Criteria andRpMeasureIsNotNull() {
            addCriterion("RP_MEASURE is not null");
            return (Criteria) this;
        }

        public Criteria andRpMeasureEqualTo(String value) {
            addCriterion("RP_MEASURE =", value, "rpMeasure");
            return (Criteria) this;
        }

        public Criteria andRpMeasureNotEqualTo(String value) {
            addCriterion("RP_MEASURE <>", value, "rpMeasure");
            return (Criteria) this;
        }

        public Criteria andRpMeasureGreaterThan(String value) {
            addCriterion("RP_MEASURE >", value, "rpMeasure");
            return (Criteria) this;
        }

        public Criteria andRpMeasureGreaterThanOrEqualTo(String value) {
            addCriterion("RP_MEASURE >=", value, "rpMeasure");
            return (Criteria) this;
        }

        public Criteria andRpMeasureLessThan(String value) {
            addCriterion("RP_MEASURE <", value, "rpMeasure");
            return (Criteria) this;
        }

        public Criteria andRpMeasureLessThanOrEqualTo(String value) {
            addCriterion("RP_MEASURE <=", value, "rpMeasure");
            return (Criteria) this;
        }

        public Criteria andRpMeasureLike(String value) {
            addCriterion("RP_MEASURE like", value, "rpMeasure");
            return (Criteria) this;
        }

        public Criteria andRpMeasureNotLike(String value) {
            addCriterion("RP_MEASURE not like", value, "rpMeasure");
            return (Criteria) this;
        }

        public Criteria andRpMeasureIn(List<String> values) {
            addCriterion("RP_MEASURE in", values, "rpMeasure");
            return (Criteria) this;
        }

        public Criteria andRpMeasureNotIn(List<String> values) {
            addCriterion("RP_MEASURE not in", values, "rpMeasure");
            return (Criteria) this;
        }

        public Criteria andRpMeasureBetween(String value1, String value2) {
            addCriterion("RP_MEASURE between", value1, value2, "rpMeasure");
            return (Criteria) this;
        }

        public Criteria andRpMeasureNotBetween(String value1, String value2) {
            addCriterion("RP_MEASURE not between", value1, value2, "rpMeasure");
            return (Criteria) this;
        }

        public Criteria andRpUndoTimeIsNull() {
            addCriterion("RP_UNDO_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRpUndoTimeIsNotNull() {
            addCriterion("RP_UNDO_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRpUndoTimeEqualTo(Date value) {
            addCriterionForJDBCDate("RP_UNDO_TIME =", value, "rpUndoTime");
            return (Criteria) this;
        }

        public Criteria andRpUndoTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("RP_UNDO_TIME <>", value, "rpUndoTime");
            return (Criteria) this;
        }

        public Criteria andRpUndoTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("RP_UNDO_TIME >", value, "rpUndoTime");
            return (Criteria) this;
        }

        public Criteria andRpUndoTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RP_UNDO_TIME >=", value, "rpUndoTime");
            return (Criteria) this;
        }

        public Criteria andRpUndoTimeLessThan(Date value) {
            addCriterionForJDBCDate("RP_UNDO_TIME <", value, "rpUndoTime");
            return (Criteria) this;
        }

        public Criteria andRpUndoTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("RP_UNDO_TIME <=", value, "rpUndoTime");
            return (Criteria) this;
        }

        public Criteria andRpUndoTimeIn(List<Date> values) {
            addCriterionForJDBCDate("RP_UNDO_TIME in", values, "rpUndoTime");
            return (Criteria) this;
        }

        public Criteria andRpUndoTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("RP_UNDO_TIME not in", values, "rpUndoTime");
            return (Criteria) this;
        }

        public Criteria andRpUndoTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RP_UNDO_TIME between", value1, value2, "rpUndoTime");
            return (Criteria) this;
        }

        public Criteria andRpUndoTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("RP_UNDO_TIME not between", value1, value2, "rpUndoTime");
            return (Criteria) this;
        }

        public Criteria andRpUndoCasueIsNull() {
            addCriterion("RP_UNDO_CASUE is null");
            return (Criteria) this;
        }

        public Criteria andRpUndoCasueIsNotNull() {
            addCriterion("RP_UNDO_CASUE is not null");
            return (Criteria) this;
        }

        public Criteria andRpUndoCasueEqualTo(String value) {
            addCriterion("RP_UNDO_CASUE =", value, "rpUndoCasue");
            return (Criteria) this;
        }

        public Criteria andRpUndoCasueNotEqualTo(String value) {
            addCriterion("RP_UNDO_CASUE <>", value, "rpUndoCasue");
            return (Criteria) this;
        }

        public Criteria andRpUndoCasueGreaterThan(String value) {
            addCriterion("RP_UNDO_CASUE >", value, "rpUndoCasue");
            return (Criteria) this;
        }

        public Criteria andRpUndoCasueGreaterThanOrEqualTo(String value) {
            addCriterion("RP_UNDO_CASUE >=", value, "rpUndoCasue");
            return (Criteria) this;
        }

        public Criteria andRpUndoCasueLessThan(String value) {
            addCriterion("RP_UNDO_CASUE <", value, "rpUndoCasue");
            return (Criteria) this;
        }

        public Criteria andRpUndoCasueLessThanOrEqualTo(String value) {
            addCriterion("RP_UNDO_CASUE <=", value, "rpUndoCasue");
            return (Criteria) this;
        }

        public Criteria andRpUndoCasueLike(String value) {
            addCriterion("RP_UNDO_CASUE like", value, "rpUndoCasue");
            return (Criteria) this;
        }

        public Criteria andRpUndoCasueNotLike(String value) {
            addCriterion("RP_UNDO_CASUE not like", value, "rpUndoCasue");
            return (Criteria) this;
        }

        public Criteria andRpUndoCasueIn(List<String> values) {
            addCriterion("RP_UNDO_CASUE in", values, "rpUndoCasue");
            return (Criteria) this;
        }

        public Criteria andRpUndoCasueNotIn(List<String> values) {
            addCriterion("RP_UNDO_CASUE not in", values, "rpUndoCasue");
            return (Criteria) this;
        }

        public Criteria andRpUndoCasueBetween(String value1, String value2) {
            addCriterion("RP_UNDO_CASUE between", value1, value2, "rpUndoCasue");
            return (Criteria) this;
        }

        public Criteria andRpUndoCasueNotBetween(String value1, String value2) {
            addCriterion("RP_UNDO_CASUE not between", value1, value2, "rpUndoCasue");
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
package cn.picc.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationExample() {
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

        public Criteria andOrgCodeIsNull() {
            addCriterion("ORG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNotNull() {
            addCriterion("ORG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeEqualTo(String value) {
            addCriterion("ORG_CODE =", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotEqualTo(String value) {
            addCriterion("ORG_CODE <>", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThan(String value) {
            addCriterion("ORG_CODE >", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_CODE >=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThan(String value) {
            addCriterion("ORG_CODE <", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("ORG_CODE <=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLike(String value) {
            addCriterion("ORG_CODE like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotLike(String value) {
            addCriterion("ORG_CODE not like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIn(List<String> values) {
            addCriterion("ORG_CODE in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotIn(List<String> values) {
            addCriterion("ORG_CODE not in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeBetween(String value1, String value2) {
            addCriterion("ORG_CODE between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotBetween(String value1, String value2) {
            addCriterion("ORG_CODE not between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNull() {
            addCriterion("ORG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("ORG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("ORG_NAME =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("ORG_NAME <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("ORG_NAME >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_NAME >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("ORG_NAME <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("ORG_NAME <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("ORG_NAME like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("ORG_NAME not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("ORG_NAME in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("ORG_NAME not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("ORG_NAME between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("ORG_NAME not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andSupProviceCodeIsNull() {
            addCriterion("SUP_PROVICE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSupProviceCodeIsNotNull() {
            addCriterion("SUP_PROVICE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSupProviceCodeEqualTo(String value) {
            addCriterion("SUP_PROVICE_CODE =", value, "supProviceCode");
            return (Criteria) this;
        }

        public Criteria andSupProviceCodeNotEqualTo(String value) {
            addCriterion("SUP_PROVICE_CODE <>", value, "supProviceCode");
            return (Criteria) this;
        }

        public Criteria andSupProviceCodeGreaterThan(String value) {
            addCriterion("SUP_PROVICE_CODE >", value, "supProviceCode");
            return (Criteria) this;
        }

        public Criteria andSupProviceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SUP_PROVICE_CODE >=", value, "supProviceCode");
            return (Criteria) this;
        }

        public Criteria andSupProviceCodeLessThan(String value) {
            addCriterion("SUP_PROVICE_CODE <", value, "supProviceCode");
            return (Criteria) this;
        }

        public Criteria andSupProviceCodeLessThanOrEqualTo(String value) {
            addCriterion("SUP_PROVICE_CODE <=", value, "supProviceCode");
            return (Criteria) this;
        }

        public Criteria andSupProviceCodeLike(String value) {
            addCriterion("SUP_PROVICE_CODE like", value, "supProviceCode");
            return (Criteria) this;
        }

        public Criteria andSupProviceCodeNotLike(String value) {
            addCriterion("SUP_PROVICE_CODE not like", value, "supProviceCode");
            return (Criteria) this;
        }

        public Criteria andSupProviceCodeIn(List<String> values) {
            addCriterion("SUP_PROVICE_CODE in", values, "supProviceCode");
            return (Criteria) this;
        }

        public Criteria andSupProviceCodeNotIn(List<String> values) {
            addCriterion("SUP_PROVICE_CODE not in", values, "supProviceCode");
            return (Criteria) this;
        }

        public Criteria andSupProviceCodeBetween(String value1, String value2) {
            addCriterion("SUP_PROVICE_CODE between", value1, value2, "supProviceCode");
            return (Criteria) this;
        }

        public Criteria andSupProviceCodeNotBetween(String value1, String value2) {
            addCriterion("SUP_PROVICE_CODE not between", value1, value2, "supProviceCode");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIsNull() {
            addCriterion("ORG_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIsNotNull() {
            addCriterion("ORG_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLevelEqualTo(String value) {
            addCriterion("ORG_LEVEL =", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNotEqualTo(String value) {
            addCriterion("ORG_LEVEL <>", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelGreaterThan(String value) {
            addCriterion("ORG_LEVEL >", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_LEVEL >=", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelLessThan(String value) {
            addCriterion("ORG_LEVEL <", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelLessThanOrEqualTo(String value) {
            addCriterion("ORG_LEVEL <=", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelLike(String value) {
            addCriterion("ORG_LEVEL like", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNotLike(String value) {
            addCriterion("ORG_LEVEL not like", value, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelIn(List<String> values) {
            addCriterion("ORG_LEVEL in", values, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNotIn(List<String> values) {
            addCriterion("ORG_LEVEL not in", values, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelBetween(String value1, String value2) {
            addCriterion("ORG_LEVEL between", value1, value2, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andOrgLevelNotBetween(String value1, String value2) {
            addCriterion("ORG_LEVEL not between", value1, value2, "orgLevel");
            return (Criteria) this;
        }

        public Criteria andSupOrgCodeIsNull() {
            addCriterion("SUP_ORG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSupOrgCodeIsNotNull() {
            addCriterion("SUP_ORG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSupOrgCodeEqualTo(String value) {
            addCriterion("SUP_ORG_CODE =", value, "supOrgCode");
            return (Criteria) this;
        }

        public Criteria andSupOrgCodeNotEqualTo(String value) {
            addCriterion("SUP_ORG_CODE <>", value, "supOrgCode");
            return (Criteria) this;
        }

        public Criteria andSupOrgCodeGreaterThan(String value) {
            addCriterion("SUP_ORG_CODE >", value, "supOrgCode");
            return (Criteria) this;
        }

        public Criteria andSupOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SUP_ORG_CODE >=", value, "supOrgCode");
            return (Criteria) this;
        }

        public Criteria andSupOrgCodeLessThan(String value) {
            addCriterion("SUP_ORG_CODE <", value, "supOrgCode");
            return (Criteria) this;
        }

        public Criteria andSupOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("SUP_ORG_CODE <=", value, "supOrgCode");
            return (Criteria) this;
        }

        public Criteria andSupOrgCodeLike(String value) {
            addCriterion("SUP_ORG_CODE like", value, "supOrgCode");
            return (Criteria) this;
        }

        public Criteria andSupOrgCodeNotLike(String value) {
            addCriterion("SUP_ORG_CODE not like", value, "supOrgCode");
            return (Criteria) this;
        }

        public Criteria andSupOrgCodeIn(List<String> values) {
            addCriterion("SUP_ORG_CODE in", values, "supOrgCode");
            return (Criteria) this;
        }

        public Criteria andSupOrgCodeNotIn(List<String> values) {
            addCriterion("SUP_ORG_CODE not in", values, "supOrgCode");
            return (Criteria) this;
        }

        public Criteria andSupOrgCodeBetween(String value1, String value2) {
            addCriterion("SUP_ORG_CODE between", value1, value2, "supOrgCode");
            return (Criteria) this;
        }

        public Criteria andSupOrgCodeNotBetween(String value1, String value2) {
            addCriterion("SUP_ORG_CODE not between", value1, value2, "supOrgCode");
            return (Criteria) this;
        }

        public Criteria andOrgAddressIsNull() {
            addCriterion("ORG_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andOrgAddressIsNotNull() {
            addCriterion("ORG_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andOrgAddressEqualTo(String value) {
            addCriterion("ORG_ADDRESS =", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressNotEqualTo(String value) {
            addCriterion("ORG_ADDRESS <>", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressGreaterThan(String value) {
            addCriterion("ORG_ADDRESS >", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_ADDRESS >=", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressLessThan(String value) {
            addCriterion("ORG_ADDRESS <", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressLessThanOrEqualTo(String value) {
            addCriterion("ORG_ADDRESS <=", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressLike(String value) {
            addCriterion("ORG_ADDRESS like", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressNotLike(String value) {
            addCriterion("ORG_ADDRESS not like", value, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressIn(List<String> values) {
            addCriterion("ORG_ADDRESS in", values, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressNotIn(List<String> values) {
            addCriterion("ORG_ADDRESS not in", values, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressBetween(String value1, String value2) {
            addCriterion("ORG_ADDRESS between", value1, value2, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgAddressNotBetween(String value1, String value2) {
            addCriterion("ORG_ADDRESS not between", value1, value2, "orgAddress");
            return (Criteria) this;
        }

        public Criteria andOrgLiccensecodeIsNull() {
            addCriterion("ORG_LICCENSECODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgLiccensecodeIsNotNull() {
            addCriterion("ORG_LICCENSECODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgLiccensecodeEqualTo(String value) {
            addCriterion("ORG_LICCENSECODE =", value, "orgLiccensecode");
            return (Criteria) this;
        }

        public Criteria andOrgLiccensecodeNotEqualTo(String value) {
            addCriterion("ORG_LICCENSECODE <>", value, "orgLiccensecode");
            return (Criteria) this;
        }

        public Criteria andOrgLiccensecodeGreaterThan(String value) {
            addCriterion("ORG_LICCENSECODE >", value, "orgLiccensecode");
            return (Criteria) this;
        }

        public Criteria andOrgLiccensecodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_LICCENSECODE >=", value, "orgLiccensecode");
            return (Criteria) this;
        }

        public Criteria andOrgLiccensecodeLessThan(String value) {
            addCriterion("ORG_LICCENSECODE <", value, "orgLiccensecode");
            return (Criteria) this;
        }

        public Criteria andOrgLiccensecodeLessThanOrEqualTo(String value) {
            addCriterion("ORG_LICCENSECODE <=", value, "orgLiccensecode");
            return (Criteria) this;
        }

        public Criteria andOrgLiccensecodeLike(String value) {
            addCriterion("ORG_LICCENSECODE like", value, "orgLiccensecode");
            return (Criteria) this;
        }

        public Criteria andOrgLiccensecodeNotLike(String value) {
            addCriterion("ORG_LICCENSECODE not like", value, "orgLiccensecode");
            return (Criteria) this;
        }

        public Criteria andOrgLiccensecodeIn(List<String> values) {
            addCriterion("ORG_LICCENSECODE in", values, "orgLiccensecode");
            return (Criteria) this;
        }

        public Criteria andOrgLiccensecodeNotIn(List<String> values) {
            addCriterion("ORG_LICCENSECODE not in", values, "orgLiccensecode");
            return (Criteria) this;
        }

        public Criteria andOrgLiccensecodeBetween(String value1, String value2) {
            addCriterion("ORG_LICCENSECODE between", value1, value2, "orgLiccensecode");
            return (Criteria) this;
        }

        public Criteria andOrgLiccensecodeNotBetween(String value1, String value2) {
            addCriterion("ORG_LICCENSECODE not between", value1, value2, "orgLiccensecode");
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

        public Criteria andSupProviceNameIsNull() {
            addCriterion("SUP_PROVICE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSupProviceNameIsNotNull() {
            addCriterion("SUP_PROVICE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSupProviceNameEqualTo(String value) {
            addCriterion("SUP_PROVICE_NAME =", value, "supProviceName");
            return (Criteria) this;
        }

        public Criteria andSupProviceNameNotEqualTo(String value) {
            addCriterion("SUP_PROVICE_NAME <>", value, "supProviceName");
            return (Criteria) this;
        }

        public Criteria andSupProviceNameGreaterThan(String value) {
            addCriterion("SUP_PROVICE_NAME >", value, "supProviceName");
            return (Criteria) this;
        }

        public Criteria andSupProviceNameGreaterThanOrEqualTo(String value) {
            addCriterion("SUP_PROVICE_NAME >=", value, "supProviceName");
            return (Criteria) this;
        }

        public Criteria andSupProviceNameLessThan(String value) {
            addCriterion("SUP_PROVICE_NAME <", value, "supProviceName");
            return (Criteria) this;
        }

        public Criteria andSupProviceNameLessThanOrEqualTo(String value) {
            addCriterion("SUP_PROVICE_NAME <=", value, "supProviceName");
            return (Criteria) this;
        }

        public Criteria andSupProviceNameLike(String value) {
            addCriterion("SUP_PROVICE_NAME like", value, "supProviceName");
            return (Criteria) this;
        }

        public Criteria andSupProviceNameNotLike(String value) {
            addCriterion("SUP_PROVICE_NAME not like", value, "supProviceName");
            return (Criteria) this;
        }

        public Criteria andSupProviceNameIn(List<String> values) {
            addCriterion("SUP_PROVICE_NAME in", values, "supProviceName");
            return (Criteria) this;
        }

        public Criteria andSupProviceNameNotIn(List<String> values) {
            addCriterion("SUP_PROVICE_NAME not in", values, "supProviceName");
            return (Criteria) this;
        }

        public Criteria andSupProviceNameBetween(String value1, String value2) {
            addCriterion("SUP_PROVICE_NAME between", value1, value2, "supProviceName");
            return (Criteria) this;
        }

        public Criteria andSupProviceNameNotBetween(String value1, String value2) {
            addCriterion("SUP_PROVICE_NAME not between", value1, value2, "supProviceName");
            return (Criteria) this;
        }

        public Criteria andSupCityCodeIsNull() {
            addCriterion("SUP_CITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSupCityCodeIsNotNull() {
            addCriterion("SUP_CITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSupCityCodeEqualTo(String value) {
            addCriterion("SUP_CITY_CODE =", value, "supCityCode");
            return (Criteria) this;
        }

        public Criteria andSupCityCodeNotEqualTo(String value) {
            addCriterion("SUP_CITY_CODE <>", value, "supCityCode");
            return (Criteria) this;
        }

        public Criteria andSupCityCodeGreaterThan(String value) {
            addCriterion("SUP_CITY_CODE >", value, "supCityCode");
            return (Criteria) this;
        }

        public Criteria andSupCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SUP_CITY_CODE >=", value, "supCityCode");
            return (Criteria) this;
        }

        public Criteria andSupCityCodeLessThan(String value) {
            addCriterion("SUP_CITY_CODE <", value, "supCityCode");
            return (Criteria) this;
        }

        public Criteria andSupCityCodeLessThanOrEqualTo(String value) {
            addCriterion("SUP_CITY_CODE <=", value, "supCityCode");
            return (Criteria) this;
        }

        public Criteria andSupCityCodeLike(String value) {
            addCriterion("SUP_CITY_CODE like", value, "supCityCode");
            return (Criteria) this;
        }

        public Criteria andSupCityCodeNotLike(String value) {
            addCriterion("SUP_CITY_CODE not like", value, "supCityCode");
            return (Criteria) this;
        }

        public Criteria andSupCityCodeIn(List<String> values) {
            addCriterion("SUP_CITY_CODE in", values, "supCityCode");
            return (Criteria) this;
        }

        public Criteria andSupCityCodeNotIn(List<String> values) {
            addCriterion("SUP_CITY_CODE not in", values, "supCityCode");
            return (Criteria) this;
        }

        public Criteria andSupCityCodeBetween(String value1, String value2) {
            addCriterion("SUP_CITY_CODE between", value1, value2, "supCityCode");
            return (Criteria) this;
        }

        public Criteria andSupCityCodeNotBetween(String value1, String value2) {
            addCriterion("SUP_CITY_CODE not between", value1, value2, "supCityCode");
            return (Criteria) this;
        }

        public Criteria andSupCityNameIsNull() {
            addCriterion("SUP_CITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSupCityNameIsNotNull() {
            addCriterion("SUP_CITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSupCityNameEqualTo(String value) {
            addCriterion("SUP_CITY_NAME =", value, "supCityName");
            return (Criteria) this;
        }

        public Criteria andSupCityNameNotEqualTo(String value) {
            addCriterion("SUP_CITY_NAME <>", value, "supCityName");
            return (Criteria) this;
        }

        public Criteria andSupCityNameGreaterThan(String value) {
            addCriterion("SUP_CITY_NAME >", value, "supCityName");
            return (Criteria) this;
        }

        public Criteria andSupCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("SUP_CITY_NAME >=", value, "supCityName");
            return (Criteria) this;
        }

        public Criteria andSupCityNameLessThan(String value) {
            addCriterion("SUP_CITY_NAME <", value, "supCityName");
            return (Criteria) this;
        }

        public Criteria andSupCityNameLessThanOrEqualTo(String value) {
            addCriterion("SUP_CITY_NAME <=", value, "supCityName");
            return (Criteria) this;
        }

        public Criteria andSupCityNameLike(String value) {
            addCriterion("SUP_CITY_NAME like", value, "supCityName");
            return (Criteria) this;
        }

        public Criteria andSupCityNameNotLike(String value) {
            addCriterion("SUP_CITY_NAME not like", value, "supCityName");
            return (Criteria) this;
        }

        public Criteria andSupCityNameIn(List<String> values) {
            addCriterion("SUP_CITY_NAME in", values, "supCityName");
            return (Criteria) this;
        }

        public Criteria andSupCityNameNotIn(List<String> values) {
            addCriterion("SUP_CITY_NAME not in", values, "supCityName");
            return (Criteria) this;
        }

        public Criteria andSupCityNameBetween(String value1, String value2) {
            addCriterion("SUP_CITY_NAME between", value1, value2, "supCityName");
            return (Criteria) this;
        }

        public Criteria andSupCityNameNotBetween(String value1, String value2) {
            addCriterion("SUP_CITY_NAME not between", value1, value2, "supCityName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameIsNull() {
            addCriterion("ORG_SHORT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameIsNotNull() {
            addCriterion("ORG_SHORT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameEqualTo(String value) {
            addCriterion("ORG_SHORT_NAME =", value, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameNotEqualTo(String value) {
            addCriterion("ORG_SHORT_NAME <>", value, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameGreaterThan(String value) {
            addCriterion("ORG_SHORT_NAME >", value, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_SHORT_NAME >=", value, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameLessThan(String value) {
            addCriterion("ORG_SHORT_NAME <", value, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameLessThanOrEqualTo(String value) {
            addCriterion("ORG_SHORT_NAME <=", value, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameLike(String value) {
            addCriterion("ORG_SHORT_NAME like", value, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameNotLike(String value) {
            addCriterion("ORG_SHORT_NAME not like", value, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameIn(List<String> values) {
            addCriterion("ORG_SHORT_NAME in", values, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameNotIn(List<String> values) {
            addCriterion("ORG_SHORT_NAME not in", values, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameBetween(String value1, String value2) {
            addCriterion("ORG_SHORT_NAME between", value1, value2, "orgShortName");
            return (Criteria) this;
        }

        public Criteria andOrgShortNameNotBetween(String value1, String value2) {
            addCriterion("ORG_SHORT_NAME not between", value1, value2, "orgShortName");
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

        public Criteria andIsCheckIsNull() {
            addCriterion("IS_CHECK is null");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNotNull() {
            addCriterion("IS_CHECK is not null");
            return (Criteria) this;
        }

        public Criteria andIsCheckEqualTo(String value) {
            addCriterion("IS_CHECK =", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotEqualTo(String value) {
            addCriterion("IS_CHECK <>", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThan(String value) {
            addCriterion("IS_CHECK >", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThanOrEqualTo(String value) {
            addCriterion("IS_CHECK >=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThan(String value) {
            addCriterion("IS_CHECK <", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThanOrEqualTo(String value) {
            addCriterion("IS_CHECK <=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLike(String value) {
            addCriterion("IS_CHECK like", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotLike(String value) {
            addCriterion("IS_CHECK not like", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckIn(List<String> values) {
            addCriterion("IS_CHECK in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotIn(List<String> values) {
            addCriterion("IS_CHECK not in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckBetween(String value1, String value2) {
            addCriterion("IS_CHECK between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotBetween(String value1, String value2) {
            addCriterion("IS_CHECK not between", value1, value2, "isCheck");
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
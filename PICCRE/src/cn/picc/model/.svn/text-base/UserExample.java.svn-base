package cn.picc.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andOldNameIsNull() {
            addCriterion("OLD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOldNameIsNotNull() {
            addCriterion("OLD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOldNameEqualTo(String value) {
            addCriterion("OLD_NAME =", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameNotEqualTo(String value) {
            addCriterion("OLD_NAME <>", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameGreaterThan(String value) {
            addCriterion("OLD_NAME >", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_NAME >=", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameLessThan(String value) {
            addCriterion("OLD_NAME <", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameLessThanOrEqualTo(String value) {
            addCriterion("OLD_NAME <=", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameLike(String value) {
            addCriterion("OLD_NAME like", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameNotLike(String value) {
            addCriterion("OLD_NAME not like", value, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameIn(List<String> values) {
            addCriterion("OLD_NAME in", values, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameNotIn(List<String> values) {
            addCriterion("OLD_NAME not in", values, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameBetween(String value1, String value2) {
            addCriterion("OLD_NAME between", value1, value2, "oldName");
            return (Criteria) this;
        }

        public Criteria andOldNameNotBetween(String value1, String value2) {
            addCriterion("OLD_NAME not between", value1, value2, "oldName");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
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

        public Criteria andAtionIsNull() {
            addCriterion("ATION is null");
            return (Criteria) this;
        }

        public Criteria andAtionIsNotNull() {
            addCriterion("ATION is not null");
            return (Criteria) this;
        }

        public Criteria andAtionEqualTo(String value) {
            addCriterion("ATION =", value, "ation");
            return (Criteria) this;
        }

        public Criteria andAtionNotEqualTo(String value) {
            addCriterion("ATION <>", value, "ation");
            return (Criteria) this;
        }

        public Criteria andAtionGreaterThan(String value) {
            addCriterion("ATION >", value, "ation");
            return (Criteria) this;
        }

        public Criteria andAtionGreaterThanOrEqualTo(String value) {
            addCriterion("ATION >=", value, "ation");
            return (Criteria) this;
        }

        public Criteria andAtionLessThan(String value) {
            addCriterion("ATION <", value, "ation");
            return (Criteria) this;
        }

        public Criteria andAtionLessThanOrEqualTo(String value) {
            addCriterion("ATION <=", value, "ation");
            return (Criteria) this;
        }

        public Criteria andAtionLike(String value) {
            addCriterion("ATION like", value, "ation");
            return (Criteria) this;
        }

        public Criteria andAtionNotLike(String value) {
            addCriterion("ATION not like", value, "ation");
            return (Criteria) this;
        }

        public Criteria andAtionIn(List<String> values) {
            addCriterion("ATION in", values, "ation");
            return (Criteria) this;
        }

        public Criteria andAtionNotIn(List<String> values) {
            addCriterion("ATION not in", values, "ation");
            return (Criteria) this;
        }

        public Criteria andAtionBetween(String value1, String value2) {
            addCriterion("ATION between", value1, value2, "ation");
            return (Criteria) this;
        }

        public Criteria andAtionNotBetween(String value1, String value2) {
            addCriterion("ATION not between", value1, value2, "ation");
            return (Criteria) this;
        }

        public Criteria andBloodIsNull() {
            addCriterion("BLOOD is null");
            return (Criteria) this;
        }

        public Criteria andBloodIsNotNull() {
            addCriterion("BLOOD is not null");
            return (Criteria) this;
        }

        public Criteria andBloodEqualTo(String value) {
            addCriterion("BLOOD =", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodNotEqualTo(String value) {
            addCriterion("BLOOD <>", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodGreaterThan(String value) {
            addCriterion("BLOOD >", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodGreaterThanOrEqualTo(String value) {
            addCriterion("BLOOD >=", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodLessThan(String value) {
            addCriterion("BLOOD <", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodLessThanOrEqualTo(String value) {
            addCriterion("BLOOD <=", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodLike(String value) {
            addCriterion("BLOOD like", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodNotLike(String value) {
            addCriterion("BLOOD not like", value, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodIn(List<String> values) {
            addCriterion("BLOOD in", values, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodNotIn(List<String> values) {
            addCriterion("BLOOD not in", values, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodBetween(String value1, String value2) {
            addCriterion("BLOOD between", value1, value2, "blood");
            return (Criteria) this;
        }

        public Criteria andBloodNotBetween(String value1, String value2) {
            addCriterion("BLOOD not between", value1, value2, "blood");
            return (Criteria) this;
        }

        public Criteria andPsIsNull() {
            addCriterion("PS is null");
            return (Criteria) this;
        }

        public Criteria andPsIsNotNull() {
            addCriterion("PS is not null");
            return (Criteria) this;
        }

        public Criteria andPsEqualTo(String value) {
            addCriterion("PS =", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsNotEqualTo(String value) {
            addCriterion("PS <>", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsGreaterThan(String value) {
            addCriterion("PS >", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsGreaterThanOrEqualTo(String value) {
            addCriterion("PS >=", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsLessThan(String value) {
            addCriterion("PS <", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsLessThanOrEqualTo(String value) {
            addCriterion("PS <=", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsLike(String value) {
            addCriterion("PS like", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsNotLike(String value) {
            addCriterion("PS not like", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsIn(List<String> values) {
            addCriterion("PS in", values, "ps");
            return (Criteria) this;
        }

        public Criteria andPsNotIn(List<String> values) {
            addCriterion("PS not in", values, "ps");
            return (Criteria) this;
        }

        public Criteria andPsBetween(String value1, String value2) {
            addCriterion("PS between", value1, value2, "ps");
            return (Criteria) this;
        }

        public Criteria andPsNotBetween(String value1, String value2) {
            addCriterion("PS not between", value1, value2, "ps");
            return (Criteria) this;
        }

        public Criteria andHouseholdIsNull() {
            addCriterion("HOUSEHOLD is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdIsNotNull() {
            addCriterion("HOUSEHOLD is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdEqualTo(String value) {
            addCriterion("HOUSEHOLD =", value, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdNotEqualTo(String value) {
            addCriterion("HOUSEHOLD <>", value, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdGreaterThan(String value) {
            addCriterion("HOUSEHOLD >", value, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdGreaterThanOrEqualTo(String value) {
            addCriterion("HOUSEHOLD >=", value, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdLessThan(String value) {
            addCriterion("HOUSEHOLD <", value, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdLessThanOrEqualTo(String value) {
            addCriterion("HOUSEHOLD <=", value, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdLike(String value) {
            addCriterion("HOUSEHOLD like", value, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdNotLike(String value) {
            addCriterion("HOUSEHOLD not like", value, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdIn(List<String> values) {
            addCriterion("HOUSEHOLD in", values, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdNotIn(List<String> values) {
            addCriterion("HOUSEHOLD not in", values, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdBetween(String value1, String value2) {
            addCriterion("HOUSEHOLD between", value1, value2, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdNotBetween(String value1, String value2) {
            addCriterion("HOUSEHOLD not between", value1, value2, "household");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("NATION is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("NATION is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("NATION =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("NATION <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("NATION >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("NATION >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("NATION <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("NATION <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("NATION like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("NATION not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("NATION in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("NATION not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("NATION between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("NATION not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andBirthplaceIsNull() {
            addCriterion("BIRTHPLACE is null");
            return (Criteria) this;
        }

        public Criteria andBirthplaceIsNotNull() {
            addCriterion("BIRTHPLACE is not null");
            return (Criteria) this;
        }

        public Criteria andBirthplaceEqualTo(String value) {
            addCriterion("BIRTHPLACE =", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotEqualTo(String value) {
            addCriterion("BIRTHPLACE <>", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceGreaterThan(String value) {
            addCriterion("BIRTHPLACE >", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceGreaterThanOrEqualTo(String value) {
            addCriterion("BIRTHPLACE >=", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceLessThan(String value) {
            addCriterion("BIRTHPLACE <", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceLessThanOrEqualTo(String value) {
            addCriterion("BIRTHPLACE <=", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceLike(String value) {
            addCriterion("BIRTHPLACE like", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotLike(String value) {
            addCriterion("BIRTHPLACE not like", value, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceIn(List<String> values) {
            addCriterion("BIRTHPLACE in", values, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotIn(List<String> values) {
            addCriterion("BIRTHPLACE not in", values, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceBetween(String value1, String value2) {
            addCriterion("BIRTHPLACE between", value1, value2, "birthplace");
            return (Criteria) this;
        }

        public Criteria andBirthplaceNotBetween(String value1, String value2) {
            addCriterion("BIRTHPLACE not between", value1, value2, "birthplace");
            return (Criteria) this;
        }

        public Criteria andMarriageIsNull() {
            addCriterion("MARRIAGE is null");
            return (Criteria) this;
        }

        public Criteria andMarriageIsNotNull() {
            addCriterion("MARRIAGE is not null");
            return (Criteria) this;
        }

        public Criteria andMarriageEqualTo(String value) {
            addCriterion("MARRIAGE =", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotEqualTo(String value) {
            addCriterion("MARRIAGE <>", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageGreaterThan(String value) {
            addCriterion("MARRIAGE >", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageGreaterThanOrEqualTo(String value) {
            addCriterion("MARRIAGE >=", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLessThan(String value) {
            addCriterion("MARRIAGE <", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLessThanOrEqualTo(String value) {
            addCriterion("MARRIAGE <=", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageLike(String value) {
            addCriterion("MARRIAGE like", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotLike(String value) {
            addCriterion("MARRIAGE not like", value, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageIn(List<String> values) {
            addCriterion("MARRIAGE in", values, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotIn(List<String> values) {
            addCriterion("MARRIAGE not in", values, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageBetween(String value1, String value2) {
            addCriterion("MARRIAGE between", value1, value2, "marriage");
            return (Criteria) this;
        }

        public Criteria andMarriageNotBetween(String value1, String value2) {
            addCriterion("MARRIAGE not between", value1, value2, "marriage");
            return (Criteria) this;
        }

        public Criteria andHealthIsNull() {
            addCriterion("HEALTH is null");
            return (Criteria) this;
        }

        public Criteria andHealthIsNotNull() {
            addCriterion("HEALTH is not null");
            return (Criteria) this;
        }

        public Criteria andHealthEqualTo(String value) {
            addCriterion("HEALTH =", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotEqualTo(String value) {
            addCriterion("HEALTH <>", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthGreaterThan(String value) {
            addCriterion("HEALTH >", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthGreaterThanOrEqualTo(String value) {
            addCriterion("HEALTH >=", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthLessThan(String value) {
            addCriterion("HEALTH <", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthLessThanOrEqualTo(String value) {
            addCriterion("HEALTH <=", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthLike(String value) {
            addCriterion("HEALTH like", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotLike(String value) {
            addCriterion("HEALTH not like", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthIn(List<String> values) {
            addCriterion("HEALTH in", values, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotIn(List<String> values) {
            addCriterion("HEALTH not in", values, "health");
            return (Criteria) this;
        }

        public Criteria andHealthBetween(String value1, String value2) {
            addCriterion("HEALTH between", value1, value2, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotBetween(String value1, String value2) {
            addCriterion("HEALTH not between", value1, value2, "health");
            return (Criteria) this;
        }

        public Criteria andArchiveAddrIsNull() {
            addCriterion("ARCHIVE_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andArchiveAddrIsNotNull() {
            addCriterion("ARCHIVE_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andArchiveAddrEqualTo(String value) {
            addCriterion("ARCHIVE_ADDR =", value, "archiveAddr");
            return (Criteria) this;
        }

        public Criteria andArchiveAddrNotEqualTo(String value) {
            addCriterion("ARCHIVE_ADDR <>", value, "archiveAddr");
            return (Criteria) this;
        }

        public Criteria andArchiveAddrGreaterThan(String value) {
            addCriterion("ARCHIVE_ADDR >", value, "archiveAddr");
            return (Criteria) this;
        }

        public Criteria andArchiveAddrGreaterThanOrEqualTo(String value) {
            addCriterion("ARCHIVE_ADDR >=", value, "archiveAddr");
            return (Criteria) this;
        }

        public Criteria andArchiveAddrLessThan(String value) {
            addCriterion("ARCHIVE_ADDR <", value, "archiveAddr");
            return (Criteria) this;
        }

        public Criteria andArchiveAddrLessThanOrEqualTo(String value) {
            addCriterion("ARCHIVE_ADDR <=", value, "archiveAddr");
            return (Criteria) this;
        }

        public Criteria andArchiveAddrLike(String value) {
            addCriterion("ARCHIVE_ADDR like", value, "archiveAddr");
            return (Criteria) this;
        }

        public Criteria andArchiveAddrNotLike(String value) {
            addCriterion("ARCHIVE_ADDR not like", value, "archiveAddr");
            return (Criteria) this;
        }

        public Criteria andArchiveAddrIn(List<String> values) {
            addCriterion("ARCHIVE_ADDR in", values, "archiveAddr");
            return (Criteria) this;
        }

        public Criteria andArchiveAddrNotIn(List<String> values) {
            addCriterion("ARCHIVE_ADDR not in", values, "archiveAddr");
            return (Criteria) this;
        }

        public Criteria andArchiveAddrBetween(String value1, String value2) {
            addCriterion("ARCHIVE_ADDR between", value1, value2, "archiveAddr");
            return (Criteria) this;
        }

        public Criteria andArchiveAddrNotBetween(String value1, String value2) {
            addCriterion("ARCHIVE_ADDR not between", value1, value2, "archiveAddr");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIsNull() {
            addCriterion("WORK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIsNotNull() {
            addCriterion("WORK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTimeEqualTo(Date value) {
            addCriterionForJDBCDate("WORK_TIME =", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("WORK_TIME <>", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("WORK_TIME >", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("WORK_TIME >=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThan(Date value) {
            addCriterionForJDBCDate("WORK_TIME <", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("WORK_TIME <=", value, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeIn(List<Date> values) {
            addCriterionForJDBCDate("WORK_TIME in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("WORK_TIME not in", values, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("WORK_TIME between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andWorkTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("WORK_TIME not between", value1, value2, "workTime");
            return (Criteria) this;
        }

        public Criteria andHouseholdNatrueIsNull() {
            addCriterion("HOUSEHOLD_NATRUE is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdNatrueIsNotNull() {
            addCriterion("HOUSEHOLD_NATRUE is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdNatrueEqualTo(String value) {
            addCriterion("HOUSEHOLD_NATRUE =", value, "householdNatrue");
            return (Criteria) this;
        }

        public Criteria andHouseholdNatrueNotEqualTo(String value) {
            addCriterion("HOUSEHOLD_NATRUE <>", value, "householdNatrue");
            return (Criteria) this;
        }

        public Criteria andHouseholdNatrueGreaterThan(String value) {
            addCriterion("HOUSEHOLD_NATRUE >", value, "householdNatrue");
            return (Criteria) this;
        }

        public Criteria andHouseholdNatrueGreaterThanOrEqualTo(String value) {
            addCriterion("HOUSEHOLD_NATRUE >=", value, "householdNatrue");
            return (Criteria) this;
        }

        public Criteria andHouseholdNatrueLessThan(String value) {
            addCriterion("HOUSEHOLD_NATRUE <", value, "householdNatrue");
            return (Criteria) this;
        }

        public Criteria andHouseholdNatrueLessThanOrEqualTo(String value) {
            addCriterion("HOUSEHOLD_NATRUE <=", value, "householdNatrue");
            return (Criteria) this;
        }

        public Criteria andHouseholdNatrueLike(String value) {
            addCriterion("HOUSEHOLD_NATRUE like", value, "householdNatrue");
            return (Criteria) this;
        }

        public Criteria andHouseholdNatrueNotLike(String value) {
            addCriterion("HOUSEHOLD_NATRUE not like", value, "householdNatrue");
            return (Criteria) this;
        }

        public Criteria andHouseholdNatrueIn(List<String> values) {
            addCriterion("HOUSEHOLD_NATRUE in", values, "householdNatrue");
            return (Criteria) this;
        }

        public Criteria andHouseholdNatrueNotIn(List<String> values) {
            addCriterion("HOUSEHOLD_NATRUE not in", values, "householdNatrue");
            return (Criteria) this;
        }

        public Criteria andHouseholdNatrueBetween(String value1, String value2) {
            addCriterion("HOUSEHOLD_NATRUE between", value1, value2, "householdNatrue");
            return (Criteria) this;
        }

        public Criteria andHouseholdNatrueNotBetween(String value1, String value2) {
            addCriterion("HOUSEHOLD_NATRUE not between", value1, value2, "householdNatrue");
            return (Criteria) this;
        }

        public Criteria andHouseholdAddrIsNull() {
            addCriterion("HOUSEHOLD_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdAddrIsNotNull() {
            addCriterion("HOUSEHOLD_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdAddrEqualTo(String value) {
            addCriterion("HOUSEHOLD_ADDR =", value, "householdAddr");
            return (Criteria) this;
        }

        public Criteria andHouseholdAddrNotEqualTo(String value) {
            addCriterion("HOUSEHOLD_ADDR <>", value, "householdAddr");
            return (Criteria) this;
        }

        public Criteria andHouseholdAddrGreaterThan(String value) {
            addCriterion("HOUSEHOLD_ADDR >", value, "householdAddr");
            return (Criteria) this;
        }

        public Criteria andHouseholdAddrGreaterThanOrEqualTo(String value) {
            addCriterion("HOUSEHOLD_ADDR >=", value, "householdAddr");
            return (Criteria) this;
        }

        public Criteria andHouseholdAddrLessThan(String value) {
            addCriterion("HOUSEHOLD_ADDR <", value, "householdAddr");
            return (Criteria) this;
        }

        public Criteria andHouseholdAddrLessThanOrEqualTo(String value) {
            addCriterion("HOUSEHOLD_ADDR <=", value, "householdAddr");
            return (Criteria) this;
        }

        public Criteria andHouseholdAddrLike(String value) {
            addCriterion("HOUSEHOLD_ADDR like", value, "householdAddr");
            return (Criteria) this;
        }

        public Criteria andHouseholdAddrNotLike(String value) {
            addCriterion("HOUSEHOLD_ADDR not like", value, "householdAddr");
            return (Criteria) this;
        }

        public Criteria andHouseholdAddrIn(List<String> values) {
            addCriterion("HOUSEHOLD_ADDR in", values, "householdAddr");
            return (Criteria) this;
        }

        public Criteria andHouseholdAddrNotIn(List<String> values) {
            addCriterion("HOUSEHOLD_ADDR not in", values, "householdAddr");
            return (Criteria) this;
        }

        public Criteria andHouseholdAddrBetween(String value1, String value2) {
            addCriterion("HOUSEHOLD_ADDR between", value1, value2, "householdAddr");
            return (Criteria) this;
        }

        public Criteria andHouseholdAddrNotBetween(String value1, String value2) {
            addCriterion("HOUSEHOLD_ADDR not between", value1, value2, "householdAddr");
            return (Criteria) this;
        }

        public Criteria andHouseAddrIsNull() {
            addCriterion("HOUSE_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andHouseAddrIsNotNull() {
            addCriterion("HOUSE_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andHouseAddrEqualTo(String value) {
            addCriterion("HOUSE_ADDR =", value, "houseAddr");
            return (Criteria) this;
        }

        public Criteria andHouseAddrNotEqualTo(String value) {
            addCriterion("HOUSE_ADDR <>", value, "houseAddr");
            return (Criteria) this;
        }

        public Criteria andHouseAddrGreaterThan(String value) {
            addCriterion("HOUSE_ADDR >", value, "houseAddr");
            return (Criteria) this;
        }

        public Criteria andHouseAddrGreaterThanOrEqualTo(String value) {
            addCriterion("HOUSE_ADDR >=", value, "houseAddr");
            return (Criteria) this;
        }

        public Criteria andHouseAddrLessThan(String value) {
            addCriterion("HOUSE_ADDR <", value, "houseAddr");
            return (Criteria) this;
        }

        public Criteria andHouseAddrLessThanOrEqualTo(String value) {
            addCriterion("HOUSE_ADDR <=", value, "houseAddr");
            return (Criteria) this;
        }

        public Criteria andHouseAddrLike(String value) {
            addCriterion("HOUSE_ADDR like", value, "houseAddr");
            return (Criteria) this;
        }

        public Criteria andHouseAddrNotLike(String value) {
            addCriterion("HOUSE_ADDR not like", value, "houseAddr");
            return (Criteria) this;
        }

        public Criteria andHouseAddrIn(List<String> values) {
            addCriterion("HOUSE_ADDR in", values, "houseAddr");
            return (Criteria) this;
        }

        public Criteria andHouseAddrNotIn(List<String> values) {
            addCriterion("HOUSE_ADDR not in", values, "houseAddr");
            return (Criteria) this;
        }

        public Criteria andHouseAddrBetween(String value1, String value2) {
            addCriterion("HOUSE_ADDR between", value1, value2, "houseAddr");
            return (Criteria) this;
        }

        public Criteria andHouseAddrNotBetween(String value1, String value2) {
            addCriterion("HOUSE_ADDR not between", value1, value2, "houseAddr");
            return (Criteria) this;
        }

        public Criteria andPriPhoneIsNull() {
            addCriterion("PRI_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPriPhoneIsNotNull() {
            addCriterion("PRI_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPriPhoneEqualTo(String value) {
            addCriterion("PRI_PHONE =", value, "priPhone");
            return (Criteria) this;
        }

        public Criteria andPriPhoneNotEqualTo(String value) {
            addCriterion("PRI_PHONE <>", value, "priPhone");
            return (Criteria) this;
        }

        public Criteria andPriPhoneGreaterThan(String value) {
            addCriterion("PRI_PHONE >", value, "priPhone");
            return (Criteria) this;
        }

        public Criteria andPriPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PRI_PHONE >=", value, "priPhone");
            return (Criteria) this;
        }

        public Criteria andPriPhoneLessThan(String value) {
            addCriterion("PRI_PHONE <", value, "priPhone");
            return (Criteria) this;
        }

        public Criteria andPriPhoneLessThanOrEqualTo(String value) {
            addCriterion("PRI_PHONE <=", value, "priPhone");
            return (Criteria) this;
        }

        public Criteria andPriPhoneLike(String value) {
            addCriterion("PRI_PHONE like", value, "priPhone");
            return (Criteria) this;
        }

        public Criteria andPriPhoneNotLike(String value) {
            addCriterion("PRI_PHONE not like", value, "priPhone");
            return (Criteria) this;
        }

        public Criteria andPriPhoneIn(List<String> values) {
            addCriterion("PRI_PHONE in", values, "priPhone");
            return (Criteria) this;
        }

        public Criteria andPriPhoneNotIn(List<String> values) {
            addCriterion("PRI_PHONE not in", values, "priPhone");
            return (Criteria) this;
        }

        public Criteria andPriPhoneBetween(String value1, String value2) {
            addCriterion("PRI_PHONE between", value1, value2, "priPhone");
            return (Criteria) this;
        }

        public Criteria andPriPhoneNotBetween(String value1, String value2) {
            addCriterion("PRI_PHONE not between", value1, value2, "priPhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneIsNull() {
            addCriterion("OFFICE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneIsNotNull() {
            addCriterion("OFFICE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneEqualTo(String value) {
            addCriterion("OFFICE_PHONE =", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneNotEqualTo(String value) {
            addCriterion("OFFICE_PHONE <>", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneGreaterThan(String value) {
            addCriterion("OFFICE_PHONE >", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("OFFICE_PHONE >=", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneLessThan(String value) {
            addCriterion("OFFICE_PHONE <", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneLessThanOrEqualTo(String value) {
            addCriterion("OFFICE_PHONE <=", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneLike(String value) {
            addCriterion("OFFICE_PHONE like", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneNotLike(String value) {
            addCriterion("OFFICE_PHONE not like", value, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneIn(List<String> values) {
            addCriterion("OFFICE_PHONE in", values, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneNotIn(List<String> values) {
            addCriterion("OFFICE_PHONE not in", values, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneBetween(String value1, String value2) {
            addCriterion("OFFICE_PHONE between", value1, value2, "officePhone");
            return (Criteria) this;
        }

        public Criteria andOfficePhoneNotBetween(String value1, String value2) {
            addCriterion("OFFICE_PHONE not between", value1, value2, "officePhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneIsNull() {
            addCriterion("LINKMAN_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneIsNotNull() {
            addCriterion("LINKMAN_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneEqualTo(String value) {
            addCriterion("LINKMAN_PHONE =", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneNotEqualTo(String value) {
            addCriterion("LINKMAN_PHONE <>", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneGreaterThan(String value) {
            addCriterion("LINKMAN_PHONE >", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("LINKMAN_PHONE >=", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneLessThan(String value) {
            addCriterion("LINKMAN_PHONE <", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneLessThanOrEqualTo(String value) {
            addCriterion("LINKMAN_PHONE <=", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneLike(String value) {
            addCriterion("LINKMAN_PHONE like", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneNotLike(String value) {
            addCriterion("LINKMAN_PHONE not like", value, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneIn(List<String> values) {
            addCriterion("LINKMAN_PHONE in", values, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneNotIn(List<String> values) {
            addCriterion("LINKMAN_PHONE not in", values, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneBetween(String value1, String value2) {
            addCriterion("LINKMAN_PHONE between", value1, value2, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andLinkmanPhoneNotBetween(String value1, String value2) {
            addCriterion("LINKMAN_PHONE not between", value1, value2, "linkmanPhone");
            return (Criteria) this;
        }

        public Criteria andHousePhoneIsNull() {
            addCriterion("HOUSE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andHousePhoneIsNotNull() {
            addCriterion("HOUSE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andHousePhoneEqualTo(String value) {
            addCriterion("HOUSE_PHONE =", value, "housePhone");
            return (Criteria) this;
        }

        public Criteria andHousePhoneNotEqualTo(String value) {
            addCriterion("HOUSE_PHONE <>", value, "housePhone");
            return (Criteria) this;
        }

        public Criteria andHousePhoneGreaterThan(String value) {
            addCriterion("HOUSE_PHONE >", value, "housePhone");
            return (Criteria) this;
        }

        public Criteria andHousePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("HOUSE_PHONE >=", value, "housePhone");
            return (Criteria) this;
        }

        public Criteria andHousePhoneLessThan(String value) {
            addCriterion("HOUSE_PHONE <", value, "housePhone");
            return (Criteria) this;
        }

        public Criteria andHousePhoneLessThanOrEqualTo(String value) {
            addCriterion("HOUSE_PHONE <=", value, "housePhone");
            return (Criteria) this;
        }

        public Criteria andHousePhoneLike(String value) {
            addCriterion("HOUSE_PHONE like", value, "housePhone");
            return (Criteria) this;
        }

        public Criteria andHousePhoneNotLike(String value) {
            addCriterion("HOUSE_PHONE not like", value, "housePhone");
            return (Criteria) this;
        }

        public Criteria andHousePhoneIn(List<String> values) {
            addCriterion("HOUSE_PHONE in", values, "housePhone");
            return (Criteria) this;
        }

        public Criteria andHousePhoneNotIn(List<String> values) {
            addCriterion("HOUSE_PHONE not in", values, "housePhone");
            return (Criteria) this;
        }

        public Criteria andHousePhoneBetween(String value1, String value2) {
            addCriterion("HOUSE_PHONE between", value1, value2, "housePhone");
            return (Criteria) this;
        }

        public Criteria andHousePhoneNotBetween(String value1, String value2) {
            addCriterion("HOUSE_PHONE not between", value1, value2, "housePhone");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("POSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("POSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("POSTCODE =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("POSTCODE <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("POSTCODE >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("POSTCODE >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("POSTCODE <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("POSTCODE <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("POSTCODE like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("POSTCODE not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("POSTCODE in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("POSTCODE not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("POSTCODE between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("POSTCODE not between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andJoinPartyIsNull() {
            addCriterion("JOIN_PARTY is null");
            return (Criteria) this;
        }

        public Criteria andJoinPartyIsNotNull() {
            addCriterion("JOIN_PARTY is not null");
            return (Criteria) this;
        }

        public Criteria andJoinPartyEqualTo(Date value) {
            addCriterionForJDBCDate("JOIN_PARTY =", value, "joinParty");
            return (Criteria) this;
        }

        public Criteria andJoinPartyNotEqualTo(Date value) {
            addCriterionForJDBCDate("JOIN_PARTY <>", value, "joinParty");
            return (Criteria) this;
        }

        public Criteria andJoinPartyGreaterThan(Date value) {
            addCriterionForJDBCDate("JOIN_PARTY >", value, "joinParty");
            return (Criteria) this;
        }

        public Criteria andJoinPartyGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JOIN_PARTY >=", value, "joinParty");
            return (Criteria) this;
        }

        public Criteria andJoinPartyLessThan(Date value) {
            addCriterionForJDBCDate("JOIN_PARTY <", value, "joinParty");
            return (Criteria) this;
        }

        public Criteria andJoinPartyLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JOIN_PARTY <=", value, "joinParty");
            return (Criteria) this;
        }

        public Criteria andJoinPartyIn(List<Date> values) {
            addCriterionForJDBCDate("JOIN_PARTY in", values, "joinParty");
            return (Criteria) this;
        }

        public Criteria andJoinPartyNotIn(List<Date> values) {
            addCriterionForJDBCDate("JOIN_PARTY not in", values, "joinParty");
            return (Criteria) this;
        }

        public Criteria andJoinPartyBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JOIN_PARTY between", value1, value2, "joinParty");
            return (Criteria) this;
        }

        public Criteria andJoinPartyNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JOIN_PARTY not between", value1, value2, "joinParty");
            return (Criteria) this;
        }

        public Criteria andJoinPartyCompIsNull() {
            addCriterion("JOIN_PARTY_COMP is null");
            return (Criteria) this;
        }

        public Criteria andJoinPartyCompIsNotNull() {
            addCriterion("JOIN_PARTY_COMP is not null");
            return (Criteria) this;
        }

        public Criteria andJoinPartyCompEqualTo(String value) {
            addCriterion("JOIN_PARTY_COMP =", value, "joinPartyComp");
            return (Criteria) this;
        }

        public Criteria andJoinPartyCompNotEqualTo(String value) {
            addCriterion("JOIN_PARTY_COMP <>", value, "joinPartyComp");
            return (Criteria) this;
        }

        public Criteria andJoinPartyCompGreaterThan(String value) {
            addCriterion("JOIN_PARTY_COMP >", value, "joinPartyComp");
            return (Criteria) this;
        }

        public Criteria andJoinPartyCompGreaterThanOrEqualTo(String value) {
            addCriterion("JOIN_PARTY_COMP >=", value, "joinPartyComp");
            return (Criteria) this;
        }

        public Criteria andJoinPartyCompLessThan(String value) {
            addCriterion("JOIN_PARTY_COMP <", value, "joinPartyComp");
            return (Criteria) this;
        }

        public Criteria andJoinPartyCompLessThanOrEqualTo(String value) {
            addCriterion("JOIN_PARTY_COMP <=", value, "joinPartyComp");
            return (Criteria) this;
        }

        public Criteria andJoinPartyCompLike(String value) {
            addCriterion("JOIN_PARTY_COMP like", value, "joinPartyComp");
            return (Criteria) this;
        }

        public Criteria andJoinPartyCompNotLike(String value) {
            addCriterion("JOIN_PARTY_COMP not like", value, "joinPartyComp");
            return (Criteria) this;
        }

        public Criteria andJoinPartyCompIn(List<String> values) {
            addCriterion("JOIN_PARTY_COMP in", values, "joinPartyComp");
            return (Criteria) this;
        }

        public Criteria andJoinPartyCompNotIn(List<String> values) {
            addCriterion("JOIN_PARTY_COMP not in", values, "joinPartyComp");
            return (Criteria) this;
        }

        public Criteria andJoinPartyCompBetween(String value1, String value2) {
            addCriterion("JOIN_PARTY_COMP between", value1, value2, "joinPartyComp");
            return (Criteria) this;
        }

        public Criteria andJoinPartyCompNotBetween(String value1, String value2) {
            addCriterion("JOIN_PARTY_COMP not between", value1, value2, "joinPartyComp");
            return (Criteria) this;
        }

        public Criteria andJoinPartyTimeIsNull() {
            addCriterion("JOIN_PARTY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andJoinPartyTimeIsNotNull() {
            addCriterion("JOIN_PARTY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andJoinPartyTimeEqualTo(Date value) {
            addCriterionForJDBCDate("JOIN_PARTY_TIME =", value, "joinPartyTime");
            return (Criteria) this;
        }

        public Criteria andJoinPartyTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("JOIN_PARTY_TIME <>", value, "joinPartyTime");
            return (Criteria) this;
        }

        public Criteria andJoinPartyTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("JOIN_PARTY_TIME >", value, "joinPartyTime");
            return (Criteria) this;
        }

        public Criteria andJoinPartyTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JOIN_PARTY_TIME >=", value, "joinPartyTime");
            return (Criteria) this;
        }

        public Criteria andJoinPartyTimeLessThan(Date value) {
            addCriterionForJDBCDate("JOIN_PARTY_TIME <", value, "joinPartyTime");
            return (Criteria) this;
        }

        public Criteria andJoinPartyTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("JOIN_PARTY_TIME <=", value, "joinPartyTime");
            return (Criteria) this;
        }

        public Criteria andJoinPartyTimeIn(List<Date> values) {
            addCriterionForJDBCDate("JOIN_PARTY_TIME in", values, "joinPartyTime");
            return (Criteria) this;
        }

        public Criteria andJoinPartyTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("JOIN_PARTY_TIME not in", values, "joinPartyTime");
            return (Criteria) this;
        }

        public Criteria andJoinPartyTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JOIN_PARTY_TIME between", value1, value2, "joinPartyTime");
            return (Criteria) this;
        }

        public Criteria andJoinPartyTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("JOIN_PARTY_TIME not between", value1, value2, "joinPartyTime");
            return (Criteria) this;
        }

        public Criteria andFullTimeIsNull() {
            addCriterion("FULL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFullTimeIsNotNull() {
            addCriterion("FULL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFullTimeEqualTo(Date value) {
            addCriterionForJDBCDate("FULL_TIME =", value, "fullTime");
            return (Criteria) this;
        }

        public Criteria andFullTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("FULL_TIME <>", value, "fullTime");
            return (Criteria) this;
        }

        public Criteria andFullTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("FULL_TIME >", value, "fullTime");
            return (Criteria) this;
        }

        public Criteria andFullTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FULL_TIME >=", value, "fullTime");
            return (Criteria) this;
        }

        public Criteria andFullTimeLessThan(Date value) {
            addCriterionForJDBCDate("FULL_TIME <", value, "fullTime");
            return (Criteria) this;
        }

        public Criteria andFullTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FULL_TIME <=", value, "fullTime");
            return (Criteria) this;
        }

        public Criteria andFullTimeIn(List<Date> values) {
            addCriterionForJDBCDate("FULL_TIME in", values, "fullTime");
            return (Criteria) this;
        }

        public Criteria andFullTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("FULL_TIME not in", values, "fullTime");
            return (Criteria) this;
        }

        public Criteria andFullTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FULL_TIME between", value1, value2, "fullTime");
            return (Criteria) this;
        }

        public Criteria andFullTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FULL_TIME not between", value1, value2, "fullTime");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIsNull() {
            addCriterion("SPECIALTY is null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIsNotNull() {
            addCriterion("SPECIALTY is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialtyEqualTo(String value) {
            addCriterion("SPECIALTY =", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotEqualTo(String value) {
            addCriterion("SPECIALTY <>", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyGreaterThan(String value) {
            addCriterion("SPECIALTY >", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIALTY >=", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyLessThan(String value) {
            addCriterion("SPECIALTY <", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyLessThanOrEqualTo(String value) {
            addCriterion("SPECIALTY <=", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyLike(String value) {
            addCriterion("SPECIALTY like", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotLike(String value) {
            addCriterion("SPECIALTY not like", value, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyIn(List<String> values) {
            addCriterion("SPECIALTY in", values, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotIn(List<String> values) {
            addCriterion("SPECIALTY not in", values, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyBetween(String value1, String value2) {
            addCriterion("SPECIALTY between", value1, value2, "specialty");
            return (Criteria) this;
        }

        public Criteria andSpecialtyNotBetween(String value1, String value2) {
            addCriterion("SPECIALTY not between", value1, value2, "specialty");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("PHOTO =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("PHOTO <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("PHOTO >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("PHOTO >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("PHOTO <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("PHOTO <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("PHOTO like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("PHOTO not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("PHOTO in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("PHOTO not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("PHOTO between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("PHOTO not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andEmpArchiveIsNull() {
            addCriterion("EMP_ARCHIVE is null");
            return (Criteria) this;
        }

        public Criteria andEmpArchiveIsNotNull() {
            addCriterion("EMP_ARCHIVE is not null");
            return (Criteria) this;
        }

        public Criteria andEmpArchiveEqualTo(String value) {
            addCriterion("EMP_ARCHIVE =", value, "empArchive");
            return (Criteria) this;
        }

        public Criteria andEmpArchiveNotEqualTo(String value) {
            addCriterion("EMP_ARCHIVE <>", value, "empArchive");
            return (Criteria) this;
        }

        public Criteria andEmpArchiveGreaterThan(String value) {
            addCriterion("EMP_ARCHIVE >", value, "empArchive");
            return (Criteria) this;
        }

        public Criteria andEmpArchiveGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_ARCHIVE >=", value, "empArchive");
            return (Criteria) this;
        }

        public Criteria andEmpArchiveLessThan(String value) {
            addCriterion("EMP_ARCHIVE <", value, "empArchive");
            return (Criteria) this;
        }

        public Criteria andEmpArchiveLessThanOrEqualTo(String value) {
            addCriterion("EMP_ARCHIVE <=", value, "empArchive");
            return (Criteria) this;
        }

        public Criteria andEmpArchiveLike(String value) {
            addCriterion("EMP_ARCHIVE like", value, "empArchive");
            return (Criteria) this;
        }

        public Criteria andEmpArchiveNotLike(String value) {
            addCriterion("EMP_ARCHIVE not like", value, "empArchive");
            return (Criteria) this;
        }

        public Criteria andEmpArchiveIn(List<String> values) {
            addCriterion("EMP_ARCHIVE in", values, "empArchive");
            return (Criteria) this;
        }

        public Criteria andEmpArchiveNotIn(List<String> values) {
            addCriterion("EMP_ARCHIVE not in", values, "empArchive");
            return (Criteria) this;
        }

        public Criteria andEmpArchiveBetween(String value1, String value2) {
            addCriterion("EMP_ARCHIVE between", value1, value2, "empArchive");
            return (Criteria) this;
        }

        public Criteria andEmpArchiveNotBetween(String value1, String value2) {
            addCriterion("EMP_ARCHIVE not between", value1, value2, "empArchive");
            return (Criteria) this;
        }

        public Criteria andSocialNoIsNull() {
            addCriterion("SOCIAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andSocialNoIsNotNull() {
            addCriterion("SOCIAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSocialNoEqualTo(String value) {
            addCriterion("SOCIAL_NO =", value, "socialNo");
            return (Criteria) this;
        }

        public Criteria andSocialNoNotEqualTo(String value) {
            addCriterion("SOCIAL_NO <>", value, "socialNo");
            return (Criteria) this;
        }

        public Criteria andSocialNoGreaterThan(String value) {
            addCriterion("SOCIAL_NO >", value, "socialNo");
            return (Criteria) this;
        }

        public Criteria andSocialNoGreaterThanOrEqualTo(String value) {
            addCriterion("SOCIAL_NO >=", value, "socialNo");
            return (Criteria) this;
        }

        public Criteria andSocialNoLessThan(String value) {
            addCriterion("SOCIAL_NO <", value, "socialNo");
            return (Criteria) this;
        }

        public Criteria andSocialNoLessThanOrEqualTo(String value) {
            addCriterion("SOCIAL_NO <=", value, "socialNo");
            return (Criteria) this;
        }

        public Criteria andSocialNoLike(String value) {
            addCriterion("SOCIAL_NO like", value, "socialNo");
            return (Criteria) this;
        }

        public Criteria andSocialNoNotLike(String value) {
            addCriterion("SOCIAL_NO not like", value, "socialNo");
            return (Criteria) this;
        }

        public Criteria andSocialNoIn(List<String> values) {
            addCriterion("SOCIAL_NO in", values, "socialNo");
            return (Criteria) this;
        }

        public Criteria andSocialNoNotIn(List<String> values) {
            addCriterion("SOCIAL_NO not in", values, "socialNo");
            return (Criteria) this;
        }

        public Criteria andSocialNoBetween(String value1, String value2) {
            addCriterion("SOCIAL_NO between", value1, value2, "socialNo");
            return (Criteria) this;
        }

        public Criteria andSocialNoNotBetween(String value1, String value2) {
            addCriterion("SOCIAL_NO not between", value1, value2, "socialNo");
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

        public Criteria andApplyUnitIsNull() {
            addCriterion("APPLY_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andApplyUnitIsNotNull() {
            addCriterion("APPLY_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUnitEqualTo(String value) {
            addCriterion("APPLY_UNIT =", value, "applyUnit");
            return (Criteria) this;
        }

        public Criteria andApplyUnitNotEqualTo(String value) {
            addCriterion("APPLY_UNIT <>", value, "applyUnit");
            return (Criteria) this;
        }

        public Criteria andApplyUnitGreaterThan(String value) {
            addCriterion("APPLY_UNIT >", value, "applyUnit");
            return (Criteria) this;
        }

        public Criteria andApplyUnitGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_UNIT >=", value, "applyUnit");
            return (Criteria) this;
        }

        public Criteria andApplyUnitLessThan(String value) {
            addCriterion("APPLY_UNIT <", value, "applyUnit");
            return (Criteria) this;
        }

        public Criteria andApplyUnitLessThanOrEqualTo(String value) {
            addCriterion("APPLY_UNIT <=", value, "applyUnit");
            return (Criteria) this;
        }

        public Criteria andApplyUnitLike(String value) {
            addCriterion("APPLY_UNIT like", value, "applyUnit");
            return (Criteria) this;
        }

        public Criteria andApplyUnitNotLike(String value) {
            addCriterion("APPLY_UNIT not like", value, "applyUnit");
            return (Criteria) this;
        }

        public Criteria andApplyUnitIn(List<String> values) {
            addCriterion("APPLY_UNIT in", values, "applyUnit");
            return (Criteria) this;
        }

        public Criteria andApplyUnitNotIn(List<String> values) {
            addCriterion("APPLY_UNIT not in", values, "applyUnit");
            return (Criteria) this;
        }

        public Criteria andApplyUnitBetween(String value1, String value2) {
            addCriterion("APPLY_UNIT between", value1, value2, "applyUnit");
            return (Criteria) this;
        }

        public Criteria andApplyUnitNotBetween(String value1, String value2) {
            addCriterion("APPLY_UNIT not between", value1, value2, "applyUnit");
            return (Criteria) this;
        }

        public Criteria andApplyDeptIsNull() {
            addCriterion("APPLY_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andApplyDeptIsNotNull() {
            addCriterion("APPLY_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDeptEqualTo(String value) {
            addCriterion("APPLY_DEPT =", value, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptNotEqualTo(String value) {
            addCriterion("APPLY_DEPT <>", value, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptGreaterThan(String value) {
            addCriterion("APPLY_DEPT >", value, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_DEPT >=", value, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptLessThan(String value) {
            addCriterion("APPLY_DEPT <", value, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptLessThanOrEqualTo(String value) {
            addCriterion("APPLY_DEPT <=", value, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptLike(String value) {
            addCriterion("APPLY_DEPT like", value, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptNotLike(String value) {
            addCriterion("APPLY_DEPT not like", value, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptIn(List<String> values) {
            addCriterion("APPLY_DEPT in", values, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptNotIn(List<String> values) {
            addCriterion("APPLY_DEPT not in", values, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptBetween(String value1, String value2) {
            addCriterion("APPLY_DEPT between", value1, value2, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyDeptNotBetween(String value1, String value2) {
            addCriterion("APPLY_DEPT not between", value1, value2, "applyDept");
            return (Criteria) this;
        }

        public Criteria andApplyPostIsNull() {
            addCriterion("APPLY_POST is null");
            return (Criteria) this;
        }

        public Criteria andApplyPostIsNotNull() {
            addCriterion("APPLY_POST is not null");
            return (Criteria) this;
        }

        public Criteria andApplyPostEqualTo(String value) {
            addCriterion("APPLY_POST =", value, "applyPost");
            return (Criteria) this;
        }

        public Criteria andApplyPostNotEqualTo(String value) {
            addCriterion("APPLY_POST <>", value, "applyPost");
            return (Criteria) this;
        }

        public Criteria andApplyPostGreaterThan(String value) {
            addCriterion("APPLY_POST >", value, "applyPost");
            return (Criteria) this;
        }

        public Criteria andApplyPostGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_POST >=", value, "applyPost");
            return (Criteria) this;
        }

        public Criteria andApplyPostLessThan(String value) {
            addCriterion("APPLY_POST <", value, "applyPost");
            return (Criteria) this;
        }

        public Criteria andApplyPostLessThanOrEqualTo(String value) {
            addCriterion("APPLY_POST <=", value, "applyPost");
            return (Criteria) this;
        }

        public Criteria andApplyPostLike(String value) {
            addCriterion("APPLY_POST like", value, "applyPost");
            return (Criteria) this;
        }

        public Criteria andApplyPostNotLike(String value) {
            addCriterion("APPLY_POST not like", value, "applyPost");
            return (Criteria) this;
        }

        public Criteria andApplyPostIn(List<String> values) {
            addCriterion("APPLY_POST in", values, "applyPost");
            return (Criteria) this;
        }

        public Criteria andApplyPostNotIn(List<String> values) {
            addCriterion("APPLY_POST not in", values, "applyPost");
            return (Criteria) this;
        }

        public Criteria andApplyPostBetween(String value1, String value2) {
            addCriterion("APPLY_POST between", value1, value2, "applyPost");
            return (Criteria) this;
        }

        public Criteria andApplyPostNotBetween(String value1, String value2) {
            addCriterion("APPLY_POST not between", value1, value2, "applyPost");
            return (Criteria) this;
        }

        public Criteria andApplyDePostIsNull() {
            addCriterion("APPLY_DE_POST is null");
            return (Criteria) this;
        }

        public Criteria andApplyDePostIsNotNull() {
            addCriterion("APPLY_DE_POST is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDePostEqualTo(String value) {
            addCriterion("APPLY_DE_POST =", value, "applyDePost");
            return (Criteria) this;
        }

        public Criteria andApplyDePostNotEqualTo(String value) {
            addCriterion("APPLY_DE_POST <>", value, "applyDePost");
            return (Criteria) this;
        }

        public Criteria andApplyDePostGreaterThan(String value) {
            addCriterion("APPLY_DE_POST >", value, "applyDePost");
            return (Criteria) this;
        }

        public Criteria andApplyDePostGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_DE_POST >=", value, "applyDePost");
            return (Criteria) this;
        }

        public Criteria andApplyDePostLessThan(String value) {
            addCriterion("APPLY_DE_POST <", value, "applyDePost");
            return (Criteria) this;
        }

        public Criteria andApplyDePostLessThanOrEqualTo(String value) {
            addCriterion("APPLY_DE_POST <=", value, "applyDePost");
            return (Criteria) this;
        }

        public Criteria andApplyDePostLike(String value) {
            addCriterion("APPLY_DE_POST like", value, "applyDePost");
            return (Criteria) this;
        }

        public Criteria andApplyDePostNotLike(String value) {
            addCriterion("APPLY_DE_POST not like", value, "applyDePost");
            return (Criteria) this;
        }

        public Criteria andApplyDePostIn(List<String> values) {
            addCriterion("APPLY_DE_POST in", values, "applyDePost");
            return (Criteria) this;
        }

        public Criteria andApplyDePostNotIn(List<String> values) {
            addCriterion("APPLY_DE_POST not in", values, "applyDePost");
            return (Criteria) this;
        }

        public Criteria andApplyDePostBetween(String value1, String value2) {
            addCriterion("APPLY_DE_POST between", value1, value2, "applyDePost");
            return (Criteria) this;
        }

        public Criteria andApplyDePostNotBetween(String value1, String value2) {
            addCriterion("APPLY_DE_POST not between", value1, value2, "applyDePost");
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

        public Criteria andPenGrageIsNull() {
            addCriterion("PEN_GRAGE is null");
            return (Criteria) this;
        }

        public Criteria andPenGrageIsNotNull() {
            addCriterion("PEN_GRAGE is not null");
            return (Criteria) this;
        }

        public Criteria andPenGrageEqualTo(String value) {
            addCriterion("PEN_GRAGE =", value, "penGrage");
            return (Criteria) this;
        }

        public Criteria andPenGrageNotEqualTo(String value) {
            addCriterion("PEN_GRAGE <>", value, "penGrage");
            return (Criteria) this;
        }

        public Criteria andPenGrageGreaterThan(String value) {
            addCriterion("PEN_GRAGE >", value, "penGrage");
            return (Criteria) this;
        }

        public Criteria andPenGrageGreaterThanOrEqualTo(String value) {
            addCriterion("PEN_GRAGE >=", value, "penGrage");
            return (Criteria) this;
        }

        public Criteria andPenGrageLessThan(String value) {
            addCriterion("PEN_GRAGE <", value, "penGrage");
            return (Criteria) this;
        }

        public Criteria andPenGrageLessThanOrEqualTo(String value) {
            addCriterion("PEN_GRAGE <=", value, "penGrage");
            return (Criteria) this;
        }

        public Criteria andPenGrageLike(String value) {
            addCriterion("PEN_GRAGE like", value, "penGrage");
            return (Criteria) this;
        }

        public Criteria andPenGrageNotLike(String value) {
            addCriterion("PEN_GRAGE not like", value, "penGrage");
            return (Criteria) this;
        }

        public Criteria andPenGrageIn(List<String> values) {
            addCriterion("PEN_GRAGE in", values, "penGrage");
            return (Criteria) this;
        }

        public Criteria andPenGrageNotIn(List<String> values) {
            addCriterion("PEN_GRAGE not in", values, "penGrage");
            return (Criteria) this;
        }

        public Criteria andPenGrageBetween(String value1, String value2) {
            addCriterion("PEN_GRAGE between", value1, value2, "penGrage");
            return (Criteria) this;
        }

        public Criteria andPenGrageNotBetween(String value1, String value2) {
            addCriterion("PEN_GRAGE not between", value1, value2, "penGrage");
            return (Criteria) this;
        }

        public Criteria andFaceGradeIsNull() {
            addCriterion("FACE_GRADE is null");
            return (Criteria) this;
        }

        public Criteria andFaceGradeIsNotNull() {
            addCriterion("FACE_GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andFaceGradeEqualTo(String value) {
            addCriterion("FACE_GRADE =", value, "faceGrade");
            return (Criteria) this;
        }

        public Criteria andFaceGradeNotEqualTo(String value) {
            addCriterion("FACE_GRADE <>", value, "faceGrade");
            return (Criteria) this;
        }

        public Criteria andFaceGradeGreaterThan(String value) {
            addCriterion("FACE_GRADE >", value, "faceGrade");
            return (Criteria) this;
        }

        public Criteria andFaceGradeGreaterThanOrEqualTo(String value) {
            addCriterion("FACE_GRADE >=", value, "faceGrade");
            return (Criteria) this;
        }

        public Criteria andFaceGradeLessThan(String value) {
            addCriterion("FACE_GRADE <", value, "faceGrade");
            return (Criteria) this;
        }

        public Criteria andFaceGradeLessThanOrEqualTo(String value) {
            addCriterion("FACE_GRADE <=", value, "faceGrade");
            return (Criteria) this;
        }

        public Criteria andFaceGradeLike(String value) {
            addCriterion("FACE_GRADE like", value, "faceGrade");
            return (Criteria) this;
        }

        public Criteria andFaceGradeNotLike(String value) {
            addCriterion("FACE_GRADE not like", value, "faceGrade");
            return (Criteria) this;
        }

        public Criteria andFaceGradeIn(List<String> values) {
            addCriterion("FACE_GRADE in", values, "faceGrade");
            return (Criteria) this;
        }

        public Criteria andFaceGradeNotIn(List<String> values) {
            addCriterion("FACE_GRADE not in", values, "faceGrade");
            return (Criteria) this;
        }

        public Criteria andFaceGradeBetween(String value1, String value2) {
            addCriterion("FACE_GRADE between", value1, value2, "faceGrade");
            return (Criteria) this;
        }

        public Criteria andFaceGradeNotBetween(String value1, String value2) {
            addCriterion("FACE_GRADE not between", value1, value2, "faceGrade");
            return (Criteria) this;
        }

        public Criteria andPlanUnitIsNull() {
            addCriterion("PLAN_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andPlanUnitIsNotNull() {
            addCriterion("PLAN_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andPlanUnitEqualTo(String value) {
            addCriterion("PLAN_UNIT =", value, "planUnit");
            return (Criteria) this;
        }

        public Criteria andPlanUnitNotEqualTo(String value) {
            addCriterion("PLAN_UNIT <>", value, "planUnit");
            return (Criteria) this;
        }

        public Criteria andPlanUnitGreaterThan(String value) {
            addCriterion("PLAN_UNIT >", value, "planUnit");
            return (Criteria) this;
        }

        public Criteria andPlanUnitGreaterThanOrEqualTo(String value) {
            addCriterion("PLAN_UNIT >=", value, "planUnit");
            return (Criteria) this;
        }

        public Criteria andPlanUnitLessThan(String value) {
            addCriterion("PLAN_UNIT <", value, "planUnit");
            return (Criteria) this;
        }

        public Criteria andPlanUnitLessThanOrEqualTo(String value) {
            addCriterion("PLAN_UNIT <=", value, "planUnit");
            return (Criteria) this;
        }

        public Criteria andPlanUnitLike(String value) {
            addCriterion("PLAN_UNIT like", value, "planUnit");
            return (Criteria) this;
        }

        public Criteria andPlanUnitNotLike(String value) {
            addCriterion("PLAN_UNIT not like", value, "planUnit");
            return (Criteria) this;
        }

        public Criteria andPlanUnitIn(List<String> values) {
            addCriterion("PLAN_UNIT in", values, "planUnit");
            return (Criteria) this;
        }

        public Criteria andPlanUnitNotIn(List<String> values) {
            addCriterion("PLAN_UNIT not in", values, "planUnit");
            return (Criteria) this;
        }

        public Criteria andPlanUnitBetween(String value1, String value2) {
            addCriterion("PLAN_UNIT between", value1, value2, "planUnit");
            return (Criteria) this;
        }

        public Criteria andPlanUnitNotBetween(String value1, String value2) {
            addCriterion("PLAN_UNIT not between", value1, value2, "planUnit");
            return (Criteria) this;
        }

        public Criteria andPlanDeptIsNull() {
            addCriterion("PLAN_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andPlanDeptIsNotNull() {
            addCriterion("PLAN_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andPlanDeptEqualTo(String value) {
            addCriterion("PLAN_DEPT =", value, "planDept");
            return (Criteria) this;
        }

        public Criteria andPlanDeptNotEqualTo(String value) {
            addCriterion("PLAN_DEPT <>", value, "planDept");
            return (Criteria) this;
        }

        public Criteria andPlanDeptGreaterThan(String value) {
            addCriterion("PLAN_DEPT >", value, "planDept");
            return (Criteria) this;
        }

        public Criteria andPlanDeptGreaterThanOrEqualTo(String value) {
            addCriterion("PLAN_DEPT >=", value, "planDept");
            return (Criteria) this;
        }

        public Criteria andPlanDeptLessThan(String value) {
            addCriterion("PLAN_DEPT <", value, "planDept");
            return (Criteria) this;
        }

        public Criteria andPlanDeptLessThanOrEqualTo(String value) {
            addCriterion("PLAN_DEPT <=", value, "planDept");
            return (Criteria) this;
        }

        public Criteria andPlanDeptLike(String value) {
            addCriterion("PLAN_DEPT like", value, "planDept");
            return (Criteria) this;
        }

        public Criteria andPlanDeptNotLike(String value) {
            addCriterion("PLAN_DEPT not like", value, "planDept");
            return (Criteria) this;
        }

        public Criteria andPlanDeptIn(List<String> values) {
            addCriterion("PLAN_DEPT in", values, "planDept");
            return (Criteria) this;
        }

        public Criteria andPlanDeptNotIn(List<String> values) {
            addCriterion("PLAN_DEPT not in", values, "planDept");
            return (Criteria) this;
        }

        public Criteria andPlanDeptBetween(String value1, String value2) {
            addCriterion("PLAN_DEPT between", value1, value2, "planDept");
            return (Criteria) this;
        }

        public Criteria andPlanDeptNotBetween(String value1, String value2) {
            addCriterion("PLAN_DEPT not between", value1, value2, "planDept");
            return (Criteria) this;
        }

        public Criteria andPlanPostIsNull() {
            addCriterion("PLAN_POST is null");
            return (Criteria) this;
        }

        public Criteria andPlanPostIsNotNull() {
            addCriterion("PLAN_POST is not null");
            return (Criteria) this;
        }

        public Criteria andPlanPostEqualTo(String value) {
            addCriterion("PLAN_POST =", value, "planPost");
            return (Criteria) this;
        }

        public Criteria andPlanPostNotEqualTo(String value) {
            addCriterion("PLAN_POST <>", value, "planPost");
            return (Criteria) this;
        }

        public Criteria andPlanPostGreaterThan(String value) {
            addCriterion("PLAN_POST >", value, "planPost");
            return (Criteria) this;
        }

        public Criteria andPlanPostGreaterThanOrEqualTo(String value) {
            addCriterion("PLAN_POST >=", value, "planPost");
            return (Criteria) this;
        }

        public Criteria andPlanPostLessThan(String value) {
            addCriterion("PLAN_POST <", value, "planPost");
            return (Criteria) this;
        }

        public Criteria andPlanPostLessThanOrEqualTo(String value) {
            addCriterion("PLAN_POST <=", value, "planPost");
            return (Criteria) this;
        }

        public Criteria andPlanPostLike(String value) {
            addCriterion("PLAN_POST like", value, "planPost");
            return (Criteria) this;
        }

        public Criteria andPlanPostNotLike(String value) {
            addCriterion("PLAN_POST not like", value, "planPost");
            return (Criteria) this;
        }

        public Criteria andPlanPostIn(List<String> values) {
            addCriterion("PLAN_POST in", values, "planPost");
            return (Criteria) this;
        }

        public Criteria andPlanPostNotIn(List<String> values) {
            addCriterion("PLAN_POST not in", values, "planPost");
            return (Criteria) this;
        }

        public Criteria andPlanPostBetween(String value1, String value2) {
            addCriterion("PLAN_POST between", value1, value2, "planPost");
            return (Criteria) this;
        }

        public Criteria andPlanPostNotBetween(String value1, String value2) {
            addCriterion("PLAN_POST not between", value1, value2, "planPost");
            return (Criteria) this;
        }

        public Criteria andApplyUnitCodeIsNull() {
            addCriterion("APPLY_UNIT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andApplyUnitCodeIsNotNull() {
            addCriterion("APPLY_UNIT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUnitCodeEqualTo(String value) {
            addCriterion("APPLY_UNIT_CODE =", value, "applyUnitCode");
            return (Criteria) this;
        }

        public Criteria andApplyUnitCodeNotEqualTo(String value) {
            addCriterion("APPLY_UNIT_CODE <>", value, "applyUnitCode");
            return (Criteria) this;
        }

        public Criteria andApplyUnitCodeGreaterThan(String value) {
            addCriterion("APPLY_UNIT_CODE >", value, "applyUnitCode");
            return (Criteria) this;
        }

        public Criteria andApplyUnitCodeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_UNIT_CODE >=", value, "applyUnitCode");
            return (Criteria) this;
        }

        public Criteria andApplyUnitCodeLessThan(String value) {
            addCriterion("APPLY_UNIT_CODE <", value, "applyUnitCode");
            return (Criteria) this;
        }

        public Criteria andApplyUnitCodeLessThanOrEqualTo(String value) {
            addCriterion("APPLY_UNIT_CODE <=", value, "applyUnitCode");
            return (Criteria) this;
        }

        public Criteria andApplyUnitCodeLike(String value) {
            addCriterion("APPLY_UNIT_CODE like", value, "applyUnitCode");
            return (Criteria) this;
        }

        public Criteria andApplyUnitCodeNotLike(String value) {
            addCriterion("APPLY_UNIT_CODE not like", value, "applyUnitCode");
            return (Criteria) this;
        }

        public Criteria andApplyUnitCodeIn(List<String> values) {
            addCriterion("APPLY_UNIT_CODE in", values, "applyUnitCode");
            return (Criteria) this;
        }

        public Criteria andApplyUnitCodeNotIn(List<String> values) {
            addCriterion("APPLY_UNIT_CODE not in", values, "applyUnitCode");
            return (Criteria) this;
        }

        public Criteria andApplyUnitCodeBetween(String value1, String value2) {
            addCriterion("APPLY_UNIT_CODE between", value1, value2, "applyUnitCode");
            return (Criteria) this;
        }

        public Criteria andApplyUnitCodeNotBetween(String value1, String value2) {
            addCriterion("APPLY_UNIT_CODE not between", value1, value2, "applyUnitCode");
            return (Criteria) this;
        }

        public Criteria andPlanUnitCodeIsNull() {
            addCriterion("PLAN_UNIT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPlanUnitCodeIsNotNull() {
            addCriterion("PLAN_UNIT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPlanUnitCodeEqualTo(String value) {
            addCriterion("PLAN_UNIT_CODE =", value, "planUnitCode");
            return (Criteria) this;
        }

        public Criteria andPlanUnitCodeNotEqualTo(String value) {
            addCriterion("PLAN_UNIT_CODE <>", value, "planUnitCode");
            return (Criteria) this;
        }

        public Criteria andPlanUnitCodeGreaterThan(String value) {
            addCriterion("PLAN_UNIT_CODE >", value, "planUnitCode");
            return (Criteria) this;
        }

        public Criteria andPlanUnitCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PLAN_UNIT_CODE >=", value, "planUnitCode");
            return (Criteria) this;
        }

        public Criteria andPlanUnitCodeLessThan(String value) {
            addCriterion("PLAN_UNIT_CODE <", value, "planUnitCode");
            return (Criteria) this;
        }

        public Criteria andPlanUnitCodeLessThanOrEqualTo(String value) {
            addCriterion("PLAN_UNIT_CODE <=", value, "planUnitCode");
            return (Criteria) this;
        }

        public Criteria andPlanUnitCodeLike(String value) {
            addCriterion("PLAN_UNIT_CODE like", value, "planUnitCode");
            return (Criteria) this;
        }

        public Criteria andPlanUnitCodeNotLike(String value) {
            addCriterion("PLAN_UNIT_CODE not like", value, "planUnitCode");
            return (Criteria) this;
        }

        public Criteria andPlanUnitCodeIn(List<String> values) {
            addCriterion("PLAN_UNIT_CODE in", values, "planUnitCode");
            return (Criteria) this;
        }

        public Criteria andPlanUnitCodeNotIn(List<String> values) {
            addCriterion("PLAN_UNIT_CODE not in", values, "planUnitCode");
            return (Criteria) this;
        }

        public Criteria andPlanUnitCodeBetween(String value1, String value2) {
            addCriterion("PLAN_UNIT_CODE between", value1, value2, "planUnitCode");
            return (Criteria) this;
        }

        public Criteria andPlanUnitCodeNotBetween(String value1, String value2) {
            addCriterion("PLAN_UNIT_CODE not between", value1, value2, "planUnitCode");
            return (Criteria) this;
        }

        public Criteria andApplyPostCodeIsNull() {
            addCriterion("APPLY_POST_CODE is null");
            return (Criteria) this;
        }

        public Criteria andApplyPostCodeIsNotNull() {
            addCriterion("APPLY_POST_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyPostCodeEqualTo(String value) {
            addCriterion("APPLY_POST_CODE =", value, "applyPostCode");
            return (Criteria) this;
        }

        public Criteria andApplyPostCodeNotEqualTo(String value) {
            addCriterion("APPLY_POST_CODE <>", value, "applyPostCode");
            return (Criteria) this;
        }

        public Criteria andApplyPostCodeGreaterThan(String value) {
            addCriterion("APPLY_POST_CODE >", value, "applyPostCode");
            return (Criteria) this;
        }

        public Criteria andApplyPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_POST_CODE >=", value, "applyPostCode");
            return (Criteria) this;
        }

        public Criteria andApplyPostCodeLessThan(String value) {
            addCriterion("APPLY_POST_CODE <", value, "applyPostCode");
            return (Criteria) this;
        }

        public Criteria andApplyPostCodeLessThanOrEqualTo(String value) {
            addCriterion("APPLY_POST_CODE <=", value, "applyPostCode");
            return (Criteria) this;
        }

        public Criteria andApplyPostCodeLike(String value) {
            addCriterion("APPLY_POST_CODE like", value, "applyPostCode");
            return (Criteria) this;
        }

        public Criteria andApplyPostCodeNotLike(String value) {
            addCriterion("APPLY_POST_CODE not like", value, "applyPostCode");
            return (Criteria) this;
        }

        public Criteria andApplyPostCodeIn(List<String> values) {
            addCriterion("APPLY_POST_CODE in", values, "applyPostCode");
            return (Criteria) this;
        }

        public Criteria andApplyPostCodeNotIn(List<String> values) {
            addCriterion("APPLY_POST_CODE not in", values, "applyPostCode");
            return (Criteria) this;
        }

        public Criteria andApplyPostCodeBetween(String value1, String value2) {
            addCriterion("APPLY_POST_CODE between", value1, value2, "applyPostCode");
            return (Criteria) this;
        }

        public Criteria andApplyPostCodeNotBetween(String value1, String value2) {
            addCriterion("APPLY_POST_CODE not between", value1, value2, "applyPostCode");
            return (Criteria) this;
        }

        public Criteria andPlanPostCodeIsNull() {
            addCriterion("PLAN_POST_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPlanPostCodeIsNotNull() {
            addCriterion("PLAN_POST_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPlanPostCodeEqualTo(String value) {
            addCriterion("PLAN_POST_CODE =", value, "planPostCode");
            return (Criteria) this;
        }

        public Criteria andPlanPostCodeNotEqualTo(String value) {
            addCriterion("PLAN_POST_CODE <>", value, "planPostCode");
            return (Criteria) this;
        }

        public Criteria andPlanPostCodeGreaterThan(String value) {
            addCriterion("PLAN_POST_CODE >", value, "planPostCode");
            return (Criteria) this;
        }

        public Criteria andPlanPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PLAN_POST_CODE >=", value, "planPostCode");
            return (Criteria) this;
        }

        public Criteria andPlanPostCodeLessThan(String value) {
            addCriterion("PLAN_POST_CODE <", value, "planPostCode");
            return (Criteria) this;
        }

        public Criteria andPlanPostCodeLessThanOrEqualTo(String value) {
            addCriterion("PLAN_POST_CODE <=", value, "planPostCode");
            return (Criteria) this;
        }

        public Criteria andPlanPostCodeLike(String value) {
            addCriterion("PLAN_POST_CODE like", value, "planPostCode");
            return (Criteria) this;
        }

        public Criteria andPlanPostCodeNotLike(String value) {
            addCriterion("PLAN_POST_CODE not like", value, "planPostCode");
            return (Criteria) this;
        }

        public Criteria andPlanPostCodeIn(List<String> values) {
            addCriterion("PLAN_POST_CODE in", values, "planPostCode");
            return (Criteria) this;
        }

        public Criteria andPlanPostCodeNotIn(List<String> values) {
            addCriterion("PLAN_POST_CODE not in", values, "planPostCode");
            return (Criteria) this;
        }

        public Criteria andPlanPostCodeBetween(String value1, String value2) {
            addCriterion("PLAN_POST_CODE between", value1, value2, "planPostCode");
            return (Criteria) this;
        }

        public Criteria andPlanPostCodeNotBetween(String value1, String value2) {
            addCriterion("PLAN_POST_CODE not between", value1, value2, "planPostCode");
            return (Criteria) this;
        }

        public Criteria andApplyDeptCodeIsNull() {
            addCriterion("APPLY_DEPT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andApplyDeptCodeIsNotNull() {
            addCriterion("APPLY_DEPT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDeptCodeEqualTo(String value) {
            addCriterion("APPLY_DEPT_CODE =", value, "applyDeptCode");
            return (Criteria) this;
        }

        public Criteria andApplyDeptCodeNotEqualTo(String value) {
            addCriterion("APPLY_DEPT_CODE <>", value, "applyDeptCode");
            return (Criteria) this;
        }

        public Criteria andApplyDeptCodeGreaterThan(String value) {
            addCriterion("APPLY_DEPT_CODE >", value, "applyDeptCode");
            return (Criteria) this;
        }

        public Criteria andApplyDeptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_DEPT_CODE >=", value, "applyDeptCode");
            return (Criteria) this;
        }

        public Criteria andApplyDeptCodeLessThan(String value) {
            addCriterion("APPLY_DEPT_CODE <", value, "applyDeptCode");
            return (Criteria) this;
        }

        public Criteria andApplyDeptCodeLessThanOrEqualTo(String value) {
            addCriterion("APPLY_DEPT_CODE <=", value, "applyDeptCode");
            return (Criteria) this;
        }

        public Criteria andApplyDeptCodeLike(String value) {
            addCriterion("APPLY_DEPT_CODE like", value, "applyDeptCode");
            return (Criteria) this;
        }

        public Criteria andApplyDeptCodeNotLike(String value) {
            addCriterion("APPLY_DEPT_CODE not like", value, "applyDeptCode");
            return (Criteria) this;
        }

        public Criteria andApplyDeptCodeIn(List<String> values) {
            addCriterion("APPLY_DEPT_CODE in", values, "applyDeptCode");
            return (Criteria) this;
        }

        public Criteria andApplyDeptCodeNotIn(List<String> values) {
            addCriterion("APPLY_DEPT_CODE not in", values, "applyDeptCode");
            return (Criteria) this;
        }

        public Criteria andApplyDeptCodeBetween(String value1, String value2) {
            addCriterion("APPLY_DEPT_CODE between", value1, value2, "applyDeptCode");
            return (Criteria) this;
        }

        public Criteria andApplyDeptCodeNotBetween(String value1, String value2) {
            addCriterion("APPLY_DEPT_CODE not between", value1, value2, "applyDeptCode");
            return (Criteria) this;
        }

        public Criteria andPlanDeptCodeIsNull() {
            addCriterion("PLAN_DEPT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPlanDeptCodeIsNotNull() {
            addCriterion("PLAN_DEPT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPlanDeptCodeEqualTo(String value) {
            addCriterion("PLAN_DEPT_CODE =", value, "planDeptCode");
            return (Criteria) this;
        }

        public Criteria andPlanDeptCodeNotEqualTo(String value) {
            addCriterion("PLAN_DEPT_CODE <>", value, "planDeptCode");
            return (Criteria) this;
        }

        public Criteria andPlanDeptCodeGreaterThan(String value) {
            addCriterion("PLAN_DEPT_CODE >", value, "planDeptCode");
            return (Criteria) this;
        }

        public Criteria andPlanDeptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PLAN_DEPT_CODE >=", value, "planDeptCode");
            return (Criteria) this;
        }

        public Criteria andPlanDeptCodeLessThan(String value) {
            addCriterion("PLAN_DEPT_CODE <", value, "planDeptCode");
            return (Criteria) this;
        }

        public Criteria andPlanDeptCodeLessThanOrEqualTo(String value) {
            addCriterion("PLAN_DEPT_CODE <=", value, "planDeptCode");
            return (Criteria) this;
        }

        public Criteria andPlanDeptCodeLike(String value) {
            addCriterion("PLAN_DEPT_CODE like", value, "planDeptCode");
            return (Criteria) this;
        }

        public Criteria andPlanDeptCodeNotLike(String value) {
            addCriterion("PLAN_DEPT_CODE not like", value, "planDeptCode");
            return (Criteria) this;
        }

        public Criteria andPlanDeptCodeIn(List<String> values) {
            addCriterion("PLAN_DEPT_CODE in", values, "planDeptCode");
            return (Criteria) this;
        }

        public Criteria andPlanDeptCodeNotIn(List<String> values) {
            addCriterion("PLAN_DEPT_CODE not in", values, "planDeptCode");
            return (Criteria) this;
        }

        public Criteria andPlanDeptCodeBetween(String value1, String value2) {
            addCriterion("PLAN_DEPT_CODE between", value1, value2, "planDeptCode");
            return (Criteria) this;
        }

        public Criteria andPlanDeptCodeNotBetween(String value1, String value2) {
            addCriterion("PLAN_DEPT_CODE not between", value1, value2, "planDeptCode");
            return (Criteria) this;
        }

        public Criteria andApplyDutyCodeIsNull() {
            addCriterion("APPLY_DUTY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andApplyDutyCodeIsNotNull() {
            addCriterion("APPLY_DUTY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDutyCodeEqualTo(String value) {
            addCriterion("APPLY_DUTY_CODE =", value, "applyDutyCode");
            return (Criteria) this;
        }

        public Criteria andApplyDutyCodeNotEqualTo(String value) {
            addCriterion("APPLY_DUTY_CODE <>", value, "applyDutyCode");
            return (Criteria) this;
        }

        public Criteria andApplyDutyCodeGreaterThan(String value) {
            addCriterion("APPLY_DUTY_CODE >", value, "applyDutyCode");
            return (Criteria) this;
        }

        public Criteria andApplyDutyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_DUTY_CODE >=", value, "applyDutyCode");
            return (Criteria) this;
        }

        public Criteria andApplyDutyCodeLessThan(String value) {
            addCriterion("APPLY_DUTY_CODE <", value, "applyDutyCode");
            return (Criteria) this;
        }

        public Criteria andApplyDutyCodeLessThanOrEqualTo(String value) {
            addCriterion("APPLY_DUTY_CODE <=", value, "applyDutyCode");
            return (Criteria) this;
        }

        public Criteria andApplyDutyCodeLike(String value) {
            addCriterion("APPLY_DUTY_CODE like", value, "applyDutyCode");
            return (Criteria) this;
        }

        public Criteria andApplyDutyCodeNotLike(String value) {
            addCriterion("APPLY_DUTY_CODE not like", value, "applyDutyCode");
            return (Criteria) this;
        }

        public Criteria andApplyDutyCodeIn(List<String> values) {
            addCriterion("APPLY_DUTY_CODE in", values, "applyDutyCode");
            return (Criteria) this;
        }

        public Criteria andApplyDutyCodeNotIn(List<String> values) {
            addCriterion("APPLY_DUTY_CODE not in", values, "applyDutyCode");
            return (Criteria) this;
        }

        public Criteria andApplyDutyCodeBetween(String value1, String value2) {
            addCriterion("APPLY_DUTY_CODE between", value1, value2, "applyDutyCode");
            return (Criteria) this;
        }

        public Criteria andApplyDutyCodeNotBetween(String value1, String value2) {
            addCriterion("APPLY_DUTY_CODE not between", value1, value2, "applyDutyCode");
            return (Criteria) this;
        }

        public Criteria andApplyDutyIsNull() {
            addCriterion("APPLY_DUTY is null");
            return (Criteria) this;
        }

        public Criteria andApplyDutyIsNotNull() {
            addCriterion("APPLY_DUTY is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDutyEqualTo(String value) {
            addCriterion("APPLY_DUTY =", value, "applyDuty");
            return (Criteria) this;
        }

        public Criteria andApplyDutyNotEqualTo(String value) {
            addCriterion("APPLY_DUTY <>", value, "applyDuty");
            return (Criteria) this;
        }

        public Criteria andApplyDutyGreaterThan(String value) {
            addCriterion("APPLY_DUTY >", value, "applyDuty");
            return (Criteria) this;
        }

        public Criteria andApplyDutyGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_DUTY >=", value, "applyDuty");
            return (Criteria) this;
        }

        public Criteria andApplyDutyLessThan(String value) {
            addCriterion("APPLY_DUTY <", value, "applyDuty");
            return (Criteria) this;
        }

        public Criteria andApplyDutyLessThanOrEqualTo(String value) {
            addCriterion("APPLY_DUTY <=", value, "applyDuty");
            return (Criteria) this;
        }

        public Criteria andApplyDutyLike(String value) {
            addCriterion("APPLY_DUTY like", value, "applyDuty");
            return (Criteria) this;
        }

        public Criteria andApplyDutyNotLike(String value) {
            addCriterion("APPLY_DUTY not like", value, "applyDuty");
            return (Criteria) this;
        }

        public Criteria andApplyDutyIn(List<String> values) {
            addCriterion("APPLY_DUTY in", values, "applyDuty");
            return (Criteria) this;
        }

        public Criteria andApplyDutyNotIn(List<String> values) {
            addCriterion("APPLY_DUTY not in", values, "applyDuty");
            return (Criteria) this;
        }

        public Criteria andApplyDutyBetween(String value1, String value2) {
            addCriterion("APPLY_DUTY between", value1, value2, "applyDuty");
            return (Criteria) this;
        }

        public Criteria andApplyDutyNotBetween(String value1, String value2) {
            addCriterion("APPLY_DUTY not between", value1, value2, "applyDuty");
            return (Criteria) this;
        }

        public Criteria andPlanDutyCodeIsNull() {
            addCriterion("PLAN_DUTY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPlanDutyCodeIsNotNull() {
            addCriterion("PLAN_DUTY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPlanDutyCodeEqualTo(String value) {
            addCriterion("PLAN_DUTY_CODE =", value, "planDutyCode");
            return (Criteria) this;
        }

        public Criteria andPlanDutyCodeNotEqualTo(String value) {
            addCriterion("PLAN_DUTY_CODE <>", value, "planDutyCode");
            return (Criteria) this;
        }

        public Criteria andPlanDutyCodeGreaterThan(String value) {
            addCriterion("PLAN_DUTY_CODE >", value, "planDutyCode");
            return (Criteria) this;
        }

        public Criteria andPlanDutyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PLAN_DUTY_CODE >=", value, "planDutyCode");
            return (Criteria) this;
        }

        public Criteria andPlanDutyCodeLessThan(String value) {
            addCriterion("PLAN_DUTY_CODE <", value, "planDutyCode");
            return (Criteria) this;
        }

        public Criteria andPlanDutyCodeLessThanOrEqualTo(String value) {
            addCriterion("PLAN_DUTY_CODE <=", value, "planDutyCode");
            return (Criteria) this;
        }

        public Criteria andPlanDutyCodeLike(String value) {
            addCriterion("PLAN_DUTY_CODE like", value, "planDutyCode");
            return (Criteria) this;
        }

        public Criteria andPlanDutyCodeNotLike(String value) {
            addCriterion("PLAN_DUTY_CODE not like", value, "planDutyCode");
            return (Criteria) this;
        }

        public Criteria andPlanDutyCodeIn(List<String> values) {
            addCriterion("PLAN_DUTY_CODE in", values, "planDutyCode");
            return (Criteria) this;
        }

        public Criteria andPlanDutyCodeNotIn(List<String> values) {
            addCriterion("PLAN_DUTY_CODE not in", values, "planDutyCode");
            return (Criteria) this;
        }

        public Criteria andPlanDutyCodeBetween(String value1, String value2) {
            addCriterion("PLAN_DUTY_CODE between", value1, value2, "planDutyCode");
            return (Criteria) this;
        }

        public Criteria andPlanDutyCodeNotBetween(String value1, String value2) {
            addCriterion("PLAN_DUTY_CODE not between", value1, value2, "planDutyCode");
            return (Criteria) this;
        }

        public Criteria andPlanDutyIsNull() {
            addCriterion("PLAN_DUTY is null");
            return (Criteria) this;
        }

        public Criteria andPlanDutyIsNotNull() {
            addCriterion("PLAN_DUTY is not null");
            return (Criteria) this;
        }

        public Criteria andPlanDutyEqualTo(String value) {
            addCriterion("PLAN_DUTY =", value, "planDuty");
            return (Criteria) this;
        }

        public Criteria andPlanDutyNotEqualTo(String value) {
            addCriterion("PLAN_DUTY <>", value, "planDuty");
            return (Criteria) this;
        }

        public Criteria andPlanDutyGreaterThan(String value) {
            addCriterion("PLAN_DUTY >", value, "planDuty");
            return (Criteria) this;
        }

        public Criteria andPlanDutyGreaterThanOrEqualTo(String value) {
            addCriterion("PLAN_DUTY >=", value, "planDuty");
            return (Criteria) this;
        }

        public Criteria andPlanDutyLessThan(String value) {
            addCriterion("PLAN_DUTY <", value, "planDuty");
            return (Criteria) this;
        }

        public Criteria andPlanDutyLessThanOrEqualTo(String value) {
            addCriterion("PLAN_DUTY <=", value, "planDuty");
            return (Criteria) this;
        }

        public Criteria andPlanDutyLike(String value) {
            addCriterion("PLAN_DUTY like", value, "planDuty");
            return (Criteria) this;
        }

        public Criteria andPlanDutyNotLike(String value) {
            addCriterion("PLAN_DUTY not like", value, "planDuty");
            return (Criteria) this;
        }

        public Criteria andPlanDutyIn(List<String> values) {
            addCriterion("PLAN_DUTY in", values, "planDuty");
            return (Criteria) this;
        }

        public Criteria andPlanDutyNotIn(List<String> values) {
            addCriterion("PLAN_DUTY not in", values, "planDuty");
            return (Criteria) this;
        }

        public Criteria andPlanDutyBetween(String value1, String value2) {
            addCriterion("PLAN_DUTY between", value1, value2, "planDuty");
            return (Criteria) this;
        }

        public Criteria andPlanDutyNotBetween(String value1, String value2) {
            addCriterion("PLAN_DUTY not between", value1, value2, "planDuty");
            return (Criteria) this;
        }

        public Criteria andDemPkIsNull() {
            addCriterion("DEM_PK is null");
            return (Criteria) this;
        }

        public Criteria andDemPkIsNotNull() {
            addCriterion("DEM_PK is not null");
            return (Criteria) this;
        }

        public Criteria andDemPkEqualTo(BigDecimal value) {
            addCriterion("DEM_PK =", value, "demPk");
            return (Criteria) this;
        }

        public Criteria andDemPkNotEqualTo(BigDecimal value) {
            addCriterion("DEM_PK <>", value, "demPk");
            return (Criteria) this;
        }

        public Criteria andDemPkGreaterThan(BigDecimal value) {
            addCriterion("DEM_PK >", value, "demPk");
            return (Criteria) this;
        }

        public Criteria andDemPkGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEM_PK >=", value, "demPk");
            return (Criteria) this;
        }

        public Criteria andDemPkLessThan(BigDecimal value) {
            addCriterion("DEM_PK <", value, "demPk");
            return (Criteria) this;
        }

        public Criteria andDemPkLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEM_PK <=", value, "demPk");
            return (Criteria) this;
        }

        public Criteria andDemPkIn(List<BigDecimal> values) {
            addCriterion("DEM_PK in", values, "demPk");
            return (Criteria) this;
        }

        public Criteria andDemPkNotIn(List<BigDecimal> values) {
            addCriterion("DEM_PK not in", values, "demPk");
            return (Criteria) this;
        }

        public Criteria andDemPkBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEM_PK between", value1, value2, "demPk");
            return (Criteria) this;
        }

        public Criteria andDemPkNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEM_PK not between", value1, value2, "demPk");
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

        public Criteria andIsSaleIsNull() {
            addCriterion("IS_SALE is null");
            return (Criteria) this;
        }

        public Criteria andIsSaleIsNotNull() {
            addCriterion("IS_SALE is not null");
            return (Criteria) this;
        }

        public Criteria andIsSaleEqualTo(String value) {
            addCriterion("IS_SALE =", value, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleNotEqualTo(String value) {
            addCriterion("IS_SALE <>", value, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleGreaterThan(String value) {
            addCriterion("IS_SALE >", value, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SALE >=", value, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleLessThan(String value) {
            addCriterion("IS_SALE <", value, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleLessThanOrEqualTo(String value) {
            addCriterion("IS_SALE <=", value, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleLike(String value) {
            addCriterion("IS_SALE like", value, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleNotLike(String value) {
            addCriterion("IS_SALE not like", value, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleIn(List<String> values) {
            addCriterion("IS_SALE in", values, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleNotIn(List<String> values) {
            addCriterion("IS_SALE not in", values, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleBetween(String value1, String value2) {
            addCriterion("IS_SALE between", value1, value2, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsSaleNotBetween(String value1, String value2) {
            addCriterion("IS_SALE not between", value1, value2, "isSale");
            return (Criteria) this;
        }

        public Criteria andIsLipeiIsNull() {
            addCriterion("IS_LIPEI is null");
            return (Criteria) this;
        }

        public Criteria andIsLipeiIsNotNull() {
            addCriterion("IS_LIPEI is not null");
            return (Criteria) this;
        }

        public Criteria andIsLipeiEqualTo(String value) {
            addCriterion("IS_LIPEI =", value, "isLipei");
            return (Criteria) this;
        }

        public Criteria andIsLipeiNotEqualTo(String value) {
            addCriterion("IS_LIPEI <>", value, "isLipei");
            return (Criteria) this;
        }

        public Criteria andIsLipeiGreaterThan(String value) {
            addCriterion("IS_LIPEI >", value, "isLipei");
            return (Criteria) this;
        }

        public Criteria andIsLipeiGreaterThanOrEqualTo(String value) {
            addCriterion("IS_LIPEI >=", value, "isLipei");
            return (Criteria) this;
        }

        public Criteria andIsLipeiLessThan(String value) {
            addCriterion("IS_LIPEI <", value, "isLipei");
            return (Criteria) this;
        }

        public Criteria andIsLipeiLessThanOrEqualTo(String value) {
            addCriterion("IS_LIPEI <=", value, "isLipei");
            return (Criteria) this;
        }

        public Criteria andIsLipeiLike(String value) {
            addCriterion("IS_LIPEI like", value, "isLipei");
            return (Criteria) this;
        }

        public Criteria andIsLipeiNotLike(String value) {
            addCriterion("IS_LIPEI not like", value, "isLipei");
            return (Criteria) this;
        }

        public Criteria andIsLipeiIn(List<String> values) {
            addCriterion("IS_LIPEI in", values, "isLipei");
            return (Criteria) this;
        }

        public Criteria andIsLipeiNotIn(List<String> values) {
            addCriterion("IS_LIPEI not in", values, "isLipei");
            return (Criteria) this;
        }

        public Criteria andIsLipeiBetween(String value1, String value2) {
            addCriterion("IS_LIPEI between", value1, value2, "isLipei");
            return (Criteria) this;
        }

        public Criteria andIsLipeiNotBetween(String value1, String value2) {
            addCriterion("IS_LIPEI not between", value1, value2, "isLipei");
            return (Criteria) this;
        }

        public Criteria andPlanUserStyleIsNull() {
            addCriterion("PLAN_USER_STYLE is null");
            return (Criteria) this;
        }

        public Criteria andPlanUserStyleIsNotNull() {
            addCriterion("PLAN_USER_STYLE is not null");
            return (Criteria) this;
        }

        public Criteria andPlanUserStyleEqualTo(String value) {
            addCriterion("PLAN_USER_STYLE =", value, "planUserStyle");
            return (Criteria) this;
        }

        public Criteria andPlanUserStyleNotEqualTo(String value) {
            addCriterion("PLAN_USER_STYLE <>", value, "planUserStyle");
            return (Criteria) this;
        }

        public Criteria andPlanUserStyleGreaterThan(String value) {
            addCriterion("PLAN_USER_STYLE >", value, "planUserStyle");
            return (Criteria) this;
        }

        public Criteria andPlanUserStyleGreaterThanOrEqualTo(String value) {
            addCriterion("PLAN_USER_STYLE >=", value, "planUserStyle");
            return (Criteria) this;
        }

        public Criteria andPlanUserStyleLessThan(String value) {
            addCriterion("PLAN_USER_STYLE <", value, "planUserStyle");
            return (Criteria) this;
        }

        public Criteria andPlanUserStyleLessThanOrEqualTo(String value) {
            addCriterion("PLAN_USER_STYLE <=", value, "planUserStyle");
            return (Criteria) this;
        }

        public Criteria andPlanUserStyleLike(String value) {
            addCriterion("PLAN_USER_STYLE like", value, "planUserStyle");
            return (Criteria) this;
        }

        public Criteria andPlanUserStyleNotLike(String value) {
            addCriterion("PLAN_USER_STYLE not like", value, "planUserStyle");
            return (Criteria) this;
        }

        public Criteria andPlanUserStyleIn(List<String> values) {
            addCriterion("PLAN_USER_STYLE in", values, "planUserStyle");
            return (Criteria) this;
        }

        public Criteria andPlanUserStyleNotIn(List<String> values) {
            addCriterion("PLAN_USER_STYLE not in", values, "planUserStyle");
            return (Criteria) this;
        }

        public Criteria andPlanUserStyleBetween(String value1, String value2) {
            addCriterion("PLAN_USER_STYLE between", value1, value2, "planUserStyle");
            return (Criteria) this;
        }

        public Criteria andPlanUserStyleNotBetween(String value1, String value2) {
            addCriterion("PLAN_USER_STYLE not between", value1, value2, "planUserStyle");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("AGE is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("AGE is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String value) {
            addCriterion("AGE =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("AGE <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String value) {
            addCriterion("AGE >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("AGE >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String value) {
            addCriterion("AGE <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("AGE <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLike(String value) {
            addCriterion("AGE like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotLike(String value) {
            addCriterion("AGE not like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<String> values) {
            addCriterion("AGE in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("AGE not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("AGE between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("AGE not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andResumeNameIsNull() {
            addCriterion("RESUME_NAME is null");
            return (Criteria) this;
        }

        public Criteria andResumeNameIsNotNull() {
            addCriterion("RESUME_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andResumeNameEqualTo(String value) {
            addCriterion("RESUME_NAME =", value, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameNotEqualTo(String value) {
            addCriterion("RESUME_NAME <>", value, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameGreaterThan(String value) {
            addCriterion("RESUME_NAME >", value, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameGreaterThanOrEqualTo(String value) {
            addCriterion("RESUME_NAME >=", value, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameLessThan(String value) {
            addCriterion("RESUME_NAME <", value, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameLessThanOrEqualTo(String value) {
            addCriterion("RESUME_NAME <=", value, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameLike(String value) {
            addCriterion("RESUME_NAME like", value, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameNotLike(String value) {
            addCriterion("RESUME_NAME not like", value, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameIn(List<String> values) {
            addCriterion("RESUME_NAME in", values, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameNotIn(List<String> values) {
            addCriterion("RESUME_NAME not in", values, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameBetween(String value1, String value2) {
            addCriterion("RESUME_NAME between", value1, value2, "resumeName");
            return (Criteria) this;
        }

        public Criteria andResumeNameNotBetween(String value1, String value2) {
            addCriterion("RESUME_NAME not between", value1, value2, "resumeName");
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
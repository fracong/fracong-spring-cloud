package com.fracong.blog.func.user.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CmsUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public CmsUserExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserEnNameIsNull() {
            addCriterion("USER_EN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserEnNameIsNotNull() {
            addCriterion("USER_EN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserEnNameEqualTo(String value) {
            addCriterion("USER_EN_NAME =", value, "userEnName");
            return (Criteria) this;
        }

        public Criteria andUserEnNameNotEqualTo(String value) {
            addCriterion("USER_EN_NAME <>", value, "userEnName");
            return (Criteria) this;
        }

        public Criteria andUserEnNameGreaterThan(String value) {
            addCriterion("USER_EN_NAME >", value, "userEnName");
            return (Criteria) this;
        }

        public Criteria andUserEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_EN_NAME >=", value, "userEnName");
            return (Criteria) this;
        }

        public Criteria andUserEnNameLessThan(String value) {
            addCriterion("USER_EN_NAME <", value, "userEnName");
            return (Criteria) this;
        }

        public Criteria andUserEnNameLessThanOrEqualTo(String value) {
            addCriterion("USER_EN_NAME <=", value, "userEnName");
            return (Criteria) this;
        }

        public Criteria andUserEnNameLike(String value) {
            addCriterion("USER_EN_NAME like", value, "userEnName");
            return (Criteria) this;
        }

        public Criteria andUserEnNameNotLike(String value) {
            addCriterion("USER_EN_NAME not like", value, "userEnName");
            return (Criteria) this;
        }

        public Criteria andUserEnNameIn(List<String> values) {
            addCriterion("USER_EN_NAME in", values, "userEnName");
            return (Criteria) this;
        }

        public Criteria andUserEnNameNotIn(List<String> values) {
            addCriterion("USER_EN_NAME not in", values, "userEnName");
            return (Criteria) this;
        }

        public Criteria andUserEnNameBetween(String value1, String value2) {
            addCriterion("USER_EN_NAME between", value1, value2, "userEnName");
            return (Criteria) this;
        }

        public Criteria andUserEnNameNotBetween(String value1, String value2) {
            addCriterion("USER_EN_NAME not between", value1, value2, "userEnName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("LOGIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("LOGIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("LOGIN_NAME =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("LOGIN_NAME <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("LOGIN_NAME >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_NAME >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("LOGIN_NAME <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_NAME <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("LOGIN_NAME like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("LOGIN_NAME not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("LOGIN_NAME in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("LOGIN_NAME not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("LOGIN_NAME between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("LOGIN_NAME not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("USER_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("USER_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("USER_PASSWORD =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("USER_PASSWORD <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("USER_PASSWORD >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PASSWORD >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("USER_PASSWORD <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("USER_PASSWORD <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("USER_PASSWORD like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("USER_PASSWORD not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("USER_PASSWORD in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("USER_PASSWORD not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("USER_PASSWORD between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("USER_PASSWORD not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Short value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Short value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Short value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Short value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Short value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Short value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Short> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Short> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Short value1, Short value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Short value1, Short value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBriefIsNull() {
            addCriterion("BRIEF is null");
            return (Criteria) this;
        }

        public Criteria andBriefIsNotNull() {
            addCriterion("BRIEF is not null");
            return (Criteria) this;
        }

        public Criteria andBriefEqualTo(String value) {
            addCriterion("BRIEF =", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotEqualTo(String value) {
            addCriterion("BRIEF <>", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefGreaterThan(String value) {
            addCriterion("BRIEF >", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefGreaterThanOrEqualTo(String value) {
            addCriterion("BRIEF >=", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLessThan(String value) {
            addCriterion("BRIEF <", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLessThanOrEqualTo(String value) {
            addCriterion("BRIEF <=", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLike(String value) {
            addCriterion("BRIEF like", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotLike(String value) {
            addCriterion("BRIEF not like", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefIn(List<String> values) {
            addCriterion("BRIEF in", values, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotIn(List<String> values) {
            addCriterion("BRIEF not in", values, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefBetween(String value1, String value2) {
            addCriterion("BRIEF between", value1, value2, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotBetween(String value1, String value2) {
            addCriterion("BRIEF not between", value1, value2, "brief");
            return (Criteria) this;
        }

        public Criteria andBirthDateIsNull() {
            addCriterion("BIRTH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBirthDateIsNotNull() {
            addCriterion("BIRTH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBirthDateEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTH_DATE =", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTH_DATE <>", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateGreaterThan(Date value) {
            addCriterionForJDBCDate("BIRTH_DATE >", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTH_DATE >=", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLessThan(Date value) {
            addCriterionForJDBCDate("BIRTH_DATE <", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BIRTH_DATE <=", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTH_DATE in", values, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("BIRTH_DATE not in", values, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTH_DATE between", value1, value2, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BIRTH_DATE not between", value1, value2, "birthDate");
            return (Criteria) this;
        }

        public Criteria andPositionCountryIsNull() {
            addCriterion("POSITION_COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andPositionCountryIsNotNull() {
            addCriterion("POSITION_COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andPositionCountryEqualTo(String value) {
            addCriterion("POSITION_COUNTRY =", value, "positionCountry");
            return (Criteria) this;
        }

        public Criteria andPositionCountryNotEqualTo(String value) {
            addCriterion("POSITION_COUNTRY <>", value, "positionCountry");
            return (Criteria) this;
        }

        public Criteria andPositionCountryGreaterThan(String value) {
            addCriterion("POSITION_COUNTRY >", value, "positionCountry");
            return (Criteria) this;
        }

        public Criteria andPositionCountryGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION_COUNTRY >=", value, "positionCountry");
            return (Criteria) this;
        }

        public Criteria andPositionCountryLessThan(String value) {
            addCriterion("POSITION_COUNTRY <", value, "positionCountry");
            return (Criteria) this;
        }

        public Criteria andPositionCountryLessThanOrEqualTo(String value) {
            addCriterion("POSITION_COUNTRY <=", value, "positionCountry");
            return (Criteria) this;
        }

        public Criteria andPositionCountryLike(String value) {
            addCriterion("POSITION_COUNTRY like", value, "positionCountry");
            return (Criteria) this;
        }

        public Criteria andPositionCountryNotLike(String value) {
            addCriterion("POSITION_COUNTRY not like", value, "positionCountry");
            return (Criteria) this;
        }

        public Criteria andPositionCountryIn(List<String> values) {
            addCriterion("POSITION_COUNTRY in", values, "positionCountry");
            return (Criteria) this;
        }

        public Criteria andPositionCountryNotIn(List<String> values) {
            addCriterion("POSITION_COUNTRY not in", values, "positionCountry");
            return (Criteria) this;
        }

        public Criteria andPositionCountryBetween(String value1, String value2) {
            addCriterion("POSITION_COUNTRY between", value1, value2, "positionCountry");
            return (Criteria) this;
        }

        public Criteria andPositionCountryNotBetween(String value1, String value2) {
            addCriterion("POSITION_COUNTRY not between", value1, value2, "positionCountry");
            return (Criteria) this;
        }

        public Criteria andPositionProvinceIsNull() {
            addCriterion("POSITION_PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andPositionProvinceIsNotNull() {
            addCriterion("POSITION_PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andPositionProvinceEqualTo(String value) {
            addCriterion("POSITION_PROVINCE =", value, "positionProvince");
            return (Criteria) this;
        }

        public Criteria andPositionProvinceNotEqualTo(String value) {
            addCriterion("POSITION_PROVINCE <>", value, "positionProvince");
            return (Criteria) this;
        }

        public Criteria andPositionProvinceGreaterThan(String value) {
            addCriterion("POSITION_PROVINCE >", value, "positionProvince");
            return (Criteria) this;
        }

        public Criteria andPositionProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION_PROVINCE >=", value, "positionProvince");
            return (Criteria) this;
        }

        public Criteria andPositionProvinceLessThan(String value) {
            addCriterion("POSITION_PROVINCE <", value, "positionProvince");
            return (Criteria) this;
        }

        public Criteria andPositionProvinceLessThanOrEqualTo(String value) {
            addCriterion("POSITION_PROVINCE <=", value, "positionProvince");
            return (Criteria) this;
        }

        public Criteria andPositionProvinceLike(String value) {
            addCriterion("POSITION_PROVINCE like", value, "positionProvince");
            return (Criteria) this;
        }

        public Criteria andPositionProvinceNotLike(String value) {
            addCriterion("POSITION_PROVINCE not like", value, "positionProvince");
            return (Criteria) this;
        }

        public Criteria andPositionProvinceIn(List<String> values) {
            addCriterion("POSITION_PROVINCE in", values, "positionProvince");
            return (Criteria) this;
        }

        public Criteria andPositionProvinceNotIn(List<String> values) {
            addCriterion("POSITION_PROVINCE not in", values, "positionProvince");
            return (Criteria) this;
        }

        public Criteria andPositionProvinceBetween(String value1, String value2) {
            addCriterion("POSITION_PROVINCE between", value1, value2, "positionProvince");
            return (Criteria) this;
        }

        public Criteria andPositionProvinceNotBetween(String value1, String value2) {
            addCriterion("POSITION_PROVINCE not between", value1, value2, "positionProvince");
            return (Criteria) this;
        }

        public Criteria andPositionCityIsNull() {
            addCriterion("POSITION_CITY is null");
            return (Criteria) this;
        }

        public Criteria andPositionCityIsNotNull() {
            addCriterion("POSITION_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andPositionCityEqualTo(String value) {
            addCriterion("POSITION_CITY =", value, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionCityNotEqualTo(String value) {
            addCriterion("POSITION_CITY <>", value, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionCityGreaterThan(String value) {
            addCriterion("POSITION_CITY >", value, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionCityGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION_CITY >=", value, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionCityLessThan(String value) {
            addCriterion("POSITION_CITY <", value, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionCityLessThanOrEqualTo(String value) {
            addCriterion("POSITION_CITY <=", value, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionCityLike(String value) {
            addCriterion("POSITION_CITY like", value, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionCityNotLike(String value) {
            addCriterion("POSITION_CITY not like", value, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionCityIn(List<String> values) {
            addCriterion("POSITION_CITY in", values, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionCityNotIn(List<String> values) {
            addCriterion("POSITION_CITY not in", values, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionCityBetween(String value1, String value2) {
            addCriterion("POSITION_CITY between", value1, value2, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionCityNotBetween(String value1, String value2) {
            addCriterion("POSITION_CITY not between", value1, value2, "positionCity");
            return (Criteria) this;
        }

        public Criteria andPositionOtherDetailIsNull() {
            addCriterion("POSITION_OTHER_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andPositionOtherDetailIsNotNull() {
            addCriterion("POSITION_OTHER_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andPositionOtherDetailEqualTo(String value) {
            addCriterion("POSITION_OTHER_DETAIL =", value, "positionOtherDetail");
            return (Criteria) this;
        }

        public Criteria andPositionOtherDetailNotEqualTo(String value) {
            addCriterion("POSITION_OTHER_DETAIL <>", value, "positionOtherDetail");
            return (Criteria) this;
        }

        public Criteria andPositionOtherDetailGreaterThan(String value) {
            addCriterion("POSITION_OTHER_DETAIL >", value, "positionOtherDetail");
            return (Criteria) this;
        }

        public Criteria andPositionOtherDetailGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION_OTHER_DETAIL >=", value, "positionOtherDetail");
            return (Criteria) this;
        }

        public Criteria andPositionOtherDetailLessThan(String value) {
            addCriterion("POSITION_OTHER_DETAIL <", value, "positionOtherDetail");
            return (Criteria) this;
        }

        public Criteria andPositionOtherDetailLessThanOrEqualTo(String value) {
            addCriterion("POSITION_OTHER_DETAIL <=", value, "positionOtherDetail");
            return (Criteria) this;
        }

        public Criteria andPositionOtherDetailLike(String value) {
            addCriterion("POSITION_OTHER_DETAIL like", value, "positionOtherDetail");
            return (Criteria) this;
        }

        public Criteria andPositionOtherDetailNotLike(String value) {
            addCriterion("POSITION_OTHER_DETAIL not like", value, "positionOtherDetail");
            return (Criteria) this;
        }

        public Criteria andPositionOtherDetailIn(List<String> values) {
            addCriterion("POSITION_OTHER_DETAIL in", values, "positionOtherDetail");
            return (Criteria) this;
        }

        public Criteria andPositionOtherDetailNotIn(List<String> values) {
            addCriterion("POSITION_OTHER_DETAIL not in", values, "positionOtherDetail");
            return (Criteria) this;
        }

        public Criteria andPositionOtherDetailBetween(String value1, String value2) {
            addCriterion("POSITION_OTHER_DETAIL between", value1, value2, "positionOtherDetail");
            return (Criteria) this;
        }

        public Criteria andPositionOtherDetailNotBetween(String value1, String value2) {
            addCriterion("POSITION_OTHER_DETAIL not between", value1, value2, "positionOtherDetail");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNull() {
            addCriterion("MOBILE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNotNull() {
            addCriterion("MOBILE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneEqualTo(String value) {
            addCriterion("MOBILE_PHONE =", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotEqualTo(String value) {
            addCriterion("MOBILE_PHONE <>", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThan(String value) {
            addCriterion("MOBILE_PHONE >", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE_PHONE >=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThan(String value) {
            addCriterion("MOBILE_PHONE <", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("MOBILE_PHONE <=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLike(String value) {
            addCriterion("MOBILE_PHONE like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotLike(String value) {
            addCriterion("MOBILE_PHONE not like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIn(List<String> values) {
            addCriterion("MOBILE_PHONE in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotIn(List<String> values) {
            addCriterion("MOBILE_PHONE not in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneBetween(String value1, String value2) {
            addCriterion("MOBILE_PHONE between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("MOBILE_PHONE not between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneIsNull() {
            addCriterion("WORK_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneIsNotNull() {
            addCriterion("WORK_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneEqualTo(String value) {
            addCriterion("WORK_PHONE =", value, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneNotEqualTo(String value) {
            addCriterion("WORK_PHONE <>", value, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneGreaterThan(String value) {
            addCriterion("WORK_PHONE >", value, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_PHONE >=", value, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneLessThan(String value) {
            addCriterion("WORK_PHONE <", value, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneLessThanOrEqualTo(String value) {
            addCriterion("WORK_PHONE <=", value, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneLike(String value) {
            addCriterion("WORK_PHONE like", value, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneNotLike(String value) {
            addCriterion("WORK_PHONE not like", value, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneIn(List<String> values) {
            addCriterion("WORK_PHONE in", values, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneNotIn(List<String> values) {
            addCriterion("WORK_PHONE not in", values, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneBetween(String value1, String value2) {
            addCriterion("WORK_PHONE between", value1, value2, "workPhone");
            return (Criteria) this;
        }

        public Criteria andWorkPhoneNotBetween(String value1, String value2) {
            addCriterion("WORK_PHONE not between", value1, value2, "workPhone");
            return (Criteria) this;
        }

        public Criteria andStatusFlagIsNull() {
            addCriterion("STATUS_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andStatusFlagIsNotNull() {
            addCriterion("STATUS_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andStatusFlagEqualTo(Short value) {
            addCriterion("STATUS_FLAG =", value, "statusFlag");
            return (Criteria) this;
        }

        public Criteria andStatusFlagNotEqualTo(Short value) {
            addCriterion("STATUS_FLAG <>", value, "statusFlag");
            return (Criteria) this;
        }

        public Criteria andStatusFlagGreaterThan(Short value) {
            addCriterion("STATUS_FLAG >", value, "statusFlag");
            return (Criteria) this;
        }

        public Criteria andStatusFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("STATUS_FLAG >=", value, "statusFlag");
            return (Criteria) this;
        }

        public Criteria andStatusFlagLessThan(Short value) {
            addCriterion("STATUS_FLAG <", value, "statusFlag");
            return (Criteria) this;
        }

        public Criteria andStatusFlagLessThanOrEqualTo(Short value) {
            addCriterion("STATUS_FLAG <=", value, "statusFlag");
            return (Criteria) this;
        }

        public Criteria andStatusFlagIn(List<Short> values) {
            addCriterion("STATUS_FLAG in", values, "statusFlag");
            return (Criteria) this;
        }

        public Criteria andStatusFlagNotIn(List<Short> values) {
            addCriterion("STATUS_FLAG not in", values, "statusFlag");
            return (Criteria) this;
        }

        public Criteria andStatusFlagBetween(Short value1, Short value2) {
            addCriterion("STATUS_FLAG between", value1, value2, "statusFlag");
            return (Criteria) this;
        }

        public Criteria andStatusFlagNotBetween(Short value1, Short value2) {
            addCriterion("STATUS_FLAG not between", value1, value2, "statusFlag");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("DELETE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("DELETE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Short value) {
            addCriterion("DELETE_FLAG =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Short value) {
            addCriterion("DELETE_FLAG <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Short value) {
            addCriterion("DELETE_FLAG >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("DELETE_FLAG >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Short value) {
            addCriterion("DELETE_FLAG <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Short value) {
            addCriterion("DELETE_FLAG <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Short> values) {
            addCriterion("DELETE_FLAG in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Short> values) {
            addCriterion("DELETE_FLAG not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Short value1, Short value2) {
            addCriterion("DELETE_FLAG between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Short value1, Short value2) {
            addCriterion("DELETE_FLAG not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }
    }

    /**
     */
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
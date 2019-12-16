package com.fracong.blog.func.role.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CmsRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public CmsRoleExample() {
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

        public Criteria andRoleIdIsNull() {
            addCriterion("ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(String value) {
            addCriterion("ROLE_ID =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(String value) {
            addCriterion("ROLE_ID <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(String value) {
            addCriterion("ROLE_ID >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_ID >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(String value) {
            addCriterion("ROLE_ID <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(String value) {
            addCriterion("ROLE_ID <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLike(String value) {
            addCriterion("ROLE_ID like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotLike(String value) {
            addCriterion("ROLE_ID not like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<String> values) {
            addCriterion("ROLE_ID in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<String> values) {
            addCriterion("ROLE_ID not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(String value1, String value2) {
            addCriterion("ROLE_ID between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(String value1, String value2) {
            addCriterion("ROLE_ID not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNull() {
            addCriterion("ROLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("ROLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("ROLE_NAME =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("ROLE_NAME <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("ROLE_NAME >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_NAME >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("ROLE_NAME <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("ROLE_NAME <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("ROLE_NAME like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("ROLE_NAME not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("ROLE_NAME in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("ROLE_NAME not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("ROLE_NAME between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("ROLE_NAME not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameIsNull() {
            addCriterion("ROLE_EN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameIsNotNull() {
            addCriterion("ROLE_EN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameEqualTo(String value) {
            addCriterion("ROLE_EN_NAME =", value, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameNotEqualTo(String value) {
            addCriterion("ROLE_EN_NAME <>", value, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameGreaterThan(String value) {
            addCriterion("ROLE_EN_NAME >", value, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_EN_NAME >=", value, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameLessThan(String value) {
            addCriterion("ROLE_EN_NAME <", value, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameLessThanOrEqualTo(String value) {
            addCriterion("ROLE_EN_NAME <=", value, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameLike(String value) {
            addCriterion("ROLE_EN_NAME like", value, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameNotLike(String value) {
            addCriterion("ROLE_EN_NAME not like", value, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameIn(List<String> values) {
            addCriterion("ROLE_EN_NAME in", values, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameNotIn(List<String> values) {
            addCriterion("ROLE_EN_NAME not in", values, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameBetween(String value1, String value2) {
            addCriterion("ROLE_EN_NAME between", value1, value2, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleEnNameNotBetween(String value1, String value2) {
            addCriterion("ROLE_EN_NAME not between", value1, value2, "roleEnName");
            return (Criteria) this;
        }

        public Criteria andRoleBriefIsNull() {
            addCriterion("ROLE_BRIEF is null");
            return (Criteria) this;
        }

        public Criteria andRoleBriefIsNotNull() {
            addCriterion("ROLE_BRIEF is not null");
            return (Criteria) this;
        }

        public Criteria andRoleBriefEqualTo(String value) {
            addCriterion("ROLE_BRIEF =", value, "roleBrief");
            return (Criteria) this;
        }

        public Criteria andRoleBriefNotEqualTo(String value) {
            addCriterion("ROLE_BRIEF <>", value, "roleBrief");
            return (Criteria) this;
        }

        public Criteria andRoleBriefGreaterThan(String value) {
            addCriterion("ROLE_BRIEF >", value, "roleBrief");
            return (Criteria) this;
        }

        public Criteria andRoleBriefGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_BRIEF >=", value, "roleBrief");
            return (Criteria) this;
        }

        public Criteria andRoleBriefLessThan(String value) {
            addCriterion("ROLE_BRIEF <", value, "roleBrief");
            return (Criteria) this;
        }

        public Criteria andRoleBriefLessThanOrEqualTo(String value) {
            addCriterion("ROLE_BRIEF <=", value, "roleBrief");
            return (Criteria) this;
        }

        public Criteria andRoleBriefLike(String value) {
            addCriterion("ROLE_BRIEF like", value, "roleBrief");
            return (Criteria) this;
        }

        public Criteria andRoleBriefNotLike(String value) {
            addCriterion("ROLE_BRIEF not like", value, "roleBrief");
            return (Criteria) this;
        }

        public Criteria andRoleBriefIn(List<String> values) {
            addCriterion("ROLE_BRIEF in", values, "roleBrief");
            return (Criteria) this;
        }

        public Criteria andRoleBriefNotIn(List<String> values) {
            addCriterion("ROLE_BRIEF not in", values, "roleBrief");
            return (Criteria) this;
        }

        public Criteria andRoleBriefBetween(String value1, String value2) {
            addCriterion("ROLE_BRIEF between", value1, value2, "roleBrief");
            return (Criteria) this;
        }

        public Criteria andRoleBriefNotBetween(String value1, String value2) {
            addCriterion("ROLE_BRIEF not between", value1, value2, "roleBrief");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeIsNull() {
            addCriterion("ROLE_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeIsNotNull() {
            addCriterion("ROLE_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeEqualTo(Date value) {
            addCriterion("ROLE_CREATE_TIME =", value, "roleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeNotEqualTo(Date value) {
            addCriterion("ROLE_CREATE_TIME <>", value, "roleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeGreaterThan(Date value) {
            addCriterion("ROLE_CREATE_TIME >", value, "roleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ROLE_CREATE_TIME >=", value, "roleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeLessThan(Date value) {
            addCriterion("ROLE_CREATE_TIME <", value, "roleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("ROLE_CREATE_TIME <=", value, "roleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeIn(List<Date> values) {
            addCriterion("ROLE_CREATE_TIME in", values, "roleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeNotIn(List<Date> values) {
            addCriterion("ROLE_CREATE_TIME not in", values, "roleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeBetween(Date value1, Date value2) {
            addCriterion("ROLE_CREATE_TIME between", value1, value2, "roleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("ROLE_CREATE_TIME not between", value1, value2, "roleCreateTime");
            return (Criteria) this;
        }

        public Criteria andRoleCreateIdIsNull() {
            addCriterion("ROLE_CREATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoleCreateIdIsNotNull() {
            addCriterion("ROLE_CREATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleCreateIdEqualTo(String value) {
            addCriterion("ROLE_CREATE_ID =", value, "roleCreateId");
            return (Criteria) this;
        }

        public Criteria andRoleCreateIdNotEqualTo(String value) {
            addCriterion("ROLE_CREATE_ID <>", value, "roleCreateId");
            return (Criteria) this;
        }

        public Criteria andRoleCreateIdGreaterThan(String value) {
            addCriterion("ROLE_CREATE_ID >", value, "roleCreateId");
            return (Criteria) this;
        }

        public Criteria andRoleCreateIdGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_CREATE_ID >=", value, "roleCreateId");
            return (Criteria) this;
        }

        public Criteria andRoleCreateIdLessThan(String value) {
            addCriterion("ROLE_CREATE_ID <", value, "roleCreateId");
            return (Criteria) this;
        }

        public Criteria andRoleCreateIdLessThanOrEqualTo(String value) {
            addCriterion("ROLE_CREATE_ID <=", value, "roleCreateId");
            return (Criteria) this;
        }

        public Criteria andRoleCreateIdLike(String value) {
            addCriterion("ROLE_CREATE_ID like", value, "roleCreateId");
            return (Criteria) this;
        }

        public Criteria andRoleCreateIdNotLike(String value) {
            addCriterion("ROLE_CREATE_ID not like", value, "roleCreateId");
            return (Criteria) this;
        }

        public Criteria andRoleCreateIdIn(List<String> values) {
            addCriterion("ROLE_CREATE_ID in", values, "roleCreateId");
            return (Criteria) this;
        }

        public Criteria andRoleCreateIdNotIn(List<String> values) {
            addCriterion("ROLE_CREATE_ID not in", values, "roleCreateId");
            return (Criteria) this;
        }

        public Criteria andRoleCreateIdBetween(String value1, String value2) {
            addCriterion("ROLE_CREATE_ID between", value1, value2, "roleCreateId");
            return (Criteria) this;
        }

        public Criteria andRoleCreateIdNotBetween(String value1, String value2) {
            addCriterion("ROLE_CREATE_ID not between", value1, value2, "roleCreateId");
            return (Criteria) this;
        }

        public Criteria andRoleStateFlagIsNull() {
            addCriterion("ROLE_STATE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andRoleStateFlagIsNotNull() {
            addCriterion("ROLE_STATE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andRoleStateFlagEqualTo(Short value) {
            addCriterion("ROLE_STATE_FLAG =", value, "roleStateFlag");
            return (Criteria) this;
        }

        public Criteria andRoleStateFlagNotEqualTo(Short value) {
            addCriterion("ROLE_STATE_FLAG <>", value, "roleStateFlag");
            return (Criteria) this;
        }

        public Criteria andRoleStateFlagGreaterThan(Short value) {
            addCriterion("ROLE_STATE_FLAG >", value, "roleStateFlag");
            return (Criteria) this;
        }

        public Criteria andRoleStateFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("ROLE_STATE_FLAG >=", value, "roleStateFlag");
            return (Criteria) this;
        }

        public Criteria andRoleStateFlagLessThan(Short value) {
            addCriterion("ROLE_STATE_FLAG <", value, "roleStateFlag");
            return (Criteria) this;
        }

        public Criteria andRoleStateFlagLessThanOrEqualTo(Short value) {
            addCriterion("ROLE_STATE_FLAG <=", value, "roleStateFlag");
            return (Criteria) this;
        }

        public Criteria andRoleStateFlagIn(List<Short> values) {
            addCriterion("ROLE_STATE_FLAG in", values, "roleStateFlag");
            return (Criteria) this;
        }

        public Criteria andRoleStateFlagNotIn(List<Short> values) {
            addCriterion("ROLE_STATE_FLAG not in", values, "roleStateFlag");
            return (Criteria) this;
        }

        public Criteria andRoleStateFlagBetween(Short value1, Short value2) {
            addCriterion("ROLE_STATE_FLAG between", value1, value2, "roleStateFlag");
            return (Criteria) this;
        }

        public Criteria andRoleStateFlagNotBetween(Short value1, Short value2) {
            addCriterion("ROLE_STATE_FLAG not between", value1, value2, "roleStateFlag");
            return (Criteria) this;
        }

        public Criteria andRoleLastmodifyTimeIsNull() {
            addCriterion("ROLE_LASTMODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRoleLastmodifyTimeIsNotNull() {
            addCriterion("ROLE_LASTMODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRoleLastmodifyTimeEqualTo(Date value) {
            addCriterion("ROLE_LASTMODIFY_TIME =", value, "roleLastmodifyTime");
            return (Criteria) this;
        }

        public Criteria andRoleLastmodifyTimeNotEqualTo(Date value) {
            addCriterion("ROLE_LASTMODIFY_TIME <>", value, "roleLastmodifyTime");
            return (Criteria) this;
        }

        public Criteria andRoleLastmodifyTimeGreaterThan(Date value) {
            addCriterion("ROLE_LASTMODIFY_TIME >", value, "roleLastmodifyTime");
            return (Criteria) this;
        }

        public Criteria andRoleLastmodifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ROLE_LASTMODIFY_TIME >=", value, "roleLastmodifyTime");
            return (Criteria) this;
        }

        public Criteria andRoleLastmodifyTimeLessThan(Date value) {
            addCriterion("ROLE_LASTMODIFY_TIME <", value, "roleLastmodifyTime");
            return (Criteria) this;
        }

        public Criteria andRoleLastmodifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("ROLE_LASTMODIFY_TIME <=", value, "roleLastmodifyTime");
            return (Criteria) this;
        }

        public Criteria andRoleLastmodifyTimeIn(List<Date> values) {
            addCriterion("ROLE_LASTMODIFY_TIME in", values, "roleLastmodifyTime");
            return (Criteria) this;
        }

        public Criteria andRoleLastmodifyTimeNotIn(List<Date> values) {
            addCriterion("ROLE_LASTMODIFY_TIME not in", values, "roleLastmodifyTime");
            return (Criteria) this;
        }

        public Criteria andRoleLastmodifyTimeBetween(Date value1, Date value2) {
            addCriterion("ROLE_LASTMODIFY_TIME between", value1, value2, "roleLastmodifyTime");
            return (Criteria) this;
        }

        public Criteria andRoleLastmodifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("ROLE_LASTMODIFY_TIME not between", value1, value2, "roleLastmodifyTime");
            return (Criteria) this;
        }

        public Criteria andRoleLastmodifyIdIsNull() {
            addCriterion("ROLE_LASTMODIFY_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoleLastmodifyIdIsNotNull() {
            addCriterion("ROLE_LASTMODIFY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleLastmodifyIdEqualTo(String value) {
            addCriterion("ROLE_LASTMODIFY_ID =", value, "roleLastmodifyId");
            return (Criteria) this;
        }

        public Criteria andRoleLastmodifyIdNotEqualTo(String value) {
            addCriterion("ROLE_LASTMODIFY_ID <>", value, "roleLastmodifyId");
            return (Criteria) this;
        }

        public Criteria andRoleLastmodifyIdGreaterThan(String value) {
            addCriterion("ROLE_LASTMODIFY_ID >", value, "roleLastmodifyId");
            return (Criteria) this;
        }

        public Criteria andRoleLastmodifyIdGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_LASTMODIFY_ID >=", value, "roleLastmodifyId");
            return (Criteria) this;
        }

        public Criteria andRoleLastmodifyIdLessThan(String value) {
            addCriterion("ROLE_LASTMODIFY_ID <", value, "roleLastmodifyId");
            return (Criteria) this;
        }

        public Criteria andRoleLastmodifyIdLessThanOrEqualTo(String value) {
            addCriterion("ROLE_LASTMODIFY_ID <=", value, "roleLastmodifyId");
            return (Criteria) this;
        }

        public Criteria andRoleLastmodifyIdLike(String value) {
            addCriterion("ROLE_LASTMODIFY_ID like", value, "roleLastmodifyId");
            return (Criteria) this;
        }

        public Criteria andRoleLastmodifyIdNotLike(String value) {
            addCriterion("ROLE_LASTMODIFY_ID not like", value, "roleLastmodifyId");
            return (Criteria) this;
        }

        public Criteria andRoleLastmodifyIdIn(List<String> values) {
            addCriterion("ROLE_LASTMODIFY_ID in", values, "roleLastmodifyId");
            return (Criteria) this;
        }

        public Criteria andRoleLastmodifyIdNotIn(List<String> values) {
            addCriterion("ROLE_LASTMODIFY_ID not in", values, "roleLastmodifyId");
            return (Criteria) this;
        }

        public Criteria andRoleLastmodifyIdBetween(String value1, String value2) {
            addCriterion("ROLE_LASTMODIFY_ID between", value1, value2, "roleLastmodifyId");
            return (Criteria) this;
        }

        public Criteria andRoleLastmodifyIdNotBetween(String value1, String value2) {
            addCriterion("ROLE_LASTMODIFY_ID not between", value1, value2, "roleLastmodifyId");
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
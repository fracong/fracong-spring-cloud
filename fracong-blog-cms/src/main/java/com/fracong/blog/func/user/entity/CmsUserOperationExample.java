package com.fracong.blog.func.user.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CmsUserOperationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public CmsUserOperationExample() {
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

        public Criteria andOperationIdIsNull() {
            addCriterion("OPERATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andOperationIdIsNotNull() {
            addCriterion("OPERATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOperationIdEqualTo(String value) {
            addCriterion("OPERATION_ID =", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdNotEqualTo(String value) {
            addCriterion("OPERATION_ID <>", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdGreaterThan(String value) {
            addCriterion("OPERATION_ID >", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATION_ID >=", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdLessThan(String value) {
            addCriterion("OPERATION_ID <", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdLessThanOrEqualTo(String value) {
            addCriterion("OPERATION_ID <=", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdLike(String value) {
            addCriterion("OPERATION_ID like", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdNotLike(String value) {
            addCriterion("OPERATION_ID not like", value, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdIn(List<String> values) {
            addCriterion("OPERATION_ID in", values, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdNotIn(List<String> values) {
            addCriterion("OPERATION_ID not in", values, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdBetween(String value1, String value2) {
            addCriterion("OPERATION_ID between", value1, value2, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationIdNotBetween(String value1, String value2) {
            addCriterion("OPERATION_ID not between", value1, value2, "operationId");
            return (Criteria) this;
        }

        public Criteria andOperationNameIsNull() {
            addCriterion("OPERATION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOperationNameIsNotNull() {
            addCriterion("OPERATION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOperationNameEqualTo(String value) {
            addCriterion("OPERATION_NAME =", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameNotEqualTo(String value) {
            addCriterion("OPERATION_NAME <>", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameGreaterThan(String value) {
            addCriterion("OPERATION_NAME >", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATION_NAME >=", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameLessThan(String value) {
            addCriterion("OPERATION_NAME <", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameLessThanOrEqualTo(String value) {
            addCriterion("OPERATION_NAME <=", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameLike(String value) {
            addCriterion("OPERATION_NAME like", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameNotLike(String value) {
            addCriterion("OPERATION_NAME not like", value, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameIn(List<String> values) {
            addCriterion("OPERATION_NAME in", values, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameNotIn(List<String> values) {
            addCriterion("OPERATION_NAME not in", values, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameBetween(String value1, String value2) {
            addCriterion("OPERATION_NAME between", value1, value2, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationNameNotBetween(String value1, String value2) {
            addCriterion("OPERATION_NAME not between", value1, value2, "operationName");
            return (Criteria) this;
        }

        public Criteria andOperationBriefIsNull() {
            addCriterion("OPERATION_BRIEF is null");
            return (Criteria) this;
        }

        public Criteria andOperationBriefIsNotNull() {
            addCriterion("OPERATION_BRIEF is not null");
            return (Criteria) this;
        }

        public Criteria andOperationBriefEqualTo(String value) {
            addCriterion("OPERATION_BRIEF =", value, "operationBrief");
            return (Criteria) this;
        }

        public Criteria andOperationBriefNotEqualTo(String value) {
            addCriterion("OPERATION_BRIEF <>", value, "operationBrief");
            return (Criteria) this;
        }

        public Criteria andOperationBriefGreaterThan(String value) {
            addCriterion("OPERATION_BRIEF >", value, "operationBrief");
            return (Criteria) this;
        }

        public Criteria andOperationBriefGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATION_BRIEF >=", value, "operationBrief");
            return (Criteria) this;
        }

        public Criteria andOperationBriefLessThan(String value) {
            addCriterion("OPERATION_BRIEF <", value, "operationBrief");
            return (Criteria) this;
        }

        public Criteria andOperationBriefLessThanOrEqualTo(String value) {
            addCriterion("OPERATION_BRIEF <=", value, "operationBrief");
            return (Criteria) this;
        }

        public Criteria andOperationBriefLike(String value) {
            addCriterion("OPERATION_BRIEF like", value, "operationBrief");
            return (Criteria) this;
        }

        public Criteria andOperationBriefNotLike(String value) {
            addCriterion("OPERATION_BRIEF not like", value, "operationBrief");
            return (Criteria) this;
        }

        public Criteria andOperationBriefIn(List<String> values) {
            addCriterion("OPERATION_BRIEF in", values, "operationBrief");
            return (Criteria) this;
        }

        public Criteria andOperationBriefNotIn(List<String> values) {
            addCriterion("OPERATION_BRIEF not in", values, "operationBrief");
            return (Criteria) this;
        }

        public Criteria andOperationBriefBetween(String value1, String value2) {
            addCriterion("OPERATION_BRIEF between", value1, value2, "operationBrief");
            return (Criteria) this;
        }

        public Criteria andOperationBriefNotBetween(String value1, String value2) {
            addCriterion("OPERATION_BRIEF not between", value1, value2, "operationBrief");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIsNull() {
            addCriterion("OPERATION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIsNotNull() {
            addCriterion("OPERATION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeEqualTo(Short value) {
            addCriterion("OPERATION_TYPE =", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotEqualTo(Short value) {
            addCriterion("OPERATION_TYPE <>", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThan(Short value) {
            addCriterion("OPERATION_TYPE >", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("OPERATION_TYPE >=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThan(Short value) {
            addCriterion("OPERATION_TYPE <", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThanOrEqualTo(Short value) {
            addCriterion("OPERATION_TYPE <=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIn(List<Short> values) {
            addCriterion("OPERATION_TYPE in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotIn(List<Short> values) {
            addCriterion("OPERATION_TYPE not in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeBetween(Short value1, Short value2) {
            addCriterion("OPERATION_TYPE between", value1, value2, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotBetween(Short value1, Short value2) {
            addCriterion("OPERATION_TYPE not between", value1, value2, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTagIsNull() {
            addCriterion("OPERATION_TAG is null");
            return (Criteria) this;
        }

        public Criteria andOperationTagIsNotNull() {
            addCriterion("OPERATION_TAG is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTagEqualTo(String value) {
            addCriterion("OPERATION_TAG =", value, "operationTag");
            return (Criteria) this;
        }

        public Criteria andOperationTagNotEqualTo(String value) {
            addCriterion("OPERATION_TAG <>", value, "operationTag");
            return (Criteria) this;
        }

        public Criteria andOperationTagGreaterThan(String value) {
            addCriterion("OPERATION_TAG >", value, "operationTag");
            return (Criteria) this;
        }

        public Criteria andOperationTagGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATION_TAG >=", value, "operationTag");
            return (Criteria) this;
        }

        public Criteria andOperationTagLessThan(String value) {
            addCriterion("OPERATION_TAG <", value, "operationTag");
            return (Criteria) this;
        }

        public Criteria andOperationTagLessThanOrEqualTo(String value) {
            addCriterion("OPERATION_TAG <=", value, "operationTag");
            return (Criteria) this;
        }

        public Criteria andOperationTagLike(String value) {
            addCriterion("OPERATION_TAG like", value, "operationTag");
            return (Criteria) this;
        }

        public Criteria andOperationTagNotLike(String value) {
            addCriterion("OPERATION_TAG not like", value, "operationTag");
            return (Criteria) this;
        }

        public Criteria andOperationTagIn(List<String> values) {
            addCriterion("OPERATION_TAG in", values, "operationTag");
            return (Criteria) this;
        }

        public Criteria andOperationTagNotIn(List<String> values) {
            addCriterion("OPERATION_TAG not in", values, "operationTag");
            return (Criteria) this;
        }

        public Criteria andOperationTagBetween(String value1, String value2) {
            addCriterion("OPERATION_TAG between", value1, value2, "operationTag");
            return (Criteria) this;
        }

        public Criteria andOperationTagNotBetween(String value1, String value2) {
            addCriterion("OPERATION_TAG not between", value1, value2, "operationTag");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("CREATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("CREATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(String value) {
            addCriterion("CREATE_ID =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(String value) {
            addCriterion("CREATE_ID <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(String value) {
            addCriterion("CREATE_ID >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_ID >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(String value) {
            addCriterion("CREATE_ID <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(String value) {
            addCriterion("CREATE_ID <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLike(String value) {
            addCriterion("CREATE_ID like", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotLike(String value) {
            addCriterion("CREATE_ID not like", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<String> values) {
            addCriterion("CREATE_ID in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<String> values) {
            addCriterion("CREATE_ID not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(String value1, String value2) {
            addCriterion("CREATE_ID between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(String value1, String value2) {
            addCriterion("CREATE_ID not between", value1, value2, "createId");
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

        public Criteria andDeleteFlgIsNull() {
            addCriterion("DELETE_FLG is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgIsNotNull() {
            addCriterion("DELETE_FLG is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgEqualTo(Short value) {
            addCriterion("DELETE_FLG =", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgNotEqualTo(Short value) {
            addCriterion("DELETE_FLG <>", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgGreaterThan(Short value) {
            addCriterion("DELETE_FLG >", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgGreaterThanOrEqualTo(Short value) {
            addCriterion("DELETE_FLG >=", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgLessThan(Short value) {
            addCriterion("DELETE_FLG <", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgLessThanOrEqualTo(Short value) {
            addCriterion("DELETE_FLG <=", value, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgIn(List<Short> values) {
            addCriterion("DELETE_FLG in", values, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgNotIn(List<Short> values) {
            addCriterion("DELETE_FLG not in", values, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgBetween(Short value1, Short value2) {
            addCriterion("DELETE_FLG between", value1, value2, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andDeleteFlgNotBetween(Short value1, Short value2) {
            addCriterion("DELETE_FLG not between", value1, value2, "deleteFlg");
            return (Criteria) this;
        }

        public Criteria andLastmodifyIdIsNull() {
            addCriterion("LASTMODIFY_ID is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifyIdIsNotNull() {
            addCriterion("LASTMODIFY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifyIdEqualTo(String value) {
            addCriterion("LASTMODIFY_ID =", value, "lastmodifyId");
            return (Criteria) this;
        }

        public Criteria andLastmodifyIdNotEqualTo(String value) {
            addCriterion("LASTMODIFY_ID <>", value, "lastmodifyId");
            return (Criteria) this;
        }

        public Criteria andLastmodifyIdGreaterThan(String value) {
            addCriterion("LASTMODIFY_ID >", value, "lastmodifyId");
            return (Criteria) this;
        }

        public Criteria andLastmodifyIdGreaterThanOrEqualTo(String value) {
            addCriterion("LASTMODIFY_ID >=", value, "lastmodifyId");
            return (Criteria) this;
        }

        public Criteria andLastmodifyIdLessThan(String value) {
            addCriterion("LASTMODIFY_ID <", value, "lastmodifyId");
            return (Criteria) this;
        }

        public Criteria andLastmodifyIdLessThanOrEqualTo(String value) {
            addCriterion("LASTMODIFY_ID <=", value, "lastmodifyId");
            return (Criteria) this;
        }

        public Criteria andLastmodifyIdLike(String value) {
            addCriterion("LASTMODIFY_ID like", value, "lastmodifyId");
            return (Criteria) this;
        }

        public Criteria andLastmodifyIdNotLike(String value) {
            addCriterion("LASTMODIFY_ID not like", value, "lastmodifyId");
            return (Criteria) this;
        }

        public Criteria andLastmodifyIdIn(List<String> values) {
            addCriterion("LASTMODIFY_ID in", values, "lastmodifyId");
            return (Criteria) this;
        }

        public Criteria andLastmodifyIdNotIn(List<String> values) {
            addCriterion("LASTMODIFY_ID not in", values, "lastmodifyId");
            return (Criteria) this;
        }

        public Criteria andLastmodifyIdBetween(String value1, String value2) {
            addCriterion("LASTMODIFY_ID between", value1, value2, "lastmodifyId");
            return (Criteria) this;
        }

        public Criteria andLastmodifyIdNotBetween(String value1, String value2) {
            addCriterion("LASTMODIFY_ID not between", value1, value2, "lastmodifyId");
            return (Criteria) this;
        }

        public Criteria andLastmodifyTimeIsNull() {
            addCriterion("LASTMODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifyTimeIsNotNull() {
            addCriterion("LASTMODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifyTimeEqualTo(Date value) {
            addCriterion("LASTMODIFY_TIME =", value, "lastmodifyTime");
            return (Criteria) this;
        }

        public Criteria andLastmodifyTimeNotEqualTo(Date value) {
            addCriterion("LASTMODIFY_TIME <>", value, "lastmodifyTime");
            return (Criteria) this;
        }

        public Criteria andLastmodifyTimeGreaterThan(Date value) {
            addCriterion("LASTMODIFY_TIME >", value, "lastmodifyTime");
            return (Criteria) this;
        }

        public Criteria andLastmodifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTMODIFY_TIME >=", value, "lastmodifyTime");
            return (Criteria) this;
        }

        public Criteria andLastmodifyTimeLessThan(Date value) {
            addCriterion("LASTMODIFY_TIME <", value, "lastmodifyTime");
            return (Criteria) this;
        }

        public Criteria andLastmodifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("LASTMODIFY_TIME <=", value, "lastmodifyTime");
            return (Criteria) this;
        }

        public Criteria andLastmodifyTimeIn(List<Date> values) {
            addCriterion("LASTMODIFY_TIME in", values, "lastmodifyTime");
            return (Criteria) this;
        }

        public Criteria andLastmodifyTimeNotIn(List<Date> values) {
            addCriterion("LASTMODIFY_TIME not in", values, "lastmodifyTime");
            return (Criteria) this;
        }

        public Criteria andLastmodifyTimeBetween(Date value1, Date value2) {
            addCriterion("LASTMODIFY_TIME between", value1, value2, "lastmodifyTime");
            return (Criteria) this;
        }

        public Criteria andLastmodifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("LASTMODIFY_TIME not between", value1, value2, "lastmodifyTime");
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
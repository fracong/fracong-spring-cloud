package com.fracong.blog.func.menu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CmsMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public CmsMenuExample() {
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

        public Criteria andMenuIdIsNull() {
            addCriterion("MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(String value) {
            addCriterion("MENU_ID =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(String value) {
            addCriterion("MENU_ID <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(String value) {
            addCriterion("MENU_ID >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_ID >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(String value) {
            addCriterion("MENU_ID <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(String value) {
            addCriterion("MENU_ID <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLike(String value) {
            addCriterion("MENU_ID like", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotLike(String value) {
            addCriterion("MENU_ID not like", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<String> values) {
            addCriterion("MENU_ID in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<String> values) {
            addCriterion("MENU_ID not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(String value1, String value2) {
            addCriterion("MENU_ID between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(String value1, String value2) {
            addCriterion("MENU_ID not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuKeyIsNull() {
            addCriterion("MENU_KEY is null");
            return (Criteria) this;
        }

        public Criteria andMenuKeyIsNotNull() {
            addCriterion("MENU_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andMenuKeyEqualTo(String value) {
            addCriterion("MENU_KEY =", value, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyNotEqualTo(String value) {
            addCriterion("MENU_KEY <>", value, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyGreaterThan(String value) {
            addCriterion("MENU_KEY >", value, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_KEY >=", value, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyLessThan(String value) {
            addCriterion("MENU_KEY <", value, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyLessThanOrEqualTo(String value) {
            addCriterion("MENU_KEY <=", value, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyLike(String value) {
            addCriterion("MENU_KEY like", value, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyNotLike(String value) {
            addCriterion("MENU_KEY not like", value, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyIn(List<String> values) {
            addCriterion("MENU_KEY in", values, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyNotIn(List<String> values) {
            addCriterion("MENU_KEY not in", values, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyBetween(String value1, String value2) {
            addCriterion("MENU_KEY between", value1, value2, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuKeyNotBetween(String value1, String value2) {
            addCriterion("MENU_KEY not between", value1, value2, "menuKey");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNull() {
            addCriterion("MENU_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("MENU_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("MENU_NAME =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("MENU_NAME <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("MENU_NAME >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_NAME >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("MENU_NAME <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("MENU_NAME <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("MENU_NAME like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("MENU_NAME not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("MENU_NAME in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("MENU_NAME not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("MENU_NAME between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("MENU_NAME not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuUrlIsNull() {
            addCriterion("MENU_URL is null");
            return (Criteria) this;
        }

        public Criteria andMenuUrlIsNotNull() {
            addCriterion("MENU_URL is not null");
            return (Criteria) this;
        }

        public Criteria andMenuUrlEqualTo(String value) {
            addCriterion("MENU_URL =", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotEqualTo(String value) {
            addCriterion("MENU_URL <>", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlGreaterThan(String value) {
            addCriterion("MENU_URL >", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_URL >=", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLessThan(String value) {
            addCriterion("MENU_URL <", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLessThanOrEqualTo(String value) {
            addCriterion("MENU_URL <=", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlLike(String value) {
            addCriterion("MENU_URL like", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotLike(String value) {
            addCriterion("MENU_URL not like", value, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlIn(List<String> values) {
            addCriterion("MENU_URL in", values, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotIn(List<String> values) {
            addCriterion("MENU_URL not in", values, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlBetween(String value1, String value2) {
            addCriterion("MENU_URL between", value1, value2, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andMenuUrlNotBetween(String value1, String value2) {
            addCriterion("MENU_URL not between", value1, value2, "menuUrl");
            return (Criteria) this;
        }

        public Criteria andOpenTypeIsNull() {
            addCriterion("OPEN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOpenTypeIsNotNull() {
            addCriterion("OPEN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTypeEqualTo(Short value) {
            addCriterion("OPEN_TYPE =", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeNotEqualTo(Short value) {
            addCriterion("OPEN_TYPE <>", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeGreaterThan(Short value) {
            addCriterion("OPEN_TYPE >", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("OPEN_TYPE >=", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeLessThan(Short value) {
            addCriterion("OPEN_TYPE <", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeLessThanOrEqualTo(Short value) {
            addCriterion("OPEN_TYPE <=", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeIn(List<Short> values) {
            addCriterion("OPEN_TYPE in", values, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeNotIn(List<Short> values) {
            addCriterion("OPEN_TYPE not in", values, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeBetween(Short value1, Short value2) {
            addCriterion("OPEN_TYPE between", value1, value2, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeNotBetween(Short value1, Short value2) {
            addCriterion("OPEN_TYPE not between", value1, value2, "openType");
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

        public Criteria andParentMenuIdIsNull() {
            addCriterion("PARENT_MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdIsNotNull() {
            addCriterion("PARENT_MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdEqualTo(String value) {
            addCriterion("PARENT_MENU_ID =", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdNotEqualTo(String value) {
            addCriterion("PARENT_MENU_ID <>", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdGreaterThan(String value) {
            addCriterion("PARENT_MENU_ID >", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_MENU_ID >=", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdLessThan(String value) {
            addCriterion("PARENT_MENU_ID <", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdLessThanOrEqualTo(String value) {
            addCriterion("PARENT_MENU_ID <=", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdLike(String value) {
            addCriterion("PARENT_MENU_ID like", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdNotLike(String value) {
            addCriterion("PARENT_MENU_ID not like", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdIn(List<String> values) {
            addCriterion("PARENT_MENU_ID in", values, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdNotIn(List<String> values) {
            addCriterion("PARENT_MENU_ID not in", values, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdBetween(String value1, String value2) {
            addCriterion("PARENT_MENU_ID between", value1, value2, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdNotBetween(String value1, String value2) {
            addCriterion("PARENT_MENU_ID not between", value1, value2, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNull() {
            addCriterion("ORDER_NUM is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("ORDER_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(Integer value) {
            addCriterion("ORDER_NUM =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(Integer value) {
            addCriterion("ORDER_NUM <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(Integer value) {
            addCriterion("ORDER_NUM >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_NUM >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(Integer value) {
            addCriterion("ORDER_NUM <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_NUM <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<Integer> values) {
            addCriterion("ORDER_NUM in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<Integer> values) {
            addCriterion("ORDER_NUM not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_NUM between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_NUM not between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andMenuCreateIdIsNull() {
            addCriterion("MENU_CREATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andMenuCreateIdIsNotNull() {
            addCriterion("MENU_CREATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMenuCreateIdEqualTo(String value) {
            addCriterion("MENU_CREATE_ID =", value, "menuCreateId");
            return (Criteria) this;
        }

        public Criteria andMenuCreateIdNotEqualTo(String value) {
            addCriterion("MENU_CREATE_ID <>", value, "menuCreateId");
            return (Criteria) this;
        }

        public Criteria andMenuCreateIdGreaterThan(String value) {
            addCriterion("MENU_CREATE_ID >", value, "menuCreateId");
            return (Criteria) this;
        }

        public Criteria andMenuCreateIdGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_CREATE_ID >=", value, "menuCreateId");
            return (Criteria) this;
        }

        public Criteria andMenuCreateIdLessThan(String value) {
            addCriterion("MENU_CREATE_ID <", value, "menuCreateId");
            return (Criteria) this;
        }

        public Criteria andMenuCreateIdLessThanOrEqualTo(String value) {
            addCriterion("MENU_CREATE_ID <=", value, "menuCreateId");
            return (Criteria) this;
        }

        public Criteria andMenuCreateIdLike(String value) {
            addCriterion("MENU_CREATE_ID like", value, "menuCreateId");
            return (Criteria) this;
        }

        public Criteria andMenuCreateIdNotLike(String value) {
            addCriterion("MENU_CREATE_ID not like", value, "menuCreateId");
            return (Criteria) this;
        }

        public Criteria andMenuCreateIdIn(List<String> values) {
            addCriterion("MENU_CREATE_ID in", values, "menuCreateId");
            return (Criteria) this;
        }

        public Criteria andMenuCreateIdNotIn(List<String> values) {
            addCriterion("MENU_CREATE_ID not in", values, "menuCreateId");
            return (Criteria) this;
        }

        public Criteria andMenuCreateIdBetween(String value1, String value2) {
            addCriterion("MENU_CREATE_ID between", value1, value2, "menuCreateId");
            return (Criteria) this;
        }

        public Criteria andMenuCreateIdNotBetween(String value1, String value2) {
            addCriterion("MENU_CREATE_ID not between", value1, value2, "menuCreateId");
            return (Criteria) this;
        }

        public Criteria andMenuCreateTimeIsNull() {
            addCriterion("MENU_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andMenuCreateTimeIsNotNull() {
            addCriterion("MENU_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andMenuCreateTimeEqualTo(Date value) {
            addCriterion("MENU_CREATE_TIME =", value, "menuCreateTime");
            return (Criteria) this;
        }

        public Criteria andMenuCreateTimeNotEqualTo(Date value) {
            addCriterion("MENU_CREATE_TIME <>", value, "menuCreateTime");
            return (Criteria) this;
        }

        public Criteria andMenuCreateTimeGreaterThan(Date value) {
            addCriterion("MENU_CREATE_TIME >", value, "menuCreateTime");
            return (Criteria) this;
        }

        public Criteria andMenuCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MENU_CREATE_TIME >=", value, "menuCreateTime");
            return (Criteria) this;
        }

        public Criteria andMenuCreateTimeLessThan(Date value) {
            addCriterion("MENU_CREATE_TIME <", value, "menuCreateTime");
            return (Criteria) this;
        }

        public Criteria andMenuCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("MENU_CREATE_TIME <=", value, "menuCreateTime");
            return (Criteria) this;
        }

        public Criteria andMenuCreateTimeIn(List<Date> values) {
            addCriterion("MENU_CREATE_TIME in", values, "menuCreateTime");
            return (Criteria) this;
        }

        public Criteria andMenuCreateTimeNotIn(List<Date> values) {
            addCriterion("MENU_CREATE_TIME not in", values, "menuCreateTime");
            return (Criteria) this;
        }

        public Criteria andMenuCreateTimeBetween(Date value1, Date value2) {
            addCriterion("MENU_CREATE_TIME between", value1, value2, "menuCreateTime");
            return (Criteria) this;
        }

        public Criteria andMenuCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("MENU_CREATE_TIME not between", value1, value2, "menuCreateTime");
            return (Criteria) this;
        }

        public Criteria andMenuLastmodifyIdIsNull() {
            addCriterion("MENU_LASTMODIFY_ID is null");
            return (Criteria) this;
        }

        public Criteria andMenuLastmodifyIdIsNotNull() {
            addCriterion("MENU_LASTMODIFY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMenuLastmodifyIdEqualTo(String value) {
            addCriterion("MENU_LASTMODIFY_ID =", value, "menuLastmodifyId");
            return (Criteria) this;
        }

        public Criteria andMenuLastmodifyIdNotEqualTo(String value) {
            addCriterion("MENU_LASTMODIFY_ID <>", value, "menuLastmodifyId");
            return (Criteria) this;
        }

        public Criteria andMenuLastmodifyIdGreaterThan(String value) {
            addCriterion("MENU_LASTMODIFY_ID >", value, "menuLastmodifyId");
            return (Criteria) this;
        }

        public Criteria andMenuLastmodifyIdGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_LASTMODIFY_ID >=", value, "menuLastmodifyId");
            return (Criteria) this;
        }

        public Criteria andMenuLastmodifyIdLessThan(String value) {
            addCriterion("MENU_LASTMODIFY_ID <", value, "menuLastmodifyId");
            return (Criteria) this;
        }

        public Criteria andMenuLastmodifyIdLessThanOrEqualTo(String value) {
            addCriterion("MENU_LASTMODIFY_ID <=", value, "menuLastmodifyId");
            return (Criteria) this;
        }

        public Criteria andMenuLastmodifyIdLike(String value) {
            addCriterion("MENU_LASTMODIFY_ID like", value, "menuLastmodifyId");
            return (Criteria) this;
        }

        public Criteria andMenuLastmodifyIdNotLike(String value) {
            addCriterion("MENU_LASTMODIFY_ID not like", value, "menuLastmodifyId");
            return (Criteria) this;
        }

        public Criteria andMenuLastmodifyIdIn(List<String> values) {
            addCriterion("MENU_LASTMODIFY_ID in", values, "menuLastmodifyId");
            return (Criteria) this;
        }

        public Criteria andMenuLastmodifyIdNotIn(List<String> values) {
            addCriterion("MENU_LASTMODIFY_ID not in", values, "menuLastmodifyId");
            return (Criteria) this;
        }

        public Criteria andMenuLastmodifyIdBetween(String value1, String value2) {
            addCriterion("MENU_LASTMODIFY_ID between", value1, value2, "menuLastmodifyId");
            return (Criteria) this;
        }

        public Criteria andMenuLastmodifyIdNotBetween(String value1, String value2) {
            addCriterion("MENU_LASTMODIFY_ID not between", value1, value2, "menuLastmodifyId");
            return (Criteria) this;
        }

        public Criteria andMenuLastmodifyTimeIsNull() {
            addCriterion("MENU_LASTMODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andMenuLastmodifyTimeIsNotNull() {
            addCriterion("MENU_LASTMODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andMenuLastmodifyTimeEqualTo(Date value) {
            addCriterion("MENU_LASTMODIFY_TIME =", value, "menuLastmodifyTime");
            return (Criteria) this;
        }

        public Criteria andMenuLastmodifyTimeNotEqualTo(Date value) {
            addCriterion("MENU_LASTMODIFY_TIME <>", value, "menuLastmodifyTime");
            return (Criteria) this;
        }

        public Criteria andMenuLastmodifyTimeGreaterThan(Date value) {
            addCriterion("MENU_LASTMODIFY_TIME >", value, "menuLastmodifyTime");
            return (Criteria) this;
        }

        public Criteria andMenuLastmodifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MENU_LASTMODIFY_TIME >=", value, "menuLastmodifyTime");
            return (Criteria) this;
        }

        public Criteria andMenuLastmodifyTimeLessThan(Date value) {
            addCriterion("MENU_LASTMODIFY_TIME <", value, "menuLastmodifyTime");
            return (Criteria) this;
        }

        public Criteria andMenuLastmodifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("MENU_LASTMODIFY_TIME <=", value, "menuLastmodifyTime");
            return (Criteria) this;
        }

        public Criteria andMenuLastmodifyTimeIn(List<Date> values) {
            addCriterion("MENU_LASTMODIFY_TIME in", values, "menuLastmodifyTime");
            return (Criteria) this;
        }

        public Criteria andMenuLastmodifyTimeNotIn(List<Date> values) {
            addCriterion("MENU_LASTMODIFY_TIME not in", values, "menuLastmodifyTime");
            return (Criteria) this;
        }

        public Criteria andMenuLastmodifyTimeBetween(Date value1, Date value2) {
            addCriterion("MENU_LASTMODIFY_TIME between", value1, value2, "menuLastmodifyTime");
            return (Criteria) this;
        }

        public Criteria andMenuLastmodifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("MENU_LASTMODIFY_TIME not between", value1, value2, "menuLastmodifyTime");
            return (Criteria) this;
        }

        public Criteria andMenuCssClassIsNull() {
            addCriterion("MENU_CSS_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andMenuCssClassIsNotNull() {
            addCriterion("MENU_CSS_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andMenuCssClassEqualTo(String value) {
            addCriterion("MENU_CSS_CLASS =", value, "menuCssClass");
            return (Criteria) this;
        }

        public Criteria andMenuCssClassNotEqualTo(String value) {
            addCriterion("MENU_CSS_CLASS <>", value, "menuCssClass");
            return (Criteria) this;
        }

        public Criteria andMenuCssClassGreaterThan(String value) {
            addCriterion("MENU_CSS_CLASS >", value, "menuCssClass");
            return (Criteria) this;
        }

        public Criteria andMenuCssClassGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_CSS_CLASS >=", value, "menuCssClass");
            return (Criteria) this;
        }

        public Criteria andMenuCssClassLessThan(String value) {
            addCriterion("MENU_CSS_CLASS <", value, "menuCssClass");
            return (Criteria) this;
        }

        public Criteria andMenuCssClassLessThanOrEqualTo(String value) {
            addCriterion("MENU_CSS_CLASS <=", value, "menuCssClass");
            return (Criteria) this;
        }

        public Criteria andMenuCssClassLike(String value) {
            addCriterion("MENU_CSS_CLASS like", value, "menuCssClass");
            return (Criteria) this;
        }

        public Criteria andMenuCssClassNotLike(String value) {
            addCriterion("MENU_CSS_CLASS not like", value, "menuCssClass");
            return (Criteria) this;
        }

        public Criteria andMenuCssClassIn(List<String> values) {
            addCriterion("MENU_CSS_CLASS in", values, "menuCssClass");
            return (Criteria) this;
        }

        public Criteria andMenuCssClassNotIn(List<String> values) {
            addCriterion("MENU_CSS_CLASS not in", values, "menuCssClass");
            return (Criteria) this;
        }

        public Criteria andMenuCssClassBetween(String value1, String value2) {
            addCriterion("MENU_CSS_CLASS between", value1, value2, "menuCssClass");
            return (Criteria) this;
        }

        public Criteria andMenuCssClassNotBetween(String value1, String value2) {
            addCriterion("MENU_CSS_CLASS not between", value1, value2, "menuCssClass");
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
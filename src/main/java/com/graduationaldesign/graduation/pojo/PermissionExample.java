package com.graduationaldesign.graduation.pojo;

import java.util.ArrayList;
import java.util.List;

public class PermissionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_permission
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_permission
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_permission
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     *  构造查询条件,t_permission
     */
    public PermissionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,t_permission
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,t_permission
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,t_permission
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,t_permission
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,t_permission
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,t_permission
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,t_permission
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,t_permission
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,t_permission
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,t_permission
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * InnoDB free: 11264 kB
     * GeneratedCriteria
     * 数据库表：t_permission
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPerNameIsNull() {
            addCriterion("per_name is null");
            return (Criteria) this;
        }

        public Criteria andPerNameIsNotNull() {
            addCriterion("per_name is not null");
            return (Criteria) this;
        }

        public Criteria andPerNameEqualTo(String value) {
            addCriterion("per_name =", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameNotEqualTo(String value) {
            addCriterion("per_name <>", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameGreaterThan(String value) {
            addCriterion("per_name >", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameGreaterThanOrEqualTo(String value) {
            addCriterion("per_name >=", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameLessThan(String value) {
            addCriterion("per_name <", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameLessThanOrEqualTo(String value) {
            addCriterion("per_name <=", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameLike(String value) {
            addCriterion("per_name like", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameNotLike(String value) {
            addCriterion("per_name not like", value, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameIn(List<String> values) {
            addCriterion("per_name in", values, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameNotIn(List<String> values) {
            addCriterion("per_name not in", values, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameBetween(String value1, String value2) {
            addCriterion("per_name between", value1, value2, "perName");
            return (Criteria) this;
        }

        public Criteria andPerNameNotBetween(String value1, String value2) {
            addCriterion("per_name not between", value1, value2, "perName");
            return (Criteria) this;
        }

        public Criteria andPerDescIsNull() {
            addCriterion("per_desc is null");
            return (Criteria) this;
        }

        public Criteria andPerDescIsNotNull() {
            addCriterion("per_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPerDescEqualTo(String value) {
            addCriterion("per_desc =", value, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescNotEqualTo(String value) {
            addCriterion("per_desc <>", value, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescGreaterThan(String value) {
            addCriterion("per_desc >", value, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescGreaterThanOrEqualTo(String value) {
            addCriterion("per_desc >=", value, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescLessThan(String value) {
            addCriterion("per_desc <", value, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescLessThanOrEqualTo(String value) {
            addCriterion("per_desc <=", value, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescLike(String value) {
            addCriterion("per_desc like", value, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescNotLike(String value) {
            addCriterion("per_desc not like", value, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescIn(List<String> values) {
            addCriterion("per_desc in", values, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescNotIn(List<String> values) {
            addCriterion("per_desc not in", values, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescBetween(String value1, String value2) {
            addCriterion("per_desc between", value1, value2, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerDescNotBetween(String value1, String value2) {
            addCriterion("per_desc not between", value1, value2, "perDesc");
            return (Criteria) this;
        }

        public Criteria andPerUrlIsNull() {
            addCriterion("per_url is null");
            return (Criteria) this;
        }

        public Criteria andPerUrlIsNotNull() {
            addCriterion("per_url is not null");
            return (Criteria) this;
        }

        public Criteria andPerUrlEqualTo(String value) {
            addCriterion("per_url =", value, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlNotEqualTo(String value) {
            addCriterion("per_url <>", value, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlGreaterThan(String value) {
            addCriterion("per_url >", value, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlGreaterThanOrEqualTo(String value) {
            addCriterion("per_url >=", value, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlLessThan(String value) {
            addCriterion("per_url <", value, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlLessThanOrEqualTo(String value) {
            addCriterion("per_url <=", value, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlLike(String value) {
            addCriterion("per_url like", value, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlNotLike(String value) {
            addCriterion("per_url not like", value, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlIn(List<String> values) {
            addCriterion("per_url in", values, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlNotIn(List<String> values) {
            addCriterion("per_url not in", values, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlBetween(String value1, String value2) {
            addCriterion("per_url between", value1, value2, "perUrl");
            return (Criteria) this;
        }

        public Criteria andPerUrlNotBetween(String value1, String value2) {
            addCriterion("per_url not between", value1, value2, "perUrl");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：t_permission
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * InnoDB free: 11264 kB
     * Criterion
     * 数据库表：t_permission
     */
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
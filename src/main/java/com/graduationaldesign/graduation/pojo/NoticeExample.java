package com.graduationaldesign.graduation.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoticeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_notice
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_notice
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_notice
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     *  构造查询条件,t_notice
     */
    public NoticeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,t_notice
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,t_notice
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,t_notice
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,t_notice
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,t_notice
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,t_notice
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,t_notice
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,t_notice
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,t_notice
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,t_notice
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * InnoDB free: 11264 kB; (`aca_id`) REFER `graduationmanagement/t_academy`(`id`)
     * GeneratedCriteria
     * 数据库表：t_notice
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIsNull() {
            addCriterion("notice_time is null");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIsNotNull() {
            addCriterion("notice_time is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeEqualTo(Date value) {
            addCriterion("notice_time =", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotEqualTo(Date value) {
            addCriterion("notice_time <>", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeGreaterThan(Date value) {
            addCriterion("notice_time >", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("notice_time >=", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeLessThan(Date value) {
            addCriterion("notice_time <", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeLessThanOrEqualTo(Date value) {
            addCriterion("notice_time <=", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIn(List<Date> values) {
            addCriterion("notice_time in", values, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotIn(List<Date> values) {
            addCriterion("notice_time not in", values, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeBetween(Date value1, Date value2) {
            addCriterion("notice_time between", value1, value2, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotBetween(Date value1, Date value2) {
            addCriterion("notice_time not between", value1, value2, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticePublisherIsNull() {
            addCriterion("notice_publisher is null");
            return (Criteria) this;
        }

        public Criteria andNoticePublisherIsNotNull() {
            addCriterion("notice_publisher is not null");
            return (Criteria) this;
        }

        public Criteria andNoticePublisherEqualTo(String value) {
            addCriterion("notice_publisher =", value, "noticePublisher");
            return (Criteria) this;
        }

        public Criteria andNoticePublisherNotEqualTo(String value) {
            addCriterion("notice_publisher <>", value, "noticePublisher");
            return (Criteria) this;
        }

        public Criteria andNoticePublisherGreaterThan(String value) {
            addCriterion("notice_publisher >", value, "noticePublisher");
            return (Criteria) this;
        }

        public Criteria andNoticePublisherGreaterThanOrEqualTo(String value) {
            addCriterion("notice_publisher >=", value, "noticePublisher");
            return (Criteria) this;
        }

        public Criteria andNoticePublisherLessThan(String value) {
            addCriterion("notice_publisher <", value, "noticePublisher");
            return (Criteria) this;
        }

        public Criteria andNoticePublisherLessThanOrEqualTo(String value) {
            addCriterion("notice_publisher <=", value, "noticePublisher");
            return (Criteria) this;
        }

        public Criteria andNoticePublisherLike(String value) {
            addCriterion("notice_publisher like", value, "noticePublisher");
            return (Criteria) this;
        }

        public Criteria andNoticePublisherNotLike(String value) {
            addCriterion("notice_publisher not like", value, "noticePublisher");
            return (Criteria) this;
        }

        public Criteria andNoticePublisherIn(List<String> values) {
            addCriterion("notice_publisher in", values, "noticePublisher");
            return (Criteria) this;
        }

        public Criteria andNoticePublisherNotIn(List<String> values) {
            addCriterion("notice_publisher not in", values, "noticePublisher");
            return (Criteria) this;
        }

        public Criteria andNoticePublisherBetween(String value1, String value2) {
            addCriterion("notice_publisher between", value1, value2, "noticePublisher");
            return (Criteria) this;
        }

        public Criteria andNoticePublisherNotBetween(String value1, String value2) {
            addCriterion("notice_publisher not between", value1, value2, "noticePublisher");
            return (Criteria) this;
        }

        public Criteria andAcaIdIsNull() {
            addCriterion("aca_id is null");
            return (Criteria) this;
        }

        public Criteria andAcaIdIsNotNull() {
            addCriterion("aca_id is not null");
            return (Criteria) this;
        }

        public Criteria andAcaIdEqualTo(Integer value) {
            addCriterion("aca_id =", value, "acaId");
            return (Criteria) this;
        }

        public Criteria andAcaIdNotEqualTo(Integer value) {
            addCriterion("aca_id <>", value, "acaId");
            return (Criteria) this;
        }

        public Criteria andAcaIdGreaterThan(Integer value) {
            addCriterion("aca_id >", value, "acaId");
            return (Criteria) this;
        }

        public Criteria andAcaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("aca_id >=", value, "acaId");
            return (Criteria) this;
        }

        public Criteria andAcaIdLessThan(Integer value) {
            addCriterion("aca_id <", value, "acaId");
            return (Criteria) this;
        }

        public Criteria andAcaIdLessThanOrEqualTo(Integer value) {
            addCriterion("aca_id <=", value, "acaId");
            return (Criteria) this;
        }

        public Criteria andAcaIdIn(List<Integer> values) {
            addCriterion("aca_id in", values, "acaId");
            return (Criteria) this;
        }

        public Criteria andAcaIdNotIn(List<Integer> values) {
            addCriterion("aca_id not in", values, "acaId");
            return (Criteria) this;
        }

        public Criteria andAcaIdBetween(Integer value1, Integer value2) {
            addCriterion("aca_id between", value1, value2, "acaId");
            return (Criteria) this;
        }

        public Criteria andAcaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("aca_id not between", value1, value2, "acaId");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：t_notice
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * InnoDB free: 11264 kB; (`aca_id`) REFER `graduationmanagement/t_academy`(`id`)
     * Criterion
     * 数据库表：t_notice
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
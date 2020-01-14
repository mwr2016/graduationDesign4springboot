package com.graduationaldesign.graduation.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_task
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_task
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_task
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     *  构造查询条件,t_task
     */
    public TaskExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,t_task
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,t_task
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,t_task
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,t_task
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,t_task
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,t_task
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,t_task
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,t_task
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,t_task
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,t_task
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * InnoDB free: 11264 kB; (`task_sub_id`) REFER `graduationmanagement/t_subject`(`s
     * GeneratedCriteria
     * 数据库表：t_task
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

        public Criteria andTaskFileIsNull() {
            addCriterion("task_file is null");
            return (Criteria) this;
        }

        public Criteria andTaskFileIsNotNull() {
            addCriterion("task_file is not null");
            return (Criteria) this;
        }

        public Criteria andTaskFileEqualTo(String value) {
            addCriterion("task_file =", value, "taskFile");
            return (Criteria) this;
        }

        public Criteria andTaskFileNotEqualTo(String value) {
            addCriterion("task_file <>", value, "taskFile");
            return (Criteria) this;
        }

        public Criteria andTaskFileGreaterThan(String value) {
            addCriterion("task_file >", value, "taskFile");
            return (Criteria) this;
        }

        public Criteria andTaskFileGreaterThanOrEqualTo(String value) {
            addCriterion("task_file >=", value, "taskFile");
            return (Criteria) this;
        }

        public Criteria andTaskFileLessThan(String value) {
            addCriterion("task_file <", value, "taskFile");
            return (Criteria) this;
        }

        public Criteria andTaskFileLessThanOrEqualTo(String value) {
            addCriterion("task_file <=", value, "taskFile");
            return (Criteria) this;
        }

        public Criteria andTaskFileLike(String value) {
            addCriterion("task_file like", value, "taskFile");
            return (Criteria) this;
        }

        public Criteria andTaskFileNotLike(String value) {
            addCriterion("task_file not like", value, "taskFile");
            return (Criteria) this;
        }

        public Criteria andTaskFileIn(List<String> values) {
            addCriterion("task_file in", values, "taskFile");
            return (Criteria) this;
        }

        public Criteria andTaskFileNotIn(List<String> values) {
            addCriterion("task_file not in", values, "taskFile");
            return (Criteria) this;
        }

        public Criteria andTaskFileBetween(String value1, String value2) {
            addCriterion("task_file between", value1, value2, "taskFile");
            return (Criteria) this;
        }

        public Criteria andTaskFileNotBetween(String value1, String value2) {
            addCriterion("task_file not between", value1, value2, "taskFile");
            return (Criteria) this;
        }

        public Criteria andTaskStateIsNull() {
            addCriterion("task_state is null");
            return (Criteria) this;
        }

        public Criteria andTaskStateIsNotNull() {
            addCriterion("task_state is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStateEqualTo(String value) {
            addCriterion("task_state =", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateNotEqualTo(String value) {
            addCriterion("task_state <>", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateGreaterThan(String value) {
            addCriterion("task_state >", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateGreaterThanOrEqualTo(String value) {
            addCriterion("task_state >=", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateLessThan(String value) {
            addCriterion("task_state <", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateLessThanOrEqualTo(String value) {
            addCriterion("task_state <=", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateLike(String value) {
            addCriterion("task_state like", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateNotLike(String value) {
            addCriterion("task_state not like", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateIn(List<String> values) {
            addCriterion("task_state in", values, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateNotIn(List<String> values) {
            addCriterion("task_state not in", values, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateBetween(String value1, String value2) {
            addCriterion("task_state between", value1, value2, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateNotBetween(String value1, String value2) {
            addCriterion("task_state not between", value1, value2, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskNumberIsNull() {
            addCriterion("task_number is null");
            return (Criteria) this;
        }

        public Criteria andTaskNumberIsNotNull() {
            addCriterion("task_number is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNumberEqualTo(Integer value) {
            addCriterion("task_number =", value, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTaskNumberNotEqualTo(Integer value) {
            addCriterion("task_number <>", value, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTaskNumberGreaterThan(Integer value) {
            addCriterion("task_number >", value, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTaskNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_number >=", value, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTaskNumberLessThan(Integer value) {
            addCriterion("task_number <", value, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTaskNumberLessThanOrEqualTo(Integer value) {
            addCriterion("task_number <=", value, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTaskNumberIn(List<Integer> values) {
            addCriterion("task_number in", values, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTaskNumberNotIn(List<Integer> values) {
            addCriterion("task_number not in", values, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTaskNumberBetween(Integer value1, Integer value2) {
            addCriterion("task_number between", value1, value2, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTaskNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("task_number not between", value1, value2, "taskNumber");
            return (Criteria) this;
        }

        public Criteria andTaskSubIdIsNull() {
            addCriterion("task_sub_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskSubIdIsNotNull() {
            addCriterion("task_sub_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskSubIdEqualTo(String value) {
            addCriterion("task_sub_id =", value, "taskSubId");
            return (Criteria) this;
        }

        public Criteria andTaskSubIdNotEqualTo(String value) {
            addCriterion("task_sub_id <>", value, "taskSubId");
            return (Criteria) this;
        }

        public Criteria andTaskSubIdGreaterThan(String value) {
            addCriterion("task_sub_id >", value, "taskSubId");
            return (Criteria) this;
        }

        public Criteria andTaskSubIdGreaterThanOrEqualTo(String value) {
            addCriterion("task_sub_id >=", value, "taskSubId");
            return (Criteria) this;
        }

        public Criteria andTaskSubIdLessThan(String value) {
            addCriterion("task_sub_id <", value, "taskSubId");
            return (Criteria) this;
        }

        public Criteria andTaskSubIdLessThanOrEqualTo(String value) {
            addCriterion("task_sub_id <=", value, "taskSubId");
            return (Criteria) this;
        }

        public Criteria andTaskSubIdLike(String value) {
            addCriterion("task_sub_id like", value, "taskSubId");
            return (Criteria) this;
        }

        public Criteria andTaskSubIdNotLike(String value) {
            addCriterion("task_sub_id not like", value, "taskSubId");
            return (Criteria) this;
        }

        public Criteria andTaskSubIdIn(List<String> values) {
            addCriterion("task_sub_id in", values, "taskSubId");
            return (Criteria) this;
        }

        public Criteria andTaskSubIdNotIn(List<String> values) {
            addCriterion("task_sub_id not in", values, "taskSubId");
            return (Criteria) this;
        }

        public Criteria andTaskSubIdBetween(String value1, String value2) {
            addCriterion("task_sub_id between", value1, value2, "taskSubId");
            return (Criteria) this;
        }

        public Criteria andTaskSubIdNotBetween(String value1, String value2) {
            addCriterion("task_sub_id not between", value1, value2, "taskSubId");
            return (Criteria) this;
        }

        public Criteria andReplyFileIsNull() {
            addCriterion("reply_file is null");
            return (Criteria) this;
        }

        public Criteria andReplyFileIsNotNull() {
            addCriterion("reply_file is not null");
            return (Criteria) this;
        }

        public Criteria andReplyFileEqualTo(String value) {
            addCriterion("reply_file =", value, "replyFile");
            return (Criteria) this;
        }

        public Criteria andReplyFileNotEqualTo(String value) {
            addCriterion("reply_file <>", value, "replyFile");
            return (Criteria) this;
        }

        public Criteria andReplyFileGreaterThan(String value) {
            addCriterion("reply_file >", value, "replyFile");
            return (Criteria) this;
        }

        public Criteria andReplyFileGreaterThanOrEqualTo(String value) {
            addCriterion("reply_file >=", value, "replyFile");
            return (Criteria) this;
        }

        public Criteria andReplyFileLessThan(String value) {
            addCriterion("reply_file <", value, "replyFile");
            return (Criteria) this;
        }

        public Criteria andReplyFileLessThanOrEqualTo(String value) {
            addCriterion("reply_file <=", value, "replyFile");
            return (Criteria) this;
        }

        public Criteria andReplyFileLike(String value) {
            addCriterion("reply_file like", value, "replyFile");
            return (Criteria) this;
        }

        public Criteria andReplyFileNotLike(String value) {
            addCriterion("reply_file not like", value, "replyFile");
            return (Criteria) this;
        }

        public Criteria andReplyFileIn(List<String> values) {
            addCriterion("reply_file in", values, "replyFile");
            return (Criteria) this;
        }

        public Criteria andReplyFileNotIn(List<String> values) {
            addCriterion("reply_file not in", values, "replyFile");
            return (Criteria) this;
        }

        public Criteria andReplyFileBetween(String value1, String value2) {
            addCriterion("reply_file between", value1, value2, "replyFile");
            return (Criteria) this;
        }

        public Criteria andReplyFileNotBetween(String value1, String value2) {
            addCriterion("reply_file not between", value1, value2, "replyFile");
            return (Criteria) this;
        }

        public Criteria andTaskTimeIsNull() {
            addCriterion("task_time is null");
            return (Criteria) this;
        }

        public Criteria andTaskTimeIsNotNull() {
            addCriterion("task_time is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEqualTo(Date value) {
            addCriterion("task_time =", value, "taskTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeNotEqualTo(Date value) {
            addCriterion("task_time <>", value, "taskTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeGreaterThan(Date value) {
            addCriterion("task_time >", value, "taskTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("task_time >=", value, "taskTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeLessThan(Date value) {
            addCriterion("task_time <", value, "taskTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeLessThanOrEqualTo(Date value) {
            addCriterion("task_time <=", value, "taskTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeIn(List<Date> values) {
            addCriterion("task_time in", values, "taskTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeNotIn(List<Date> values) {
            addCriterion("task_time not in", values, "taskTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeBetween(Date value1, Date value2) {
            addCriterion("task_time between", value1, value2, "taskTime");
            return (Criteria) this;
        }

        public Criteria andTaskTimeNotBetween(Date value1, Date value2) {
            addCriterion("task_time not between", value1, value2, "taskTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIsNull() {
            addCriterion("reply_time is null");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIsNotNull() {
            addCriterion("reply_time is not null");
            return (Criteria) this;
        }

        public Criteria andReplyTimeEqualTo(Date value) {
            addCriterion("reply_time =", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotEqualTo(Date value) {
            addCriterion("reply_time <>", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeGreaterThan(Date value) {
            addCriterion("reply_time >", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("reply_time >=", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLessThan(Date value) {
            addCriterion("reply_time <", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("reply_time <=", value, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeIn(List<Date> values) {
            addCriterion("reply_time in", values, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotIn(List<Date> values) {
            addCriterion("reply_time not in", values, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeBetween(Date value1, Date value2) {
            addCriterion("reply_time between", value1, value2, "replyTime");
            return (Criteria) this;
        }

        public Criteria andReplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("reply_time not between", value1, value2, "replyTime");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：t_task
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * InnoDB free: 11264 kB; (`task_sub_id`) REFER `graduationmanagement/t_subject`(`s
     * Criterion
     * 数据库表：t_task
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
package com.graduationaldesign.graduation.pojo;

import java.io.Serializable;
import java.util.Date;

public class Subject implements Serializable {
    /**
     * 课题id
     * 表字段 : t_subject.sub_id
     */
    private String subId;

    /**
     * 课题名称
     * 表字段 : t_subject.sub_name
     */
    private String subName;

    /**
     * 课题性质，1是理论性课题，2是实践性课题
     * 表字段 : t_subject.sub_nature
     */
    private Integer subNature;

    /**
     * 课程来源，1是科研题目，2是企业题目，3是自拟题目
     * 表字段 : t_subject.sub_source
     */
    private Integer subSource;

    /**
     * 课题导师，外键对教师表
     * 表字段 : t_subject.sub_tea_id
     */
    private String subTeaId;

    /**
     * 课题附件
     * 表字段 : t_subject.sub_file
     */
    private String subFile;

    /**
     * 开题报告最后的时间
     * 表字段 : t_subject.first_report_deadline
     */
    private Date firstReportDeadline;

    /**
     * 论文定稿最后时间
     * 表字段 : t_subject.last_report_deadline
     */
    private Date lastReportDeadline;

    /**
     * 学生id，外键对学生表
     * 表字段 : t_subject.stu_id
     */
    private String stuId;

    /**
     * 选定状态，1是待选定，2是待审核，3是通过
     * 表字段 : t_subject.sub_stu_state
     */
    private Integer subStuState;

    /**
     * 最终评分
     * 表字段 : t_subject.sub_last_score
     */
    private Long subLastScore;

    /**
     * 展示id，外键展示表id
     * 表字段 : t_subject.show_id
     */
    private Integer showId;

    /**
     * 课题介绍
     * 表字段 : t_subject.sub_introduce
     */
    private String subIntroduce;

    private Teacher teacher;

    private Student student;

    private DesignShow designShow;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_subject
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 课题id 字段:t_subject.sub_id
     *
     * @return t_subject.sub_id, 课题id
     */
    public String getSubId() {
        return subId;
    }

    /**
     * 设置 课题id 字段:t_subject.sub_id
     *
     * @param subId the value for t_subject.sub_id, 课题id
     */
    public void setSubId(String subId) {
        this.subId = subId == null ? null : subId.trim();
    }

    /**
     * 获取 课题名称 字段:t_subject.sub_name
     *
     * @return t_subject.sub_name, 课题名称
     */
    public String getSubName() {
        return subName;
    }

    /**
     * 设置 课题名称 字段:t_subject.sub_name
     *
     * @param subName the value for t_subject.sub_name, 课题名称
     */
    public void setSubName(String subName) {
        this.subName = subName == null ? null : subName.trim();
    }

    /**
     * 获取 课题性质，1是理论性课题，2是实践性课题 字段:t_subject.sub_nature
     *
     * @return t_subject.sub_nature, 课题性质，1是理论性课题，2是实践性课题
     */
    public Integer getSubNature() {
        return subNature;
    }

    /**
     * 设置 课题性质，1是理论性课题，2是实践性课题 字段:t_subject.sub_nature
     *
     * @param subNature the value for t_subject.sub_nature, 课题性质，1是理论性课题，2是实践性课题
     */
    public void setSubNature(Integer subNature) {
        this.subNature = subNature;
    }

    /**
     * 获取 课程来源，1是科研题目，2是企业题目，3是自拟题目 字段:t_subject.sub_source
     *
     * @return t_subject.sub_source, 课程来源，1是科研题目，2是企业题目，3是自拟题目
     */
    public Integer getSubSource() {
        return subSource;
    }

    /**
     * 设置 课程来源，1是科研题目，2是企业题目，3是自拟题目 字段:t_subject.sub_source
     *
     * @param subSource the value for t_subject.sub_source, 课程来源，1是科研题目，2是企业题目，3是自拟题目
     */
    public void setSubSource(Integer subSource) {
        this.subSource = subSource;
    }

    /**
     * 获取 课题导师，外键对教师表 字段:t_subject.sub_tea_id
     *
     * @return t_subject.sub_tea_id, 课题导师，外键对教师表
     */
    public String getSubTeaId() {
        return subTeaId;
    }

    /**
     * 设置 课题导师，外键对教师表 字段:t_subject.sub_tea_id
     *
     * @param subTeaId the value for t_subject.sub_tea_id, 课题导师，外键对教师表
     */
    public void setSubTeaId(String subTeaId) {
        this.subTeaId = subTeaId == null ? null : subTeaId.trim();
    }

    /**
     * 获取 课题附件 字段:t_subject.sub_file
     *
     * @return t_subject.sub_file, 课题附件
     */
    public String getSubFile() {
        return subFile;
    }

    /**
     * 设置 课题附件 字段:t_subject.sub_file
     *
     * @param subFile the value for t_subject.sub_file, 课题附件
     */
    public void setSubFile(String subFile) {
        this.subFile = subFile == null ? null : subFile.trim();
    }

    /**
     * 获取 开题报告最后的时间 字段:t_subject.first_report_deadline
     *
     * @return t_subject.first_report_deadline, 开题报告最后的时间
     */
    public Date getFirstReportDeadline() {
        return firstReportDeadline;
    }

    /**
     * 设置 开题报告最后的时间 字段:t_subject.first_report_deadline
     *
     * @param firstReportDeadline the value for t_subject.first_report_deadline, 开题报告最后的时间
     */
    public void setFirstReportDeadline(Date firstReportDeadline) {
        this.firstReportDeadline = firstReportDeadline;
    }

    /**
     * 获取 论文定稿最后时间 字段:t_subject.last_report_deadline
     *
     * @return t_subject.last_report_deadline, 论文定稿最后时间
     */
    public Date getLastReportDeadline() {
        return lastReportDeadline;
    }

    /**
     * 设置 论文定稿最后时间 字段:t_subject.last_report_deadline
     *
     * @param lastReportDeadline the value for t_subject.last_report_deadline, 论文定稿最后时间
     */
    public void setLastReportDeadline(Date lastReportDeadline) {
        this.lastReportDeadline = lastReportDeadline;
    }

    /**
     * 获取 学生id，外键对学生表 字段:t_subject.stu_id
     *
     * @return t_subject.stu_id, 学生id，外键对学生表
     */
    public String getStuId() {
        return stuId;
    }

    /**
     * 设置 学生id，外键对学生表 字段:t_subject.stu_id
     *
     * @param stuId the value for t_subject.stu_id, 学生id，外键对学生表
     */
    public void setStuId(String stuId) {
        this.stuId = stuId == null ? null : stuId.trim();
    }

    /**
     * 获取 选定状态，1是待选定，2是待审核，3是通过 字段:t_subject.sub_stu_state
     *
     * @return t_subject.sub_stu_state, 选定状态，1是待选定，2是待审核，3是通过
     */
    public Integer getSubStuState() {
        return subStuState;
    }

    /**
     * 设置 选定状态，1是待选定，2是待审核，3是通过 字段:t_subject.sub_stu_state
     *
     * @param subStuState the value for t_subject.sub_stu_state, 选定状态，1是待选定，2是待审核，3是通过
     */
    public void setSubStuState(Integer subStuState) {
        this.subStuState = subStuState;
    }

    /**
     * 获取 最终评分 字段:t_subject.sub_last_score
     *
     * @return t_subject.sub_last_score, 最终评分
     */
    public Long getSubLastScore() {
        return subLastScore;
    }

    /**
     * 设置 最终评分 字段:t_subject.sub_last_score
     *
     * @param subLastScore the value for t_subject.sub_last_score, 最终评分
     */
    public void setSubLastScore(Long subLastScore) {
        this.subLastScore = subLastScore;
    }

    /**
     * 获取 展示id，外键展示表id 字段:t_subject.show_id
     *
     * @return t_subject.show_id, 展示id，外键展示表id
     */
    public Integer getShowId() {
        return showId;
    }

    /**
     * 设置 展示id，外键展示表id 字段:t_subject.show_id
     *
     * @param showId the value for t_subject.show_id, 展示id，外键展示表id
     */
    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    /**
     * 获取 课题介绍 字段:t_subject.sub_introduce
     *
     * @return t_subject.sub_introduce, 课题介绍
     */
    public String getSubIntroduce() {
        return subIntroduce;
    }

    /**
     * 设置 课题介绍 字段:t_subject.sub_introduce
     *
     * @param subIntroduce the value for t_subject.sub_introduce, 课题介绍
     */
    public void setSubIntroduce(String subIntroduce) {
        this.subIntroduce = subIntroduce == null ? null : subIntroduce.trim();
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher=teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student=student;
    }

    public DesignShow getDesignShow() {
        return designShow;
    }

    public void setDesignShow(DesignShow designShow) {
        this.designShow=designShow;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subId='" + subId + '\'' +
                ", subName='" + subName + '\'' +
                ", subNature=" + subNature +
                ", subSource=" + subSource +
                ", subTeaId='" + subTeaId + '\'' +
                ", subFile='" + subFile + '\'' +
                ", firstReportDeadline=" + firstReportDeadline +
                ", lastReportDeadline=" + lastReportDeadline +
                ", stuId='" + stuId + '\'' +
                ", subStuState=" + subStuState +
                ", subLastScore=" + subLastScore +
                ", showId=" + showId +
                ", subIntroduce='" + subIntroduce + '\'' +
                ", teacher=" + teacher +
                ", student=" + student +
                ", designShow=" + designShow +
                '}';
    }
}
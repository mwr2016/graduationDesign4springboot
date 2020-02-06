package com.graduationaldesign.graduation.pojo;

import cn.hutool.core.date.DateUtil;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
@JsonIgnoreProperties(value = {"handler"})
public class ReplyTeam implements Serializable {

    /**
     * 表字段 : reply_team.id
     */
    private Integer id;

    /**
     * 答辩组名称
     * 表字段 : reply_team.team_name
     */
    private String teamName;

    /**
     * 答辩地址
     * 表字段 : reply_team.team_address
     */
    private String teamAddress;

    /**
     * 答辩时间
     * 表字段 : reply_team.reply_time
     */
    private Date replyTime;

    /**
     * 答辩组长id
     * 表字段 : reply_team.team_leader_id
     */
    private String teamLeaderId;

    private Teacher teacher;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table reply_team
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取  字段:reply_team.id
     *
     * @return reply_team.id,
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置  字段:reply_team.id
     *
     * @param id the value for reply_team.id,
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 答辩组名称 字段:reply_team.team_name
     *
     * @return reply_team.team_name, 答辩组名称
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * 设置 答辩组名称 字段:reply_team.team_name
     *
     * @param teamName the value for reply_team.team_name, 答辩组名称
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName == null ? null : teamName.trim();
    }

    /**
     * 获取 答辩地址 字段:reply_team.team_address
     *
     * @return reply_team.team_address, 答辩地址
     */
    public String getTeamAddress() {
        return teamAddress;
    }

    /**
     * 设置 答辩地址 字段:reply_team.team_address
     *
     * @param teamAddress the value for reply_team.team_address, 答辩地址
     */
    public void setTeamAddress(String teamAddress) {
        this.teamAddress = teamAddress == null ? null : teamAddress.trim();
    }

    /**
     * 获取 答辩时间 字段:reply_team.reply_time
     *
     * @return reply_team.reply_time, 答辩时间
     */
    public String getReplyTime() {
        return DateUtil.formatDateTime(replyTime);
    }

    /**
     * 设置 答辩时间 字段:reply_team.reply_time
     *
     * @param replyTime the value for reply_team.reply_time, 答辩时间
     */
    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    /**
     * 获取 答辩组长id 字段:reply_team.team_leader_id
     *
     * @return reply_team.team_leader_id, 答辩组长id
     */
    public String getTeamLeaderId() {
        return teamLeaderId;
    }

    /**
     * 设置 答辩组长id 字段:reply_team.team_leader_id
     *
     * @param teamLeaderId the value for reply_team.team_leader_id, 答辩组长id
     */
    public void setTeamLeaderId(String teamLeaderId) {
        this.teamLeaderId = teamLeaderId == null ? null : teamLeaderId.trim();
    }

    @JsonIgnore
    public Teacher getTeacher() {
        return teacher;
    }

    @JsonGetter(value = "teacher")
    public Teacher getTeacherDetail() {//自定的方法
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
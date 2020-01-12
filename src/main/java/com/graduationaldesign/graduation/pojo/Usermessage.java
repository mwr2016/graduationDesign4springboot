package com.graduationaldesign.graduation.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;


@JsonIgnoreProperties(value = {"handler"})
public class Usermessage implements Serializable {
    /**
     * 
     * 表字段 : usermessage.id
     */
    private Integer id;

    /**
     * 
     * 表字段 : usermessage.content
     */
    private String content;

    /**
     * 
     * 表字段 : usermessage.replyContent
     */
    private String replycontent;

    /**
     * 
     * 表字段 : usermessage.sendId
     */
    private Integer sendid;

    /**
     * 
     * 表字段 : usermessage.sendeeId
     */
    private Integer sendeeid;

    /**
     * 
     * 表字段 : usermessage.sendTime
     */
    private String sendtime;

    private User user;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table usermessage
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取  字段:usermessage.id
     *
     * @return usermessage.id, 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置  字段:usermessage.id
     *
     * @param id the value for usermessage.id, 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取  字段:usermessage.content
     *
     * @return usermessage.content, 
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置  字段:usermessage.content
     *
     * @param content the value for usermessage.content, 
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 获取  字段:usermessage.replyContent
     *
     * @return usermessage.replyContent, 
     */
    public String getReplycontent() {
        return replycontent;
    }

    /**
     * 设置  字段:usermessage.replyContent
     *
     * @param replycontent the value for usermessage.replyContent, 
     */
    public void setReplycontent(String replycontent) {
        this.replycontent = replycontent == null ? null : replycontent.trim();
    }

    /**
     * 获取  字段:usermessage.sendId
     *
     * @return usermessage.sendId, 
     */
    public Integer getSendid() {
        return sendid;
    }

    /**
     * 设置  字段:usermessage.sendId
     *
     * @param sendid the value for usermessage.sendId, 
     */
    public void setSendid(Integer sendid) {
        this.sendid = sendid;
    }

    /**
     * 获取  字段:usermessage.sendeeId
     *
     * @return usermessage.sendeeId, 
     */
    public Integer getSendeeid() {
        return sendeeid;
    }

    /**
     * 设置  字段:usermessage.sendeeId
     *
     * @param sendeeid the value for usermessage.sendeeId, 
     */
    public void setSendeeid(Integer sendeeid) {
        this.sendeeid = sendeeid;
    }

    /**
     * 获取  字段:usermessage.sendTime
     *
     * @return usermessage.sendTime, 
     */
    public String getSendtime() {
        return sendtime;
    }

    /**
     * 设置  字段:usermessage.sendTime
     *
     * @param sendtime the value for usermessage.sendTime, 
     */
    public void setSendtime(String sendtime) {
        this.sendtime = sendtime == null ? null : sendtime.trim();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user=user;
    }
}
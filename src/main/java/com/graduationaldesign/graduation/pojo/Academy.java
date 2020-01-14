package com.graduationaldesign.graduation.pojo;

import java.io.Serializable;

public class Academy implements Serializable {
    /**
     * 
     * 表字段 : t_academy.id
     */
    private Integer id;

    /**
     * 学院名称
     * 表字段 : t_academy.aca_name
     */
    private String acaName;

    /**
     * 学院介绍
     * 表字段 : t_academy.aca_introduce
     */
    private String acaIntroduce;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_academy
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取  字段:t_academy.id
     *
     * @return t_academy.id, 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置  字段:t_academy.id
     *
     * @param id the value for t_academy.id, 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 学院名称 字段:t_academy.aca_name
     *
     * @return t_academy.aca_name, 学院名称
     */
    public String getAcaName() {
        return acaName;
    }

    /**
     * 设置 学院名称 字段:t_academy.aca_name
     *
     * @param acaName the value for t_academy.aca_name, 学院名称
     */
    public void setAcaName(String acaName) {
        this.acaName = acaName == null ? null : acaName.trim();
    }

    /**
     * 获取 学院介绍 字段:t_academy.aca_introduce
     *
     * @return t_academy.aca_introduce, 学院介绍
     */
    public String getAcaIntroduce() {
        return acaIntroduce;
    }

    /**
     * 设置 学院介绍 字段:t_academy.aca_introduce
     *
     * @param acaIntroduce the value for t_academy.aca_introduce, 学院介绍
     */
    public void setAcaIntroduce(String acaIntroduce) {
        this.acaIntroduce = acaIntroduce == null ? null : acaIntroduce.trim();
    }
}
package com.graduationaldesign.graduation.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import lombok.Data;

@Data
@JsonIgnoreProperties(value = {"handler"})
public class Admin implements Serializable {

    /**
     * 管理员账号
     * 表字段 : t_admin.admin_id
     */
    private String adminId;

    /**
     * 登陆密码
     * 表字段 : t_admin.admin_password
     */
    private String adminPassword;

    /**
     * 管理员名称
     * 表字段 : t_admin.admin_name
     */
    private String adminName;

    /**
     * 性别
     * 表字段 : t_admin.admin_sex
     */
    private String adminSex;

    /**
     * 年龄
     * 表字段 : t_admin.admin_age
     */
    private Integer adminAge;

    /**
     * 生日
     * 表字段 : t_admin.admin_birthday
     */
    private String adminBirthday;

    /**
     * 电话
     * 表字段 : t_admin.admin_phone
     */
    private String adminPhone;

    /**
     * 邮箱
     * 表字段 : t_admin.admin_mail
     */
    private String adminMail;

    /**
     * 地址
     * 表字段 : t_admin.admin_address
     */
    private String adminAddress;

    /**
     * 备注
     * 表字段 : t_admin.admin_remarks
     */
    private String adminRemarks;

    /**
     * 1是小助手，2是超级管理员
     * 表字段 : t_admin.admin_type
     */
    private Integer adminType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_admin
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    public Admin(String adminId, String adminPassword) {
        this.adminId = adminId;
        this.adminPassword = adminPassword;
    }

    public Admin() {
    }

    public Admin(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    /**
     * 获取 管理员账号 字段:t_admin.admin_id
     *
     * @return t_admin.admin_id, 管理员账号
     */
    public String getAdminId() {
        return adminId;
    }

    /**
     * 设置 管理员账号 字段:t_admin.admin_id
     *
     * @param adminId the value for t_admin.admin_id, 管理员账号
     */
    public void setAdminId(String adminId) {
        this.adminId = adminId == null ? null : adminId.trim();
    }

    /**
     * 获取 登陆密码 字段:t_admin.admin_password
     *
     * @return t_admin.admin_password, 登陆密码
     */
    public String getAdminPassword() {
        return adminPassword;
    }

    /**
     * 设置 登陆密码 字段:t_admin.admin_password
     *
     * @param adminPassword the value for t_admin.admin_password, 登陆密码
     */
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    /**
     * 获取 管理员名称 字段:t_admin.admin_name
     *
     * @return t_admin.admin_name, 管理员名称
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * 设置 管理员名称 字段:t_admin.admin_name
     *
     * @param adminName the value for t_admin.admin_name, 管理员名称
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    /**
     * 获取 性别 字段:t_admin.admin_sex
     *
     * @return t_admin.admin_sex, 性别
     */
    public String getAdminSex() {
        return adminSex;
    }

    /**
     * 设置 性别 字段:t_admin.admin_sex
     *
     * @param adminSex the value for t_admin.admin_sex, 性别
     */
    public void setAdminSex(String adminSex) {
        this.adminSex = adminSex == null ? null : adminSex.trim();
    }

    /**
     * 获取 年龄 字段:t_admin.admin_age
     *
     * @return t_admin.admin_age, 年龄
     */
    public Integer getAdminAge() {
        return adminAge;
    }

    /**
     * 设置 年龄 字段:t_admin.admin_age
     *
     * @param adminAge the value for t_admin.admin_age, 年龄
     */
    public void setAdminAge(Integer adminAge) {
        this.adminAge = adminAge;
    }

    /**
     * 获取 生日 字段:t_admin.admin_birthday
     *
     * @return t_admin.admin_birthday, 生日
     */
    public String getAdminBirthday() {
        return adminBirthday;
    }

    /**
     * 设置 生日 字段:t_admin.admin_birthday
     *
     * @param adminBirthday the value for t_admin.admin_birthday, 生日
     */
    public void setAdminBirthday(String adminBirthday) {
        this.adminBirthday = adminBirthday == null ? null : adminBirthday.trim();
    }

    /**
     * 获取 电话 字段:t_admin.admin_phone
     *
     * @return t_admin.admin_phone, 电话
     */
    public String getAdminPhone() {
        return adminPhone;
    }

    /**
     * 设置 电话 字段:t_admin.admin_phone
     *
     * @param adminPhone the value for t_admin.admin_phone, 电话
     */
    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone == null ? null : adminPhone.trim();
    }

    /**
     * 获取 邮箱 字段:t_admin.admin_mail
     *
     * @return t_admin.admin_mail, 邮箱
     */
    public String getAdminMail() {
        return adminMail;
    }

    /**
     * 设置 邮箱 字段:t_admin.admin_mail
     *
     * @param adminMail the value for t_admin.admin_mail, 邮箱
     */
    public void setAdminMail(String adminMail) {
        this.adminMail = adminMail == null ? null : adminMail.trim();
    }

    /**
     * 获取 地址 字段:t_admin.admin_address
     *
     * @return t_admin.admin_address, 地址
     */
    public String getAdminAddress() {
        return adminAddress;
    }

    /**
     * 设置 地址 字段:t_admin.admin_address
     *
     * @param adminAddress the value for t_admin.admin_address, 地址
     */
    public void setAdminAddress(String adminAddress) {
        this.adminAddress = adminAddress == null ? null : adminAddress.trim();
    }

    /**
     * 获取 备注 字段:t_admin.admin_remarks
     *
     * @return t_admin.admin_remarks, 备注
     */
    public String getAdminRemarks() {
        return adminRemarks;
    }

    /**
     * 设置 备注 字段:t_admin.admin_remarks
     *
     * @param adminRemarks the value for t_admin.admin_remarks, 备注
     */
    public void setAdminRemarks(String adminRemarks) {
        this.adminRemarks = adminRemarks == null ? null : adminRemarks.trim();
    }

    /**
     * 获取 1是小助手，2是超级管理员 字段:t_admin.admin_type
     *
     * @return t_admin.admin_type, 1是小助手，2是超级管理员
     */
    public Integer getAdminType() {
        return adminType;
    }

    /**
     * 设置 1是小助手，2是超级管理员 字段:t_admin.admin_type
     *
     * @param adminType the value for t_admin.admin_type, 1是小助手，2是超级管理员
     */
    public void setAdminType(Integer adminType) {
        this.adminType = adminType;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId='" + adminId + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                ", adminName='" + adminName + '\'' +
                ", adminSex='" + adminSex + '\'' +
                ", adminAge=" + adminAge +
                ", adminBirthday='" + adminBirthday + '\'' +
                ", adminPhone='" + adminPhone + '\'' +
                ", adminMail='" + adminMail + '\'' +
                ", adminAddress='" + adminAddress + '\'' +
                ", adminRemarks='" + adminRemarks + '\'' +
                ", adminType=" + adminType +
                '}';
    }

    public void setModel(UserModel userModel) {
        this.setAdminAddress(userModel.getAddress());
        this.setAdminAge(userModel.getAge());
        this.setAdminBirthday(userModel.getBirthday());
//        this.setStuClass(userModel.getClass_());
        this.setAdminMail(userModel.getMail());
//        this.setStuMajor(userModel.getMajor());
        this.setAdminName(userModel.getName());
        this.setAdminPhone(userModel.getPhone());
        this.setAdminRemarks(userModel.getRemarks());
        this.setAdminSex(userModel.getSex());
    }
}
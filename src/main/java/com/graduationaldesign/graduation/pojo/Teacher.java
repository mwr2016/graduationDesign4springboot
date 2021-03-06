package com.graduationaldesign.graduation.pojo;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import lombok.Data;

@Data
@JsonIgnoreProperties(value = {"handler"})
public class Teacher implements Serializable {

    /**
     * 教师id
     * 表字段 : t_teacher.tea_id
     */
    private String teaId;

    /**
     * 教师密码
     * 表字段 : t_teacher.tea_password
     */
    private String teaPassword;

    /**
     * 教师名称
     * 表字段 : t_teacher.tea_name
     */
    private String teaName;

    /**
     * 教师性别
     * 表字段 : t_teacher.tea_sex
     */
    private String teaSex;

    /**
     * 教师年龄
     * 表字段 : t_teacher.tea_age
     */
    private Integer teaAge;

    /**
     * 教师生日
     * 表字段 : t_teacher.tea_birthday
     */
    private String teaBirthday;

    /**
     * 教师电话
     * 表字段 : t_teacher.tea_phone
     */
    private String teaPhone;

    /**
     * 教师邮箱
     * 表字段 : t_teacher.tea_mail
     */
    private String teaMail;

    /**
     * 教师地址
     * 表字段 : t_teacher.tea_address
     */
    private String teaAddress;

    /**
     * 备注
     * 表字段 : t_teacher.tea_remarks
     */
    private String teaRemarks;

    /**
     * 学院id
     * 表字段 : t_teacher.academy_id
     */
    private Integer academyId;

    private Academy academy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_teacher
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 教师id 字段:t_teacher.tea_id
     *
     * @return t_teacher.tea_id, 教师id
     */
    public String getTeaId() {
        return teaId;
    }

    /**
     * 设置 教师id 字段:t_teacher.tea_id
     *
     * @param teaId the value for t_teacher.tea_id, 教师id
     */
    public void setTeaId(String teaId) {
        this.teaId = teaId == null ? null : teaId.trim();
    }

    /**
     * 获取 教师密码 字段:t_teacher.tea_password
     *
     * @return t_teacher.tea_password, 教师密码
     */
    public String getTeaPassword() {
        return teaPassword;
    }

    /**
     * 设置 教师密码 字段:t_teacher.tea_password
     *
     * @param teaPassword the value for t_teacher.tea_password, 教师密码
     */
    public void setTeaPassword(String teaPassword) {
        this.teaPassword = teaPassword == null ? null : teaPassword.trim();
    }

    /**
     * 获取 教师名称 字段:t_teacher.tea_name
     *
     * @return t_teacher.tea_name, 教师名称
     */
    public String getTeaName() {
        return teaName;
    }

    /**
     * 设置 教师名称 字段:t_teacher.tea_name
     *
     * @param teaName the value for t_teacher.tea_name, 教师名称
     */
    public void setTeaName(String teaName) {
        this.teaName = teaName == null ? null : teaName.trim();
    }

    /**
     * 获取 教师性别 字段:t_teacher.tea_sex
     *
     * @return t_teacher.tea_sex, 教师性别
     */
    public String getTeaSex() {
        return teaSex;
    }

    /**
     * 设置 教师性别 字段:t_teacher.tea_sex
     *
     * @param teaSex the value for t_teacher.tea_sex, 教师性别
     */
    public void setTeaSex(String teaSex) {
        this.teaSex = teaSex == null ? null : teaSex.trim();
    }

    /**
     * 获取 教师年龄 字段:t_teacher.tea_age
     *
     * @return t_teacher.tea_age, 教师年龄
     */
    public Integer getTeaAge() {
        return teaAge;
    }

    /**
     * 设置 教师年龄 字段:t_teacher.tea_age
     *
     * @param teaAge the value for t_teacher.tea_age, 教师年龄
     */
    public void setTeaAge(Integer teaAge) {
        this.teaAge = teaAge;
    }

    /**
     * 获取 教师生日 字段:t_teacher.tea_birthday
     *
     * @return t_teacher.tea_birthday, 教师生日
     */
    public String getTeaBirthday() {
        return teaBirthday;
    }

    /**
     * 设置 教师生日 字段:t_teacher.tea_birthday
     *
     * @param teaBirthday the value for t_teacher.tea_birthday, 教师生日
     */
    public void setTeaBirthday(String teaBirthday) {
        this.teaBirthday = teaBirthday == null ? null : teaBirthday.trim();
    }

    /**
     * 获取 教师电话 字段:t_teacher.tea_phone
     *
     * @return t_teacher.tea_phone, 教师电话
     */
    public String getTeaPhone() {
        return teaPhone;
    }

    /**
     * 设置 教师电话 字段:t_teacher.tea_phone
     *
     * @param teaPhone the value for t_teacher.tea_phone, 教师电话
     */
    public void setTeaPhone(String teaPhone) {
        this.teaPhone = teaPhone == null ? null : teaPhone.trim();
    }

    /**
     * 获取 教师邮箱 字段:t_teacher.tea_mail
     *
     * @return t_teacher.tea_mail, 教师邮箱
     */
    public String getTeaMail() {
        return teaMail;
    }

    /**
     * 设置 教师邮箱 字段:t_teacher.tea_mail
     *
     * @param teaMail the value for t_teacher.tea_mail, 教师邮箱
     */
    public void setTeaMail(String teaMail) {
        this.teaMail = teaMail == null ? null : teaMail.trim();
    }

    /**
     * 获取 教师地址 字段:t_teacher.tea_address
     *
     * @return t_teacher.tea_address, 教师地址
     */
    public String getTeaAddress() {
        return teaAddress;
    }

    /**
     * 设置 教师地址 字段:t_teacher.tea_address
     *
     * @param teaAddress the value for t_teacher.tea_address, 教师地址
     */
    public void setTeaAddress(String teaAddress) {
        this.teaAddress = teaAddress == null ? null : teaAddress.trim();
    }

    /**
     * 获取 备注 字段:t_teacher.tea_remarks
     *
     * @return t_teacher.tea_remarks, 备注
     */
    public String getTeaRemarks() {
        return teaRemarks;
    }

    /**
     * 设置 备注 字段:t_teacher.tea_remarks
     *
     * @param teaRemarks the value for t_teacher.tea_remarks, 备注
     */
    public void setTeaRemarks(String teaRemarks) {
        this.teaRemarks = teaRemarks == null ? null : teaRemarks.trim();
    }

    /**
     * 获取 学院id 字段:t_teacher.academy_id
     *
     * @return t_teacher.academy_id, 学院id
     */
    public Integer getAcademyId() {
        return academyId;
    }

    /**
     * 设置 学院id 字段:t_teacher.academy_id
     *
     * @param academyId the value for t_teacher.academy_id, 学院id
     */
    public void setAcademyId(Integer academyId) {
        this.academyId = academyId;
    }

    @JsonIgnore
    public Academy getAcademy() {
        return academy;
    }

    @JsonGetter(value = "academy")
    public Academy getAcademyDetail() {//自定的方法
        return academy;
    }

    public void setAcademy(Academy academy) {
        this.academy = academy;
    }

    public Teacher(String teaId, String teaPassword) {
        this.teaId = teaId;
        this.teaPassword = teaPassword;
    }

    public Teacher() {

    }

    public Teacher(String teaPassword) {
        this.teaPassword = teaPassword;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teaId='" + teaId + '\'' +
                ", teaPassword='" + teaPassword + '\'' +
                ", teaName='" + teaName + '\'' +
                ", teaSex='" + teaSex + '\'' +
                ", teaAge=" + teaAge +
                ", teaBirthday='" + teaBirthday + '\'' +
                ", teaPhone='" + teaPhone + '\'' +
                ", teaMail='" + teaMail + '\'' +
                ", teaAddress='" + teaAddress + '\'' +
                ", teaRemarks='" + teaRemarks + '\'' +
                ", academyId=" + academyId +
                ", academy=" + academy +
                '}';
    }

    public void setModel(UserModel userModel) {
        this.setTeaAddress(userModel.getAddress());
        this.setTeaAge(userModel.getAge());
        this.setTeaBirthday(userModel.getBirthday());
//        this.setStuClass(userModel.getClass_());
        this.setTeaMail(userModel.getMail());
//        this.setStuMajor(userModel.getMajor());
        this.setTeaName(userModel.getName());
        this.setTeaPhone(userModel.getPhone());
        this.setTeaRemarks(userModel.getRemarks());
        this.setTeaSex(userModel.getSex());
    }
}
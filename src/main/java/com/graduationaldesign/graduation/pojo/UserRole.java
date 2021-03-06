package com.graduationaldesign.graduation.pojo;

import java.io.Serializable;
import lombok.Data;

@Data
public class UserRole implements Serializable {

    /**
     * 表字段 : user_role.id
     */
    private Long id;

    /**
     * 管理员id，外键
     * 表字段 : user_role.admin_id
     */
    private String adminId;

    /**
     * 角色id，外键
     * 表字段 : user_role.role_id
     */
    private Long roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_role
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取  字段:user_role.id
     *
     * @return user_role.id,
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置  字段:user_role.id
     *
     * @param id the value for user_role.id,
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 管理员id，外键 字段:user_role.admin_id
     *
     * @return user_role.admin_id, 管理员id，外键
     */
    public String getAdminId() {
        return adminId;
    }

    /**
     * 设置 管理员id，外键 字段:user_role.admin_id
     *
     * @param adminId the value for user_role.admin_id, 管理员id，外键
     */
    public void setAdminId(String adminId) {
        this.adminId = adminId == null ? null : adminId.trim();
    }

    /**
     * 获取 角色id，外键 字段:user_role.role_id
     *
     * @return user_role.role_id, 角色id，外键
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置 角色id，外键 字段:user_role.role_id
     *
     * @param roleId the value for user_role.role_id, 角色id，外键
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
package com.graduationaldesign.graduation.service;

import com.graduationaldesign.graduation.pojo.Role;

/**
 * @Author: wuzhuhao
 * @Date: 2020/1/20 21:09
 */
public interface RoleService {

    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

}

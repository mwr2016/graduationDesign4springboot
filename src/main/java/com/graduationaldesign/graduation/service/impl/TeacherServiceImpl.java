package com.graduationaldesign.graduation.service.impl;

import com.graduationaldesign.graduation.mapper.TeacherMapper;
import com.graduationaldesign.graduation.pojo.*;
import com.graduationaldesign.graduation.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wuzhuhao
 * @Date: 2020/1/15 10:04
 */
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherMapper teacherMapper;
    @Override
    public Teacher login(Teacher teacher) {
        TeacherExample example = new TeacherExample();
        TeacherExample.Criteria criteria = example.createCriteria();
        criteria.andTeaIdEqualTo(teacher.getTeaId());
        if (teacherMapper.selectByExample(example).size()==0){
            throw new RuntimeException("账号不存在！");
        }
        else{
            criteria.andTeaPasswordEqualTo(teacher.getTeaPassword());
            List<Teacher> list = teacherMapper.selectByExample(example);
            if (list.size()==0){
                throw new RuntimeException("密码错误！");
            }else{
                return list.get(0);
            }
        }
    }

    private boolean checkPassword(String id,String oldPassword){
        Teacher teacher = teacherMapper.selectByPrimaryKey(id);
        boolean flag = true;
        if (!teacher.getTeaPassword().equals(oldPassword)){
            flag = false;
        }
        return flag;
    }

    public String changPassword(String id,String oldPassword,String newPassword){
        if (!checkPassword(id, oldPassword)){
            throw new RuntimeException("原密码不正确!");
        }
        TeacherExample studentExample = new TeacherExample();
        TeacherExample.Criteria criteria = studentExample.createCriteria();
        criteria.andTeaIdEqualTo(id);
        if (teacherMapper.updateByExampleSelective(new Teacher(newPassword),studentExample)>0){
            return "修改成功！";
        }
        return "修改失败！";
    }

    private Teacher getUsetById(String id){
        Teacher list = teacherMapper.selectByPrimaryKey(id);
        return list;
    }
    public String changeInformation(UserModel userModel) {
        String message;
        Teacher teacher = getUsetById(userModel.getId());
        if (teacher==null){
            throw new RuntimeException("账号不存在,请重新登陆！");
        }
        teacher.setModel(userModel);
        if (teacherMapper.updateByPrimaryKey(teacher)>0){
            message = "修改成功！";
        }else{
            message = "修改失败！";
        }
        return message;
    }
}

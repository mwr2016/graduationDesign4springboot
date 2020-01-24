package com.graduationaldesign.graduation.service.impl;

import com.graduationaldesign.graduation.mapper.StudentMapper;
import com.graduationaldesign.graduation.pojo.Student;
import com.graduationaldesign.graduation.pojo.StudentExample;
import com.graduationaldesign.graduation.pojo.UserModel;
import com.graduationaldesign.graduation.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.List;

/**
 * @Author: wuzhuhao
 * @Date: 2020/1/14 19:33
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student login(Student student) {
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andStuIdEqualTo(student.getStuId());
        if (studentMapper.selectByExample(studentExample).size()==0){
            throw new RuntimeException("账号不存在！");
        }
        else{
            criteria.andStuPasswordEqualTo(student.getStuPassword());
            List<Student> list = studentMapper.selectByExample(studentExample);
            if (list.size()==0){
                throw new RuntimeException("密码错误！");
            }else{
                list.get(0).getAcademy();
                return list.get(0);
            }
        }
    }

    public Student getStuById(String id){
        Student student = studentMapper.selectByPrimaryKey(id);
        return student;
    }
    public String changeInformation(UserModel userModel) {
        String message;
        Student student = getStuById(userModel.getId());
        if (student==null){
            throw new RuntimeException("账号不存在,请重新登陆！");
        }
        student.setModel(userModel);
        if (studentMapper.updateByPrimaryKey(student)>0){
            message = "修改成功！";
        }else{
            message = "修改失败！";
        }
        return message;
    }


    private boolean checkPassword(String id,String oldPassword){
        Student student = studentMapper.selectByPrimaryKey(id);
        boolean flag = true;
        if (!student.getStuPassword().equals(oldPassword)){
                flag = false;
        }
        return flag;
    }

    public String changPassword(String id,String oldPassword,String newPassword){
        if (!checkPassword(id, oldPassword)){
            throw new RuntimeException("原密码不正确!");
        }
        StudentExample studentExample = new StudentExample();
        StudentExample.Criteria criteria = studentExample.createCriteria();
        criteria.andStuIdEqualTo(id);
        if (studentMapper.updateByExampleSelective(new Student(newPassword),studentExample)>0){
            return "修改成功！";
        }
        return "修改失败！";
    }


}

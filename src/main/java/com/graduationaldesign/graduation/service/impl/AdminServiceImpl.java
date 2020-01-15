package com.graduationaldesign.graduation.service.impl;

import com.graduationaldesign.graduation.mapper.AdminMapper;
import com.graduationaldesign.graduation.pojo.Admin;
import com.graduationaldesign.graduation.pojo.AdminExample;
import com.graduationaldesign.graduation.pojo.Teacher;
import com.graduationaldesign.graduation.pojo.TeacherExample;
import com.graduationaldesign.graduation.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wuzhuhao
 * @Date: 2020/1/14 16:50
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;
    @Override
    public Admin getAdminByName(String adminID) {
        //模拟数据库查询，正常情况此处是从数据库或者缓存查询。
        return getMapByName(adminID);
    }

    @Override
    public Admin login(Admin admin) {
        AdminExample example = new AdminExample();
        AdminExample.Criteria criteria = example.createCriteria();
        criteria.andAdminIdEqualTo(admin.getAdminId());
        if (adminMapper.selectByExample(example).size()==0){
            throw new RuntimeException("账号不存在！");
        }
        else{
            criteria.andAdminPasswordEqualTo(admin.getAdminPassword());
            List<Admin> list = adminMapper.selectByExample(example);
            if (list.size()==0){
                throw new RuntimeException("密码错误！");
            }else{
                return list.get(0);
            }
        }
    }

    /**
     * 模拟数据库查询
     * @param userName
     * @return
     */
    private Admin getMapByName(String userName){
        //共添加两个用户，两个用户都是admin一个角色，
        //wsl有query和add权限，zhangsan只有一个query权限
//        Permissions permissions1 = new Permissions("1","query");
//        Permissions permissions2 = new Permissions("2","add");
//        Set<Permissions> permissionsSet = new HashSet<>();
//        permissionsSet.add(permissions1);
//        permissionsSet.add(permissions2);
//        Role role = new Role("1","admin",permissionsSet);
//        Set<Role> roleSet = new HashSet<>();
//        roleSet.add(role);
//        Admin user = new Admin(1,"wsl","123456",roleSet);
//        Map<String ,User> map = new HashMap<>();
//        map.put(user.getUserName(), user);
//
//        Permissions permissions3 = new Permissions("3","query");
//        Set<Permissions> permissionsSet1 = new HashSet<>();
//        permissionsSet1.add(permissions3);
//        Role role1 = new Role("2","user",permissionsSet1);
//        Set<Role> roleSet1 = new HashSet<>();
//        roleSet1.add(role1);
//        User user1 = new User(2,"zhangsan","123456",roleSet1);
//        map.put(user1.getUserName(), user1);
//        return map.get(userName);
        return null;
    }
}

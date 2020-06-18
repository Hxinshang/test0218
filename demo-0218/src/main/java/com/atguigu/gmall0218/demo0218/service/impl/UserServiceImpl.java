package com.atguigu.gmall0218.demo0218.service.impl;

import com.atguigu.gmall0218.demo0218.bean.UserInfo;
import com.atguigu.gmall0218.demo0218.mapper.UserInfoMapper;
import com.atguigu.gmall0218.demo0218.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author chujian
 * @create 2020-06-18 21:07
 */
@Service
public class UserServiceImpl implements UserService {

    //表示当前的UserinfoMapper在容器中
    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public void addUser(UserInfo userInfo) {
        //insertSelective有选择的添加
        userInfoMapper.insertSelective(userInfo);
    }

    @Override
    public void updUser(UserInfo userInfo) {
        //根据id修改name
        userInfoMapper.updateByPrimaryKeySelective(userInfo);
    }

    @Override
    public void updUserByName(UserInfo userInfo) {
        //根据name修改loginName

        //第一个参数：userinfo 表示要修改的数据
        //第二个参数：表示根据什么条件修改
        Example example = new Example(UserInfo.class);
        //创建修改条件
        //第一个参数：property 指的是实体类的属性名还是数据库表中的字段名
        //第二个参数：修改的具体值
        example.createCriteria().andEqualTo("name", userInfo.getName());
        userInfoMapper.updateByExampleSelective(userInfo, example);
    }

    @Override
    public void delUser(UserInfo userInfo) {
        //Example 主要作用就是封装条件
        Example example = new Example(UserInfo.class);
        example.createCriteria().andEqualTo("name", userInfo.getName());
        userInfoMapper.deleteByExample(example);
    }
}

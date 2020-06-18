package com.atguigu.gmall0218.demo0218.controller;

import com.atguigu.gmall0218.demo0218.bean.UserInfo;
import com.atguigu.gmall0218.demo0218.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chujian
 * @create 2020-06-18 21:10
 */
@RestController
public class UserInfoController {

    //调用服务层
    @Autowired
    private UserService userService;

    @RequestMapping("findAll")
    public List<UserInfo> findAll() {
        return userService.findAll();
    }

    //数据应该从前台页面过来
    @RequestMapping("addUser")
    public void addUser(UserInfo userInfo) {
        userInfo.setLoginName("admin");
        userInfo.setPasswd("66666");

        userService.addUser(userInfo);

        //获取添加之后的主键
        System.out.println(userInfo.getId());

    }

    @RequestMapping("updById")
    public String updById(UserInfo userInfo) {
        userInfo.setName("0218 优秀");
        userInfo.setId("4");

        userService.updUser(userInfo);
        return "ok";
    }

    @RequestMapping("updByIdName")
    public String updByIdName(UserInfo userInfo) {
        userInfo.setName("0218 优秀");
        userInfo.setId("4");
        userInfo.setLoginName("Administrator");
        userService.updUserByName(userInfo);
        return "ok";


    }

    @RequestMapping("delUser")
    public String delUser(UserInfo userInfo) {
        userService.delUser(userInfo);
        return "OK";
    }

    @RequestMapping("delUserByName")
    public String delUserByName(UserInfo userInfo) {
        userService.delUser(userInfo);
        return "OK";
    }

    @RequestMapping("delUserByNickName")
    public String delUserByNickName(UserInfo userInfo) {
        userService.delUser(userInfo);
        return "OK";
    }
}

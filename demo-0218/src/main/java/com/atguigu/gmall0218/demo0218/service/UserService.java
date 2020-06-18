package com.atguigu.gmall0218.demo0218.service;

import com.atguigu.gmall0218.demo0218.bean.UserInfo;

import java.util.List;

/**
 * @author chujian
 * @create 2020-06-18 21:06
 */
//业务逻辑层
public interface UserService {
    /**
     * 查询所有数据
     * @return
     */
    List<UserInfo> findAll();

    /**
     *
     * @param userInfo
     */
    void addUser(UserInfo userInfo);

    /**
     * 修改数据
     */
    void updUser(UserInfo userInfo);
    /**
     * 修改数据
     */
    void updUserByName(UserInfo userInfo);

    // 删除 boolean , int ,void

    /**
     *  删除数据
     */
    void delUser(UserInfo userInfo);


}

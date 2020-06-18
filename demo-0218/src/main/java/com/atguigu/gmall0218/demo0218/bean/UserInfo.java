package com.atguigu.gmall0218.demo0218.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author chujian
 * @create 2020-06-18 20:51
 */
@Data
public class UserInfo implements Serializable {
    //通用mapper注解
    @Id//表示主键
    @Column//普通字段列
    @GeneratedValue(strategy = GenerationType.IDENTITY)//获取数据库主键自增
    private String id;
    @Column
    private String loginName;
    @Column
    private String nickName;
    @Column
    private String passwd;
    @Column
    private String name;
    @Column
    private String phoneNum;
    @Column
    private String email;
    @Column
    private String headImg;
    @Column
    private String userLevel;
}


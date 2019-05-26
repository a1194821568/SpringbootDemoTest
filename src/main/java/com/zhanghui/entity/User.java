package com.zhanghui.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonFormat;

@Data
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String passWord;
    @JsonFormat
    private Date createTime;
    private String mark;
}
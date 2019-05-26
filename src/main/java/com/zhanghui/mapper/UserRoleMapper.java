package com.zhanghui.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.zhanghui.config.MyMapper;
import com.zhanghui.entity.UserRole;

@Mapper
public interface UserRoleMapper extends MyMapper<UserRole>{

}
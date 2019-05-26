package com.zhanghui.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.zhanghui.config.MyMapper;
import com.zhanghui.entity.User;


@Mapper
public interface TestMapper extends MyMapper<User> {

	@Select("SELECT * FROM 	user WHERE user_name = #{userName}")
	User findByName(@Param("userName") String userName);

	
}
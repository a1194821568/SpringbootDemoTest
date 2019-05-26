package com.zhanghui.controller;

import java.util.List;

import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhanghui.entity.User;
import com.zhanghui.service.TestService;

@Controller
public class TestController {

	@GetMapping("/")
	@ResponseBody
	String home (){
		return "hello world;";
	}
	
	//注入service类
	@Autowired
	private TestService testService;
	
	//新加方法
	@GetMapping("/get")
	@ResponseBody
	public User getUser(){
		return testService.getUser();
	}
	
	//连接数据库方法
	@GetMapping("/find")
	@ResponseBody
	public User findByName(){
	//这个拉萨附近是我自己在数据库中添加的数据
		return testService.findByName("拉萨附近");
	}
	
	//添加测试通用mapper
	@ApiOperation(value="获取用户列表,234测试通用mapper", notes="获取用户列表,234测试通用mapper")
	@GetMapping("/qureyUser")
	@ResponseBody
	public List<User> getUserMapper(){
		return testService.getUserMapper();
	}
	
	
	//添加新增方法 并测试事物
	@ApiOperation(value = "添加新增用户方法 并测试事物",notes = "添加新增用户方法 并测试事物")
	@PostMapping("/test/add")
	@ResponseBody
	public int addUser(User user){
		return testService.addUser(user);
	}
	
}

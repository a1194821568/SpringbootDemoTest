package com.zhanghui.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhanghui.entity.User;
import com.zhanghui.entity.UserRole;
import com.zhanghui.mapper.TestMapper;
import com.zhanghui.mapper.UserRoleMapper;
@Service
public class TestService {
	public User getUser(){
		return new User();
	}
	
	//注入dao层的mapper接口
	@Autowired
	private TestMapper testMapper;
	
	//连接数据库方法
	public User findByName(String userName){
		return testMapper.findByName(userName);
	}
	
	public List<User> getUserMapper(){
		return testMapper.selectAll();
	}
	
	//添加新增方法 并测试事物
		@Transactional
		public int  addUser(User user) {
			// TODO 自动生成的方法存根
			int i = testMapper.insert(user);
			System.out.println(user.getId());
			int ss = addRole(user.getId());
			System.out.println("sssss==" + ss);
		//注意下面这两行是报错的 为了测试事物是否可用 正常添加时需要把这个去掉
			/*List list = new ArrayList<User>();
			list.get(0);*/
			//或者使用下面这种方式 抛出异常
			if (true) {
		        throw new RuntimeException("save 抛异常了");
		    }
			return i;
		}

		@Autowired
		private UserRoleMapper userRoleMapper;
		
		
		public int addRole(Long id){
			UserRole record = new UserRole();
			record.setStatus(1);
			record.setUserId(id);
			record.setRoleId(id);
			int i = userRoleMapper.insertSelective(record);
			return i;
		}

}
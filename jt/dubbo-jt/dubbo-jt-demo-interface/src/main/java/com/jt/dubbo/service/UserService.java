package com.jt.dubbo.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.jt.dubbo.pojo.User;

public interface UserService {
	//定义接口一查询全部的用户数据信息
	List<User> findAll();
	
	@Transactional
	void saveUser(User user);
}

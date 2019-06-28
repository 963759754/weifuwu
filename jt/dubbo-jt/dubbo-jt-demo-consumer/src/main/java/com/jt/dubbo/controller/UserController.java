package com.jt.dubbo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jt.dubbo.pojo.User;
import com.jt.dubbo.service.UserService;

@RestController
public class UserController {
	
	/**
	 * springboot利用dubbo注解实例化接口
	 * timeout=3000定义时间
	 * check=true 当服务器启动检查是否有提供者
	 *	如果没有提供者,则程序启动保存
	 * check=false
	 * 当程序启动时不会检查是否有提供者,当程序调用检查.
	 * 
	 */
	
	//springboot利用dubbo注解实例化接口的对象
	@Reference(timeout=3000,check=false,loadbalance="roundRobin")
	private UserService userService;
	
	@RequestMapping("/findAll")
	public List<User> findAll(){
		
		return userService.findAll();
	}
	
	@RequestMapping("/saveUser/{name}/{age}/{sex}")
	public String saveUser(User user) {
		
		userService.saveUser(user);
		return "用户入库成功!!!";
	}
}

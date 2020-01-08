package com.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.exam.pojo.User;
import com.exam.service.UserService;

import entity.Result;
import entity.StatusCode;

@RestController
public class UserController {
	
	@Reference
	private UserService userService;
	
	@RequestMapping("login")
	public Result login(@RequestBody User user)
	{
		User login = userService.login(user);
		if(login==null)
		{
			return new Result(false, StatusCode.ERROR, "登录失败");
		}
		else {
			return new Result(true, StatusCode.OK, "登录成功",login);
			
		}
	}
}

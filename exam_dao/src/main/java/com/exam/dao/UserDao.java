package com.exam.dao;

import org.apache.ibatis.annotations.Select;

import com.exam.pojo.User;

public interface UserDao {

	@Select("select * from user where username=#{username} and password=#{password}")
	public User login(User user);
}

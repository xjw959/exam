package com.exam.service;

import java.util.List;


import com.exam.pojo.Clazz;

import entity.PageResult;

public interface ClazzService {

	/*
	 * 列表,分页,模糊
	 */
	public PageResult<Clazz> ClazzList(String name,Integer page,Integer size);
	/*
	 * 修改
	 * 上架
	 */
	public void updateStuts(int id);
	/*
	 * 修改
	 * 下架
	 */
	public void updateStutsDrop(int id);
}

package com.exam.service;

import java.util.List;


import com.exam.pojo.Order;

import entity.PageResult;

public interface OrderService {

	/*
	 * 列表方法
	 */
	public List<Order> orederList();
	/*
	 * 修改
	 * 上架
	 */
	public void updateStuts(int oid);
	/*
	 * 修改
	 * 下架
	 */
	public void updateStutsDrop(int oid);
	/*
	 * 根据id查询
	 */
	public Order findById(int oid);
	/*
	 * 添加课程
	 */
	public void add(Order order);
	
	public void stuadd(Order order );
}

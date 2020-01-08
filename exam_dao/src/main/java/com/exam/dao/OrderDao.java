package com.exam.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.exam.pojo.Order;

public interface OrderDao {

	/*
	 * 列表方法
	 */
	@Select("select * from t_order")
	public List<Order> ClazzList(String name);
	/*
	 * 修改
	 * 上架
	 */
	@Update("update t_order set stuts=1 where oid=#{oid}")
	public void updateStuts(int oid);
	/*
	 * 修改
	 * 下架
	 */
	@Update("update t_order set stuts=0 where oid=#{oid}")
	public void updateStutsDrop(int oid);
	/*
	 * 根据id查询
	 */
	@Select("select * from  t_order where oid =#{oid}")
	public Order findById(int oid);
	/*
	 * 添加课程
	 */
	@Insert("insert into t_order set name=#{name},number=#{number},type=#{type},time=#{time},pople=#{pople},img=#{img},date=#{date},stuts=#{stuts}")
	public void add(Order order);
	@Insert("insert into t_order set number=#{number},name=#{name},type=#{type},money=#{money}")
	public void stuadd(Order order );
}

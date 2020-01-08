package com.exam.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.exam.pojo.Clazz;

public interface ClazzDao {

	/*
	 * 列表方法
	 */
	@Select("select * from clazz where cname like #{name}")
	public List<Clazz> ClazzList(String name);
	/*
	 * 修改
	 * 上架
	 */
	@Update("update clazz set stuts=1 where id=#{id}")
	public void updateStuts(int id);
	/*
	 * 修改
	 * 下架
	 */
	@Update("update clazz set stuts=0 where id=#{id}")
	public void updateStutsDrop(int id);
	
}

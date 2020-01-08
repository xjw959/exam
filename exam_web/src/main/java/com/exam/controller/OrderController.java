package com.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.remoting.p2p.Networkers;
import com.exam.pojo.Order;
import com.exam.service.OrderService;
import com.exam.util.FreeMarkerUtil;

import entity.PageResult;
import entity.Result;
import entity.StatusCode;
import util.AliyunOSSClientUtils;
@RestController
public class OrderController {

	@Reference
	private OrderService orderService;
	@Autowired
	private FreeMarkerConfig freeMarkerConfig;
	@Value("${mystatic}")
	public String lh;
	/**
	 * 修改转台
	 * 上架下架
	 * @param oid
	 * @param stuts
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("updateStuts")
	public Order updateStuts(int oid,int stuts) throws Exception
	{
		if(stuts==0)
		{
			orderService.updateStuts(oid);
			Order order=orderService.findById(oid);
			FreeMarkerUtil freeMarkerUtil = new FreeMarkerUtil();
			freeMarkerUtil.generateHtml(order, oid, freeMarkerConfig, lh);
			return order;
		}
		else {
			orderService.updateStutsDrop(oid);
			return null;
		}
	}
	/**
	 * 列表
	 * 分页
	 * 模糊
	 * @param order
	 * @param page
	 * @param size
	 * @return
	 */
	@RequestMapping("orderList")
	public Result orderList()
	{
		return new Result(true, StatusCode.OK, "",  orderService.orederList());
	}
	/**
	 * 添加课程
	 * @param order
	 * @return
	 */
	@RequestMapping("add")
	public Result add(@RequestBody Order order) {
		try {
			System.out.println("sadasdas");
			orderService.add(order);
			return new Result(true, StatusCode.OK, "添加成功");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new Result(false, StatusCode.ERROR, "添加失败");
		}
	}
	@RequestMapping("upload")
	public Result upload(MultipartFile file)
	{
		AliyunOSSClientUtils aliyunOSSClientUtils = new AliyunOSSClientUtils();
		String uploadImg2Oss;
		try {
			uploadImg2Oss = aliyunOSSClientUtils.uploadImg2Oss(file);
			String imgUrl = aliyunOSSClientUtils.getImgUrl(uploadImg2Oss);
			return new Result(true, StatusCode.OK, "上传成功",imgUrl);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Result(false, StatusCode.ERROR, "上传失败");
		}
		
	}
	@RequestMapping("stuadd")
	public void stuadd(@RequestBody Order order)
	{
		orderService.stuadd(order);
	}
	
}

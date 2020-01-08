package com.exam.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.exam.pojo.Clazz;
import com.exam.service.ClazzService;

import entity.Result;
import entity.StatusCode;

@RestController
public class ClazzController {
	
	@Reference
	private ClazzService clazzService;
	
	@RequestMapping("clazzList")
	public Result clazzList(@RequestBody Clazz clazz, Integer page,Integer size)
	{
		return new Result(true, StatusCode.OK, "", clazzService.ClazzList(clazz.getCname(), page, size));
	}
	

}

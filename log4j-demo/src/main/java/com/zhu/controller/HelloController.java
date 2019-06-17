package com.zhu.controller;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhu.domain.User;

@RestController
public class HelloController {
	 private static Logger logger = LoggerFactory.getLogger(HelloController.class);// slf4j日志记录器
	
	 /**
	  * 
	  * reqest.getParameter()可以用get请求或者post请求的表单提交的方式
	  * 不可以用json格式的入参,获取不了
	  *
	  */
	@RequestMapping(value="/name.do")
	public String login(HttpServletRequest reqest) {
		String name = reqest.getParameter("name");
		logger.info("====info===");
		logger.warn("====warn===");
		logger.error("====error===");
		return name;
	}
	
	/**
	 * 
	 * 注意此处要转换成转成json,需要配置json转换器
	 * 
	 */
	@RequestMapping(value="/login.do")
	public User login(User user) {
		return user;
	}
	public static void main(String[] args) {
		logger.info("====info===");
		logger.warn("====warn===");
		logger.error("====error===");
	}
}

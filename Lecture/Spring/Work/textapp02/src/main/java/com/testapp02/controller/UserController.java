package com.testapp02.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.testapp02.inf.IServiceUser;
import com.testapp02.model.ModelUser;

@Controller
public class UserController {
	
	@Autowired
	IServiceUser svr_user;
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	@ResponseBody
	public ModelUser login(@ModelAttribute ModelUser user) {
		logger.info("login");
		
		ModelUser result = svr_user.login(user);
		
		return result;
	}
	
}

package com.testapp.wonjun.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.testapp.wonjun.inf.IServiceUser;
import com.testapp.wonjun.model.ModelUser;

@Controller
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	IServiceUser svr_user;

	@RequestMapping(value = "/insertuser", method = RequestMethod.GET)
	@ResponseBody
	public int insertuser(Model model, @ModelAttribute ModelUser user) {
		logger.info("insertuser");

		int result = svr_user.insertUser(user);

		return result;
	}

	@RequestMapping(value = "/login", produces = "application/json; charset=utf8", method = RequestMethod.GET)
	@ResponseBody
	public String login(Model model, @ModelAttribute ModelUser user) {
		logger.info("login");

		int result = svr_user.login(user);
		
		if (result == 0) {
			return "�Է��� ȸ�������� �����ϴ�.";
		} else if(result==1){
			return "�α��� ����";
		} else {
			return "���� ���� ����";
		}

	}
	
	@RequestMapping(value = "/selectuserlist", produces = "application/json; charset=utf8", method = RequestMethod.GET)
	@ResponseBody
	public List<ModelUser> selectuserlist(Model model, @ModelAttribute ModelUser user) {
		logger.info("selectuserlist");

		List<ModelUser> result = svr_user.selectUserList(user);
		
		return result;
	}
	
	@RequestMapping(value = "/updateuseruse", produces = "application/json; charset=utf8", method = RequestMethod.GET)
	@ResponseBody
	public String updateuseruse(Model model, @ModelAttribute ModelUser user) {
		logger.info("updateuseruse");

		int result = svr_user.updateUserUse(user);

		if (result == 1) {
			return "Ż��ó�� �Ǿ����ϴ�.";
		} else if (result == 0) {
			return "���̵� ������ �����ϴ�.";
		} else {
			return "���� ���� ����";
		}

	}
	
	@RequestMapping(value = "/updateuserinfo", produces = "application/json; charset=utf8", method = RequestMethod.GET)
	@ResponseBody
	public String updateuserinfo(Model model, @ModelAttribute ModelUser user) {
		logger.info("updateuseruse");

		int result = svr_user.updateUserInfo(user);

		if (result == 1) {
			return "���������� �Ϸ�Ǿ����ϴ�.";
		} else {
			return "���� ���� ����";
		}

	}
}

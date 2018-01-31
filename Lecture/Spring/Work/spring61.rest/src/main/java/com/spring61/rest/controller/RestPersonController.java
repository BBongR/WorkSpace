package com.spring61.rest.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.spring61.rest.model.ModelPerson;

@Controller
@RequestMapping(value = "/rest") // 2.
public class RestPersonController {

	private static final Logger logger = LoggerFactory.getLogger(RestPersonController.class);

	@Autowired
	DataStorePerson service;

	// http://localhost:8080/rest/curtime
	@RequestMapping(value = "/curtime", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody // 1. Ŭ���̾�Ʈ�� ���� �Ѱ� ���� json �����Ͱ� �ڹ��� �� �ν��Ͻ��� �ڵ� ��ȯ�ȴ�
	public long curtime(Model model) {
		logger.info("/rest/curtime");

		return new Date().getTime();
	}

	// http://localhost:8080/rest/loginperson?id=userid1&pw=password
	@RequestMapping(value = "/loginperson", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody // 1. Ŭ���̾�Ʈ�� ���� �Ѱ� ���� json �����Ͱ� �ڹ��� �� �ν��Ͻ��� �ڵ� ��ȯ�ȴ�
	public long loginperson(Model model, @RequestParam String id, @RequestParam String pw) {
		logger.info("/rest/loginperson");

		return service.login(id, pw);
	}

	// http://localhost:8080/rest//rest/selectparam?name=id1 (GET)
	@RequestMapping(value = "/selectparam", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody // 1. Ŭ���̾�Ʈ�� ���� �Ѱ� ���� json �����Ͱ� �ڹ��� �� �ν��Ͻ��� �ڵ� ��ȯ�ȴ�
	public List<ModelPerson> selectparam(Model model, @RequestParam String name) {
		logger.info("/rest/selectparam");

		ModelPerson person = new ModelPerson();
		person.setName(name);

		return service.select(person);
	}

	// /rest/selectmodel :: form �±׸� �̿��Ͽ� Ŭ���̾�Ʈ�� �����͸� ������ ����
	// <form action="/rest/selectmodel" method="post">
	// <input type="text" name="id" />
	// <input type="password" name="pw" />
	// <input type="text" name="name" />
	// <input type="text" name="email" />
	// <input type="button" value="send" />
	// </form>
	@RequestMapping(value = "/selectmodel", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public List<ModelPerson> selectmodel(@ModelAttribute ModelPerson person) {
		logger.info("/rest/selectmodel");

		return service.select(person);
	}

	// /rest/selectjson :: ajax �� �̿��Ͽ� json �����͸� Ŭ���̾�Ʈ���� ������ ����.
	// var model = { 'id': '???', 'pw':'???', 'name':'???', 'email':'???' }
	@RequestMapping(value = "/selectjson", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public List<ModelPerson> selectjson(@RequestBody ModelPerson person) {
		logger.info("/rest/selectjson");

		return service.select(person);
	}

	/**
	 * Ŭ���̾�Ʈ ---����(JSONObject)---> ���� --- ��ȯ(JSONArray)--->Ŭ���̾�Ʈ
	 *
	 * 1. �ȵ���̵� ---> ������ : �ȵ���̵�� json �� ���������� �����Ѵ�. 2. ������ ---> �ȵ���̵� : ����������
	 * �ȵ���̵�� ���� 1 �� ��ȯ�Ѵ�.
	 *
	 * var map = { 'searchvalue' : { 'id': '???', 'pw':'???', 'name':'???',
	 * 'email':'???' } , 'orderby' : 'desc' };
	 */
	@RequestMapping(value = "/selectmap", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public List<ModelPerson> selectmap(Model model, @RequestBody Map<String, Object> map) {
		logger.info("/rest/selectmap");

		// gson �� �̿��Ͽ� json �� model �� ��ȯ.
		ModelPerson person = new Gson().fromJson(map.get("searchvalue").toString(), ModelPerson.class);
		String name = (String) map.get("orderby");
		return service.makePersonData(100, 200);
	}

	@RequestMapping(value = "/selectpaging", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public List<ModelPerson> selectpaging(Model model, @RequestParam int start, @RequestParam int end) {
		logger.info("/rest/selectpaging");

		List<ModelPerson> result = service.makePersonData(start, end);
		return result;
	}

	@RequestMapping(value = "/insertparam", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public boolean insertparam(Model model, @RequestParam String name) {
		logger.info("/rest/insertparam");

		ModelPerson person = new ModelPerson();
		person.setName(name);

		return service.insert(person);
	}

	@RequestMapping(value = "/insertmodel", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public boolean insertmodel(Model model, @ModelAttribute ModelPerson person) {
		logger.info("/rest/insertmodel");

		return service.insert(person);
	}

	@RequestMapping(value = "/insertjsonobject", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public boolean insertjsonobject(Model model, @RequestBody ModelPerson person) {
		logger.info("/rest/insertmodel");
		
		return service.insert(person);
	}
	
	@RequestMapping(value = "/insertjsonarray", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseBody
	public boolean insertjsonarray(Model model, @RequestBody List<ModelPerson> person) {
		logger.info("/rest/insertjsonarray");
		
		return service.insert(person);
	}
}

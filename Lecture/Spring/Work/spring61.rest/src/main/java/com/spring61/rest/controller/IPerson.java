package com.spring61.rest.controller;

import java.util.List;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring61.rest.model.ModelPerson;

public interface IPerson {

	// http://localhost:8080/rest/curtime
	long curtime(Model model);

	// http://localhost:8080/rest/loginperson?id=userid1&pw=password
	long loginperson(Model model, String id, String pw);

	// http://localhost:8080/rest//rest/selectparam?name=id1 (GET)
	List<ModelPerson> selectparam(Model model, String name);

	// /rest/selectmodel :: form �±׸� �̿��Ͽ� Ŭ���̾�Ʈ�� �����͸� ������ ����
	// <form action="/rest/selectmodel" method="post">
	// <input type="text" name="id" />
	// <input type="password" name="pw" />
	// <input type="text" name="name" />
	// <input type="text" name="email" />
	// <input type="button" value="send" />
	// </form>
	List<ModelPerson> selectmodel(ModelPerson person);

	// /rest/selectjson :: ajax �� �̿��Ͽ� json �����͸� Ŭ���̾�Ʈ���� ������ ����.
	// var model = { 'id': '???', 'pw':'???', 'name':'???', 'email':'???' }
	List<ModelPerson> selectjson(ModelPerson person);

	/**
	 * Ŭ���̾�Ʈ ---����(JSONObject)---> ���� --- ��ȯ(JSONArray)--->Ŭ���̾�Ʈ
	 *
	 * 1. �ȵ���̵� ---> ������ : �ȵ���̵�� json �� ���������� �����Ѵ�. 2. ������ ---> �ȵ���̵� : ����������
	 * �ȵ���̵�� ���� 1 �� ��ȯ�Ѵ�.
	 *
	 * var map = { 'searchvalue' : { 'id': '???', 'pw':'???', 'name':'???',
	 * 'email':'???' } , 'orderby' : 'desc' };
	 */
	List<ModelPerson> selectmap(Model model, Map<String, Object> map);

	List<ModelPerson> selectpaging(Model model, int start, int end);

	boolean insertparam(Model model, String name);

	boolean insertmodel(Model model, ModelPerson person);

	boolean insertjsonobject(Model model, ModelPerson person);

	boolean insertjsonarray(Model model, List<ModelPerson> person);

}
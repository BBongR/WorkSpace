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

	// /rest/selectmodel :: form 태그를 이용하여 클라이언트의 데이터를 서버로 전송
	// <form action="/rest/selectmodel" method="post">
	// <input type="text" name="id" />
	// <input type="password" name="pw" />
	// <input type="text" name="name" />
	// <input type="text" name="email" />
	// <input type="button" value="send" />
	// </form>
	List<ModelPerson> selectmodel(ModelPerson person);

	// /rest/selectjson :: ajax 를 이용하여 json 데이터를 클라이언트에서 서버로 전송.
	// var model = { 'id': '???', 'pw':'???', 'name':'???', 'email':'???' }
	List<ModelPerson> selectjson(ModelPerson person);

	/**
	 * 클라이언트 ---전송(JSONObject)---> 서버 --- 반환(JSONArray)--->클라이언트
	 *
	 * 1. 안드로이드 ---> 스프링 : 안드로이드는 json 을 스프링으로 전송한다. 2. 스프링 ---> 안드로이드 : 스프링에서
	 * 안드로이드로 값을 1 개 반환한다.
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
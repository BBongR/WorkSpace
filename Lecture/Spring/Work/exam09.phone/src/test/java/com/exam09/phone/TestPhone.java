package com.exam09.phone;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@FixMethodOrder(org.junit.runners.MethodSorters.NAME_ASCENDING)
public class TestPhone {

	private static ApplicationContext context = null;
	private static IServicePhone      service = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		context = new ClassPathXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml");
		service = context.getBean(IServicePhone.class);
		
	}

	@Test
	public void test01_GetPhoneList() {
		List<ModelPhone> result = service.getPhoneList();
		assertNotNull(result);
		assertTrue(result.size() > 0);
	}

	@Test
	public void test02_testInsertPhone() {
		ModelPhone phone = new ModelPhone("111", "1111", 1111);
		int result = service.insertPhone(phone);
		assertTrue(result == 1);
	}

}

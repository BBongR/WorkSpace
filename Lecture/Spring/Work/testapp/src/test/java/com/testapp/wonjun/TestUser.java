package com.testapp.wonjun;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.testapp.wonjun.inf.IServiceUser;
import com.testapp.wonjun.model.ModelUser;

public class TestUser {

	private static IServiceUser service = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml");
		
		service = context.getBean("serviceUser", IServiceUser.class);
	}

	@Test
	public void test01_selectUserList() {
		
		ModelUser user = new ModelUser();
		user.setUser_email("aa@aa");
		
		List<ModelUser> result = service.selectUserList(user);
		
		assertEquals("1234", result.get(0).getUser_password());
	}

	@Test
	public void test02_updateUserUse() {
		
		ModelUser user = new ModelUser();
		user.setUser_email("aa@aa");
		user.setUser_password("1234");
		user.setUser_use(0);
		
		int result = service.updateUserUse(user);
		assertEquals(1, result);
	}
	
	@Test
	public void test03_updateUserInfo() {
		
		ModelUser user = new ModelUser();
		user.setUser_email("cc@cc");
		user.setUser_name("cc");
		user.setUser_password("cc");
		user.setUser_nickname("cc");
		user.setUser_phone("cc");
		
		int result = service.updateUserInfo(user);
		
		assertEquals(1, result);
	}
	
}

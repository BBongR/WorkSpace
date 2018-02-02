package com.testapp02.svr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testapp02.inf.IDaoUser;
import com.testapp02.inf.IServiceUser;
import com.testapp02.model.ModelUser;

@Service
public class ServiceUser implements IServiceUser {

	@Autowired
	IDaoUser dao;
	
	@Override
	public ModelUser login(ModelUser user) {
		
		ModelUser result = null;
		
		try {
			result = dao.login(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

}

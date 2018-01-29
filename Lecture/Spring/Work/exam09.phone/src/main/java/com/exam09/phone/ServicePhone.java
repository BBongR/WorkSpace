package com.exam09.phone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicePhone implements IServicePhone {

	@Autowired
	IDaoPhone dao;
	
	@Override
	public List<ModelPhone> getPhoneList() {
		List<ModelPhone> result = null;
		
		try {
			result = dao.getPhoneList();
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		return result;
	}

	@Override
	public int insertPhone(ModelPhone phone) {
		int result = -1; // -1이 결과값으로 나오면 프로그램 오류
		                 // DB와 연결이 되었는지 안되었는지 판단하기 위해 -1로 설정
		try {
			result = dao.insertPhone(phone);
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		return result;
	}
	
}

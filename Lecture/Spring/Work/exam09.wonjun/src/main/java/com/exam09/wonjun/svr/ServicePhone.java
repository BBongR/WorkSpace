package com.exam09.wonjun.svr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam09.wonjun.inf.IDaoPhone;
import com.exam09.wonjun.inf.IServicePhone;
import com.exam09.wonjun.model.ModelPhone;

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
		int result = -1;
		try {
			result = dao.insertPhone(phone);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}

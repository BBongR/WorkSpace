package com.testapp.wonjun.svr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testapp.wonjun.inf.IDaoUser;
import com.testapp.wonjun.inf.IServiceUser;
import com.testapp.wonjun.model.ModelUser;

@Service
public class ServiceUser implements IServiceUser {

	@Autowired
	IDaoUser dao;
	
	@Override
	public int insertUser(ModelUser user) {
		int result = -1;
		try {
			result = dao.insertUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int login(ModelUser user) {
		int result = -1;
		try {
			result = dao.login(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public List<ModelUser> selectUserList(ModelUser user) {
		List<ModelUser> result = null;
		try {
			result = dao.selectUserList(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int updateUserUse(ModelUser user) {
		int result = -1;
		try {
			result  = dao.updateUserUse(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int updateUserInfo(ModelUser user) {
		int result = -1;
		try {
			result = dao.updateUserInfo(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}

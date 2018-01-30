package com.exam09.wonjun.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exam09.wonjun.inf.IDaoPhone;
import com.exam09.wonjun.model.ModelPhone;

@Repository
public class DaoPhone implements IDaoPhone {

	@Autowired
	SqlSession session;

	@Override
	public List<ModelPhone> getPhoneList() {
		return session.selectList("mapper.mysql.mapperPhone.getPhoneList");
	}

	@Override
	public int insertPhone(ModelPhone phone) {
		return session.insert("mapper.mysql.mapperPhone.insertPhone", phone);
	}

}

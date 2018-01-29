package com.exam09.phone;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
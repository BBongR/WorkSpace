package com.testapp02.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.jdbc.interceptors.SessionAssociationInterceptor;
import com.testapp02.inf.IDaoUser;
import com.testapp02.model.ModelUser;

@Repository
public class DaoUser implements IDaoUser {

	@Autowired
	SqlSession session = null;
	
	@Override
	public ModelUser login(ModelUser user) {
		return session.selectOne("mapper.mysql.mapperUser.login", user);
	}

}

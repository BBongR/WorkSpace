package com.testapp.wonjun.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.testapp.wonjun.inf.IDaoUser;
import com.testapp.wonjun.model.ModelUser;

@Repository
public class DaoUser implements IDaoUser {

	@Autowired
	SqlSession session;
	
	@Override
	public int insertUser(ModelUser user) {
		return session.insert("mapper.mysql.mapperUser.insertUser", user);
	}

	@Override
	public int login(ModelUser user) {
		return session.selectOne("mapper.mysql.mapperUser.login", user);
	}

	@Override
	public List<ModelUser> selectUserList(ModelUser user) {
		return session.selectList("mapper.mysql.mapperUser.selectUserList", user);
	}

	@Override
	public int updateUserUse(ModelUser user) {
		return session.update("mapper.mysql.mapperUser.updateUserUse", user);
	}

	@Override
	public int updateUserInfo(ModelUser user) {
		return session.update("mapper.mysql.mapperUser.updateUserInfo", user);
	}

}

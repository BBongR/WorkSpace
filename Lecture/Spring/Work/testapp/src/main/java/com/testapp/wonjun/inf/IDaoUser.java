package com.testapp.wonjun.inf;

import java.util.List;

import com.testapp.wonjun.model.ModelUser;

public interface IDaoUser {

	int insertUser(ModelUser user);                 // 회원가입
	
	int login(ModelUser user);                      // 로그인

	List<ModelUser> selectUserList(ModelUser user); // 회원정보 검색
	
	int updateUserUse(ModelUser user);              // 회원탈퇴
	
	int updateUserInfo(ModelUser user);             // 회원정보변경
	
}

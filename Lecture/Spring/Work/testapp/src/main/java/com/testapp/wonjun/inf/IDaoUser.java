package com.testapp.wonjun.inf;

import java.util.List;

import com.testapp.wonjun.model.ModelUser;

public interface IDaoUser {

	int insertUser(ModelUser user);                 // ȸ������
	
	int login(ModelUser user);                      // �α���

	List<ModelUser> selectUserList(ModelUser user); // ȸ������ �˻�
	
	int updateUserUse(ModelUser user);              // ȸ��Ż��
	
	int updateUserInfo(ModelUser user);             // ȸ����������
	
}

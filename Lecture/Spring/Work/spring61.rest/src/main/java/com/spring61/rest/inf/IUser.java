package com.spring61.rest.inf;

import java.util.List;

import com.spring61.rest.model.ModelUser;

public interface IUser {

    int insertUser(ModelUser user) throws Exception;

    List<ModelUser> login(ModelUser user) throws Exception;

    int logout(String user) throws Exception;

    int updateUserInfo(ModelUser updateValue, ModelUser searchValue) throws Exception;

    int updatePasswd(String newPasswd, String currentPasswd, String userid) throws Exception;

    int deleteUser(ModelUser user) throws Exception;

    List<ModelUser> selectUserOne(ModelUser user) throws Exception;

    List<ModelUser> selectUserList(ModelUser user) throws Exception;

    int checkuserid(String user) throws Exception;
    
}

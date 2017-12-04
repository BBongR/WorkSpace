package board.inf;

import java.util.List;

import board.model.ModelUser;

public interface IUser {
    
    int insertUser(ModelUser user) throws Exception;
    
    List<ModelUser> login(ModelUser user) throws Exception;
    
    int logout(String user) throws Exception;
    
    int updateUserInfo(ModelUser updateValue, ModelUser searchValue) throws Exception;
    
    int updatePasswd(ModelUser currentPasswd, ModelUser newPasswd) throws Exception;
    
    int deleteUser(ModelUser auth) throws Exception;
    
    List<ModelUser> selectUserOne(ModelUser user) throws Exception;
    
    List<ModelUser> selectUserList(ModelUser user) throws Exception;
    
    int checkuserid(String user) throws Exception;
}

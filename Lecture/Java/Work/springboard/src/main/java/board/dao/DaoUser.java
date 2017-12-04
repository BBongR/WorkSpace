package board.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import board.inf.IUser;
import board.model.ModelUser;

@Repository("daouser")
public class DaoUser implements IUser {
    
    @Autowired
    @Qualifier("sqlSession")
    private SqlSession session;
    
    @Override
    public int insertUser(ModelUser user) throws Exception {
        int rs = -1;
        rs = session.insert("mapper.mapperUser.InsertUser", user);
        return rs;
    }
    
    @Override
    public List<ModelUser> login(ModelUser user) throws Exception {
        List<ModelUser> rs = null;
        rs = session.selectOne("mapper.mapperUser.login", user);
        return rs;
    }
    
    @Override
    public int logout(String user) throws Exception {
        int rs = -1;
        rs = session.update("mapper.mapperUser.logout", user);
        return rs;
    }
    
    @Override
    public int updateUserInfo(ModelUser searchValue, ModelUser updateValue) throws Exception {
        int rs = -1;
        Map<String, Object> map = new HashMap<>();
        map.put("searchValue", searchValue);
        map.put("updateValue", updateValue);
        rs = session.update("mapper.mapperUser.updateUserInfo", map);
        return rs;
    }
    
    @Override
    public int updatePasswd(ModelUser currentPasswd, ModelUser newPasswd) throws Exception {
        int rs = -1;
        Map<String, Object> map = new HashMap<>();
        map.put("currentPasswd", currentPasswd);
        map.put("newPasswd", newPasswd);
        rs = session.update("mapper.mapperUser.updateUserInfo", map);
        return rs;
    }
    
    @Override
    public int deleteUser(ModelUser user) throws Exception {
        int rs = -1;
        rs = session.delete("mapper.mapperUser.deleteUser", user);
        return rs;
    }
    
    @Override
    public List<ModelUser> selectUserOne(ModelUser user) throws Exception {
        List<ModelUser> rs = null;
        rs = session.selectOne("mapper.mapperUser.selectUserOne", user);
        return rs;
    }
    
    @Override
    public List<ModelUser> selectUserList(ModelUser user) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public int checkuserid(String user) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }
    
}

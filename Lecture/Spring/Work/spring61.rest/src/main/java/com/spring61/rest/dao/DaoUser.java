package com.spring61.rest.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.spring61.rest.inf.IUser;
import com.spring61.rest.model.ModelUser;

@Repository("daouser")
public class DaoUser implements IUser {

    @Autowired
    @Qualifier("sqlSession")
    private SqlSession session;

    @Override
    public int insertUser(ModelUser user) throws Exception {
        System.out.println("DaoUser : " + user.toString());
        int rs = -1;
        rs = session.insert("mapper.mapperUser.insertUser", user);
        return rs;
    }

    @Override
    public List<ModelUser> login(ModelUser user) throws Exception {
        System.out.println("DaoUser : " + user);
        List<ModelUser> rs = null;
        rs = session.selectList("mapper.mapperUser.login", user);
        return rs;
    }

    @Override
    public int logout(String user) throws Exception {
        return 0;
    }

    @Override
    public int updateUserInfo(ModelUser updateValue, ModelUser searchValue) throws Exception {
        int rs = -1;
        Map<String, ModelUser> map = new HashMap<>();
        map.put("searchValue", searchValue);
        map.put("updateValue", updateValue);
        rs = session.update("mapper.mapperUser.updateUserInfo", map);
        return rs;
    }

    @Override
    public int updatePasswd(String newPasswd, String currentPasswd, String userid) throws Exception {
        int rs = -1;
        Map<String, String> map = new HashMap<>();
        map.put("newPasswd", newPasswd);
        map.put("currentPasswd", currentPasswd);
        map.put("userid", userid);
        
        
        rs = session.update("mapper.mapperUser.updatePasswd", map);
        return rs;
    }

    @Override
    public int deleteUser(ModelUser user) throws Exception {
        System.out.println("DaoUser : " + user.toString());
        int rs = -1;
        rs = session.delete("mapper.mapperUser.deleteUser", user);
        return rs;
    }

    @Override
    public List<ModelUser> selectUserOne(ModelUser user) throws Exception {
        List<ModelUser> rs = null;
        rs = session.selectList("mapper.mapperUser.selectUserOne", user);
        return rs;
    }

    @Override
    public List<ModelUser> selectUserList(ModelUser user) throws Exception {
        List<ModelUser> rs = null;
        rs = session.selectList("mapper.mapperUser.selectUserList", user);
        return rs;
    }

    @Override
    public int checkuserid(String user) throws Exception {
        int rs = -1;
        rs = session.selectOne("mapper.mapperUser.checkuserid", user);
        return rs;
    }

}

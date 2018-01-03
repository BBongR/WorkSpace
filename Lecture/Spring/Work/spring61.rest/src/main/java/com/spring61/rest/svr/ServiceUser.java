package com.spring61.rest.svr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.spring61.rest.inf.IServiceUser;
import com.spring61.rest.inf.IUser;
import com.spring61.rest.model.ModelUser;

@Repository("serviceuser")
public class ServiceUser implements IServiceUser{
    
    @Autowired
    @Qualifier("daouser")
    private IUser dao;

    @Override
    public int insertUser(ModelUser user) throws Exception {
        System.out.println("DaoUser : " + user.toString());
        int rs = -1;
        try {
            rs = dao.insertUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public List<ModelUser> login(ModelUser user) throws Exception {
        List<ModelUser> rs = null;
        try {
            rs  = dao.login(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public int logout(String user) throws Exception {
        return 0;
    }

    @Override
    public int updateUserInfo(ModelUser updateValue, ModelUser searchValue) throws Exception {
        int rs = -1;
        try {
            rs  = dao.updateUserInfo(updateValue, searchValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public int updatePasswd(String newPasswd, String currentPasswd, String userid) throws Exception {
        int rs = -1;
        try {
            rs  = dao.updatePasswd(newPasswd, currentPasswd, userid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public int deleteUser(ModelUser user) throws Exception {
        System.out.println("ServiceUser : " + user.toString());
        int rs = -1;
        try {
            rs  = dao.deleteUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public List<ModelUser> selectUserOne(ModelUser user) throws Exception {
        List<ModelUser> rs = null;
        try {
            rs  = dao.selectUserOne(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public List<ModelUser> selectUserList(ModelUser user) throws Exception {
        List<ModelUser> rs = null;
        try {
            rs  = dao.selectUserList(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public int checkuserid(String user) throws Exception {
        int rs = -1;
        try {
            rs  = dao.checkuserid(user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs;
    }

}

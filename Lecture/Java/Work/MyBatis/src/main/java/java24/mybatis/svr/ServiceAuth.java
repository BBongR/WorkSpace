package java24.mybatis.svr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java24.mybatis.inf.IAuth;
import java24.mybatis.inf.IServiceAuth;
import java24.mybatis.model.ModelAuth;

@Service("serviceauth")
public class ServiceAuth implements IServiceAuth {
    
    @Autowired
    @Qualifier("daoauth")
    private IAuth dao;
    
    @Override
    public int getCount(ModelAuth auth) throws Exception {
        int rs = -1;
        try {
            rs = dao.getCount(auth);
        } catch (Exception e) {
 
            e.printStackTrace();
            
        }
        return rs;
    }
    
    @Override
    public int getMaxAuthid() throws Exception {
        int rs = -1;
        try {
            rs = dao.getMaxAuthid();
        } catch (Exception e) {
       
            e.printStackTrace();
            
        }
        return rs;
    }
    
    @Override
    public List<ModelAuth> selectAll(ModelAuth auth) throws Exception {
        List<ModelAuth> rs = null;
        try {
            rs = dao.selectAll(auth);
        } catch (Exception e) {  
            e.printStackTrace(); 
        }
        return rs;
    }
    
    @Override
    public List<ModelAuth> selectLike(ModelAuth auth) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public List<ModelAuth> selectEqual(ModelAuth auth) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public int insertAuth(ModelAuth auth) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int updateAuth(ModelAuth whereauth, ModelAuth setauth)
            throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int deleteAuth(ModelAuth auth) throws Exception {
        // TODO Auto-generated method stub
        return 0;
    }
    
}

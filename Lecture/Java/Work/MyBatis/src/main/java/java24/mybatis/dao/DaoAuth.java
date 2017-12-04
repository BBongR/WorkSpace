package java24.mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java24.mybatis.inf.IAuth;
import java24.mybatis.model.ModelAuth;

@Repository("daoauth")
public class DaoAuth implements IAuth {

    @Autowired
    @Qualifier("sqlSession")
    private SqlSession session;
    
    @Override
    public int getCount(ModelAuth auth) throws Exception {
        int result = -1;
        result = session.selectOne("mapper.mapperAuth.getCount", auth);
        return result;
    }

    @Override
    public int getMaxAuthid() throws Exception {
        int result = -1;
        result = session.selectOne("mapper.mapperAuth.getMaxAuthid");
        return result;
    }

    @Override
    public List<ModelAuth> selectAll(ModelAuth auth) throws Exception {
        List<ModelAuth> result = null;
        result = session.selectList("mapper.mapperAuth.selectAll", auth);
        return result;
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

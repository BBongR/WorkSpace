package com.spring61.rest.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.spring61.rest.inf.IBoard;
import com.spring61.rest.model.ModelArticle;
import com.spring61.rest.model.ModelAttachFile;
import com.spring61.rest.model.ModelBoard;
import com.spring61.rest.model.ModelComments;

@Repository("daoboard")
public class DaoBoard implements IBoard {
    
    @Autowired
    @Qualifier("sqlSession")
    private SqlSession session;
    
    @Override
    public String getBoardName(String boardcd) throws Exception {
        String rs = null;
        rs = session.selectOne("mapper.mapperBoard.getBoardName", boardcd);
        return rs;
    }
    
    @Override
    public ModelBoard getBoardOne(String boardcd) throws Exception {
        ModelBoard rs = null;
        rs = session.selectOne("mapper.mapperBoard.getBoardOne", boardcd);
        return rs;
    }
    
    @Override
    public List<ModelBoard> getBoardList() throws Exception {
        List<ModelBoard> rs = null;
        rs = session.selectList("mapper.mapperBoard.getBoardList");
        return rs;
    }
    
    @Override
    public int insertBoard(ModelBoard board) throws Exception {
        int rs = -1;
        rs = session.insert("mapper.mapperBoard.insertBoard", board);
        return rs;
    }
    
    @Override
    public int updateBoard(ModelBoard setValue, ModelBoard whereValue)
            throws Exception {
        int rs = -1;
        Map<String, ModelBoard> map = new HashMap<>();
        map.put("setValue" , setValue);
        map.put("whereValue", whereValue);
        rs = session.update("mapper.mapperBoard.updateBoard", map);
        return rs;
    }
    
    @Override
    public int deleteBoard(ModelBoard board) throws Exception {
        int rs = -1;
        rs = session.delete("mapper.mapperBoard.deleteBoard", board);
        return rs;
    }
    
    @Override
    public ModelBoard getBoardSearch(ModelBoard board) throws Exception {
        ModelBoard rs = null;
        rs = session.selectOne("mapper.mapperBoard.getBoardSearch", board);
        return rs;
    }
    
    @Override
    public int getBoardTotalRecord(ModelBoard board) throws Exception {
        int rs = -1;
        rs = session.selectOne("mapper.mapperBoard.getBoardTotalRecord", board);
        return rs;
    }
    
    @Override
    public List<ModelBoard> getBoardPaging(String boardcd, String boardnm,
            Integer start, Integer end) throws Exception {
        List<ModelBoard> rs = null;
        Map<String, Object> map = new HashMap<>();
        map.put("boardcd", boardcd);
        map.put("boardnm", boardnm);
        map.put("start", start);
        map.put("end", end);
        rs = session.selectList("mapper.mapperBoard.getBoardPaging", map);
        return rs;
    }
    
    @Override
    public int insertBoardList(List<ModelBoard> list)
            throws Exception {
        int rs = -1;
        rs = session.insert("mapper.mapperBoard.insertBoardList", list);
        return rs;
    }
    
    @Override
    public int getArticleTotalRecord(String boardcd, String searchWord) throws Exception {
        int rs = -1;
        Map<String, String> map = new HashMap<>();
        map.put("boardcd", boardcd);
        map.put("searchWord", searchWord);
        rs = session.selectOne("mapper.mapperBoard.getArticleTotalRecord", map);
        return rs;
    }
    
    @Override
    public List<ModelArticle> getArticleList(String boardcd, String searchWord, Integer start, Integer end) throws Exception {
        List<ModelArticle> rs = null;
        Map<String, Object> map = new HashMap<>();
        map.put("boardcd", boardcd);
        map.put("searchWord", searchWord);
        map.put("start", start);
        map.put("end", end);
        rs = session.selectList("mapper.mapperBoard.getArticleList", map);
        return rs;
    }
    
    @Override
    public ModelArticle getArticle(int articleno) throws Exception {
        ModelArticle rs = null;
        rs = session.selectOne("mapper.mapperBoard.getArticle", articleno);
        return rs;
    }
    
    @Override
    public int insertArticle(ModelArticle article) throws Exception {
        int rs = -1;
        rs = session.insert("mapper.mapperBoard.insertArticle", article);
        return rs;
    }
    
    @Override
    public int updateArticle(ModelArticle setValue, ModelArticle whereValue)
            throws Exception {
        int rs = -1;
        Map<String, ModelArticle> map = new HashMap<>();
        map.put("setValue", setValue);
        map.put("whereValue", whereValue);
        rs = session.update("mapper.mapperBoard.updateArticle", map);
        return rs;
    }
    
    @Override
    public int deleteArticle(ModelArticle article) throws Exception {
        int rs = -1;
        rs = session.delete("mapper.mapperBoard.deleteArticle", article);
        return rs;
    }
    
    @Override
    public int increaseHit(int articleno) throws Exception {
        int rs = -1;
        rs = session.update("mapper.mapperBoard.increaseHit", articleno);
        return rs;
    }
    
    @Override
    public List<ModelArticle> getNextArticle(String boardcd, Integer articleno,
            String searchWord) throws Exception {
        List<ModelArticle> rs = null;
        Map<String, Object> map = new HashMap<>();
        map.put("boardcd", boardcd);
        map.put("articleno", articleno);
        map.put("searchWord", searchWord);
        rs = session.selectList("mapper.mapperBoard.getNextArticle", map);
        return rs;
    }
    
    @Override
    public List<ModelArticle> getPrevArticle(String boardcd, Integer articleno,
            String searchWord) throws Exception {
        List<ModelArticle> rs = null;
        Map<String, Object> map = new HashMap<>();
        map.put("boardcd", boardcd);
        map.put("articleno", articleno);
        map.put("searchWord", searchWord);
        rs = session.selectList("mapper.mapperBoard.getPrevArticle", map);
        return rs;
    }
    
    @Override
    public ModelAttachFile getAttachFile(int attachFileNo)
            throws Exception {
        ModelAttachFile rs = null;
        rs = session.selectOne("mapper.mapperBoard.getAttachFile", attachFileNo);
        return rs;
    }
    
    @Override
    public List<ModelAttachFile> getAttachFileList(int articleno)
            throws Exception {
        List<ModelAttachFile> rs = null;
        rs = session.selectList("mapper.mapperBoard.getAttachFileList", articleno);
        return rs;
    }
    
    @Override
    public int insertAttachFile(ModelAttachFile attachFile) throws Exception {
        int rs = -1;
        rs = session.insert("mapper.mapperBoard.insertAttachFile", attachFile);
        return rs;
    }
    
    @Override
    public int deleteAttachFile(ModelAttachFile attachFile) throws Exception {
        int rs = -1;
        rs = session.delete("mapper.mapperBoard.deleteAttachFile", attachFile);
        return rs;
    }
    
    @Override
    public ModelComments getComment(int commentNo) throws Exception {
        ModelComments rs = null;
        rs = session.selectOne("mapper.mapperBoard.getComment", commentNo);
        return rs;
    }
    
    @Override
    public List<ModelComments> getCommentList(int articleno) throws Exception {
        List<ModelComments> rs = null;
        rs = session.selectList("mapper.mapperBoard.getCommentList", articleno);
        return rs;
    }
    
    @Override
    public int insertComment(ModelComments comments) throws Exception {
        int rs = -1;
        rs = session.insert("mapper.mapperBoard.insertComment", comments);
        return rs;
    }
    
    @Override
    public int updateComment(ModelComments setValue, ModelComments whereValue)
            throws Exception {
        int rs = -1;
        Map<String, ModelComments> map = new HashMap<>();
        map.put("setValue", setValue);
        map.put("whereValue", whereValue);
        rs = session.update("mapper.mapperBoard.updateComment", map);
        return rs;
    }
    
    @Override
    public int deleteComment(ModelComments comments) throws Exception {
        int rs = -1;
        rs = session.delete("mapper.mapperBoard.deleteComment", comments);
        return rs;
    }
    
}

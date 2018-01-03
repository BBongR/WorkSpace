package com.spring61.rest.svr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.spring61.rest.inf.IBoard;
import com.spring61.rest.inf.IServiceBoard;
import com.spring61.rest.model.ModelArticle;
import com.spring61.rest.model.ModelAttachFile;
import com.spring61.rest.model.ModelBoard;
import com.spring61.rest.model.ModelComments;

@Repository("serviceboard")
public class ServiceBoard implements IServiceBoard {
    
    @Autowired
    @Qualifier("daoboard")
    private IBoard dao;
    
    @Override
    public String getBoardName(String boardcd) throws Exception {
        String rs = "";
        try {
            rs = dao.getBoardName(boardcd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public ModelBoard getBoardOne(String boardcd) throws Exception {
        ModelBoard rs = null;
        try {
            rs = dao.getBoardOne(boardcd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public List<ModelBoard> getBoardList() throws Exception {
        List<ModelBoard> rs = null;
        try {
            rs = dao.getBoardList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public int insertBoard(ModelBoard board) throws Exception {
        int rs = -1;
        try {
            rs = dao.insertBoard(board);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public int updateBoard(ModelBoard setValue, ModelBoard whereValue)
            throws Exception {
        int rs = -1;
        try {
            rs = dao.updateBoard(setValue, whereValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public int deleteBoard(ModelBoard board) throws Exception {
        int rs = -1;
        try {
            rs = dao.deleteBoard(board);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public ModelBoard getBoardSearch(ModelBoard board) throws Exception {
        ModelBoard rs = null;
        try {
            rs = dao.getBoardSearch(board);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public int getBoardTotalRecord(ModelBoard board)
            throws Exception {
        int rs = -1;
        try {
            rs = dao.getBoardTotalRecord(board);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public List<ModelBoard> getBoardPaging(String boardcd, String boardnm,
            Integer start, Integer end) throws Exception {
        List<ModelBoard> rs = null;
        try {
            rs = dao.getBoardPaging(boardcd, boardnm, start, end);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public int insertBoardList(List<ModelBoard> list) throws Exception {
        int rs = -1;
        try {
            rs = dao.insertBoardList(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public int getArticleTotalRecord(String boardcd, String searchWord)
            throws Exception {
        int rs = -1;
        try {
            rs = dao.getArticleTotalRecord(boardcd, searchWord);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public List<ModelArticle> getArticleList(String boardcd, String searchWord, Integer start, Integer end)
            throws Exception {
        List<ModelArticle> rs = null;
        try {
            rs = dao.getArticleList(boardcd, searchWord, start, end);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public ModelArticle getArticle(int articleno) throws Exception {
        ModelArticle rs = null;
        try {
            rs = dao.getArticle(articleno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public int insertArticle(ModelArticle article) throws Exception {
        int rs = -1;
        try {
            rs = dao.insertArticle(article);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public int updateArticle(ModelArticle setValue, ModelArticle whereValue)
            throws Exception {
        int rs = -1;
        try {
            rs = dao.updateArticle(setValue, whereValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public int deleteArticle(ModelArticle article) throws Exception {
        int rs = -1;
        try {
            rs = dao.deleteArticle(article);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public int increaseHit(int articleno) throws Exception {
        int rs = -1;
        try {
            rs = dao.increaseHit(articleno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public List<ModelArticle> getNextArticle(String boardcd, Integer articleno,
            String searchWord) throws Exception {
        List<ModelArticle> rs = null;
        try {
            rs = dao.getNextArticle(boardcd, articleno, searchWord);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public List<ModelArticle> getPrevArticle(String boardcd, Integer articleno,
            String searchWord) throws Exception {
        List<ModelArticle> rs = null;
        try {
            rs = dao.getPrevArticle(boardcd, articleno, searchWord);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public ModelAttachFile getAttachFile(int attachFileNo)
            throws Exception {
        ModelAttachFile rs = null;
        try {
            rs = dao.getAttachFile(attachFileNo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public List<ModelAttachFile> getAttachFileList(int articleno)
            throws Exception {
        List<ModelAttachFile> rs = null;
        try {
            rs = dao.getAttachFileList(articleno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public int insertAttachFile(ModelAttachFile attachFile) throws Exception {
        int rs = -1;
        try {
            rs = dao.insertAttachFile(attachFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public int deleteAttachFile(ModelAttachFile attachFile) throws Exception {
        int rs = -1;
        try {
            rs = dao.deleteAttachFile(attachFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public ModelComments getComment(int commentNo) throws Exception {
        ModelComments rs = null;
        try {
            rs = dao.getComment(commentNo);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public List<ModelComments> getCommentList(int articleno) throws Exception {
        List<ModelComments> rs = null;
        try {
            rs = dao.getCommentList(articleno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public int insertComment(ModelComments comments) throws Exception {
        int rs = -1;
        try {
            rs = dao.insertComment(comments);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public int updateComment(ModelComments setValue, ModelComments whereValue)
            throws Exception {
        int rs = -1;
        try {
            rs = dao.updateComment(setValue, whereValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    @Override
    public int deleteComment(ModelComments comments) throws Exception {
        int rs = -1;
        try {
            rs = dao.deleteComment(comments);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
}

package com.spring61.rest.inf;

import java.util.List;

import com.spring61.rest.model.ModelArticle;
import com.spring61.rest.model.ModelAttachFile;
import com.spring61.rest.model.ModelBoard;
import com.spring61.rest.model.ModelComments;

public interface IBoard {
    
    String getBoardName(String boardcd) throws Exception;
    
    ModelBoard getBoardOne(String boardcd) throws Exception;
    
    List<ModelBoard> getBoardList() throws Exception;
    
    int insertBoard(ModelBoard board) throws Exception;
    
    int updateBoard(ModelBoard setValue, ModelBoard whereValue)
            throws Exception;
    
    int deleteBoard(ModelBoard board) throws Exception;
    
    ModelBoard getBoardSearch(ModelBoard board) throws Exception;
    
    int getBoardTotalRecord(ModelBoard board) throws Exception;
    
    List<ModelBoard> getBoardPaging(String boardcd, String boardnm,
            Integer start, Integer end) throws Exception;
    
    int insertBoardList(List<ModelBoard> list)
            throws Exception;
    
    int getArticleTotalRecord(String boardcd, String searchWord)
            throws Exception;
    
    List<ModelArticle> getArticleList(String boardcd, String searchWord, Integer start, Integer end) throws Exception;
    
    ModelArticle getArticle(int articleno) throws Exception;
    
    int insertArticle(ModelArticle article) throws Exception;
    
    int updateArticle(ModelArticle setValue, ModelArticle whereValue)
            throws Exception;
    
    int deleteArticle(ModelArticle article) throws Exception;
    
    int increaseHit(int articleno) throws Exception;
    
    List<ModelArticle> getNextArticle(String boardcd, Integer articleno,
            String searchWord) throws Exception;
    
    List<ModelArticle> getPrevArticle(String boardcd, Integer articleno,
            String searchWord) throws Exception;
    
    ModelAttachFile getAttachFile(int attachFileNo) throws Exception;
    
    List<ModelAttachFile> getAttachFileList(int articleno) throws Exception;
    
    int insertAttachFile(ModelAttachFile attachFile) throws Exception;
    
    int deleteAttachFile(ModelAttachFile attachFile) throws Exception;
    
    ModelComments getComment(int commentNo) throws Exception;
    
    List<ModelComments> getCommentList(int articleno) throws Exception;
    
    int insertComment(ModelComments comments) throws Exception;
    
    int updateComment(ModelComments setValue, ModelComments whereValue)
            throws Exception;
    
    int deleteComment(ModelComments comments) throws Exception;
}

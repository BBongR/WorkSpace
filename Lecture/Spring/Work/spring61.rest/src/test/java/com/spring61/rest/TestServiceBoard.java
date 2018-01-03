package com.spring61.rest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring61.rest.inf.IServiceBoard;
import com.spring61.rest.model.ModelArticle;
import com.spring61.rest.model.ModelAttachFile;
import com.spring61.rest.model.ModelBoard;
import com.spring61.rest.model.ModelComments;
import com.spring61.rest.svr.ServiceBoard;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestServiceBoard {
    
    private static IServiceBoard service = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        // classpath 를 이용한 설정 파일 로딩
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml");
        
        // DI를 이용한 serviceuser 인스턴스 생성
        service = context.getBean("serviceboard", ServiceBoard.class);
        
        // DB Table 초기화 코드
        javax.sql.DataSource dataSource = (DataSource) context.getBean("dataSource");
        org.apache.ibatis.jdbc.ScriptRunner runner = new org.apache.ibatis.jdbc.ScriptRunner(dataSource.getConnection());
        runner.setAutoCommit(true);
        runner.setStopOnError(true);
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        String sf = cl.getResource("java21/ddl/board.ddl.mysql.sql").getFile();
        java.io.Reader br = new java.io.BufferedReader(new java.io.FileReader(sf));
        runner.runScript(br);
        runner.closeConnection();
    }
        
        @Test
        public void test01_GetBoardName() throws Exception {
            String rs = "";
            String boardcd = "free";
            rs = service.getBoardName(boardcd);
            assertEquals("자유게시판", rs);
            
        }
        
        @Test
        public void test02_GetBoardOne() throws Exception {
            ModelBoard rs = null;
            String boardcd = "qna";
            rs = service.getBoardOne(boardcd);
            assertEquals("QnA게시판", rs.getBoardnm());
        }
        
        @Test
        public void test03_GetBoardList() throws Exception {
            List<ModelBoard> rs = service.getBoardList();
            assertEquals(3, rs.size());
            assertEquals("qna", rs.get(0).getBoardcd());
        }
        
        @Test
        public void test04_InsertBoard() throws Exception {
            int rs = -1;
            ModelBoard board = new ModelBoard();
            board.setBoardcd("한지민");
            board.setBoardnm("한지민");
            board.setInsertUID("한지민");
            rs = service.insertBoard(board);
            assertEquals(1, rs);
        }
        
        @Test
        public void test05_UpdateBoard() throws Exception {
            int rs = -1;
            ModelBoard setValue = new ModelBoard();
            setValue.setBoardnm("갓지민");
            setValue.setUpdateUID("갓지민");
            ModelBoard whereValue = new ModelBoard();
            whereValue.setBoardcd("한지민");
            rs = service.updateBoard(setValue, whereValue);
            assertEquals(1, rs);
        }
        
        
        @Test
        public void test06_GetBoardSearch() throws Exception {
            ModelBoard rs = null;
            ModelBoard board = new ModelBoard();
            board.setBoardcd("지");
            rs = service.getBoardSearch(board);
            assertEquals("한지민", rs.getBoardcd());
        }
        
        @Test
        public void test07_DeleteBoard() throws Exception {
            int rs = -1;
            ModelBoard board = new ModelBoard();
            board.setBoardcd("한지민");
            rs = service.deleteBoard(board);
            assertEquals(1, rs);
        }
        
        @Test
        public void test08_GetBoardTotalRecord() throws Exception {
            int rs = -1;
            ModelBoard board = new ModelBoard();
            board.setBoardcd("free");
            board.setBoardnm("");
            rs = service.getBoardTotalRecord(board);
            assertEquals(1, rs);
        }
        
        @Test
        public void test09_GetBoardPaging() throws Exception {
            List<ModelBoard> rs = null;
            String boardcd = "free";
            String boardnm = "";
            Integer start = 1;
            Integer end = 3;
            rs = service.getBoardPaging(boardcd, boardnm, start, end);
            assertEquals(1, rs.size());
            assertEquals("free", rs.get(0).getBoardcd());
        }
        
        @Test
        public void test10_InsertBoardList() throws Exception {
            int rs = -1;
            ModelBoard board1 = new ModelBoard();
            board1.setBoardcd("111");
            board1.setBoardnm("111");
            board1.setUseYN(true);
            ModelBoard board2 = new ModelBoard();
            board2.setBoardcd("222");
            board2.setBoardnm("222");
            board2.setUseYN(true);
            List<ModelBoard> list = new ArrayList<>();
            list.add(board1);
            list.add(board2);
            rs = service.insertBoardList(list);
            assertEquals(2, rs);
        }
        
        @Test
        public void test11_GetArticleTotalRecord() throws Exception {
            int rs = -1;
            String boardcd = "free";
            String searchWord = "167";
            rs = service.getArticleTotalRecord(boardcd, searchWord);
            assertEquals(1, rs);
        }
        
        @Test
        public void test12_GetArticleList() throws Exception {
        List<ModelArticle> rs = null;
        String boardcd = "free";
        String searchWord = "test";
        Integer start = 1;
        Integer end = 10;
        rs = service.getArticleList(boardcd, searchWord, start, end);
        assertTrue(rs.get(0).getArticleno()==201);
    }
        
        @Test
        public void test13_GetArticle() throws Exception {
            ModelArticle rs = null;
            int articleno = 5;
            rs = service.getArticle(articleno);
            assertSame(5, rs.getArticleno());
        }
        
        @Test
        public void test14_InsertArticle() throws Exception {
            int rs = -1;
            ModelArticle article = new ModelArticle();
            article.setBoardcd("qna");
            article.setTitle("한지민");
            article.setContent("한지민");
            rs = service.insertArticle(article);
            assertEquals(1, rs);
        }
        
        @Test
        public void test15_UpdateArticle() throws Exception {
            LocalDateTime dt = LocalDateTime.now();
            String date = dt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            int rs = -1;
            ModelArticle setValue = new ModelArticle();
            setValue.setTitle("갓지민");
            setValue.setContent("갓지민");
            setValue.setUseYN(true);
            setValue.setUpdateUID("갓지민");
            setValue.setUpdateDT(date);
            ModelArticle whereValue = new ModelArticle();
            whereValue.setBoardcd("free");
            rs = service.updateArticle(setValue, whereValue);
            assertEquals(201, rs);
        }
        
        @Test
        public void test16_DeleteArticle() throws Exception {
            int rs = -1;
            ModelArticle article = new ModelArticle();
            article.setArticleno(8);
            rs = service.deleteArticle(article);
            assertEquals(1, rs);
        }
        
        @Test
        public void test17_IncreaseHit() throws Exception {
            int rs = -1;
            int articleno = 1;
            rs = service.increaseHit(articleno);
            assertEquals(1, rs);
        }
        
        @Test
        public void test18_GetNextArticle() throws Exception {
        List<ModelArticle> rs = null;
        String boardcd = "free";
        Integer articleno = 1;
        String searchWord = "";
        rs = service.getNextArticle(boardcd, articleno, searchWord);
        assertSame(2, rs.get(0).getArticleno());
    }
    
        @Test
        public void test19_GetPrevArticle() throws Exception {
        List<ModelArticle> rs = null;
        String boardcd = "free";
        Integer articleno = 2;
        String searchWord = "";
        rs = service.getPrevArticle(boardcd, articleno, searchWord);
        assertSame(1, rs.get(0).getArticleno());
    }
    
        @Test
        public void test20_GetAttachFile() throws Exception {
            ModelAttachFile rs = null;
            int attachFileNo = 6;
            rs = service.getAttachFile(attachFileNo);
            assertSame(6, rs.getAttachfileno());
        }
        
        @Test
        public void test21_GetAttachFileList() throws Exception {
            List<ModelAttachFile> rs = null;
            int articleno = 1;
            rs = service.getAttachFileList(articleno);
            assertSame(7, rs.size());
        }
        
        @Test
        public void test22_InsertAttachFile() throws Exception {
            LocalDateTime dt = LocalDateTime.now();
            String date = dt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            int rs = -1;
            ModelAttachFile attachFile = new ModelAttachFile();
            attachFile.setFilename("한지민파일");
            attachFile.setFiletype("한지민타입");
            attachFile.setFilesize(1);
            attachFile.setArticleno(1);
            attachFile.setInsertUID("한지민");
            attachFile.setInsertDT(date);
            attachFile.setUpdateUID("한지민");
            attachFile.setUpdateDT(date);
            rs = service.insertAttachFile(attachFile);
            assertEquals(1, rs);
        }
        
        @Test
        public void test23_DeleteAttachFile() throws Exception {
            int rs = -1;
            ModelAttachFile attachFile = new ModelAttachFile();
            attachFile.setAttachfileno(8);
            rs = service.deleteAttachFile(attachFile);
            assertEquals(1, rs);
        }
        
        @Test
        public void test24_GetComment() throws Exception {
            ModelComments rs = null;
            int commentNo = 1;
            rs = service.getComment(commentNo);
            assertSame(1, rs.getCommentno());
        }
        
        @Test
        public void test25_GetCommentList() throws Exception {
            List<ModelComments> rs = null;
            int articleno = 1;
            rs = service.getCommentList(articleno);
            assertEquals(1, rs.size());
        }
        
        @Test
        public void test26_InsertComment() throws Exception {
            int rs = -1;
            ModelComments comments = new ModelComments();
            comments.setArticleno(2);
            comments.setEmail("ss@ss.com");
            comments.setMemo("test");
            rs = service.insertComment(comments);
            assertEquals(1, rs);
        }
        
        @Test
        public void test27_UpdateComment() throws Exception {
            LocalDateTime dt = LocalDateTime.now();
            String date = dt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            int rs = -1;
            ModelComments setValue = new ModelComments();
            setValue.setMemo("as");
            setValue.setRegdate(date);
            setValue.setUseYN(true);
            ModelComments whereValue = new ModelComments();
            whereValue.setCommentno(1);
            rs = service.updateComment(setValue, whereValue);
            assertEquals(1, rs);
        }
        
        @Test
        public void test28_DeleteComment() throws Exception {
            int rs = -1;
            ModelComments comments = new ModelComments();
            comments.setCommentno(1);
            rs = service.deleteComment(comments);
            assertEquals(1, rs);
        }
        
}

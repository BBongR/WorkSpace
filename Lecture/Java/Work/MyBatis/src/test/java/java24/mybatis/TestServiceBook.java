package java24.mybatis;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java24.mybatis.inf.IServiceBook;
import java24.mybatis.model.ModelBook;
import java24.mybatis.svr.ServiceBook;

public class TestServiceBook {
    
    private static IServiceBook service = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        // classpath 를 이용한 설정 파일 로딩
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:ApplicationContext.xml");
        
        // DI를 이용한 servicebook 인스턴스 생성
        service = context.getBean("servicebook", ServiceBook.class);
    }
    
    @Test
    public void testGetCount() throws Exception {
        ModelBook book = new ModelBook();
        int rs = service.getCount(book);
        assertEquals(4, rs);
    }
    
    @Test
    public void testGetMaxBookid() throws Exception {
        int rs = service.getMaxBookid();
        assertEquals(4, rs);
    }
    
    @Test
    public void testSelectAll() throws Exception {
        ModelBook book = new ModelBook();
        
        List<ModelBook> rs = service.selectAll(book);
        // 1. 인스턴스 검증
        assertNotNull(rs);
        
        // 2. 값으로 검증
        ModelBook m = rs.get(0);
        assertSame(1, m.getBookid());
        assertEquals("operating system", m.getBookname());
        
        // 3. 갯수로 검증
        int count = service.getCount(null);
        assertEquals(count, rs.size());
    }
    
    @Test
    public void testSelectLike() throws Exception {
        ModelBook book = new ModelBook();
        book.setBookname("%ja%");
        List<ModelBook> rs = service.selectLike(book);
        assertEquals("java", rs.get(0).getBookname());
    }
    
    @Test
    public void testSelectEqual() throws Exception {
        ModelBook book = new ModelBook();
        book.setPrice(58700);
        List<ModelBook> rs = service.selectEqual(book);
        assertTrue(58700 == rs.get(0).getPrice());
    }
    
    @Test
    public void testInsertBook() throws Exception {
        Date date = Date.valueOf("2017-11-23");
        
        ModelBook book = new ModelBook();
        book.setBookname("홍길동전");
        book.setPublisher("aaa");
        book.setYear("2017");
        book.setPrice(12345);
        book.setDtm(date);
        book.setUse_yn(true);
        book.setAuthid(5);
        int rs = service.insertBook(book);
        assertTrue(1 <= rs);
    }
    
    @Test
    public void testInsertMap() throws Exception {
        String bookname = "나길동";
        Date dtm = Date.valueOf("2017-11-23");
        int authid = 7;
        int rs = service.insertMap(bookname, dtm, authid);
        
        assertTrue(rs >= 0);
    }
    
    @Test
    public void testUpdateBook() throws Exception {
        ModelBook wherebook = new ModelBook();
        wherebook.setBookname("홍길동전");
        
        ModelBook setbook = new ModelBook();
        setbook.setPublisher("zzz");
        setbook.setPrice(10000);
        
        int rs = service.updateBook(wherebook, setbook);
        
        assertTrue(rs >= 0);
    }
    
    @Test
    public void testDeleteBook() throws Exception {
        ModelBook book = new ModelBook();
        book.setBookname(" ");
        int rs = service.deleteBook(book);
        assertTrue(rs >= 0);
    }
    
    @Test
    public void testSelectDynamic() {
        
    }
    
}

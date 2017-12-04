package java24.mybatis;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java24.mybatis.inf.IServiceAuth;
import java24.mybatis.model.ModelAuth;
import java24.mybatis.svr.ServiceAuth;

public class TestServiceAuth {
    
    private static IServiceAuth service = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        // classpath 를 이용한 설정 파일 로딩
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:ApplicationContext.xml");
        
        // DI를 이용한 servicebook 인스턴스 생성
        service = context.getBean("serviceauth", ServiceAuth.class);
    }
    
    @Test
    public void testGetCount() throws Exception {
        ModelAuth auth = new ModelAuth();
        int rs = -1;
        rs = service.getCount(auth);
        assertEquals(3, rs);
    }
    
    @Test
    public void testGetMaxAuthid() throws Exception {
        int rs = -1;
        rs = service.getMaxAuthid();
        assertEquals(7, rs);
    }
    
    @Test
    public void testSelectAll() throws Exception {
        ModelAuth auth = new ModelAuth();
        
        List<ModelAuth> rs = service.selectAll(auth);
        // 인스턴스 검증
        assertNotNull(rs);
        
        // 값으로 검증
        ModelAuth au1 = rs.get(1);
        assertEquals("kim", au1.getName());
    }
    
    @Test
    public void testSelectLike() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testSelectEqual() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testInsertAuth() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testUpdateAuth() {
        fail("Not yet implemented");
    }
    
    @Test
    public void testDeleteAuth() {
        fail("Not yet implemented");
    }
    
}

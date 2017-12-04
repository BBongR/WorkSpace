package java23.jdbc;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestDaoAuth {
    static java.sql.Connection conn = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        conn = DBConnect.makeConnection();
    }
    
    @Test
    public void testGetCount() throws SQLException {
        DaoAuth dao = new DaoAuth(conn);
        ModelAuth model = new ModelAuth();
        int result = dao.getCount(model);
        assertEquals(3, result);
    }
    
    @Test
    public void testGetMaxAuthid() throws SQLException {
        DaoAuth dao = new DaoAuth(conn);
        int result = dao.getMaxAuthid();
        assertEquals(-1, result);
    }
    
    @Test
    public void testSelectAll() throws SQLException {
        DaoAuth dao = new DaoAuth(conn);
        java.sql.ResultSet rs = dao.selectAll();
        
        rs.next();
        int authid = rs.getInt("authid");
        assertEquals(1, authid);
        
        String name = rs.getString("name");
        assertEquals("bob", name);
          }
    
    @Test
    public void testSelectLike() throws SQLException {
        DaoAuth dao = new DaoAuth(conn);
        ModelAuth auth = new ModelAuth();
        auth.setName("bo");
        
        ResultSet rs = dao.selectLike(auth);
       
        
        //resultset을 이용한 검증
        assertNotNull(rs);
        rs.next();
        String name = rs.getString("name");
        assertTrue(name.contains("bo"));
        assertTrue(name.contains(auth.getName()));
        
    }
    
    @Test
    public void testSelectEqual() throws SQLException {
        ModelAuth auth = new ModelAuth();
        auth.setName("kim");
        DaoAuth dao = new DaoAuth(conn);
        ResultSet rs = dao.selectEqual(auth);        
        
    }
    
    @Test
    public void testSelectDynamic() {
        
    	
    	
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
package junittest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestMyunit {
    
    static MyUnit my = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        my = new MyUnit();
    }
    
    @Test
    public void testConcate() {
        String rs = my.concate("가나", "다라");
        assertNotNull(my);
        assertEquals("가나다라", rs);
    }
    
    @Test
    public void testGetBoolean() {
        boolean rs = my.getBoolean();
        assertFalse(rs);
    }
    
    @Test
    public void testGetSameObject() {
       Object rs = my.getSameObject();
       assertNull(rs);
    }
    
    @Test
    public void testGetObject() {
        Object rs = my.getObject();
        assertNull(rs);
    }
    
    @Test
    public void testGetStringArray() {
        String[] rs = my.getStringArray();
        String[] as = {"one","two","three"};
        
        assertArrayEquals(rs, as);
    }
    
    @Test(expected=ArithmeticException.class)
    public void testGetException() {
        double rs = my.getException();
        assertEquals(0.0, rs, 0.0);
    }
    
    @Test(expected=IndexOutOfBoundsException.class)
    public void testGetEmptyList() {
        my.getEmptyList().get(0);
    }
    
}

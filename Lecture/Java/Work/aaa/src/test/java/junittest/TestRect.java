package junittest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestRect {
    
    static Rect r = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        r = new Rect();
        r.setWidth(10);
        r.setHeight(20);
    }
    
    @Test
    public void testArea() {
        int rs = r.area();
        assertEquals(200, rs);
    }
    
    @Test
    public void testPerimeter() {
        int rs = r.perimeter();
        assertEquals(60, rs);
    }
    
}

package junittest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestOper {
    
    static Oper op = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        op = new Oper();
        op.setX(10);
        op.setY(20);
    }
    
    @Before
    public void before() {
        System.out.println("Not yet implemented");
    }
    
    @Test
    public void testAdd() {
        int rs = op.add();
        assertEquals(30, rs);
    }
    
    @Test
    public void testMinus() {
        int rs = op.minus();
        assertEquals(-10, rs);
    }
    
    @Test
    public void testMul() {
        int rs = op.mul();
        assertEquals(200, rs);
    }
    
    @Test
    public void testDiv() {
        double rs = op.div();
        assertEquals(0.5, rs, 0.0);
    }
    
}

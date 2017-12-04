package java22.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestMyUnit {

 private static MyUnit myUnit = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        myUnit = new MyUnit();
    }
    
    @Test
    public void test_Concate() {
        String result = myUnit.concate("ab", "12");
        assertEquals("ab12", result);
        
    }
    
    @Test
    public void test_getBoolean() {
        boolean result = myUnit.getBoolean();
        assertFalse(result);
        assertEquals(result, false);
        assertSame(result, false);
    }
    
    @Test
    public void test_getSameObject() {
        Object result = myUnit.getSameObject();
        
        // null 검증
        assertNull(result);
        assertEquals(null, result);
        assertSame(null, result);
        
    }
    
    @Test
    public void test_getObject() {
        Object result = myUnit.getObject();
        assertNull(result);
        assertEquals(null, result);
        assertSame(null, result);
    }
    
    @Test
    public void test_getStringArray() {
        String[] result = myUnit.getStringArray();
        String[] expecteds = { "one", "two", "three" };
        assertArrayEquals(expecteds, result); // 배열의 값으로 동일 여부를 비교.
        
    }
    
    @Test(expected = ArithmeticException.class) // () 안의 부분이 exception 처리 하는 부분.
    public void test_getException() {
        double result = myUnit.getException(); // ArithmeticException 발생.
        
    }
    
    @Test(expected = IndexOutOfBoundsException.class) // 오류 날시 밑에 가장 위쪽 줄. () 안에.
    public void test_getEmptyList() {
        ArrayList<String> list = myUnit.getEmptyList();
        list.get(0);
    }


}

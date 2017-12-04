package junittest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestArrayList {
    
    static List<String> list = null;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        
        list = new ArrayList<>();
        list.add("0");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
    }
    
    @Test
    public void test1() {
        assertNotNull(list);
    }
    
    @Test
    public void test2() {
        assertEquals(5, list.size());
    }
    
    @Test
    public void test3() {
        assertSame(true, list.contains("1"));
    }
    
    @Test
    public void test4() {
        String names1[] = {"y2kpooh","hwang"};
        String names2[] = {"y2kpooh","hwang"};
        
        assertArrayEquals(names1, names2);
    }
}

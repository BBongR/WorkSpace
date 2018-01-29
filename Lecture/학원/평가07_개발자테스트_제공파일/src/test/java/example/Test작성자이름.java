package example;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.BeforeClass;
import org.junit.Test;

import example.debug.Employee;
import example.debug.EmployeeList;

public class Test작성자이름 {

    private static EmployeeList list = null;

    @BeforeClass
    public static void setUpClass() {

        list = new EmployeeList();

        list.addEmployee(new Employee(0, "0"));
        list.addEmployee(new Employee(2, "2"));
        list.addEmployee(new Employee(1, "1"));
        list.addEmployee(new Employee(3, "3"));
        list.addEmployee(new Employee(4, "4"));
        list.addEmployee(new Employee(3, "5"));
    }

    /*
     * 문제1. JUnit을 이용하여 list가 null 이 아님을 검증하는 테스트 코드들 작성하시오. 테스트 메서드명: test01
     */
    @Test
    public void test01() {
        assertNotNull(list);
    }

    /*
     * 문제2. JUnit을 이용하여 list 의 갯수가 5인지를 검증하는 테스트 코드들 작성하시오. 테스트 메서드명: test02
     */

    @Test
    public void test02() {
        assertEquals(5, list.getList().size());
    }

    /*
     * 문제3. JUnit을 이용하여 list 에 targetId=10이 존재하지 않음을 검증하는 테스트 코드들 작성하시오. 테스트 메서드명:
     * test03
     */

    @Test
    public void test03() {
        for (int i = 0; i < list.getList().size() - 1; i++)
            assertNotEquals(6, list.getList().get(i).id);
    }

    /*
     * 문제4. JUnit을 이용하여 Employee.isValid() 메서드를 검증하는 테스트 코드들 작성하시오.
     * boolean isValid = new Employee().isValid( "test" ); 인 경우에 isValid가 false 가 되면 테스트가 통과 되도록 코드를
     * 작성하시오 테스트 메서드명: test04
     */

    @Test
    public void test04() {
        boolean isValid = new Employee().isValid( "test" );
        assertFalse(isValid);
    }
    
    /*
     * 문제5. JUnit을 이용하여 두 배열이 같음을 검증하는 테스트 코드들 작성하시오.
     * String names1[] = {"y2kpooh","hwang"};
     * String names2[] = {"y2kpooh","hwang"}; 테스트 메서드명: test05
     */
    
    @Test
    public void test05() {
        String names1[] = {"y2kpooh","hwang"};
        String names2[] = {"y2kpooh","hwang"};
        
        assertArrayEquals(names1, names2);
    }
}

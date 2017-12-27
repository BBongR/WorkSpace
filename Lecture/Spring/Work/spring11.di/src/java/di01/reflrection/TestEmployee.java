package di01.reflrection;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.BeforeClass;
import org.junit.Test;

import di01.model.Employee;

public class TestEmployee {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @Test
    public void test_Make_Instance_with_new() {
        di01.model.Employee emp1 = new Employee();
        emp1.setAddress("emp1 address");
        emp1.setName("emp1 name");
        emp1.setRrn("emp1 rrn");
        emp1.setSalary(10000);

        di01.model.Employee emp2 = new Employee("emp2 name", "emp2 address", 1000, "emp2 rrn");
        assertEquals("emp2 address", emp2.getAddress());
    }

    @Test
    public void test_make_instance_with_reflection()
            throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class klass = Class.forName("di01.model.Employee");

        Class[] paramTypes = { String.class, String.class, int.class, String.class };

        Object[] objs = {"emp2 name", "emp2 address", 1000, "emp2 rrn"};
                
        Constructor cons = klass.getConstructor(paramTypes);
        
        Object instance = cons.newInstance(objs);
        
        System.out.println(instance.toString());
        assertEquals("emp2 address", ((di01.model.Employee)instance).getAddress());
        
        
        /*  -----------------  */
        
        Method m = klass.getMethod("setName", String.class);
        
        Object [] params = {"hello"};
        
        m.invoke(instance, params);
        System.out.println(instance.toString());
        
        assertEquals("hello", ((di01.model.Employee)instance).getName());
        
        /*  -----------------  */
        
        m = klass.getMethod("getName");
        
        Object result = m.invoke(instance);
        
        System.out.println(result);
        assertEquals("hello", result);
    }
}

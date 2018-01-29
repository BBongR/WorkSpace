package example.debug;

import java.util.*;

public class EmployeeList {
    private List<Employee> list = new ArrayList<Employee>();

    public List<Employee> getList() {
        return list;
    }

    public boolean addEmployee(Employee emp) {
        for (int i = 0; i < list.size(); i++) {
            int id = (list.get(i)).id;

            if (id > emp.id) {
                
                list.add(list.indexOf(list.get(i)), emp);
                return true;
            } else if (id == emp.id) {
                list.set(id, emp);
                return false;
            }
        }

        list.add(emp);

        return true;
    }

    public Employee findEmployee(int targetId) {
        return list.get(targetId);
    }
}

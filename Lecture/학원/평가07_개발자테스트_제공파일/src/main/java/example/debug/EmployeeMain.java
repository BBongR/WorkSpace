package example.debug;

public class EmployeeMain {
    public static void main(String[] args) {
        EmployeeList list = new EmployeeList();

        list.addEmployee(new Employee(0, "0"));
        list.addEmployee(new Employee(2, "2"));
        list.addEmployee(new Employee(1, "1"));
        list.addEmployee(new Employee(3, "3"));
        list.addEmployee(new Employee(4, "4"));
        list.addEmployee(new Employee(99, "99"));
        list.addEmployee(new Employee(3, "5"));

        for (int i = 0; i < list.getList().size(); i++) {
            Employee emp = list.findEmployee(i);

            System.out.println("ID : " + emp.id + "\tName: " + emp.name);
        }
    }
}

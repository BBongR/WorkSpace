package di01.model;

public class Employee {
    private String name;
    private String address;
    private int salary;
    private String rrn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String adress) {
        this.address = adress;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getRrn() {
        return rrn;
    }

    public void setRrn(String rrn) {
        this.rrn = rrn;
    }

    public Employee() {
        super();
    }
    
    public Employee(String name, String address, int salary, String rrn) {
        super();
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.rrn = rrn;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
    }
}

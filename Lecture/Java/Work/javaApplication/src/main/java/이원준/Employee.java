package 이원준;

public class Employee {
    private String name;
    private String addr;
    protected int salary;
    private String rrn;

    // getter & setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
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

    // 기본 생성자
    public Employee() {
        super();
    }

    // 생성자
    public Employee(String name, String addr, int salary, String rrn) {
        super();
        this.name = name;
        this.addr = addr;
        this.salary = salary;
        this.rrn = rrn;
    }

    // toString
    @Override
    public String toString() {
        return "Employee [name=" + name + ", addr=" + addr + ", salary=" + salary + ", rrn=" + rrn + "]";
    }
}

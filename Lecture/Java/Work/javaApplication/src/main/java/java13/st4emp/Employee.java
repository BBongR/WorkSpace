package java13.st4emp;

public class Employee {

    // 필드
    private String name;
    private String address;
    private int salary;
    private String rrm;

    // 메서드
    public void printName() {
        String result = getName();
        System.out.println("이름: " + result);
    }

    public void printAdress() {
        String result = getAddress();
        System.out.println("주소: " + result);
    }

    public void printSalary() {
        int result = getSalary();
        System.out.println("월급: " + result);
    }

    public void printrrm() {
        String result = getRrm();
        System.out.println("주민번호: " + result);
    }

    // geter & setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getRrm() {
        return rrm;
    }

    public void setRrm(String rrm) {
        this.rrm = rrm;
    }

    // 생성자
    public Employee(String name, String address, int salary, String rrm) {
    	super();
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.rrm = rrm;
    }

    public Employee() {
		super();
	}

	// toString
    @Override
    public String toString() {
        return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + ", rrm=" + rrm + "]";
    }

}

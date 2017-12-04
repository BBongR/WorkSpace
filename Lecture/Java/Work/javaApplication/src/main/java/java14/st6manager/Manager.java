package java14.st6manager;

public class Manager extends Employee {

	private int bonus = 0;

	// method
	public void test() {
		String info = "name: " + super.getName();
		info = info + ", address: " + super.getAddress();
		info = info + ", salary: " + super.salary;
		info = info + ", rrn: " + super.getRrn();
		System.out.println(info);
	}

	// getter & setter
	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	// toString
	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + ", salary=" + salary + ", toString()=" + super.toString() + "]";
	}

	// 생성자
	public Manager(int bonus) {
		super();
		this.bonus = bonus;
	}

	public Manager() {
		super();
	}
}

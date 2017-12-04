package java14.st7student;

public class GraduateStudent extends Student {

	public String lab = "";

	// getter & setter
	public String getLab() {
		return lab;
	}

	public void setLab(String lab) {
		this.lab = lab;
	}

	// toString
	@Override
	public String toString() {
		return "GraduateStudent [lab=" + lab + ", toString()=" + super.toString() + "]";
	}

	// 생성자
	public GraduateStudent() {
		super();
	}

	public GraduateStudent(String lab) {
		super();
		this.lab = lab;
	}

	public GraduateStudent(int number, String name, String phone, String lab) {
		super(number, name, phone);
		this.lab = lab;
	}
}

package java22.junit;

public class Student {

	private String name;
	private int score;

	public String getGrade(int grade) {

		String result = "";

		if (90 <= grade)
			result = "A";
		else if (80 <= grade)
			result = "B";
		else if (70 <= grade)
			result = "C";
		else if (60 <= grade)
			result = "D";
		else
			result = "F";

		return result;

	}

	// getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	// toString
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}

	// 생성자
	public Student() {
		super();
	}

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

}

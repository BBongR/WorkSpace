package java14.st7student;

public class GraduateStudentTest {
	public static void main(String[] args) {

		// GraduateStudent 인스턴스 s1을 생성하고 setter로 값 설정/출력
		// GraduateStudent 인스턴스 s2을 생성하고 필드에 직접 값을 설정/출력
		// 필드 3개가 해당 됨. settet를 이용하지 않고 필드에 값 설정이 가능하다.
		// GraduateStudent 인스턴스 s3을 생성하고 생성자를 이용하여 필드에 값을 설정/출력

		GraduateStudent s1 = new GraduateStudent();
		s1.setNumber(123);
		s1.setName("한지민");
		s1.setPhone("123-456-789");
		s1.setLab("abc");
		System.out.println(s1.toString());

		GraduateStudent s2 = new GraduateStudent();
		s2.setNumber(456);
		s2.name = "한지민";
		s2.phone = "987-654-321";
		s2.lab = "zzz";
		System.out.println(s2.toString());

		GraduateStudent s3 = new GraduateStudent(789, "한지민", "111-222-333", "xxx");
		System.out.println(s3.toString());
	}
}

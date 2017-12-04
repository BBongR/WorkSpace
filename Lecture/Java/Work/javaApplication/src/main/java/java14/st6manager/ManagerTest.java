package java14.st6manager;

public class ManagerTest {
	public static void main(String[] args) {

		// Manager 인스턴스 m1을 생성하고 test() 메서드를 호출.
		/* 필드에 값을 설정한 후
		      m1.name    : 한지민
		      m1.address : 압구정
		      m1.salary  : 1억
		      m1.rrn     : 821105 */
		// test() 메서드를 호출

		Manager m1 = new Manager();
		m1.setName("한지민");
		m1.setAddress("압구정");
		m1.salary = 100000000;
		m1.setRrn("821105");

		m1.test();
	}
}

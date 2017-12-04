package java13.st2MethodType;

public class MethodTypeTest {
	public static void main(String[] args) {

		MethodType m = new MethodType();

		// 참조변수.메서드이름 (인스턴스 메서드 호출시)
		m.instancsMethod();

		// 클래스이름.static 메서드이름 (static 메서드 호출시)
		MethodType.staticMethod();
	}

}

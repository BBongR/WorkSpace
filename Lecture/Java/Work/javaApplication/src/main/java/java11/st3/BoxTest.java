package java11.st3;

public class BoxTest {

	public static void main(String[] args) {

		//int tmp;

		// Box 인스턴스를 생성하시오
		Box tmp = new Box(); // width, length, height
		
		tmp.setWidth(100);
		tmp.setLength(100);
		tmp.setHeight(100);
		
		// 부피를 계산하고 출력하시오
		tmp.printVolumn();
	}

}

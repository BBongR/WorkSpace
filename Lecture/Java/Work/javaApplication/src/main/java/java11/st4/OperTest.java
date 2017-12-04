package java11.st4;

import java.util.Scanner;

public class OperTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("first 입력: ");
		int first = sc.nextInt();
		System.out.print("second 입력: ");
		int second = sc.nextInt();

		Oper ot = new Oper();

		ot.setX(first);
		ot.setY(second);

		ot.printadd();

		ot.printminus();

		ot.printmul();

		ot.printdiv();

	}

}

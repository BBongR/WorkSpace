package java13.st1;

public class VarArgs {

	public void sub(int... v) {
		System.out.println("인수의 개수 : " + v.length);
		for (int x : v) {
			System.out.print(x + " ");
		}
		System.out.println();

		System.out.println("-----");
		for (int i = 0; i < v.length; i = i + 1) {
			System.out.print(v[i] + " ");
		}
		System.out.println();
		System.out.println("***************************");
	}
}

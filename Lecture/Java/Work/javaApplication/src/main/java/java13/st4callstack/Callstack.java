package java13.st4callstack;

public class Callstack {
	public static void main(String[] args) {
		
		firstMethod();
	}

	public static void firstMethod() {
		secondMethod();
	}

	public static void secondMethod() {
		System.out.println("secondMethod()");
	}
}

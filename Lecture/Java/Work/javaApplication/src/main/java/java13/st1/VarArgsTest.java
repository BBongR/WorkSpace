package java13.st1;

public class VarArgsTest {
	public static void main(String[] args) {

		VarArgs c = new VarArgs();

		c.sub(1);
		c.sub(1, 2, 3, 4);
		c.sub();
	}
}

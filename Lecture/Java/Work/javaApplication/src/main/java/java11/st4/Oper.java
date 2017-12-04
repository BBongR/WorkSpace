package java11.st4;

public class Oper {
	// 변수
	private int x;
	private int y;

	// 사칙연산 메서드
	public int add() {
		return x + y;
	}

	public int minus() {
		return x - y;
	}

	public int mul() {
		return x * y;
	}

	public double div() {
		return (double) x / y;
	}

	// print 메서드
	public void printadd() {
		int volumn = add();
		System.out.println(x + " + " + y + " = " + volumn);
	}

	public void printminus() {
		int volumn = minus();
		System.out.println(x + " - " + y + " = " + volumn);
	}

	public void printmul() {
		int volumn = mul();
		System.out.println(x + " * " + y + " = " + volumn);
	}

	public void printdiv() {
		double volumn = div();
		System.out.println((double) x + " / " + (double) y + " = " + volumn);
	}

	// getter & setter

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 생성자

	public Oper() {
		super();
	}

	// toString

	@Override
	public String toString() {
		return "Oper [x=" + x + ", y=" + y + "]";
	}

}

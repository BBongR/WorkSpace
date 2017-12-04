package java11.st3;

public class Box {

	private int width;
	private int length;
	private int height;

	// getVolumn() 메서드를 만드시오
	// 가로*세로*높이 결과를 리턴
	public int getVolumn() {
		return width * length * height;
	}

	// printVolumn() 메서드를 만드시오
	// getvolumn() 으로 얻은 결과를 출력
	public void printVolumn() {
		int volumn = getVolumn();
		System.out.println(volumn);
	}

	// getter & setter 생성
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// constructor(생성자)

	// 기본 생성자
	public Box() {
		super();
	}
	// public Box(int width, int length, int height) {
	// super();
	// this.width = width;
	// this.length = length;
	// this.height = height;
	// }

	// toString()
	@Override
	public String toString() {
		return "Box [width=" + width + ", length=" + length + ", height=" + height + "]";
	}

}

package 이원준;

class Demo {
	public Integer data;

	public void setData(Integer data) {
		this.data = data;
	}

	public Integer getData() {
		return data;
	}
}

class GenericDemo<T> {

	public T data;

	public void setData(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

}

public class GenericEx1 {
	public static void main(String[] args) {

		System.out.println("일반 클래스 호출 예 -----");
		Demo d1 = new Demo();
		// Integer ing = new Integer(100);

		d1.setData(new Integer(100));
		System.out.println("data = " + d1.getData());

		System.out.println("제네릭 클래스 호출 예 -----");
		GenericDemo<Integer> gd = new GenericDemo<Integer>();

		gd.setData(new Integer(200));
		System.out.println("data = " + gd.getData());

		GenericDemo<String> gd1 = new GenericDemo<String>();

		gd1.setData(new String("하이 자바"));
		System.out.println("data = " + gd1.getData());
	}

}

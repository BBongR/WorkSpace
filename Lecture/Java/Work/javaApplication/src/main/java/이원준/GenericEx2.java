package 이원준;

class StudentData {
	public String name;

	StudentData(String name) {
		this.name = name;
	}
}

class Person<T, E> {
	public T data;
	public E id;

	public Person(T data, E id) {
		this.data = data;
		this.id = id;
	}
}

public class GenericEx2 {
	public static void main(String[] args) {

		Person<StudentData,Integer> p1 = new Person<StudentData, Integer>(new StudentData("홍길동"), 20140001);	
		System.out.println(p1.id);
	}

}

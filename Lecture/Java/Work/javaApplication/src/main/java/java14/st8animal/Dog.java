package java14.st8animal;

public class Dog extends Animal {

	public void bark() {
		System.out.println("brek");
	}
	
	@Override
	public void eat(){
		System.out.println("코로 먹는다");
	}
}

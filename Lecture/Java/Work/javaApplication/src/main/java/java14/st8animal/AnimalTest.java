package java14.st8animal;

public class AnimalTest {
	public static void main(String[] args) {

		Animal a = new Animal();
		a.sleep();
		a.eat();

		System.out.println("-----도그-----");
		Dog d = new Dog();
		d.sleep();
		d.eat();
		d.bark();

		System.out.println("-----냥이-----");
		Cat c = new Cat();
		c.sleep();
		c.eat();
		c.play();
	}
}

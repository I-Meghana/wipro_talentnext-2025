package OOPS_Inheritance;
class Animal{
	void eat() {
		System.out.println("Animals are eating:");
	}
	void sleep() {
		System.out.println("Animals are sleeping:");
	}
}
class Bird extends Animal{
	void eat() {
		System.out.println("birds are eating");
	}
	void sleep() {
		System.out.println("birds are sleeping");
	}
	void fly() {
		System.out.println("birds are flying");
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Animal animal=new Animal();
		animal.eat();
		animal.sleep();
		Bird bird=new Bird();
		bird.eat();
		bird.sleep();
		bird.fly();

	}

}

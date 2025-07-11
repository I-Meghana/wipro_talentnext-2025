package OOPS_Inheritance;
class Fruit{
	String name;
	String Taste;
	String size;
	Fruit(String name, String Taste, String size){
		this.name = name;
		this.Taste = Taste;
		this.size = size;
	}
	public void eat() {
		System.out.println("fruit:" +name+"Taste"+Taste+ "size");
	}
}
class Apple extends Fruit{
	String name, taste, size;
	 Apple(String name, String Taste, String size){
		super(name, Taste, size);
	}
	public void eat() {
		System.out.println("Apple taste is:" +Taste);
	}
}
class Orange extends Fruit{
	String name, taste, size;
	Orange(String name, String Taste, String size){
		super(name, Taste, size);
	}
	public void eat() {
		System.out.println("Orange taste is:"+Taste);
	}
}
public class Polymorphism1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a=new Apple("apple","sweet","medium");
		Orange o=new Orange("orange","sour","medium");
		a.eat();
		o.eat();

	}

}

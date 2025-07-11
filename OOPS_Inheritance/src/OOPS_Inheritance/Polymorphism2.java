package OOPS_Inheritance;
class Shape{
	public void draw() {
		System.out.println("Drawing Shape");
	}
	public void erase() {
		System.out.println("Erasing Shape");
	}
}
class Circle{
	public void draw() {
		System.out.println("Drawing Circle");
	}
	public void erase() {
		System.out.println("Erasing Circle");
	}
}
class Triangle{
	public void draw() {
		System.out.println("Drawing Triangle");
	}
	public void erase() {
		System.out.println("Erasing Triangle");
	}
}
class Square{
	public void draw() {
		System.out.println("Drawing Square");
	}
	public void erase() {
		System.out.println("Erasing Square");
	}
}
public class Polymorphism2 {

	public static void main(String[] args) {
		Circle c=new Circle();
		c.draw();
		c.erase();
		Triangle t=new Triangle();
		t.draw();
		t.erase();
		Square s=new Square();
		s.draw();
		s.erase();
		

	}

}

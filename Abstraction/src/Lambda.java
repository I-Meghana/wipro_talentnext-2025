interface Test{
	int myFunction(int a, int b, int c); 
}
public class Lambda {

	public static void main(String[] args) {
		Test t1 = (a, b, c) -> a + b + c;
		Test t2 = (a, b, c) -> a * b * c;
		int result1 = t1.myFunction(2, 5, 7);
		int result2 = t2.myFunction(2, 5, 7);
		System.out.println("Sum:" +result1);
		System.out.println("Product:"+result2);

	}

}

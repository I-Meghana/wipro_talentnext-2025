abstract class Compartment{
	public abstract void notice();
}
class Firstclass extends Compartment{
	public void notice(){
		System.out.println("The Firstclass extended compartment");
	}
}
class Ladies extends Compartment{
	public void notice() {
		System.out.println("Ladies Compartment");
	}
}
class General extends Compartment{
	public void notice() {
		System.out.println("General Compartment");
	}
}
class Luggage extends Compartment{
	public void  notice() {
		System.out.println("Lugguage");
	}
}

public class Abstract {

	public static void main(String[] args) {
		Compartment[] train=new Compartment[10];
		for(int i=0;i<train.length;i++) {
			int r=1+(int)(Math.random()*4);
			switch(r) {
			case 1:train[i]=new Firstclass(); break;
			case 2:train[i]=new Ladies(); break;
			case 3:train[i]=new General(); break;
			case 4:train[i]=new Luggage(); break;
			}
		}
		System.out.println("===Coach Notice====");
		for(Compartment c : train) {
			c.notice();
		}


	}

}

package OOPS_Inheritance;
import java.util.*;
public class Box {
	double height;
	double width;
	double depth;
	public Box(double height, double width, double depth){
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	double getvolume() {
		return height*width*depth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1=new Box(5, 6, 7);
		/*System.out.println("height:" +b1.height);
		System.out.println("width:" +b1.width);
		System.out.println("depth:" +b1.depth);
		System.out.println("volume:" +b1.getvolume()); */
		double volume=b1.getvolume();
		System.out.println("volume of the box:");
		System.out.println(volume);

	}

}

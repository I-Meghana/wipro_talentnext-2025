package java_fundamentals;
import java.util.*;
public class Question4A {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a value:");
		int a=sc.nextInt();
		 if(a>0) {
			 System.out.println("Positive");
		 }else if(a<0) {
			 System.out.println("Negative");
		 }else {
			 System.out.println("Zero");
		 }

	}

}

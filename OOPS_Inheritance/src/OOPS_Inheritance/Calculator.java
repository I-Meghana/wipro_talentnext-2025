package OOPS_Inheritance;
import java.util.*;
public class Calculator {
	static int powerInt(int num1, int num2) {
		return (int) Math.pow(num1, num2);
	}
	static double powerDouble(double num1, double num2) {
		return Math.pow(num1, num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result1 = Calculator.powerInt(5, 3);
		System.out.println("5 to the power of 3 is:"+result1);
		double result2 = Calculator.powerDouble(5.6, 3);
		System.out.println("5.6 to the power of 3 is:"+result2);
		
		

	}

}

package java_fundamentals;
import java.util.*;
public class Question21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number:");
	        int num = sc.nextInt(), rev = 0, temp = num;

	        while (num > 0) {
	            rev = rev * 10 + num % 10;
	            num = num / 10;
	        }

	        if (temp == rev)
	            System.out.println(temp + " is a palindrome");
	        else
	            System.out.println(temp + " is not a palindrome");


	}

}

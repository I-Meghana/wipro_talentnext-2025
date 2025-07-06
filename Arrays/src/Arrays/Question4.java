package Arrays;
import java.util.*;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of values");
		int n=sc.nextInt();
		int[] ASCII=new int[n];
		System.out.println("Enter the" + n + "values");
		for(int i=0;i<n;i++) {
			ASCII[i]=sc.nextInt();
		}
		System.out.print("Characters:");
		for(int num :ASCII) {
			System.out.print((char)num + " ");
		}

	}

}

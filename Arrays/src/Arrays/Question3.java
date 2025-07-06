package Arrays;
import java.util.*;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,10,15,20,25,30};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		
		boolean found=true;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]==a) {
			System.out.println(i);
			found=true;
		}
		}
		if(!found) {
			System.out.println(-1);
		}
		
		

	}

}

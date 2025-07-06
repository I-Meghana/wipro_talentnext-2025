package Arrays;
import java.util.*;
public class Question6 {

	public static void main(String[] args) {
		//int[] arr= {8,2,5,10,15};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n  values");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter" + n + "values");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Sorted array");
		for(int val:arr) {
			System.out.println(val);
		}
		
	}

}

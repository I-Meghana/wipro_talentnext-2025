package Arrays;
import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of  values");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter " + n + " values" );
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer> List=new ArrayList<>();
		for(int i=0; i<arr.length;i++) {
			if(!List.contains(arr[i])) {
				List.add(arr[i]);
			}
		}
		System.out.println("Arrays after removing duplicates");
		for(int val: List) {
			System.out.println(val + " ");
		}
		

	}

}

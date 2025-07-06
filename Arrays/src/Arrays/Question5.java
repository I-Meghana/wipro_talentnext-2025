package Arrays;
import java.util.*;
public class Question5 {

	public static void main(String[] args) {
int arr[] = {23,59,35,64,72,19,47};
		
		Arrays.sort(arr);
		
		System.out.println("Highest values are: "+arr[arr.length-2]+", "+arr[arr.length-1]);
		System.out.println("Lowest values are: "+arr[0]+", "+arr[1]);


	}

}

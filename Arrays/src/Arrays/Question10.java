package Arrays;
import java.util.*;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 0, 1, 0, 0, 1, 1}; // Try changing this to {3, 3, 2}
        int[] result = new int[arr.length];
        int index = 0;

        // Step 1: Add even numbers first
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[index++] = arr[i];
            }
        }

        // Step 2: Then add odd numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[index++] = arr[i];
            }
        }

        // Print result
        System.out.println("Output: " + Arrays.toString(result));


	}

}

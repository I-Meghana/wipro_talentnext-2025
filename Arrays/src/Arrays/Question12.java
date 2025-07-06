package Arrays;
import java.util.*;
public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { {1, 2, 3}, {4, 5, 6} };

        int[] result = new int[2];
        result[0] = arr[0][arr[0].length / 2]; // Middle of first row
        result[1] = arr[1][arr[1].length / 2]; // Middle of second row

        System.out.println("Output: " + Arrays.toString(result));


	}

}

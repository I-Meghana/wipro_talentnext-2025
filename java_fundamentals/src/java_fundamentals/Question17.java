package java_fundamentals;
import java.util.*;
public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 10; i <= 99; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 0)
            	System.out.println(i+" ");
		}


	}

}

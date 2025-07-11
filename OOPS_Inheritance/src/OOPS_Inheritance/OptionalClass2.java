package OOPS_Inheritance;
import java.util.*;
public class OptionalClass2 {

	public static void main(String[] args) {
		String address = null; // You can change this to test with a non-null value

        // Use Optional to handle null and provide a default
        String result = Optional.ofNullable(address).orElse("India");

        System.out.println(result);
	}

}

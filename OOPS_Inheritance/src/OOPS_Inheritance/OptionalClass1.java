package OOPS_Inheritance;
import java.util.*;
public class OptionalClass1 {

	public static void main(String[] args) {
		 String[] names = new String[5]; // All elements are null by default

	        // Wrap names[0] in an Optional
	        Optional<String> optionalName = Optional.ofNullable(names[0]);

	        // Safely get the length, or provide a default value
	        int length = optionalName.map(String::length).orElse(0);

	        System.out.println("Length: " + length);

	}

}

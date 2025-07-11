package OOPS_Inheritance;
import java.util.*;
public class StringJoiner2 {

	public static void main(String[] args) {
		 StringJoiner s1 = new StringJoiner("-", "[", "]");
	        s1.add("New York").add("London").add("Paris");
	        StringJoiner s2 = new StringJoiner("-", "[", "]");
	        s2.add("Tokyo").add("Berlin").add("Sydney");
	        StringJoiner s2Merged = new StringJoiner("-", "[", "]");
	        s2Merged.merge(s2);  
	        s2Merged.merge(s1); 
	        System.out.println("i) s1 merged to s2: " + s2Merged);
	        StringJoiner s1Merged = new StringJoiner("-", "[", "]");
	        s1Merged.merge(s1);  
	        s1Merged.merge(s2);  
	        System.out.println("ii) s2 merged to s1: " + s1Merged);

	}

}

package OOPS_Inheritance;
import java.util.*;
public class StringJoiner1 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        StringJoiner joiner = new StringJoiner(", ", "{", "}");
        for (String name : names) {
            joiner.add(name);
        }
        System.out.println(joiner.toString());

	}

}

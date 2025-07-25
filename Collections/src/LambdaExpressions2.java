

import java.util.*;

public class LambdaExpressions2 {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList and add 10 different words
        ArrayList<String> al = new ArrayList<>();
        al.add("Java");
        al.add("Python");
        al.add("C++");
        al.add("JavaScript");
        al.add("Ruby");
        al.add("Swift");
        al.add("Go");
        al.add("Kotlin");
        al.add("Scala");
        al.add("Rust");

        // Step 2: Print in reverse order using lambda
        System.out.println("Words in reverse order:");
        Collections.reverse(al);  // Reverse the list
        al.forEach(word -> System.out.println(word));  // Lambda to print
    }
}
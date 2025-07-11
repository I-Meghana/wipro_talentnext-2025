package OOPS_Inheritance;

public class String10 {
	 public static String repeatLastN(String str, int n) {
	        if (n < 0 || n > str.length()) {
	            return "Invalid input: n must be between 0 and the length of the string.";
	        }

	        // Get the last 'n' characters of the string
	        String lastN = str.substring(str.length() - n);

	        // Repeat the substring 'n' times
	        StringBuilder result = new StringBuilder();
	        for (int i = 0; i < n; i++) {
	            result.append(lastN);
	        }

	        return result.toString();
	    }

	public static void main(String[] args) {
		System.out.println(repeatLastN("Wipro", 3));  
        System.out.println(repeatLastN("Java", 2)); 

	}

}

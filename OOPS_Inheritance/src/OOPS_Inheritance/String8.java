package OOPS_Inheritance;

public class String8 {
	 public static String removeStarAndNeighbors(String str) {
	        StringBuilder result = new StringBuilder();

	        for (int i = 0; i < str.length(); i++) {
	            // Skip if current character is '*' or its neighbor
	            if (str.charAt(i) == '*') continue;
	            if (i > 0 && str.charAt(i - 1) == '*') continue;
	            if (i < str.length() - 1 && str.charAt(i + 1) == '*') continue;

	            result.append(str.charAt(i));
	        }

	        return result.toString();
	    }


	public static void main(String[] args) {
		 System.out.println(removeStarAndNeighbors("ab*cd")); 

	}

}

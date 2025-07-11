package OOPS_Inheritance;

public class String9 {
	public static String mixStrings(String a, String b) {
        StringBuilder result = new StringBuilder();

        int minLength = Math.min(a.length(), b.length());

        // Interleave common length
        for (int i = 0; i < minLength; i++) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }

        // Append remaining characters from the longer string
        if (a.length() > minLength) {
            result.append(a.substring(minLength));
        } else if (b.length() > minLength) {
            result.append(b.substring(minLength));
        }

        return result.toString();
    }

	public static void main(String[] args) {
		System.out.println(mixStrings("Hello", "World"));
	}

}

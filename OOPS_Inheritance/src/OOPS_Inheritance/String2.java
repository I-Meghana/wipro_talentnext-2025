package OOPS_Inheritance;

public class String2 {
	public static String concatenateStrings(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if(!str1.isEmpty() && !str2.isEmpty() && str1.charAt(str1.length()-1) == str2.charAt(0)) {
			return str1 +  str2.substring(1);
		} else {
			return str1 + " " + str2;
		}
	}
	public static void main(String[] args) {
		System.out.println(concatenateStrings("Sachin", "Tendulkar"));
		System.out.println(concatenateStrings("Mark", "Kate"));

	}

}

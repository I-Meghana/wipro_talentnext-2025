package OOPS_Inheritance;

public class String3 {
	public static String repeatFront(String str) {
		int n=str.length();
		String front = str.length() < 2 ? str: str.substring(0, 2);
		String result = "";
		for(int i=0; i<n; i++) {
			result+=front;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(repeatFront("Wipro"));

	}

}

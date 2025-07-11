package OOPS_Inheritance;

public class String6 {
	public static String makeShortLongShort(String a, String b) {
		if(a.length()<b.length()) {
			return a + b + a;
		}else {
			return b + a + b;
		}
	}

	public static void main(String[] args) {
		String result= makeShortLongShort("hi","hello");
		System.out.println(result);

	}

}

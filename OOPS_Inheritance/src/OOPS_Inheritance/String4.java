package OOPS_Inheritance;

public class String4 {
	public static String getFirstHalf(String str) {
		if(str.length() % 2 == 0) {
			return str.substring(0, str.length()/2);
		}else {
			return null;
		}
	}

	public static void main(String[] args) {
		String result1 = getFirstHalf("TomCat");
		System.out.println(result1);
		String result2 = getFirstHalf("Apron");
		System.out.println(result2);

	}

}

package OOPS_Inheritance;

public class String7 {
	public static String removeXFromEnds(String str) {
		int len=str.length();
		if(len==0) return "";
		if(len==1) return str.equals("X")?"":str;
		if(str.startsWith("x")){
			str= str.substring(1);
		}
		if(str.endsWith("x")) {
			str=str.substring(0, str.length()-1);
		}
		return str;
	}

	public static void main(String[] args) {
		System.out.println(removeXFromEnds("xHix"));
		System.out.println(removeXFromEnds("America"));

	}

}

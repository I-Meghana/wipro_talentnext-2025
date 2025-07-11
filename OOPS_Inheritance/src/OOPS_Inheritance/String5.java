package OOPS_Inheritance;

public class String5 {
	public static String removeFirstAndLast(String str){
		if(str.length() <= 2) {
			return "";
		}
		return str.substring(1,str.length()-1);
	}
	public static void main(String[] args) {

        String result = removeFirstAndLast("Suman");
        System.out.println( result);

	}

}

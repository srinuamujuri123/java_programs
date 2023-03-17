package basicPrograms;

public class Test13 {
	public static void main(String[] args) {
		String strng = "srinivasu";
		System.out.println(new StringBuffer(strng).reverse());
		stringReverse(strng);
	}

	private static void stringReverse(String strng) {
		char character;
		String nstr = "";
		for (int i = 0; i < strng.length(); i++) {
			character = strng.charAt(i);
			nstr = character + nstr;
		}
		System.out.println("new string: " + nstr);
	}
}

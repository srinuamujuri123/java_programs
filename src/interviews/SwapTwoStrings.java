package interviews;

public class SwapTwoStrings {
	public static void main(String[] args) {
		String s1 = "good";
		String s2 = "morning";
		System.out.println("Before swapping: s1: " + s1 + " and " + "s2: " + s2);
		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("After swapping: s1: " + s1 + " and " + "s2: " + s2);
	}
}
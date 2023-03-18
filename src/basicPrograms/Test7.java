package basicPrograms;

public class Test7 {
	public static void main(String[] args) {
		swapTwoNumners();
		swapTwoStrings();
	}

	public static void swapTwoNumners() {
		int numberOne = 10, numberTwo = 20;
		System.out.println("---without 3rd variable---");
		System.out.println("Before swapping numberone value is " + numberOne);
		System.out.println("Before swapping numbertwo value is " + numberTwo);
		numberOne += numberTwo;
		numberTwo = numberOne - numberTwo;
		numberOne -= numberTwo;
		System.out.println("After swapping numberone value is " + numberOne);
		System.out.println("After swapping numbertwo value is " + numberTwo);

		System.out.println("---with 3rd variable---");
		int numberThree = numberOne;
		System.out.println("Before swapping numberone value is " + numberOne);
		System.out.println("Before swapping numbertwo value is " + numberTwo);
		numberOne = numberTwo;
		numberTwo = numberThree;
		System.out.println("After swapping numberone value is " + numberOne);
		System.out.println("After swapping numbertwo value is " + numberTwo);
	}

	public static void swapTwoStrings() {
		String s1 = "good";
		String s2 = "morning";
		System.out.println("Given Strings are: s1: " + s1 + " and " + "s2: " + s2);
		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		System.out.println("After swapping strings : s1: " + s1 + " and " + "s2: " + s2);
	}
}

package basicPrograms;

public class Test8 {
	public static void main(String[] args) {
		int number = 121, copy = number, reverse = 0;
		System.out.println("Given number is: " + number);
		while (number > 0) {
			int reminder = number % 10;
			reverse = reverse * 10 + reminder;
			number = number / 10;
		}
		System.out.println("reverse number is: " + reverse);
		if (copy == reverse) {
			System.out.println(copy + " number is a palindrome");
		} else {
			System.out.println(copy + " number is not a palindrome.");
		}
		String s = "mam";
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(s);
		System.out.println(stringBuilder.reverse());
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(s);
		System.out.println(stringBuffer.reverse());
	}
}

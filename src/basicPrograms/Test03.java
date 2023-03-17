package basicPrograms;

public class Test03 {
	public static void main(String[] args) {
		int number = 19475;
		NumberOfDigits(number);
	}

	private static void NumberOfDigits(int number) {
		int copy = number;
		int digits = 0;
		while (number > 0) {
			digits++;
			number = number / 10;
		}
		System.out.println(copy + " have " + digits + " digits.");

	}
}

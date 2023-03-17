package basicPrograms;

public class Test4 {
	public static void main(String[] args) {
		int number = 145;
		strongNumber(number);

	}

	private static void strongNumber(int number) {
		System.out.println("Given number is: " + number);
		int sum = 0, copy = number;
		while (number > 0) {
			int factorial = 1;
			int reminder = number % 10;
			for (int i = 1; i <= reminder; i++) {
				factorial = factorial * i;
			}
			System.out.println(reminder + " factorial is : " + factorial);
			sum = sum + factorial;
			number = number / 10;
		}
		System.out.println("sum of factorials of each number is: " + sum);
		if (copy == sum)
			System.out.println(copy + " number is a strong number");
		else
			System.out.println(copy + " number is not a strong number");
	}
}

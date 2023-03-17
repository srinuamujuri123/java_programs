package basicPrograms;

public class Test12 {
	public static void main(String[] args) {

		int[] numbers = { 10, 15, 85, 1, 9, 100 };
		System.out.println(highestNumber(numbers));
		System.out.println(lowestNumber(numbers));
		findPrime();

	}
	private static void findPrime() {
		int n = 19;
		int m = 0;
		int bool = 0;

		m = n / 2;

		if (n == 0 || n == 1) {

			System.out.println("Not a prime");
		} else {

			for (int i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println("Not a prime");
					bool = 1;
					break;
				}
			}
			if (bool == 0) {
				System.out.println("prime number");
			}
		}

	}

	private static String lowestNumber(int[] numbers) {
		int lowest = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < lowest)
				lowest = numbers[i];
		}
		return "lowest Number is: "+lowest;
	}

	private static String highestNumber(int[] numbers) {
		int highest = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > highest)
				highest = numbers[i];
		}
		return "Highest number is: "+highest;
	}
	
}

package basicPrograms;

public class Test6 {
	public static void main(String[] args) {
		System.out.println(sumOfnNaturalNumbers());
		System.out.println(sumOfDigitsOfGivenNumber());
	}

	static String sumOfnNaturalNumbers() {
		int number = 10, sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		return "sum of " + number + " natural numbers is " + sum;
	}

	static String sumOfDigitsOfGivenNumber() {
		int number = 156, sum = 0, copy = number;
		while (number > 0) {
			int reminder = number % 10;
			sum += reminder;
			number = number / 10;

		}
		return "Sum of digits of " + copy + " number is " + sum;
	}
}

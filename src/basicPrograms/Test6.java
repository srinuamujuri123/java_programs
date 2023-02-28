package basicPrograms;

public class Test6 {
	public static void main(String[] args) {
		System.out.println(sumOfnNaturalNumbers());
	}

	static String sumOfnNaturalNumbers() {
		int number = 10, sum = 0;
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		return "sum of " + number + " natural numbers is " + sum;
	}
}

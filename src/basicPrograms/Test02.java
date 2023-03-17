package basicPrograms;

public class Test02 {
	public static void main(String[] args) {
		int number = 183;
		fetchEachNumber(number);
	}

	private static void fetchEachNumber(int number) {
		while (number > 0) {
			int reminder = number % 10;
			System.out.println(reminder);
			number = number / 10;
		}
	}
}
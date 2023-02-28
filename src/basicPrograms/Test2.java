package basicPrograms;

public class Test2 {
	public static void main(String[] args) {
		int number = 183;
		while (number > 0) {
			int reminder = number % 10;
			System.out.println(reminder);
			number = number / 10;

		}
	}
}

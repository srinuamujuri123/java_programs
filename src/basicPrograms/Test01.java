package basicPrograms;

public class Test01 {
	public static void main(String[] args) {
		int number = 183;
		fetchLastNumberRemoveLastNumber(number);
	}

	private static void fetchLastNumberRemoveLastNumber(int number) {
		int getlastnumber = number % 10;
		System.out.println(getlastnumber);
		int removeLastNumber = number / 10;
		System.out.println(removeLastNumber);
		
	}
}

package basicPrograms;

public class Test11 {
	public static void main(String[] args) {
		String strng = "srinivasu123#$%";
		System.out.println(fetchedSplCharacters(strng));
		System.out.println(fetchedNumbers(strng));
		System.out.println(fetchedAlphabets(strng));
		fetchedNumbersAlphabetsSplCharacters(strng);
	}

	private static void fetchedNumbersAlphabetsSplCharacters(String strng) {
		char[] charArray = strng.toCharArray();
		StringBuffer numbers = new StringBuffer(), splCharacters = new StringBuffer(), alphabets = new StringBuffer();
		for (int i = 0; i < charArray.length; i++) {
			if (Character.isDigit(charArray[i]))
				numbers.append(charArray[i]);
			else if (Character.isAlphabetic(charArray[i]))
				alphabets.append(charArray[i]);
			else
				splCharacters.append(charArray[i]);
		}
		System.out.println(numbers);
		System.out.println(alphabets);
		System.out.println(splCharacters);
	}

	private static String fetchedAlphabets(String strng) {
		return strng = strng.replaceAll("[^a-z,A-Z,0-9]", "");
	}

	private static String fetchedNumbers(String strng) {
		return strng = strng.replaceAll("[^0-9]", "");
	}

	private static String fetchedSplCharacters(String strng) {
		if (strng != null) {
			strng = strng.replaceAll("[!^a-z,A-Z,0-9]", "");
		}
		return strng;
	}
}
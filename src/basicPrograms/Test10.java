package basicPrograms;

public class Test10 {
	public static void main(String[] args) {
		String str = "asrini123vasu@#$";
		System.out.println("Extracted Numbers are: " + extractNumbers(str));
		System.out.println("Extracted Characters are: " + extractCharacters(str));
		System.out.println("Extracted Special characters are: " + extractSplCharacters(str));
		extractCharactersNumbersSplCharacters(str);
	}

	private static void extractCharactersNumbersSplCharacters(String str) {
		StringBuffer specialCharacters = new StringBuffer(), numbers = new StringBuffer(),
				characters = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if (Character.isAlphabetic(str.charAt(i))) {
				characters.append(str.charAt(i));
			}
			if (Character.isDigit(str.charAt(i))) {
				numbers.append(str.charAt(i));
			} else {
				if (!(Character.isAlphabetic(str.charAt(i)) || Character.isDigit(str.charAt(i))))
					specialCharacters.append(str.charAt(i));
			}
		}
		System.out.println(characters);
		System.out.println(numbers);
		System.out.println(specialCharacters);
	}

	private static String extractCharacters(String str) {
		str = str.replaceAll("[^a-z,A-Z]", "");
		return str;
	}

	private static String extractNumbers(String str) {
		str = str.replaceAll("[^0-9]", "");
		return str;
	}

	private static String extractSplCharacters(String str) {
		return str.replaceAll("[!^a-z,A-Z,0-9]", "");
	}
}

package intermediatePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample1 {
	public static void main(String[] args) {
		countOccuranceOfEachCharacter();
		countOccuranceOfSingleCharacter();
		duplicateCharatersByUsingForLoop();

	}

	final static String strng = "JAVA IS VERY EASY TO LEARN";
	final static char character = 'A';

	private static void duplicateCharatersByUsingForLoop() {
		char[] charArray = strng.toCharArray();
		int count;
		for (int i = 0; i < strng.length(); i++) {
			count = 1;
			for (int j = i + 1; j < strng.length(); j++) {
				if (charArray[i] == charArray[j] && charArray[i] != ' ') {
					count++;
					charArray[j] = '0';
				}
			}
			if (count > 1 && charArray[i] != '0')
				System.out.print(charArray[i] + "=" + count + ", ");
		}
	}

	private static void countOccuranceOfSingleCharacter() {

		Long value = strng.codePoints().filter(onechar -> onechar == character).count();
		System.out.println(character + " is present in the given input is " + value);
		long val = strng.chars().filter(a -> a == character).count();
		System.out.println(character + " is present in the given input is " + val);
	}

	static void countOccuranceOfEachCharacter() {

		if (strng == null || strng.isEmpty()) {
			throw new IllegalArgumentException("Input should not be null or empty");
		} else
			System.out.println(Arrays.stream(strng.split("")).map(String::toLowerCase)
					.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting())));
	}
}

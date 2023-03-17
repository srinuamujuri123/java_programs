package intermediatePrograms;

import java.util.Arrays;
import java.util.List;

public class DataTest {

	public static void main(String[] args) {
		List<String> numbers = Arrays.asList("srinu","vijay","jishnu","suvarna");
		String[] array = numbers.toArray(new String[numbers.size()]);
		for(int i =1; i<array.length; i++) {
			System.out.println(array[i]);
		}
		for (String number : numbers) {
			System.out.println(number);
			
			
		}
	}
}

package intermediatePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example2 {

	public static void main(String[] args) {
		duplicates();

	}

	private static void duplicates() {
		String strng = "japan";

		List<String> names = new ArrayList<>();
		names.add("srinivasu");
		names.add("Avijaya");
		names.add("sajid");
		names.add("sajid");
		names.add("srinu");
		names.add("srinivasu");
		names.add(strng);

		names.stream().forEach(System.out::println);
		System.out.println("**********");
		Set<String> distinct = names.stream().collect(Collectors.toSet());
		System.out.println(distinct);
		System.out.println("************");
		strng.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(i -> i, Collectors.counting()))
				.forEach((k, v) -> System.out.println(k + " -> " + v));
		List<String> strList = Arrays.asList(strng.split(""));
		System.out.println(strList.stream().filter(i -> Collections.frequency(strList, i) > 1).collect(Collectors.toSet()));
		System.out.println(strList.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting())).entrySet().stream().filter(e-> e.getValue()>1).collect(Collectors.toMap(k-> k.getKey(), v-> v.getValue())));
		//Arrays.stream(strng.split("")).
	}

}

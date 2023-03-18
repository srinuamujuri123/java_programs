package intermediatePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamsExample {

	public static void main(String[] args) {
		lenghtcount();
		avoidNullInList();
		avoidSpacesAndNullInList();
		avoidNullSpacesApplyUpperCase();
		allMatchToNull();
		anyMatchToNull();
		noneMatchToNull();
		searchTermByPassingParameter();
		searchTermByPassingParameterReturnElementsIfFound();
	}

	static List<String> sampleList = Arrays.asList("java", null, "spring", " ", "springBoot", "", "sql", "JPA");

	static void lenghtcount() {
		List<String> names = new ArrayList<>();
		names.add("srinivasu");
		names.add("Avijaya");
		names.add("sajid");
		long count = names.stream().filter(eachName -> eachName.length() > 6).count();
		System.out.println("lenghtcount >6 string count is: " + count);
	}

	static void avoidNullInList() {
		Object exculdeNullValue = sampleList.stream().filter(Objects::nonNull).collect(Collectors.toList());
		System.out.println("avoidNullInList: " + exculdeNullValue);
		List<String> excludeNullValues = sampleList.stream().filter(name -> name != null).collect(Collectors.toList());
		System.out.println("avoidNullInList1: " + excludeNullValues);
	}

	static void avoidSpacesAndNullInList() {
		List<String> excludeEmptySpaces = sampleList.stream().filter(names -> names != null)
				.filter(name -> !name.isBlank()).collect(Collectors.toList());
		System.out.println("avoidSpacesAndNullInList: " + excludeEmptySpaces);
	}

	static void avoidNullSpacesApplyUpperCase() {

		List<String> excludeNullSpaceToUpper = sampleList.stream().filter(names -> names != null)
				.filter(name -> !name.isBlank()).map(n -> n.toUpperCase()).collect(Collectors.toList());
		System.out.println("avoidNullSpacesApplyUpperCase: " + excludeNullSpaceToUpper);
	}

	static void allMatchToNull() {
		boolean allMatch = sampleList.stream().allMatch(name -> name == null);
		System.out.println("allMatchToNull: " + allMatch);
		boolean allMatch1 = sampleList.stream().allMatch(Objects::isNull);
		System.out.println("allMatchToNull1: " + allMatch1);
	}

	static void anyMatchToNull() {
		boolean anyMatch = sampleList.stream().anyMatch(name -> name == null);
		System.out.println("anyMatchToNull: " + anyMatch);
		boolean anyMatch1 = sampleList.stream().anyMatch(name -> name == null);
		System.out.println("anyMatchToNull1: " + anyMatch1);
	}

	static void noneMatchToNull() {
		// any element is not null in List, if there is not null then print true else
		// false.
		boolean noneMatchNull = sampleList.stream().noneMatch(name -> name == null);
		System.out.println("noneMatchToNull: " + noneMatchNull);
	}

	static void searchTermByPassingParameter() {
		// search exact term by passing parameter using stream()
		// filter(Objects :: nonNull)
		boolean searchElementByPassingParameter = sampleList.stream().filter(words -> words != null)
				.anyMatch(word -> word.equalsIgnoreCase("spring"));
		System.out.println("searchElementByPassingParameter: " + searchElementByPassingParameter);
	}

	static void searchTermByPassingParameterReturnElementsIfFound() {
		List<String> elements = sampleList.stream().filter(Objects::nonNull)
				.filter(name -> name.equalsIgnoreCase("SPRInGBOOT")).collect(Collectors.toList());
		System.out.println("searchTermByPassingParameterReturnElementsIfFound: " + elements);
	}
}

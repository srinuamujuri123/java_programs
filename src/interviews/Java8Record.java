package interviews;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java8Record {
	public static void main(String[] args) {
		getDataBasedOnName();
	}

	private static void getDataBasedOnName() {
		record Employee(int id, String name, String phoneNumber) {

		}
		Employee e1 = new Employee(1, "swamy", "4444");
		Employee e2 = new Employee(2, "arun", "8888888");
		Employee e3 = new Employee(3, "rahul", "3444");
		Employee e4 = new Employee(4, "kumar", "5444");
		Employee e5 = new Employee(5, "raju", "4744");
		Employee e6 = new Employee(6, "aruna", "4844");
		Employee e7 = new Employee(7, "raja", "4434");
		Employee e8 = new Employee(8, "yesuda", "1444");
		Employee e9 = new Employee(8, "yesuda", "1444");
		Employee e10 = new Employee(8, "yesuda", "1444");

		List<Employee> empList = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);

		// Java 8 feature streams and return type Optional
		Optional<Employee> data = empList.stream().filter(e -> e.name.equals("yesuda")).findFirst();

		if (data.isPresent()) {
			System.out.println(data.get());
		} else
			System.out.println("no data present");
		// or by using java 8 and return type as List
		List<Employee> data1 = empList.stream().filter(emp -> emp.name.equals("yesuda")).collect(Collectors.toList());

		if (data.isEmpty())
			System.out.println("no data present");
		else
			System.out.println(data1.get(0));

	}

}

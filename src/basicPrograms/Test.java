package basicPrograms;

public class Test {

	public static void main(String[] args) {
		System.out.println("welcome to java programing class");
		System.out.print("java" + "\n");// prints java and goes to the next line.
		System.out.println("hi");
		System.out.println("*****************");
		int number = 100;
		int salary = 25000;
		// System.out.printf(String format, Object...args);
		System.out.printf("Printing integer: x = %d\n", number);
		System.out.printf("printing int and salary: x = %d and salary = %d\n", number, salary);
		float flow = 5.2f;
		// this will print it upto 2 decimal places.
		System.out.printf("formatted with precision: flow = %.2f\n", Math.PI);
		// automatically appends zero to the rightmost part of decimal
		System.out.printf("Formatted to specific width: flow = %2.1f\n", flow);

		System.out.println("Ternary Operator example:-");
		int a = 10, b = 20;
		int min = (a < b) ? a : b;
		System.out.println("minimum number is: " + min);
		int max = (a > b) ? a : b;
		System.out.println("maxium number is: " + max);
		System.out.println("usage of enum class:-");
		enumMethod();

	}

	public enum Day {
		Sun, Mon, Tue, Wed, Thu, Fri, Sat
	};

	static void enumMethod() {
		Day[] days = Day.values();
		for (Day day : days) {
			switch (day) {
			case Sun:
				System.out.println("Sunday");
				break;
			case Mon:
				System.out.println("Monday");
				break;
			case Tue:
				System.out.println("Tuesday");
				break;
			case Wed:
				System.out.println("Wednesday");
				break;
			case Thu:
				System.out.println("Thursday");
				break;
			case Fri:
				System.out.println("Friday");
				break;
			case Sat:
				System.out.println("Saturday");
				break;
			}
		}
	}
	
	
}

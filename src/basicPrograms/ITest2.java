package basicPrograms;

/*
 * different ways to create an object in java
 * By new keyword
 * By newInstance() method
 * By clone() method
 * By deserialization
 * By factory method etc
 */

/*
 * classes and interfaces start with a leading uppercase, the second and subsequent words are marked with a leading uppercase letters.
 * public methods and instance variables starts with a leading lowercase letters.
 * Private and local variables use only lowercase combined with underscore.
 * When more than one words are in a name, the scond and subsequent words are marked with a leading uppercase letters.
 * Variables that represents constant values use all uppercse letters and underscore between words
 */
class User { // User class
	int number = 10; // variable
	static String SCHOOL_NAME = "st.Anns";

	void using() { // method

	}

	void notusing() {

	}
}

class Calculation {
	void cal() {

	}

	void calc(double p) {

	}
}

public class ITest2 {
	public static void main(String[] args) {

		Calculation calculation = new Calculation();
		calculation.cal();
		calculation.calc(6);

		// or

		new Calculation().cal();
		new Calculation().calc(6);

		// or

		User user = new User();
		user.using();
		user.notusing();

		new User().using();
		new User().notusing();

	}
}

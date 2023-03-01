package basicPrograms;

public class Test7 {
	public static void main(String[] args) {
		int numberOne = 10, numberTwo = 20;
		System.out.println("---without 3rd variable---");
		System.out.println("Before swapping numberone value is " + numberOne);
		System.out.println("Before swapping numbertwo value is " + numberTwo);
		numberOne += numberTwo;
		numberTwo = numberOne - numberTwo;
		numberOne -= numberTwo;
		System.out.println("After swapping numberone value is " + numberOne);
		System.out.println("After swapping numbertwo value is " + numberTwo);

		System.out.println("---with 3rd variable---");
		int numberThree = numberOne;
		System.out.println("Before swapping numberone value is " + numberOne);
		System.out.println("Before swapping numbertwo value is " + numberTwo);
		numberOne = numberTwo;
		numberTwo = numberThree;
		System.out.println("After swapping numberone value is " + numberOne);
		System.out.println("After swapping numbertwo value is " + numberTwo);
	}
}

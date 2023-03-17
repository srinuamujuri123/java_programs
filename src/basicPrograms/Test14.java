package basicPrograms;

public class Test14 {
public static void main(String[] args) {
	int number = 121;
	palindromeNumber(number);
}

private static void palindromeNumber(int number) {
	int copy = number, reverse = 0;
	System.out.println("Given number is: "+ number);
	while (number >0) {
		int reminder = number %10;
		reverse = reverse *10+ reminder;
		number = number /10;
	}
	System.out.println("reverse number is: "+ reverse);
	if(copy == reverse)
		System.out.println("Given number is palindrome");
	else
		System.out.println("given numbr is not a palindrome");
}
}
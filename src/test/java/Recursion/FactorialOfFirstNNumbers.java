package Recursion;

public class FactorialOfFirstNNumbers {

	public static void main(String[] args) {
		// Given a number ‘N’, this program will print the Factorial of the first N natural
		// numbers.
		int factorial = 1;
		for (int i = 1; i <= 5; i++) {
			factorial = factorial * i;
		}
		System.out.println("The sum is : " + factorial);
	}

}

package BasicMathsProblem;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		// Given an integer N, write a program to count the number of digits in N.
		System.out.println("The number of digits :" + countDigits(12345));
		System.out.println("The number of digits :" + countDigits(123456789));		
	}

	public static int countDigits(int n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		return count;
	}
}

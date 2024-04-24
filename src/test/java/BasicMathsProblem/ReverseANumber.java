package BasicMathsProblem;

public class ReverseANumber {

	public static void main(String[] args) {
		// Given an input number, below program will reverse it
		System.out.println("The reversed number is :" + reverseNumber(12345));
		System.out.println("The reversed number is :" + reverseNumber(123456789));
	}

	public static int reverseNumber(int n) {
		int reverse = 0;
		while (n != 0) {
			int digit = n % 10;
			reverse = (reverse * 10) + digit;
			n = n / 10;
		}
		return reverse;
	}

}

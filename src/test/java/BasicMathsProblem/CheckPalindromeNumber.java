package BasicMathsProblem;

public class CheckPalindromeNumber {

	public static void main(String[] args) {
		// Given an input String, below program will check if it is a palindrome
		int x= 121;
		int y= checkPalindrome(x);
		if (x == y) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
		
	}

	public static int checkPalindrome(int n) {
		int reverse = 0;
		while (n > 0) {
			int digit = n % 10;
			reverse = (reverse * 10) + digit;
			n = n / 10;
		}	
		return reverse;		
	}
}

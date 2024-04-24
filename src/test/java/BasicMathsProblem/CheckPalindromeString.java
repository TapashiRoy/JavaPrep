package BasicMathsProblem;

public class CheckPalindromeString {

	public static void main(String[] args) {
		// Given an input String, below program will check if it is a palindrome		
		checkPalindrome("abcds");
		checkPalindrome("aba");
	}
	
	public static void checkPalindrome(String str) {
		String reverse = "";
		for (int i = 0; i < str.length(); i++) {
			reverse = str.charAt(i) + reverse;
		}
		if(str.equalsIgnoreCase(reverse)) {
			System.out.println("The entered String is a Palindrome");			
		} else {
			System.out.println("The entered String is not a Palindrome");			
		}
	}

}

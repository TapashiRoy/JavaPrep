package BasicMathsProblem;

public class ReverseAString {

	public static void main(String[] args) {
		// Given an input String, below program will reverse it
		System.out.println("The reversed String is :" + reverseString("abcds"));
		System.out.println("The reversed String is :" + reverseString("abc"));
	}

	public static String reverseString(String str) {
		String reverse = "";
		for (int i = 0; i < str.length(); i++) {
			reverse = str.charAt(i) + reverse;
		}
		return reverse;
	}
}

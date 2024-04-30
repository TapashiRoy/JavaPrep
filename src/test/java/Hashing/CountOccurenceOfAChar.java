package Hashing;

public class CountOccurenceOfAChar {

	public static void main(String[] args) {
		// This program will count the occurence of any character in a array

		String str = "aabbbccddd";
		System.out.println("Number of occurence of a is : " + countChar(str, 'a'));
	}

	public static int countChar(String str, char n) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)=='a') {
				count++;
			}
		}
		return count;
	}
}

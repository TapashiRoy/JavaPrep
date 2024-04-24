package BasicMathsProblem;

public class CountCharactersInAString {

	public static void main(String[] args) {
		// Given an String N, write a program to count the number of characters in N.
		System.out.println("The number of characters :" + countChars("abcd"));
		System.out.println("The number of characters :" + countChars("efghjuk"));		 
	}

	public static int countChars(String str) {
		int count = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ')
				count++;
			
		}
		return count;
	}

}

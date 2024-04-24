package Strings;

public class StringConcept {
	public static void main(String[] args) {
	//String works in 0-based indexing
		String str ="Tapashi";
		int length=str.length();
		System.out.println("The length of the String is : " + length);
		
		//If we have to modify the string at a particular index, use StringBuffer or String Builder class
		StringBuilder str1 = new StringBuilder("Tapashi");
		str1.setCharAt(3, 'o');
		System.out.println("The modified String is : " + str1);
		
		
		
		
	}
	

}

package PatternProblems;

public class PatternProblem3 {
	// Printing the below pattern:
	/*
	 * 1 
	 * 12 
	 * 123 
	 * 1234 
	 * 12345 
	 * 123456
	 */

	public static void main(String[] args) {
		print(6);
	}

	public static void print(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}	
			System.out.println(" ");
		}

	}

}

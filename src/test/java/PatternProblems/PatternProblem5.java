package PatternProblems;

public class PatternProblem5 {

	public static void main(String[] args) {
		// Printing the below pattern:
		/*
		 * * * * * 
		 * * * *  
		 * * * 
		 * *
		 * 
		 */

		for (int i = 1; i <= 6; i++) {
			for (int j = 6; j >= i; j--) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}

	}

}

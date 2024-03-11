package PatternProblems;

public class PatternProblem3 {

	public static void main(String[] args) {
		// Printing the below pattern:
		/*
		 * * * * * 
		 * * * * * 
		 * * * * * 
		 * * * * * 
		 * * * * * 
		 */

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}

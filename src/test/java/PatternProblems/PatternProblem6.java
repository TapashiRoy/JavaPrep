package PatternProblems;

public class PatternProblem6 {

	public static void main(String[] args) {
		// Printing the below pattern:
		/*
		 1 2 3 4 5 6
		 1 2 3 4 5
		 1 2 3 4
		 1 2 3
		 1 2
		 1	 
		 */

		for (int i = 1; i <= 6; i++) {
			for (int j = 6; j > i; j--) {
				System.out.print(6 -j +	1 + " ");
			}
			System.out.println(" ");
		}

	}

}

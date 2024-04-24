package PatternProblems;

public class PatternProblem9 {

	public static void main(String[] args) {
		// Printing the below pattern:
		//      *
		//    * * *
		//  * * * * *
		// * * * * * *
		//  * * * * *
		//	  * * *
		//      *	
		pyramid(5);
		invertedpyramid(5);
	}
	
	public static void pyramid(int n) {
		for (int i = 0; i < n; i++) {
			// For printing the spaces before stars in each row
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}

			// For printing the stars in each row
			for (int j = 0; j < 2 * i + 1; j++) {

				System.out.print("*");
			}

			// For printing the spaces after the stars in each row
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}

			// As soon as the stars for each iteration are printed, we move to the
			// next row and give a line break otherwise all stars
			// would get printed in 1 line.
			System.out.println();
		}
	}

	public static void invertedpyramid(int n) {
		for (int i = 0; i < n; i++) {
			// This loops will print before and after spaces
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			// This loop will print stars
			for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
				System.out.print("*");
			}

			// This loops will print before and after spaces
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println();

		}

	}

}

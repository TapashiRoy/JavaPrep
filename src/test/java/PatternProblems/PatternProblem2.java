package PatternProblems;

public class PatternProblem2 {

	public static void main(String[] args) {
		// Printing the below pattern:
		// *
		// * *
		// * * *
		// * * * *
		// * * * * *

		print(6);
	}

	public static void print(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}

	}

}

package PatternProblems;

public class PatternProblem10 {

	public static void main(String[] args) {
		// Printing the below pattern:
		// *     
		// * *  
		// * * *
		// * * * *
		// * * *
		// * *	
		// *    
		pattern(4);
		invertedPattern(4);
	}
	
	public static void pattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}
	
	public static void invertedPattern(int n) {
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print("*");	
			}
			System.out.println(" ");
		}
	}

}

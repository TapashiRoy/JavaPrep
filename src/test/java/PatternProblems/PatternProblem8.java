package PatternProblems;

public class PatternProblem8 {

	public static void main(String[] args) {
		// Printing the below pattern:				
		// * * * * * *
		//  * * * * *
		//	  * * *
		//      *	
		
		// This is the outer loop which will loop for the rows.
		for (int i = 0; i < 4; i++) {
			//This loops will print before and after spaces
			for(int j =0; j <i; j++) {
				 System.out.print(" ");
			}
			// This loop will print stars
			for (int j = 0; j< 2*4 -(2*i +1); j++) {
				System.out.print("*");
			}
			
			//This loops will print before and after spaces
			for(int j =0; j <i; j++) {
				 System.out.print(" ");
			}   	 
	    	
	    	
			 System.out.println();	
	    	
	    	
	    }

		
	}

}

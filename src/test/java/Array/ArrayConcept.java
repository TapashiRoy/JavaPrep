package Array;

public class ArrayConcept {

	public static void main(String[] args) {
		//Array Concepts
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		printArray(array);
	}
	
	public static void printArray(int[] arr) {
		int n= arr.length;
		for(int i=0;i<n;i++) {
			System.out.print( arr[i] );
		}
		System.out.println();
	}

}

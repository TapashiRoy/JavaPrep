package Array;

public class findSecondMaximumValueInArray {
	
	public static void main(String[] args) {
		// Find the Second Maximum value in a Array
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		findSecondMaximum(array);
	}
	
	public static void findSecondMaximum(int[] arr) {
		int n= arr.length;
		for(int i=0;i<n;i++) {
			System.out.print( arr[i] );
		}
		System.out.println();
	}
}

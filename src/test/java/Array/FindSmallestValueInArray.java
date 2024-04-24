package Array;

public class FindSmallestValueInArray {

	public static void main(String[] args) {
		// Array Concepts
		int[] array = { 1, 2, 3, 0, 5, 6, 7, 8, 9, 10 };
		findMinimum(array);	
	}

	public static void findMinimum(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("The minimum value of the element is: " + min);
	}

}

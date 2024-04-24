package Array;

public class findLargestValueInArray {
	public static void main(String[] args) {
		// Array Concepts
		int[] array = { 1, 2, 3, 0, 5, 6, 7, 8, 9, 10 };
		findMaximum(array);
	}

	public static void findMaximum(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("The maximum value of the element is: " + max);
	}

}

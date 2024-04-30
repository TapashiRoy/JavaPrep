package Array;

public class LinearSearchInArray {

	public static void main(String[] args) {
		// Given an array, and an element num the task is to find if num is present in
		// the given array or not.
		// If present print the index of the element or print -1.
		// Input: arr[]= 1 2 3 4 5, num = 3
		// Output: 2
		// Explanation: 3 is present in the 2nd index

		int[] array = { 1, 2, 3, 4, 5 };
		int num = 3;
		linearSearch(array, 3);
		linearSearch(array, 4);
	}

	static void linearSearch(int[] arr, int num) {
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				System.out.println(num + " is present in the array and its index is : " + i);
			}
		}
	}

}

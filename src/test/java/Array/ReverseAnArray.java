package Array;

public class ReverseAnArray {

	public static void main(String[] args) {
		// Array Concepts
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		reverseArray(array, 0, 9);
		System.out.print("Reversed array is \n");
		printArray(array, 10);
	}

	public static void printArray(int arr[], int size) {
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void reverseArray(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
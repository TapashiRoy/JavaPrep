package Array;

public class CheckIfArrayIsSorted {
	public static void main(String[] args) {
		// In this program, We will check if the given array is in sorted order
		int[] array1 = { 12, 1, 0, 10, 14, 15 };
		int[] array2 = { 1, 2, 3, 4, 5 };
		System.out.println(ifSorted(array1));
		System.out.println(ifSorted(array2));
	}

	public static boolean ifSorted(int[] array) {
		int length = array.length - 1;

		for (int i = 0; i < length; i++) {
			if (array[i] > array[i + 1]) {
				return false;
			}

		}
		return true;

	}

}

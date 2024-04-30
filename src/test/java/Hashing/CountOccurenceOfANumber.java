package Hashing;

public class CountOccurenceOfANumber {

	public static void main(String[] args) {
		// This program will count the occurence of any number in a array
		int arr[] = { 5, 4, 3, 2, 1, 2, 4, 6, 8, 0, 4, 4, 4, 4, 4 };
		System.out.println("Number of occurence of 4 is : " + countInt(arr, 4));
	}
	public static int countInt(int[] arr, int n) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				count++;
			}
		}
		return count;
	}
}

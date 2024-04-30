package Array;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		// In this program, We will rmeove duplicates from the given array and print it
		int[] array = { 1, 1, 2, 2, 3, 3, 3 };
		System.out.println("Original Input Array : " + Arrays.toString(array));
//		int k = removeDuplicatesBruteForce(array);
//		for (int i = 0; i < k; i++) {
//			System.out.print(array[i] + " ");
//		}
//		System.out.println(" ");
//		System.out.println("*********");
		int j = removeDuplicatesOptimal(array);
		for (int i = 0; i < j; i++) {
		System.out.print(array[i] + " ");
	}

	}

	static int removeDuplicatesBruteForce(int[] arr) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		int k = set.size();
		int j = 0;
		for (int x : set) {
			arr[j++] = x;
		}
		return k;
	}
	
	static int removeDuplicatesOptimal(int[] arr) {
		int i=0;		
		for(int j=1;j<arr.length;j++) {
			if(arr[i]!=arr[j]) {
				i++;
				arr[i]=arr[j];
			}
		}
		return i+1;
		
	}
}

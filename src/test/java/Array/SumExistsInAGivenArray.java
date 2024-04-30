package Array;

import java.util.Arrays;

public class SumExistsInAGivenArray {

	public static void main(String[] args) {
		// Given a sorted array of integers, we need to see if there are two numbers in it such that their sum is equal to a specific value
		int[] array = { 1, 1, 2, 3, 4, 6, 8, 9 };
		System.out.println("Original Input Array : " + Arrays.toString(array));
		System.out.println("Target condition for 9 and 6: " + twoSum(array, 15));	
		System.out.println("Target condition for 1 and 9 : " + twoSum(array, -15));		
	}
	
	public static boolean twoSum(int[] array, int target) {
		int pointer1 = 0;
		int pointer2 = array.length -1;
		
		while(pointer1<pointer2) {
			int sum= array[pointer1] + array[pointer2];
			if(sum == target) {
				return true;
			}
			else if (sum<target) {
				pointer1++;
			}
			else {
				pointer2--;
			}			
		}
		return false;
	}

}

package Recursion;

import java.util.Arrays;

public class ReverseAnArrayUsingExtraArray {

	public static void main(String[] args) {
		// This program will reverse the given array using an extra array of the same size
		int arr1[] = {5,4,3,2,1};
		int arr2[] = {10,20,30,40,50};
		reverseArray(arr1, 5);
		reverseArray(arr2, 5);
	}
	
	public static void reverseArray(int arr[], int n) {
		int revarr[] = new int[n];
		for(int i=n-1;i>=0;i--) {
			revarr[n-i-1]= arr[i];		
		}
		System.out.print(Arrays.toString(revarr));
	}

}

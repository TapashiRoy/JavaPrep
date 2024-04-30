package Array;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionOfTwoArrays {

	public static void main(String[] args) {
		// Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.
		// Output will be {1,2,3,4,5,6,7,8,9,10,11,12}	
		
		int[] array1 = {1,2,3,4,5,6,7,8,9,10};
		int[] array2 = {2,3,4,4,5,11,12};
		int m = array1.length;
		int n = array2.length;
		ArrayList<Integer> Union = Union(array1, array2, m,n);
		for(int i: Union) {
			System.out.print(i + " ");	
		}
	}
	
	static ArrayList<Integer> Union(int[] arr1, int[] arr2, int m, int n) {
		HashSet<Integer> set = new HashSet<Integer>();
		ArrayList<Integer> Union = new ArrayList<Integer>();
		
		for(int i=0;i<m;i++) {
			set.add(arr1[i]);
		}
		for(int i=0;i<n;i++) {
			set.add(arr2[i]);
		}
		for(int i:set) {
			Union.add(i);
		}
		return Union;
	}

}

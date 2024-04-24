package Array;

import java.util.Arrays;

public class SortAnArrayInAscendingOrder {

	public static void main(String[] args) {
		//In this program, We will sort the given array and print it
		int[] array = {12,1,0,10,14,15};	
		System.out.println("Original Input Array : " + Arrays.toString(array));
		array = sortArray(array);
		System.out.println("Sorted Array : " + Arrays.toString(array));
		
	}
	
	public static int[] sortArray(int[] array) {				
		int length = array.length;		
		int temp;
		
		for(int i=0;i<length -1;i++) {
			System.out.println("Value of index :" +i);
			if(array[i]>array[i+1]) {
				temp=array[i];
				System.out.println(temp);
				array[i]=array[i +1];
				System.out.println(array[i]);
				array[i +1]=temp;
				System.out.println(array[i+1]);
				i=-1;
				}
		
		}
		return array;		
	}	

}



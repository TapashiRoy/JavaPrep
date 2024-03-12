package Array;

public class MoveZeroesToEndOfArray {

	public static void main(String[] args) {
		// This program will move zeroes to end of array
		int[] array = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
		int n =array.length;
		int j=0;	
		
		for(int i=0;i<n;i++) {
			if(array[i]!=0) {
				moveZeros(i,j,array);
				j++;
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(array[i] + " ");
		}
		
	}
	public static void moveZeros(int i, int j, int[] arr) {			
		int temp;		
		temp= arr[i];
		arr[i] = arr[j];
		arr[j]=temp;			
	}


}

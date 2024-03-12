package Array;

public class resizeAnArray {

	public static void main(String[] args) {
		// In this program, we will resize the array by our desired capacity
		int[] array = {1, 4, 2, 3, 5};
		resize(array, 9);		
	}
	
	public static void resize(int[] arr, int capacity) {
		int [] temp = new int[capacity];
		for(int i=0; i<arr.length; i++) {
			temp[i]=arr[i];
		}
		arr=temp;
		System.out.println(arr.length);
	
	}

}

package Array;

public class RemoveEvenIntegersfromArray {

	public static void main(String[] args) {
		//Array Concepts
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		removeEvenIntegers(array);
	}
	
	public static int[] removeEvenIntegers(int[] arr) {
		int n= arr.length;
		int result;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				result = arr[i];
			}else {
				System.out.print(arr[i]);
			}
		}
		return arr;
	}

}

package Array;

public class findSecondLargestValueInArray {
	
	public static void main(String[] args) {
		// Find the Second Maximum value in a Array
		int[] array = {1,2,10,8,9,10,0,-8};
		findSecondMaximum(array);		
	}
	
	public static int findSecondMaximum(int[] arr) {
		if(arr ==null || arr.length==0) {
			throw new IllegalArgumentException("Invalid Input");
		}
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secondMax=max;
				max=arr[i];
			}else if(arr[i]>secondMax && arr[i]!=max) {
				secondMax=arr[i];
			}
		}
		System.out.println(secondMax);
		return secondMax;
		
	}
}


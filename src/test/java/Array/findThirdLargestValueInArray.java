package Array;

public class findThirdLargestValueInArray {

	public static void main(String[] args) {
		// Find the Second Maximum value in a Array
		int[] array = {1,2,10,8,9,10,0,-8};
		findThirdMaximum(array);		
	}
	
	public static int findThirdMaximum(int[] arr) {
		if(arr ==null || arr.length==0) {
			throw new IllegalArgumentException("Invalid Input");
		}
		int max = arr[0];
		int secondMax = Integer.MIN_VALUE;
		int thirdMax= Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				thirdMax=secondMax;
				secondMax=max;
				max=arr[i];
			}else if(arr[i]>secondMax && arr[i]!=max) {
				thirdMax=secondMax;
				secondMax=arr[i];
			} else if(arr[i]>thirdMax && arr[i]!=max ) {
				thirdMax=arr[i];
			}
		}
		System.out.println("The third maximum value is: " +thirdMax);
		return thirdMax;
		
	}

}

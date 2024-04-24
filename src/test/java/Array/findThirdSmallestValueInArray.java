package Array;

public class findThirdSmallestValueInArray {

	public static void main(String[] args) {
		// Find the Second Maximum value in a Array
		int[] array = {1,2,10,8,9,10,0,18};
		findThirdMinimum(array);		
	}
	
	public static int findThirdMinimum(int[] arr) {
		if(arr ==null || arr.length==0) {
			throw new IllegalArgumentException("Invalid Input");
		}
		int min = arr[0];
		int secondMin = Integer.MAX_VALUE;
		int thirdMin= Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				thirdMin=secondMin;
				secondMin=min;
				min=arr[i];
			}else if(arr[i]<secondMin && arr[i]!=min) {
				thirdMin=secondMin;
				secondMin=arr[i];
			} else if(arr[i]<thirdMin && arr[i]!=min ) {
				thirdMin=arr[i];
			}
		}
		System.out.println("The third minimum value is: " +thirdMin);
		return thirdMin;
		
	}
}

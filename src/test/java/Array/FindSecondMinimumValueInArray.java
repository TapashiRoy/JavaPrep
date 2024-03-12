package Array;

public class FindSecondMinimumValueInArray {

	public static void main(String[] args) {
		// Find the Second Maximum value in a Array
		int[] array = {4,2,10,8,9,10,0,1};
		findSecondMinimum(array);		
	}
	
	public static int findSecondMinimum(int[] arr) {
		if(arr ==null || arr.length==0) {
			throw new IllegalArgumentException("Invalid Input");
		}
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				secondMin=min;
				min=arr[i];
			}else if(arr[i]<secondMin && arr[i]!=min) {
				secondMin=arr[i];
			}
		}
		System.out.println("The second minimum value in the array is: " + secondMin);
		return secondMin;
		
	}
}

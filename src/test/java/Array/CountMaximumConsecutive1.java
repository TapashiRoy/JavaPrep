package Array;

public class CountMaximumConsecutive1 {

	public static void main(String[] args) {
		// Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.
		int[] array = {1, 1, 0, 1, 1, 1};
		int count=0;
		int max_count=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]==1) {
				count++;
			}else {
				count=0;
			}
		}
		max_count = Math.max(max_count, count);
		System.out.println(max_count);
	}

}

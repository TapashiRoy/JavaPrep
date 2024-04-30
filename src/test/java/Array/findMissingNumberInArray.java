package Array;

public class findMissingNumberInArray {

	public static void main(String[] args) {
		// Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N. 
		// Find the number(between 1 to N), that is not present in the given array.
		int[] array = {1,2,3,4,5,7,8};
		int N = 7;
		int sum = (N * (N + 1)) / 2;
		int s2=0;
		
		for (int i = 0; i < N - 1; i++) {
            s2 += array[i];
        }
		int missingNum = sum - s2;
		System.out.println(missingNum);
	}

}

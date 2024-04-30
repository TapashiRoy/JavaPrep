package Hashing;

public class CountHighestAndLowestFrequency {
	public static void main(String[] args) {
		// This program will count the occurence of any number in a array
		int arr[] = { 10, 5, 10, 15, 10, 5 };
		int n = arr.length;
		countFreq(arr,n);
	}
	
	public static void countFreq(int[]arr, int n) {
		boolean visited[]= new boolean[n];
		int maxFreq=0,minFreq=n;
		int maxEle=0, minEle =0;		
			
		for(int i=0;i<n;i++) {
			
			if(visited[i]==true) {
				continue;
			}
			
			int count=1;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					visited[j]=true;
					count++;
				}
			}
			
			if(count>maxFreq) {
				maxFreq=count;
				maxEle=arr[i];
			}
			
			if(count<minFreq) {
				minFreq=count;
				minEle = arr[i];
			}			
		}
		
		System.out.println("The highest Freq element and it's count is :" + maxEle );
		System.out.println("The lowest Freq element and it's count is :" + minEle);
	}

}

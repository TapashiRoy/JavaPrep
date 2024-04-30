package Recursion;

public class FibonacciNumbers {

	public static void main(String[] args) {
		// Solving generation of fibonacci numbers using recursion
		int N=5;
		System.out.println(fibonacci(4));
		printfibonacci(4);
	}
	
	static int fibonacci(int N) {
		if(N<=1) {
			return N;
		}
			int last =fibonacci(N-1);
			int slast = fibonacci(N-2);
			return last + slast;
	}
	static void printfibonacci(int N) {
		int firstFib=0, secondFib=1;
		for(int i=1;i<=N;i++) {
			System.out.print(firstFib + ",");
			int nextFib = firstFib + secondFib;
			firstFib = secondFib;
			secondFib = nextFib;
		}
	}

}

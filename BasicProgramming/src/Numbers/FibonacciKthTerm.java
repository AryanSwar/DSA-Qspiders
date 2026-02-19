package Numbers;

public class FibonacciKthTerm {
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int k = 6;
		System.out.println(fibonacciKthTerm(n1, n2, k));
	}
	//Find Fibonacci Series for kth term.
	public static int fibonacciKthTerm(int n1, int n2,int k) {
		
		int i = 1;
		while(i<k) {
			int n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			i++;
		}
		return n1; 	
	}
}

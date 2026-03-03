package Patterns;

public class Pattern29FlipTriangleFibonacci {
	/*
	 * 					34 21 13 8 
						5 3 2 
						1 1 
						0 
	 */
	public static void main(String[] args) {
		int n1 = 34;
		int n2 = 21;
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(n1+" ");
				int n3 = n1-n2;
				n1 = n2;
				n2 = n3;
				
			}
			System.out.println();
		}
	}
}

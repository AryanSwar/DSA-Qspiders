package Patterns;

public class Pattern28TriangleFibonacci{
	/*
	 * 						0 
							1 1 
							2 3 5 
							8 13 21 34 
	 */
	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(n1+" ");
				int n3 = n1+n2;
				n1 = n2;
				n2 = n3;
			}
			System.out.println();
		}
	}
}

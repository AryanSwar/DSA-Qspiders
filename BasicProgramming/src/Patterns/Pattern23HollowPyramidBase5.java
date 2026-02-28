package Patterns;

public class Pattern23HollowPyramidBase5 {
	/*
	 * 						    *    
							   * *   
							  *   *  
							 *     * 
							*********
	 */
	public static void main(String[] args) {
//		int n = 5;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i;j++) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=2*n-1;k++) {
//				if(k == 1 || i == 5 || k == 2*i -1) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		
		
		
		//2nd approach to minimize the count of loop
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=9;j++) {
				if(i == 5 || j == 5-i+1 || j == 5+i-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

package Patterns.Assignment;

public class Pattern12HallowPyramid {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				if(j == 1 || i == 5 || j == 2*i-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		/*
		 * 				    1
						   121
						  12321
						 1234321
						123454321

		 */
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5-i;j++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//			for(int j=i-1;j>=1;j--) {
//					System.out.print(j);
//			}
//			System.out.println();
//		}
	}
}

package Patterns;

public class Pattern6NumSquare {
	
	
	
	/*
	 * 				1 2 3 4 5 
					1 2 3 4 5 
					1 2 3 4 5 
					1 2 3 4 5 
					1 2 3 4 5 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int num = 5;
		for(int i = 1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

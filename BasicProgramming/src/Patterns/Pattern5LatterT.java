package Patterns;

public class Pattern5LatterT {
	
	/*
	 * 				*****
					  *  
					  *  
					  *  
					  *  
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int num = 5;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=5;j++) {
				if(i == 1 || j ==3) {
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

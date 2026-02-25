package Patterns;

public class Pattern14_1And0 {
	
	
	/*
	 *					0 1 0 1 0 
						1 0 1 0 1 
						0 1 0 1 0 
						1 0 1 0 1 
						0 1 0 1 0 			
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		//1st method approach
		int num = 5;
		for(int i=1;i<=num;i++) {
			for(int j = 1;j<=num;j++) {
				if((i+j)%2 == 0) {
					System.out.print("0 ");
				}
				else {
					System.out.print("1 ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------");
		//2nd method and easy approach
		int x = 2;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(x%2 +" ");
				x++;
			}
			System.out.println();
		}
	}
}

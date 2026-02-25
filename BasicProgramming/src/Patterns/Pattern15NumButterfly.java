package Patterns;

public class Pattern15NumButterfly {
	
	/*
	 * 					1       5 
						1 2   4 5 
						1   3   5 
						1 2   4 5 
						1       5 
	 * 
	 */
	public static void main(String[] args) {
		int num = 5;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i == j || i+j == 6 || j == 1 || j == 5) {
					System.out.print(j+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}


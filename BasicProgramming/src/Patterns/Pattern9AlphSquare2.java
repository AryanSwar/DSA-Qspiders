package Patterns;

public class Pattern9AlphSquare2 {
	public static void main(String[] args) {
		int num = 5;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print((char)(96+j)+" ");
			}
			System.out.println();
		}
	}
}

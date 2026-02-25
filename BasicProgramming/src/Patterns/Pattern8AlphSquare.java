package Patterns;

public class Pattern8AlphSquare {
	public static void main(String[] args) {
		int num = 5;
		for(int i = 1;i<=num;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print((char)(64+i)+" ");
			}
			System.out.println();
		}
	}
}

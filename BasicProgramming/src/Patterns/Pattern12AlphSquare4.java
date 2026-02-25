package Patterns;

public class Pattern12AlphSquare4 {
	public static void main(String[] args) {
		int num = 3;
		for(int i=3;i>=1;i--) {
			for(int j=1;j<=3;j++) {
				System.out.print((char)(119+i)+" ");
			}
			System.out.println();
		}
	}
}

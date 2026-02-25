package Patterns;

public class Pattern10NumSquareIncreasing {
	public static void main(String[] args) {
		int num = 5;
		int count = 1;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print(count++ +" ");
			}
			System.out.println();
		}
	}
}

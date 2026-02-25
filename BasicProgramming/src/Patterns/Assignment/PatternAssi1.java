package Patterns.Assignment;

public class PatternAssi1 {
	public static void main(String[] args) {
		int num = 5;
		squareWithCross(num);
	}
	/*
	 * 			* * * * * 
				* *   * * 
				*   *   * 
				* *   * * 
				* * * * * 
	 */
	public static void squareWithCross(int num) {
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if(i == 1 || i == num || j == 1 || j == num || i == j || i+j == 6) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}

package Patterns;

public class Pattern1Square {
	public static void main(String[] args) {
		int num = 5;
		squarePattern(num);
	}
	//Ques-Print Square pattern.
	/*
	 * 			*****
				*****
				*****
				*****
				*****
	 */
	public static void squarePattern(int num)
	{
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

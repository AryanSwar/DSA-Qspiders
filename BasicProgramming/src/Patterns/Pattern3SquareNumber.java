package Patterns;

public class Pattern3SquareNumber {
	public static void main(String[] args) {
		int num = 5;
	}
	/*
	 * 		11 12 13 14 15 
			21 22 23 24 25 
			31 32 33 34 35 
			41 42 43 44 45 
			51 52 53 54 55
	 */
	
	public static void pringSquarePattern(int num) 
	{
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}
	}
}

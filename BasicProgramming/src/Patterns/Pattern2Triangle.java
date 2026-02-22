package Patterns;

public class Pattern2Triangle {
	public static void main(String[] args) {
		int num = 5;
		trianglePattern(num);
	}
	//Ques-Pring Triangle star pattern.
	/*
	 * 			*
				**
				***
				****
				*****
	 */
	public static void trianglePattern(int num) 
	{
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

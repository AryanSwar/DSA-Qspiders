package Patterns;

public class Pattern11AlphSquar3 {
	
	/*
	 * 				a b c d e 
					f g h i j 
					k l m n o 
					p q r s t 
					u v w x y 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int num = 5;
		char ch = 'a';
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}
}

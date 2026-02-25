package Patterns;

public class Pattern15NumButterfly {
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


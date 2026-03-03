package Patterns;

public class Pattern27NumPyramid {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			if(i%2 == 0) {
				for(int l=i;l>=1;l--) {
					System.out.print(l+" ");
				}
			}
			else {
				for(int k=1;k<=i;k++) {
					System.out.print(k+" ");
				}
				
			}
			System.out.println();
		}
	}
}

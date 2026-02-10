package Numbers;

public class FindGreatestBetweenThreeNum {
	//check in three number which one is greater.
	public static void main(String[] args) {
		int a = 10, b = 30, c = 20;
/*		if(a>b) {
			if(a>c) {
				System.out.println("a is greater");
			}
			else {
				System.out.println("c is greater");
			}
		}
		else {
			if(b>c) {
				System.out.println("b is greater");
			}
			else {
				System.out.println("c is greater");
			}
		}*/
		
		
		//2nd approach to solve
		if(a>b && a>c) {
			System.out.println("a is greater");
		}
		else if(b>a && b>c) {
			System.out.println("b is greater");
		}
		else {
			System.out.println("c is greater");
		}
	}
	
}

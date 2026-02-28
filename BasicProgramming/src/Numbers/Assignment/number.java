package Numbers.Assignment;

public class number {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 10;
		for(int i=num1;i<=num2;i++) {
			boolean res = primeCheck(i);
			if(res == true) {
				System.out.println(i);
			}
		}
	}
	public static boolean primeCheck(int num) {
		if(num<2) {
			return false;
		}
		for(int i=2;i<=num/2;i++) {
			if(num % 2 == 0) {
				return false;
			}
		}
		return true;
	}
}


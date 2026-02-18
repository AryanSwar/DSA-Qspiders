package Numbers;

public class PrimeNumInGivenRange {
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 10;
		boolean res = false;
		for(int i=num1;i<=num2;i++) {
			res = primeNumber(i);
			if(res == true) {
				System.out.println(i);
			}
		}
		
	}
	//Check prime number in given range.
	public static boolean primeNumber(int num) {
		if(num<2) {
			return false;
		}
		for(int i=2;i<=num/2;i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}

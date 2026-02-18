package Numbers.Assignment;

public class PrimeNumber21 {
	public static void main(String[] args) {
		int num = 51;
		boolean res = primeNumber(num);
		
		if(res == false) {
			System.out.println("Not a prime number.");
		}
		else {
			System.out.println("Prime number.");
		}
	}
	//Ques-Prime number.
	public static boolean primeNumber(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
}

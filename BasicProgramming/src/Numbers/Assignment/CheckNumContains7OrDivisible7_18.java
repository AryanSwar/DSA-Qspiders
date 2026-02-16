package Numbers.Assignment;

public class CheckNumContains7OrDivisible7_18 {
	public static void main(String[] args) {
		int num = 1234;
		boolean res = checkNumber(num);
		if(res == true) {
			System.out.println("Number contains 7 or divisible by 7.");
		}
		else {
			System.out.println("Number not contains 7 or divisible by 7.");
		}
	}
	//Check number contains 7 or divisible by 7.
	public static boolean checkNumber(int num) {
		boolean res = false;
		if(num % 7 == 0) {
			res = true;
		}
		while(num>0) {
			int digit = num % 10;
			if(digit == 7) {
				res = true;
			}
			num = num / 10;
		}
		return res;
	}
}

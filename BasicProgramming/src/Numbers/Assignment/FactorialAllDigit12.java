package Numbers.Assignment;

public class FactorialAllDigit12 {
	public static void main(String[] args) {
		int num = 2343;
		while(num>0) {
			int digit = num%10;
			System.out.println(digit+"! = "+factorialAllDigit(digit));
			num = num/10;
		}
	}
	
	//find the factorial of all the digit in given number.
	public static int factorialAllDigit(int num) {
		int fact = 1;
			while(num>0) {
				fact = fact*num;
				num--;
			}
		return fact;
	}
}

package Numbers.Assignment;

public class SumAllEvenDigit13 {
	public static void main(String[] args) {
		int num = 123456;
		System.out.println("Sum of even digit : "+sumAllEvenDigit(num));
		
	}
	//find the sum of all even digit in given number.
	
	public static int sumAllEvenDigit(int num) {
		int sum_even = 0;
		while(num>0) {
			int digit = num%10;
			if(digit%2 == 0) {
				sum_even = sum_even+digit;
			}
			num = num/10;
		}
		return sum_even;
	}
}

package Numbers.Assignment;

public class SumAllDigit10 {
	public static void main(String[] args) {
		int num = 123;
		System.out.println("sum : "+sumAllDigit(num));
	}
	//find the sum of all digit in given number
	
	public static int sumAllDigit(int num) {
		int count = 0;
		while(num>0) {
			int digit = num%10;
			count = count+digit;
			num = num/10;
		}
		return count;
	}
}

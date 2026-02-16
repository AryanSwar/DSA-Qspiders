package Numbers;

public class CountOfDigitsInNum {
	public static void main(String[] args) {
//		int num = 123;
//		int num = 23;
		int num = 12345;
		System.out.println(countDigit(num));
	}
	//find a count of digits in given positive number
//		123 -> 3
//		23 -> 2
//		12345 -> 5
	/**
	 * formula 
	 * remove last digit number       num/10
	 * fetch/get last digit number    num%10
	 * add digit 					  num*10+digit
	 */
	
	public static int countDigit(int num) {
		int count = 0;
		while(num>0) {
			num = num/10;
			count++;
		}
		return count;
	}
}

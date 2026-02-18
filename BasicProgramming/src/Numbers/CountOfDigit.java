package Numbers;

public class CountOfDigit {
	public static void main(String[] args) {
		int num = 12;
		System.out.println("count of the factor of the digit is : "+countDigit(num));
	}
	
	//find the factorial and give the count of digits.
	public static int countDigit(int num) {
		int count = 0;
		for(int i=1;i<=num;i++) {
			if(num % i == 0) {
				count++;
			}
		}
		return count;
	}
}

package Numbers;

public class ReversTheNumber {
	public static void main(String[] args) {
//		int num = 123;
		int num = 21;
		System.out.println(reverse(num));
	}
	
	//reverse the number 
//	123 -> 321
//	21 -> 12
	
	public static int reverse(int num) {
		int rev = 0;
		while(num>0) {
			int digit = num%10;
			rev = rev*10+digit;
			num = num/10;
		}
		return rev;
	}
}

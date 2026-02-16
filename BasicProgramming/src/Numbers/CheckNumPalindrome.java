package Numbers;

public class CheckNumPalindrome {
	public static void main(String[] args) {
//		int num = 123;
		int num = 121;
//		int rev = checkPalindrome(num);
//		if(num == rev) {
//			System.out.println("Palindrome number");
//		}
//		else {
//			System.out.println("Not palindrome number");
//		}
		boolean b =  checkPalindrome(num);
		if(b == true) {
			System.out.println("Palindrome number");
		}
		else {
			System.out.println("Not palindrome number");
		}
	}
	
	//write a program to check number is palindrome or not
	
	public static boolean checkPalindrome(int num) {
		int num2 = num;
		boolean b = false;
		int rev = 0;
		while(num>0) {
			int digit = num%10;
			rev = rev*10+digit;
			num = num/10;
		}
		if(num2 == rev) {
			b = true;
		}
		return b;
	}
}

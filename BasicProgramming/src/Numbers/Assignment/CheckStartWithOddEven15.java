package Numbers.Assignment;

public class CheckStartWithOddEven15 {
	public static void main(String[] args) {
		int num = 3442;
		boolean res = checkStartEvenOdd(num);
		if(res == true) {
			System.out.println("Start with even digit.");
		}
		else {
			System.out.println("Start with odd digit.");
		}
		
	}
	//Check number start with odd digit or even digit.
	public static boolean checkStartEvenOdd(int num) {
		boolean res = false;
		int rev = 0;
		while(num>0) {
			int digit = num % 10;
			rev = rev*10+digit;
			num = num / 10;
		}
		int digit = rev % 10;
		if(digit % 2 == 0) {
			res = true;
		}
		
		return res;
	}
}

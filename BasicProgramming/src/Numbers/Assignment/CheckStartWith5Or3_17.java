package Numbers.Assignment;

public class CheckStartWith5Or3_17 {
	public static void main(String[] args) {
		int num = 5456542;
		int res = checkStart(num);
		if(res == 5) {
			System.out.println("Number start with 5.");
		}
		else {
			System.out.println("Number start with 3.");
		}
	}
	//Check number start with 5 or 3.
	public static int checkStart(int num) {
		int rev = 0;
		while(num>0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		int digit = rev % 10;
		if(digit % 5 == 0) {
			return 5;
		}
		else {
			return 3;
		}
	}
}

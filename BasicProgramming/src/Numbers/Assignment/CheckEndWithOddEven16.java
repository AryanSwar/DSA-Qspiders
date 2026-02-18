package Numbers.Assignment;

public class CheckEndWithOddEven16 {
	public static void main(String[] args) {
		int num = 123432;
		boolean res =  checkEndOddEven(num);
		if(res == true) {
			System.out.println("Number end with even digit.");
		}
		else {
			System.out.println("Number end with odd digit.");
		}
	}
	//Check number end with odd digit or even digit.
	public static boolean checkEndOddEven(int num) {
		boolean res = false;
		//best approach 
		if(num % 2 == 0) {
			res = true;
		}
		
		//not best approach
//		int digit = num % 10;
//		if(digit % 2 == 0) {
//			res = true;
//		}
		
		return res;
	}
}

package Numbers.Assignment;

public class CheckZeroPresentOrNotDuckNumber14 {
	public static void main(String[] args) {
		int num = 1230454;
		boolean res = checkZero(num);
		if(res == true) {
			System.out.println("Duck number");
		}
		else {
			System.out.println("Not Duck number");
		}
		
	}
	//Check weather zero is present in number or not (Duck number).
	public static boolean checkZero(int num) {
		boolean res = false;
		while(num>0) {
			int digit = num % 10;
			if(digit == 0) {
				res = true;
			}
			num = num/10;
		}
		return res;
	}
}

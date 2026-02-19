package Numbers;

public class StrongNumber {
	public static void main(String[] args) {
		int num = 145;
//		int num1 = num;
//		int sum = 0;
//		while(num>0) {
//			int fact = 1;
//			int digit = num % 10;
//			for(int i=digit;i>0;i--) {
//				fact = fact*i;
//			}
//			sum = sum+fact;
//			num = num/10;
//		}
//		if(sum == num1) {
//			System.out.println("Strong number.");
//		}
//		else {
//			System.out.println("Not Strong number.");
//		}
		
		
		boolean b = strongNumber(num);
		if(b == true) {
			System.out.println("Strong number");
		}
		else {
			System.out.println("Not Strong number");
		}
		
	}
	//Find the given number is strong number or not.
	public static boolean strongNumber(int num) {
		int num1 = num;
		int sum = 0;
		while(num>0) {
			int fact = 1;
			int digit = num % 10;
			for(int i=digit;i>0;i--) {
				fact = fact*i;
			}
			sum = sum + fact;
			num/= 10;
		}
		if(sum == num1) {
			return true;
		}
		return false;
	}
}

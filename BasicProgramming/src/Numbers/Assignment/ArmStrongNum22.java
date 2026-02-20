package Numbers.Assignment;

public class ArmStrongNum22 {
	public static void main(String[] args) {
		int num = 145;
		boolean res = checkArmStrong(num);
		if(res == true) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not Armstrong number");
		}
	}
	//Find given number is Arm Strong number or not.
	public static boolean checkArmStrong(int num) {
		int num1 = num;
		int num2 = num;
		int count = 0;
		int sum = 0;
		while(num>0) {
			count++;
			num /= 10;
		}
		while(num1>0) {
			int digit = num1 % 10;
			int pow = 1;
			for(int i =1;i<=count;i++) {
				pow = pow*digit; 
			}
			sum = sum+pow;
			num1 /= 10;
		}
		if(sum == num2) {
			return true;
		}
		return false;
	}
}

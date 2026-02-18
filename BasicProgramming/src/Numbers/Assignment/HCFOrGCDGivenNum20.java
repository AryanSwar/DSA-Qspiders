package Numbers.Assignment;

public class HCFOrGCDGivenNum20 {
	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 18;
		System.out.println("HCF or GCD "+num1+" and "+num2+" : "+hcfGCDNumber(num1, num2));
	}
	
	//Ques-HCF or GCD if given number.
	public static int hcfGCDNumber(int num1, int num2) {
		int hcf = 0;
		int num = 0;
		if(num1>num2) {
			num = num1;
		}
		else {
			num = num2;
		}
		for(int i=1;i<=num;i++) {
			if(num1%i == 0 && num2%i == 0) {
				if(hcf<i) {
					hcf = i;
				}
			}
		}
		return hcf;
	}
}

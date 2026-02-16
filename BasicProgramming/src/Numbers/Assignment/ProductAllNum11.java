package Numbers.Assignment;

public class ProductAllNum11 {
	public static void main(String[] args) {
		int num = 124;
		System.out.println("Product : "+productAllDigit(num));
	}
	//find the product of all digit in given number
	
	public static int productAllDigit(int num) {
		int mul = 1;
		while(num>0) {
			int digit = num%10;
			mul = mul*digit;
			num = num/10;
		}
		return mul;
	}
}

package Numbers.Assignment;

public class ExponentialOfGivenNum23 {
	public static void main(String[] args) {
		int base = 2;
		int pow = 4;
		System.out.println("Exponential of given number : "+exponentialOfNum(base, pow));
	}
	//Find exponential of given number without using inbuilt function.
	public static int exponentialOfNum(int base, int pow) {
		int i = 1;
		int expo = 1;
		while(i<=pow) {
			expo = expo*base;
			i++;
		}
		return expo;
	}
}

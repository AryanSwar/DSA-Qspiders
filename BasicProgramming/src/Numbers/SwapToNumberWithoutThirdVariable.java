package Numbers;

public class SwapToNumberWithoutThirdVariable {
	public static void main(String[] args) {
		//without using third variable
		int a = 10;
		int b = 20;
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a);
		System.out.println(b);
	}
}

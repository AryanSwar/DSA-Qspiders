package Numbers;

import java.util.Scanner;

public class CalculatorSwitch {
	public static int calculator(char sym,int n1,int n2) {
		int res = 0;
		switch(sym) {
			case '+':
				res = add(n1,n2);
				break;
			case '*':
				res = mul(n1,n2);
				break;
			case '/':
				res = div(n1,n2);
				break;
			case '-':
				res = min(n1,n2);
				break;
			case '%':
				res = mod(n1,n2);
				break;
		}
		return res;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the calculator symbol : ");
		char sym = sc.next().charAt(0);
		System.out.println("Enter the first num : ");
		int n1 = sc.nextInt();
		System.out.println("Enter the second num : ");
		int n2 = sc.nextInt();
		System.out.println(calculator(sym, n1, n2));
		
	}
	public static int add(int n1,int n2) {
		return n1+n2;
	}
	public static int min(int n1,int n2) {
		return n1-n2;
	}
	public static int mul(int n1,int n2) {
		return n1*n2;
	}
	public static int div(int n1,int n2) {
		return n1/n2;
	}
	public static int mod(int n1,int n2) {
		return n1%n2;
	}
}

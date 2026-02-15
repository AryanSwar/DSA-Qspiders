package Numbers;

import java.util.Scanner;

public class BankAccountOperation {
	public static void bankOperation(int type,int operation,int balance,int amount) {
		
		switch(type) {
		case 1:
			switch(operation) {
			case 1:
				deposit(amount, balance);
				break;
			case 2:
				
			}
		}
		
	}
	public static void main(String[] args) {
		int balance = 5000;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Saving");
		System.out.println("2.Current");
		System.out.println("Enter the Account type passing number : ");
		int type = sc.nextInt();
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.Check Balance");
		System.out.println("Enter the Opertion passing number : ");
		int operation = sc.nextInt();
		
		
	}
	public static int deposit(int amount,int balance) {
		return amount+balance;
	}
	public static int withdraw(int amount,int balance) {
		if(balance > amount) {
			
		}
	}
}

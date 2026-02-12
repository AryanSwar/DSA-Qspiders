package Numbers;

import java.util.Scanner;

public class AtmMachineSwitchCase {
//Ques-3.ATM Machine Option
	
	public static String atmMachineOption(int num) {
		String option = "";
		switch(num) {
			case 1:
				option = "Check Balance";
				break;
			case 2:
				option = "Withdraw";
				break;
			case 3:
				option = "Deposit";
				break;
			case 4:
				option = "Mini statement";
				break;
			case 5:
				option = "Exit";
				break;
			default:
				option = "Invalid number enter.";
		}
		return option;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Atm option : ");
		int num = sc.nextInt();
		System.out.println(atmMachineOption(num));
		
		sc.close();
	}
}

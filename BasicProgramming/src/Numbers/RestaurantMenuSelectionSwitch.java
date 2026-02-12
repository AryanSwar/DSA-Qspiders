package Numbers;

import java.util.Scanner;

public class RestaurantMenuSelectionSwitch {
//Ques-
	public static String menuSelection(int num) {
		String item = "";
		switch(num) {
			case 1:
				item = "Idli";
				break;
			case 2:
				item = "Dosa";
				break;
			case 3:
				item = "Biryani";
				break;
			case 4:
				item = "Meals";
				break;
			case 5:
				item = "Ice cream";
				break;
			default : 
				item = "Invalid Menu Option";
		}
		return item;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number selected menu : ");
		int num = sc.nextInt();
		
		System.out.println(menuSelection(num));
		
	}
}

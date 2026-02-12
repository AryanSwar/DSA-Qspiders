package Numbers;

import java.util.Scanner;

public class SchoolGameTimeTableUsingSwitch {
	public static String schoolSportsTimeTable(String day) {
		String holiday = "";
		switch(day) {
		case "Monday":
//			System.out.println("Baskeball");
			holiday = "Baskeball";
			break;
		case "Tuseday":
//			System.out.println("Tennis");
			holiday = "Tennis";
			break;
		case "Wednesday":
//			System.out.println("Basketball");
			holiday = "Basketball";
			break;
		case "Thursday":
//			System.out.println("Cricket");
			holiday = "Cricket";
			break;
		case "Friday":
//			System.out.println("Tennis");
			holiday = "Tennis";
			break;
		case "Saturday":
//			System.out.println("Exercise");
			holiday = "Exercise";
			break;
		case "Sunday":
//			System.out.println("Holiday");
			holiday = "Holiday";
			break;
		}
		return holiday;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day name : ");
		String day = sc.nextLine();
		
		System.out.println(schoolSportsTimeTable(day));
		
	}
}

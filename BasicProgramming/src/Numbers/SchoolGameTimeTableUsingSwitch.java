package Numbers;

import java.util.Scanner;
//Ques-use switch  match
	//1 School Game Timetable
	//A school follows a weekly sports timetable
	//Monday -> Basketball
	//Tuseday -> Tennis
	//Wednesday -> Basketball
	//Thursday -> Cricket
	//Friday -> Tennis
	//Saturday -> Exercise
	//Sunday -> Holiday

	//Write a program using switch to read the day and display the activity.


public class SchoolGameTimeTableUsingSwitch {
	public static String schoolSportsTimeTable(String day) {
		String holiday = "";
		switch(day) {
		case "Monday":
			holiday = "Baskeball";
			break;
		case "Tuseday":
			holiday = "Tennis";
			break;
		case "Wednesday":

			holiday = "Basketball";
			break;
		case "Thursday":
			holiday = "Cricket";
			break;
		case "Friday":
			holiday = "Tennis";
			break;
		case "Saturday":
			holiday = "Exercise";
			break;
		case "Sunday":
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

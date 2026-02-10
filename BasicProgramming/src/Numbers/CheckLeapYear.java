package Numbers;

//Divisible by 4: Most years divisible by 4 are leap years(e.g., 2024,2028),
//Century Rule: if the year is also divisible by 100, it is not a leap year (e.g,1900, 2100)..
//The  exception : .. unless it is also divisible by 400, it is a leap year(e.g., 2000, 2400)... 
public class CheckLeapYear {
	public static void main(String[] args) {
		int year = 2024;
		if((year%4==0 && year%100 != 0)||(year%400 == 0)) {
			System.out.println("Leap year.");
		}
		else {
			System.out.println("Not Leap Year");
		}
	}
}

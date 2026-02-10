package Numbers.Assignment;

public class CheckLeapYear4 {
	//Ques-Check whether a year is a leap year or not.
	public static void main(String[] args) {
		int year = 2000;
		if((year%4 == 0 && year%100 != 0)||(year%400 == 0)) {
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not a leap year.");
		}
	}
}

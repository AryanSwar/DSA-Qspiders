package Numbers;

public class CheckMarksGrade {
	public static void main(String[] args) {
		/*>=90 -> A
		>=75 -> B
		>=60 -> C
		>=40 -> D
		>=0 -> Fail */
		
		int marks = 76;
		if(marks>=90 && marks<=100) {
			System.out.println("A");
		}
		else if(marks>=75 && marks<90) {
			System.out.println("B");
		}
		else if(marks>=60 && marks <75) {
			System.out.println("C");
		}
		else if(marks>=40 && marks<60) {
			System.out.println("D");
		}
		else if(marks>0 && marks<40) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Invalid number");
		}
	}
}
package Numbers;

public class FindYoungestSiblingAge {
	//Ques-Design an app to read age of three siblings Ramu, Raghu and Raju and store them in a variable. 
	//The app when executed should display the age of the youngest sibling. 
	public static void main(String[] args) {
		int ramu = 10;
		int raghu = 20;
		int raju = 30;
		
		if(ramu < raghu && ramu < raju) {
			System.out.println("ramu : "+ramu);
		}
		else if(raghu < ramu && raghu < raju) {
			System.out.println("raghu : "+raghu);
		}
		else {
			System.out.println("raju : "+raju);
		}
	}
}

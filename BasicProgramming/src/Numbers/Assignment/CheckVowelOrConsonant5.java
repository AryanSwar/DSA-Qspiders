package Numbers.Assignment;

public class CheckVowelOrConsonant5 {
	//Ques-Check weather a character is a vowel or consonant.
	public static void main(String[] args) {
		char ch = 'a';
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			System.out.println("Vowel");
		}
		else {
			System.out.println("Consonant");
		}
	}
}

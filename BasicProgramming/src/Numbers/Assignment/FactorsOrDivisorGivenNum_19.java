package Numbers.Assignment;

public class FactorsOrDivisorGivenNum_19 {
	public static void main(String[] args) {
		int num = 12;
		factorsGivenNumber(num);
	}
	//Ques-Factors/divisor of the given number.
	public static void factorsGivenNumber(int num) {
		for(int i=1;i<=num;i++) {
			if(num % i == 0) {
				System.out.println(i);
			}
		}
	}
}
//going to optimization to loop run in num/2 and print num.
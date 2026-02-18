package Numbers;

public class FindSumOfNaturalNum {
	public static void main(String[] args) {
		int num = 5;
		System.out.println("Sum of natural number "+num+" : "+sumNaturalNum(num));
	}

//write a program to find the sum of n natural number

	public static int sumNaturalNum(int num) {
		int sum = 0;
		for(int i =1;i<=num;i++) {
			sum = sum+i;
		}
		return sum;
	}
}

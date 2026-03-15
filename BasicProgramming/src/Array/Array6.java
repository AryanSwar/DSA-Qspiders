package Array;

public class Array6 {
	//Pairs in an Array
	//formula of pairs of array is n(n-1)/2
	//time complexity O(n^2)
	//space complexity 
	public static void printPairs(int arr[]) {
		int tp = 0; //total pair
		for(int i=0;i<arr.length-1;i++) {
			int count = 0;
			for(int j=i+1;j<arr.length;j++) {
				System.out.print("("+arr[i]+","+arr[j]+") ");
				count++;
				tp++;
			}
			System.out.print("pair count is : "+count);
			System.out.println();
		}
		System.out.println("total no of pair's are : "+tp);
	}
	public static void main(String[] args) {
		int arr[] = {2,4,6,8,10};
		printPairs(arr);
	}
}

package Array;

public class Array7 {
	//Print Subarrays
	//formula of sub array is n(n+1)/2
	//time complexity O(n^3)
	//space complexity O(1)
	public static void printSubArray(int arr[]) {
		int ts=0;	//total subarray
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int sum = 0;
				for(int k=i;k<=j;k++) {	//print
					System.out.print(arr[k]+" ");	//subarray
					sum = sum+arr[k];
					
				}
				ts++;
				if(max < sum) {
					max = sum;
				}
				if(min > sum) {
					min = sum;
				}
				System.out.println("sum of subarray is : "+sum);
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("total subarray are : "+ts);
		System.out.println("Maximum sum of subarray is : "+max);
		System.out.println("Minimum sum of subarray is : "+min);
	}
	public static void main(String[] args) {
		int arr[] = {2,4,6,8,10};
		printSubArray(arr);
	}
}

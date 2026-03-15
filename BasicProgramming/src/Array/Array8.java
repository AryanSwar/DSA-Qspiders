package Array;

public class Array8 {
	//Max Subarray sum-I(Brute Force)
	//time complexity O(n^3)
	//space complexity O(1)
	public static void maxSubarraySum(int arr[]) {
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int sum = 0;
				for(int k=i;k<=j;k++) {
					
					sum = sum + arr[k];
					
				}
				System.out.print(sum);
				if(max < sum) {
					max = sum;
				}
				
				
			}
			
		}
		System.out.println("maximum subarray sum is : "+max);
	}
	public static void main(String[] args) {
		int arr[] = {1,-2,6,-1,3};
		maxSubarraySum(arr);
	}
}

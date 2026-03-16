package Array;

public class Array9 {
	//Max Subarray sum-II(Prefix Sum)
	//time complexity O(n^2)
	//space complexity O(1)
	public static void maxSubarraySum(int arr[]) {
		int prefix[] = new int[arr.length];
		int max = Integer.MIN_VALUE;
		prefix[0] = arr[0];
		for(int i=1;i<arr.length;i++) {
			prefix[i] = prefix[i-1]+arr[i];
		}
		for(int i=0;i<prefix.length;i++) {
			int sum = 0;
			for(int j=i;j<prefix.length;j++) {
				sum = i == 0 ? prefix[j] : prefix[j]-prefix[i-1];
			}
			if(max < sum) {
				max = sum;
			}
		}
		System.out.println("Maximum subarray sum is : "+max);
	}
	public static void main(String[] args) {
		int arr[] = {1,-2,6,-1,3};
		
		maxSubarraySum(arr);
	}
}

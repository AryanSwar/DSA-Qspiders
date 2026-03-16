package Array;

public class Array10 {
	//Max Subarray sum-III(Kadane's Algorithm)
	//time complexity O(n)
	//space complexity O(1)
	public static void kadanes(int arr[]) {
		int ms = Integer.MIN_VALUE;	//maximum sum
		int cs = 0;	//current sum
		for(int i=0;i<arr.length;i++) {
			cs = cs+arr[i];
			if(cs < 0) {
				cs = 0;
			}
			//both are same in maximum
//			if(ms < cs) {	//maximum
//				ms = cs;
//			}
			ms = Math.max(cs, ms);	//maximum
		}
		System.out.println("our max subarray sum is : "+ms);
	}
	public static void main(String[] args) {
		int arr[] = {-2,-3,4,-1,-2,1,5,-3};
		int arr1[] = {-2,1,-3,4,-1,2,1,-5,4};
		kadanes(arr1);
	}
}

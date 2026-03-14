package Array;

public class Array2 {
	//largest in array
	public static int largestArray(int arr[]) {
		int largest = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(largest<arr[i]) {
				largest = arr[i];
			}
		}
		return largest;

	}
	public static void main(String[] args) {
		int arr[] = {1,3,2,6,3,5};
		
		int result = largestArray(arr);
		System.out.println("largest value is : "+result);
	}
}

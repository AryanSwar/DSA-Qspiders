package Array;

public class Array3 {
	//smallest in array
	public static int smallestArray(int arr[]) {
		int smallest = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(smallest > arr[i]) {
				smallest = arr[i];
			}
		}
		return smallest;
		
	}
	public static void main(String[] args) {
		int arr[] = {1,3,2,6,3,5};
		
		int result = smallestArray(arr);
		System.out.println("smallest value is : "+result);
	}
}

package Array;

public class Array4 {
	//Binary search - time complexity O(log n)
	public static int binarySearch(int arr[],int key) {
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			int mid = (start + end)/2;
			
			//comparisons
			if(key == arr[mid]) {
				return mid;
			}
			
			if(key > arr[mid]) { //right
				start = mid+1;
			}
			else { //left
				end = mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {2,4,6,8,10,12,14};
		int index = binarySearch(arr, 14);
		System.out.println("index for key is : "+index);
	}
}

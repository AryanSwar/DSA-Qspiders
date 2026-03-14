package Array;

public class Array1 {
	//linear search
	public static int linearSearch(int arr[], int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,5,6,7,8,9};
		int index = linearSearch(arr, 7);
		if(index == -1) {
			System.out.println("Not Found");
		}
		else {
			System.out.println("Key is at index : "+index);
		}
	}
}

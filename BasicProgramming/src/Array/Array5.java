package Array;

public class Array5 {
	//Reverse an Array
	public static void swapArray(int arr[]) {
		int i = 0;
		int j = arr.length-1;
		while(i<=j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		int arr[] = {2,4,6,8,10,12};
		swapArray(arr);
		for(int x : arr) {
			System.out.print(x+" ");
		}
	}
}

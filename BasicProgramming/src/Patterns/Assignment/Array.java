package Patterns.Assignment;

public class Array {
	//find dublicate
	public static void main(String[] args) {
//		int[] arr = {1,2,3,4,5,6,1,2,3};
//		//answer 1 2 3 
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i] == arr[j]) {
//					System.out.print(arr[j]+" ");
//				}
//			}
//		}
		
		
		
		//find the sum = 8
		//answer = (7,1),(6,2),(5,3),
//		int[] arr = {1,2,3,4,5,6,7,8};
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]+arr[j] == 8) {
//					System.out.print("("+arr[j]+","+arr[i]+"),");
//				}
//			}
//		}
		
		
		String str = "java is programming language";
		for(int i=0;i<=str.length()-1;i++) {
			char ch = str.charAt(i);
//			int count = 0;
			for(int j=0;j<=str.length()-1;j++) {
				char ch1 = str.charAt(j);
				if(ch != ch1) {
//					count++;
					System.out.println(ch);
				}
			}
//			System.out.println(ch);
		}
	}
}

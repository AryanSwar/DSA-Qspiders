package Array;

import java.util.Arrays;

public class Array12TwoSum {
	//Two Sum
	public static void main(String[] args) {
		int[] a= {3,-8,4,7,3,1,5,9};
		int target=9;
		//sort the array
//		Arrays.sort(a);
		int i=0;
		int j=a.length-1;
		
		while(i<j) {
			int sum=a[i]+a[j];
			if(target==sum) {
				System.out.println("two sum "+a[i]+" "+a[j]+" : "+sum);
				break;
			}
			else if(target>sum) {
				i++;
			}else {
				j--;
			}
		}
	}
}

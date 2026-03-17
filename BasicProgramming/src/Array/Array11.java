package Array;

public class Array11 {
	//Question : Given n non-negative integers representing an elevation map where the width of each bar is 1, 
	//compute how much water it can trap after raining.

	public static int trappedRainwater(int[] height) {
		int n = height.length;
		//calculate left max boundary - array
		int leftMax[] = new int[n];
		
		leftMax[0] = height[0];
		for(int i=1;i<n;i++) {
			leftMax[i] = Math.max(leftMax[i-1], height[i]);
		}
		//calculate right max boundary - array
		int rightMax[] = new int[n];
		
		rightMax[n-1] = height[n-1];
		for(int i=n-2;i>=0;i--) {
			rightMax[i] = Math.max(rightMax[i+1], height[i]);
		}
		
		int trappedWater = 0;
		int width = 1;
		
		//loop
		for(int i=0;i<n;i++) {
			
			//waterLevel = min(leftmax bound , rightmax bound)
			int waterLevel = Math.min(leftMax[i], rightMax[i]);
			
			//trapped water = waterLevel - height[i]
			trappedWater += (waterLevel - height[i])*width;
			
		}
	
		return trappedWater;
		
	}
	public static void main(String[] args) {
		int[] height = {4,2,0,6,3,2,5};
		int area = trappedRainwater(height);
		System.out.println(area);
	}
}


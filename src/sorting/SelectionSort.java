package sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,3,7,6,4,1,8};
		System.out.println(Arrays.toString(arr));
		selection(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	static void selection(int [] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int last = arr.length -i-1;
			int maxIndex = max(arr,0,last);
			swap(arr,maxIndex,last);
		}
	}
	static int max(int [] arr, int start, int end) {
		int maxIndex = start;
		while(start <= end) {
			if(arr[start] > arr[maxIndex])
				maxIndex = start;
			start++;
		}
		return maxIndex;
	}
	static void swap(int [] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}
}

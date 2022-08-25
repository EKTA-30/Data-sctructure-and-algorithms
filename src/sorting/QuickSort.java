package sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {8,3,2,7,4,6,1,5};
		quicksort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void quicksort(int[] arr, int low,int high) {
		if(low >= high)
			return;
		int s = low, e=high;
		int mid = s+(e-s)/2;
		int pivot = arr[mid];
		while(arr[s] > pivot)
			s++;
		while(arr[e] < pivot)
			e--;
		if(s <= e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
		quicksort(arr, low, e);
		quicksort(arr, s, high);
	}
}

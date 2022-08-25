package sorting;

import java.sql.Array;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,3,1,4,5};
		System.out.println(Arrays.toString(arr));
		System.out.println();
		bubbleSort(arr);
		System.err.println(Arrays.toString(arr));
		

	}

	public static void bubbleSort(int [] arr) {
		int n = arr.length;
		boolean swapped;
		for(int i =0;i<n;i++) {
			swapped = false;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			if(!swapped)
				break;
		}
	}
}

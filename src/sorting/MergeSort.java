package sorting;

import java.util.Arrays;

public class MergeSort {
	public static void main() {
		int [] arr = {5,4,3,2,1};
		System.out.println(mergeSort(arr));
	}
	static int [] mergeSort(int [] arr) {
		if(arr.length ==1)
		return arr;
		int mid = arr.length/2;
		int [] left = mergeSort(Arrays.copyOfRange(arr,0, mid));
		int [] right = mergeSort(Arrays.copyOfRange(arr,mid, arr.length));
		
		return mergeSort(left, right);
	}
	private static int[] mergeSort(int[] left, int[] right) {
		// TODO Auto-generated method stub
		int [] mix = new int[left.length + right.length];
		int i = 0, j = 0, k = 0;
		while(i < left.length && j<right.length) {
			if(left[i] < right[j])
				mix[k++] = left[i++];
			else
				mix[k++] = right[j++];
		}
		while(i<left.length)
			mix[k++] = left[i++];
		while(j<right.length)
			mix[k++] = right[j++];
		return mix;
	}
	
}

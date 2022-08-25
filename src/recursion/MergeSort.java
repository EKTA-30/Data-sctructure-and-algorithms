package recursion;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {5,4,3,2,1};
		mergeSortInPlace(arr, 0,arr.length);
		System.out.println(Arrays.toString(arr));

	}
//	static int [] mergeSort(int [] arr) {
//		if(arr.length ==1)
//			return arr;
//		int mid = arr.length/2;
//		int [] left = mergeSort(Arrays.copyOfRange(arr,0, mid));
//		int [] right = mergeSort(Arrays.copyOfRange(arr,mid, arr.length));
//		
//		return merge(left, right);
//	}
	static void mergeSortInPlace(int [] arr,int s,int e) {
		if(e-s ==1)
			return;
		int mid = (s+e)/2;
		mergeSortInPlace(arr,s, mid);
		 mergeSortInPlace(arr,mid,e);
		
		 mergeInPlace(arr,s,mid,e);
	}

	private static void mergeInPlace(int[] arr, int s, int mid, int e) {
		// TODO Auto-generated method stub
		int [] mix = new int[e-s];
		int i = s;
		int j = mid;
		int k=0;
		while(i<mid && j < e) {
			if(arr[i] < arr[j])
			{
				mix[k] = arr[i];
				i++;
			}
			else
			{
				mix[k] = arr[j];
				j++;
			}
			k++;
		}
		while(i < mid)
		{
			mix[k] = arr[i];
			i++;
			k++;
		}
		while(j < e )
		{
			mix[k] = arr[j];
			j++;
			k++;
		}
		//copying everything in orignal array
		for(int l=0;l<mix.length;l++) {
			arr[s+l] = mix[l]; 
		}
		
		}
//	private static int[] merge(int[] left, int[] right) {
//		// TODO Auto-generated method stub
//		int [] mix = new int[left.length + right.length];
//		int i = 0, j = 0, k = 0;
//		while(i < left.length && j<right.length) {
//			if(left[i] < right[j])
//				mix[k++] = left[i++];
//			else
//				mix[k++] = right[j++];
//		}
//		while(i<left.length)
//			mix[k++] = left[i++];
//		while(j<right.length)
//			mix[k++] = right[j++];
//		return mix;	
//	}
	

}

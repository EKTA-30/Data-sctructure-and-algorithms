package recursion;

import java.util.Arrays;

public class RecursiveBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {8,3,2,4,6,7,1,5};
		System.out.println(Arrays.toString(arr));
		recursiveBs(arr, 8);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void recursiveBs(int []arr, int n) {
		if(n == 1)
			return;
		int count =0;
		
		for(int i=0;i< n-1 ; i++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				count++;
			}
		}
		if(count ==0)
			return;
		
		recursiveBs(arr, n-1);
	}

}

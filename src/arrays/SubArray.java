package arrays;

import java.util.*;


public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,3,3};
		System.out.println(subarrayDuplicate(arr));

	}
	
	static List<List<Integer>> subarray(int [] arr){
		List<List<Integer>> outer = new ArrayList<>();
		outer.add(new ArrayList<>());
		for(int num : arr) {
		int n = outer.size();
		for(int i =0;i<n;i++) {
			List<Integer> internal = new ArrayList<>(outer.get(i));
			internal.add(num);
			outer.add(internal);
		}
		}
		return outer;
	}
	static List<List<Integer>> subarrayDuplicate(int [] arr){
		Arrays.sort(arr);
		List<List<Integer>> outer = new ArrayList<>();
		outer.add(new ArrayList<>());
		int start =0,end=0;
		for(int i=0;i<arr.length;i++) {
			start = 0;
			if(i>0 && arr[i]==arr[i-1]) {
				start = end+1;
			}
		end = outer.size()-1;
		int n = outer.size();
		for(int j = start;j<n;j++) {
			List<Integer> internal = new ArrayList<>(outer.get(j));
			internal.add(arr[i]);
			outer.add(internal);
		}
		}
		return outer;
	}

}

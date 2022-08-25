package sorting;

import java.util.*;

public class AllDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static List<Integer> allDupliateNumbers(int [] nums){
		List<Integer> list = new ArrayList<>();
		int i = 0, n = nums.length;
		while(i<n) {
			int correct = nums[i]-1;
			//this takes care of the duplicate values as well !
			if(nums[i] != nums[correct]) {
				swap(nums,i,correct);
		}
			else {
				i++;
			}
	}
		for(int j=0;j<n;j++) {
			if(nums[j] != j+1)
				list.add(nums[j]);
		}
		return list;

}
	static void swap(int [] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}	
}

package sorting;

import java.util.*;
//Given an array nums of n integers where nums[i] is in the range [1, n], 
//return an array of all the integers in the range [1, n] that do not appear in nums.
//		
//Example 1:
//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [5,6]

public class DisappearedElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {4,3,2,7,8,2,3,1,1,2,3};
		List <Integer> list = findDisappearedNumbers(nums);
		System.out.println(list);
	}
	 public static List<Integer> findDisappearedNumbers(int[] nums) {
	        cyclicSort(nums);
	        List<Integer> list = new ArrayList<>();
	        for(int i=0;i<nums.length;i++){
	            if(nums[i] != i+1)
	                list.add(i+1);
	        }
	        return list;
	    }
	    
	    public static void cyclicSort(int [] arr){
	       int i=0,n = arr.length;
	       while(i<n)
	       {
	          if(arr[i] != i+1 && arr[arr[i]-1] != arr[i])
	                swap(arr,i,arr[i]-1);
	            else
	                i++;
	        }
	    }
		static void swap(int [] arr, int first, int second) {
			int temp = arr[first];
			arr[first] = arr[second];
			arr[second] = temp;
		}

	

}

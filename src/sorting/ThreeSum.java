package sorting;
import java.util.*;
public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {-1,0,1,2,-1,-4};
		Arrays.sort(nums);
		List <List<Integer>> list = threeSum(nums);
		System.out.println();
	}
	 public static List<List<Integer>> threeSum(int[] nums) {
	        List <List<Integer>> list = new ArrayList<List<Integer>>();
	        List<Integer>index = new ArrayList<>();
	        for(int i =0;i < nums.length;i++){
	            int l = i+1, r= nums.length-1;
	            while(l<r){
	            int sum = nums[i] + nums[l] + nums[r];
	              if(sum ==0){
	                 index.add(nums[i]);
	                 index.add(nums[l]);
	                 index.add(nums[r]);
	              } 
	                else if(sum < 0){
	                 l++;
	                }
	                else
	                 r--;    
	            }
	            System.out.println(index);
	            list.add(index);
	            index.clear();
	        }
	        return list;
	    }
}

package sorting;
import java.util.*;

public class MaxPdt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {3,4,5,2};
		int max = maxProduct(nums);
		System.out.println(max);
		

	}
	
	public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
        int maxPdt = (nums[0]-1) * (nums[1] -1);
        
        for(int i =2;i<nums.length;i++){
            int pdt = (nums[i-1]-1) * (nums[i]-1);
            System.out.println(maxPdt);
            maxPdt = Math.max(pdt, maxPdt);
        }
        return maxPdt;
    }
}

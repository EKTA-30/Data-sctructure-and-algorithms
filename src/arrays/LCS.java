package arrays;
import java.util.*;
public class LCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String testString = "abc";
//		System.out.println(testString.substring());
//	int [] nums = {1,1,2,2,3,3};
//	System.out.println(longestConsecutiveSequence(nums));
		System.out.println(lengthOfLongestSubstring("abcabcbb"));

	}
	public static int lengthOfLongestSubstring(String s) {
        int maxLength=0;
        String test = "";
        for (char c : s.toCharArray()) {
            String current = String.valueOf(c);
 
            // If string already contains the character
            // Then substring after repeating character
            if (test.contains(current)) {
            	System.out.println(test.indexOf(current));
                test = test.substring(test.indexOf(current)
                                      + 1);
            }
            test = test + String.valueOf(c);
            maxLength = Math.max(test.length(), maxLength);
        }
 
        return maxLength;
    
    }	
}
//	  public static int longestConsecutive(int[] nums) {
//	        Arrays.sort(nums);
//	        System.out.println(Arrays.toString(nums));
//	        int length =1, maxLength=1;
//	        for(int i=0;i<nums.length-1;i++){
//	            if(nums[i+1]-nums[i] == 1)
//	            {
//	                length++;
//		            System.out.println(length);
//	            }
//	            else
//	            {
//	                maxLength = Math.max(length,maxLength);
//	                length=1;
//	                System.out.println(length+" "+maxLength);
//	            }
//	        }
//	        return Math.max(length, maxLength);
//	    }
//	  
//	  public static int longestConsecutiveSequence(int [] nums) {
//		  Set<Integer> set = new HashSet<>();
//		  int res = 0;
//		  for(int i:nums)
//			  set.add(i);
//		  for(int i :nums) {
//			  int max =1, preVal = i-1, nextVal = i+1;
//			  while(set.contains(preVal)) {
//				  max++;
//				  set.remove(preVal--);
//			  }
//			  while(set.contains(nextVal)) {
//				  max++;
//				  set.remove(nextVal++);
//			  }
//			  res = Math.max(max, res);
//		  }
//		  return res;
//	  }
//}

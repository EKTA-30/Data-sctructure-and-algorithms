package sorting;

import java.util.*;

public class SortArrayFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,1,2,2,2,3};
		int res [] = frequencySort(nums);
		System.out.println(Arrays.toString(res));
		
	}
	public static int[] frequencySort(int[] nums) {
		int[] res = new int[nums.length];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
        }
 
        List<Integer> sorted = new ArrayList<>(map.keySet());
        Collections.sort(sorted, (a,b) -> {
        	return (map.get(a) == map.get(b)) ? b-a : map.get(a) - map.get(b);
        });
        System.out.println(sorted);
        int i = 0;
        for(int j = 0; j < sorted.size(); j++){
            for(int k = 0; k < map.get(sorted.get(j)); k++){
                res[i] = sorted.get(j);
                i++;
            }
        }
        
        return res;
        
            
    }

}

package sorting;

public class CycleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {4,2,1,0};
		int missingNum = missingNumber(nums);
		System.out.println(missingNum);

	}
	   public static int missingNumber(int[] nums) {
	        cycleSort(nums);
	        int i;
	        for(i=0;i<nums.length;i++){
	            if(nums[i] != i)
	                return i;
	        }
	            return nums.length;
	        
	    }
    public static void cycleSort(int [] nums){
        int i=0;
       while(i<nums.length)
       {
           if(nums[i] != i && nums[i] < nums.length)
               swap(nums,i,nums[i]);
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

package sorting;

public class FirstMissingPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {2,1,0};
		int ans = firstMissing(nums);
		System.out.println(ans);

	}
	public static int firstMissing(int [] nums) {
		int index =0, size = nums.length,ans=0;
		while(index < size) {
			int correct = nums[index] - 1;
			if(	nums[index]>0 && nums[index]<size && nums[index] != nums[correct] ) {
				swap(nums,index,correct);
			}
				else {
					index++;
				}
		}
		for(int i=0;i<size;i++) {
				if(nums[i] != i+1) {
					return i+1;
				}
			
		}
		return nums.length+1;
	}
	static void swap(int [] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}

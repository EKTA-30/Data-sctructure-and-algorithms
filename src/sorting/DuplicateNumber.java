package sorting;

public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,2,4,3,2};
		int ans = missingNumber(nums);
		System.out.println(ans);

	}
	
	public static int missingNumber(int [] arr) {
		int ans =0, i=0;
		
		while(i<arr.length) {
			if(arr[i] != i+1) {
				if(arr[arr[i]-1] != arr[i])
				{
					swap(arr,i,arr[i]-1);
				}
				else {
					ans = arr[i];
					break;
				}
			}
			else {
				i++;
			}
		}
		return ans;
	}
	static void swap(int [] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}

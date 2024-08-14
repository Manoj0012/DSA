public class Main
{
	public static void main(String[] args) {
		int[] nums= {9,6,5,11,2};
		Selection_sort(nums);
		for(int k:nums) {
			System.out.print(" "+k);
		}
	}
	public static void Selection_sort(int[] nums){
	    int len=nums.length;
		for(int i=0; i<len; i++) {
			int min=i;
			for(int j=i+1; j<len; j++) {
				if(nums[min]>nums[j]) {
					min=j;
				}
			}
			int temp=nums[i];
			nums[i]=nums[min];
			nums[min]=temp;
		}
	}
}
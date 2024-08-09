/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int[] nums= {2,4,5,7,9,10};
		int target=2;
		int result=binary_Search(nums,target);
		System.out.println(result);
	}
	public static int binary_Search(int[] nums,int target) {
		int left=0;
		int right=nums.length-1;
		while(left<=right) {
			int mid=(left+right)/2;
			if(nums[mid]==target) {
				return mid;
			}
			else if(nums[mid]<target) {
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		return -1;
	}
}
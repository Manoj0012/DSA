/******************************************************************************

Bubble Sorting

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int[] nums={6,2,4,3,5,8};
	    int len=nums.length;
	    for(int i=0;i<len;i++){
	        for(int j=i+1;j<len;j++){
	            if(nums[i]>nums[j]){
	                int temp=nums[j];
	                nums[j]=nums[i];
	                nums[i]=temp;
	            }
	        }
	    }
	    for(int n:nums){
	        System.out.print(n+" ");
	    }
	}
}
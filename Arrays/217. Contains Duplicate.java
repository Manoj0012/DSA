class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
		int i=0;
		int j=i+1;
		while(j<nums.length){
		    if(nums[i]!=nums[j]){
		        i++;
		        j++;
		    }
		    else{
		        System.out.println(true);
                return true;
		    }
		}
        return false;
    }
}
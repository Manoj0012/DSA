class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> num=new HashMap<>();
      for(int i=0;i<nums.length;i++){
       if(num.containsKey(nums[i])){
        return true;
       }
       else{
        num.put(nums[i],i);
       }
      }
       return false;
    }
}
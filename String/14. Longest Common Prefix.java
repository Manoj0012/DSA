
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String temp="";
	   if(strs.length==1){
        return strs[0];
       }
	   String cpy=strs[0];
	   for(int i=1;i<strs.length;i++){
	        int j=0;
	         temp="";
	        int len=cpy.length()<strs[i].length()?cpy.length():strs[i].length();
	    while(j<len){
	       if(cpy.charAt(j)==strs[i].charAt(j)){
	           temp+=""+strs[i].charAt(j);
	       }
	       else{
	           break;
	       }
	       j++;
	    }
	    cpy=temp;
	   }
		System.out.println(temp);
        return temp;
    }
}
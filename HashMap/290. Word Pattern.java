class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> data=new HashMap<>();
        String[] str=s.split(" ");
     if(str.length!=pattern.length()){
        return false;
     }
     for(int i=0;i<pattern.length();i++){
        char p=pattern.charAt(i);
        if(data.containsKey(p)){
         if(data.get(p).equals(str[i])){
            continue;
         }
         else{
            return false;
         }
        }
        else{
            if(data.containsValue(str[i])){
                return false;
            }
            else{
                data.put(p,str[i]);
            }
        }
     }
        return true;
    }
}
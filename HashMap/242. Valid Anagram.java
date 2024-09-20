class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> data=new HashMap<>();
        if(t.length()!=s.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
          if(data.containsKey(s.charAt(i))){
            data.put(s.charAt(i),data.getOrDefault(s.charAt(i),0)+1);
          }
          else{
            data.put(s.charAt(i),1);
          }
        }
        System.out.println(data);
       
       for(int j=0;j<t.length();j++){
        if(data.containsKey(t.charAt(j))){
            data.put(t.charAt(j),data.getOrDefault(t.charAt(j),0)-1);
            if(data.get(t.charAt(j))==0){
                data.remove(t.charAt(j));
            }
        }
        else{
            return false;
        }
       }
          return true;
    }
}
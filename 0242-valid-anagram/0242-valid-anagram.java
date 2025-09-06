class Solution {
    public boolean isAnagram(String s, String t) {

        int [] arr=new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        for(char ch:t.toCharArray()){
            arr[ch-'a']++;
        }
        for(char ch:s.toCharArray()){
            arr[ch-'a']--;
        }
       
        for(int count:arr){
            if(count!=0){
                return false;
            }
        }
        
     
        
        
       return true;
        
    }
}
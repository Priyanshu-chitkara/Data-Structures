class Solution {
    public int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)){
            return -1;
        }
        int wind_length=needle.length();
        for(int i=0;i<=haystack.length()-wind_length;i++){
            String s=haystack.substring(i,i+wind_length);
            if(needle.equals(s)){
                return i;
            }


        }
        return 0;
        
    }
}
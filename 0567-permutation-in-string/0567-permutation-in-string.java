class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int l=0;
        int r=0;
        int [] freq=new int[26];
        for(int i=0;i<n;i++){
            freq[s1.charAt(i)-'a']++;
        }
       for(int i=0;i<=m-n;i++){
        int [] freq1=new int[26];
        for(int j=i;j<n+i;j++){
            freq1[s2.charAt(j)-'a']++;


        }
        boolean match=true;
        for(int k=0;k<26;k++){
            if(freq[k]!=freq1[k]){
                match=false;
                break;
            }
        }
        if(match){
            return true;
        }

       }
        return false;
    }
}
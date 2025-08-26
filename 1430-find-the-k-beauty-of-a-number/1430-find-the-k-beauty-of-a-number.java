class Solution {
    public int divisorSubstrings(int num, int k) {
       // to convert int into string
       String s=String.valueOf(num);
        int count=0;
        int n=s.length();
        
        for(int i=0;i<=n-k;i++){
            String sub=s.substring(i,i+k);
            int val=Integer.parseInt(sub);
            if(val!=0 && num%val==0){
                count++;
            }
        }
        return count;
        
    }
}
class Solution {
    public int longestPalindrome(String s) {
        int n=s.length();
        if(n==1){
            return 1;
        }
      HashMap<Character,Integer> mpp=new HashMap<>();
      for(int i=0;i<n;i++){
        char c=s.charAt(i);
        mpp.put(c,mpp.getOrDefault(c,0)+1);
      }
      int length=0;
      boolean oddfound=false;
      for(int count:mpp.values()){
        length+=(count/2)*2;
        if(count%2==1){
            oddfound=true;

        }
      }
      if(oddfound){
        length+=1;
      }
      return length;
        
    }
}
class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n=s.length();
        int l=0;
        int r=0;
        HashSet<String> set=new HashSet<>();
        while(r<n){
            if(r-l+1==k){
                StringBuilder sb=new StringBuilder();
                for(int i=l;i<=r;i++){
                    sb.append(s.charAt(i));
                }
                l++;
                set.add(sb.toString());
               
            }
            r++;
            
        }
        if(set.size()==Math.pow(2,k)){
            return true;
        }
        return false;
        
    }
}
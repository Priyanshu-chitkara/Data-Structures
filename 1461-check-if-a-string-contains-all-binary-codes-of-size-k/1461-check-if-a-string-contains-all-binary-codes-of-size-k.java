class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n=s.length();
       HashSet<String> mp=new HashSet<>();
        for(int i=0;i<=n-k;i++){
            StringBuilder sb=new StringBuilder();
            
            for(int j=i;j<k+i;j++){
                sb.append(s.charAt(j));


            }
            mp.add(sb.toString());
           

        }
        int comb=1;
        for(int i=1;i<=k;i++){
            comb*=2;
        }
        
        if(mp.size()<comb){
            return false;
        }
        return true;

        
    }
}
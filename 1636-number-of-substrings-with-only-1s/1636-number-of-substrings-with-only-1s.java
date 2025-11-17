class Solution {
    public int numSub(String s) {
        long count=0;
        int mod=(int)(1e9+7);
        int n=s.length();
       long ans=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='1'){
                count++;
            }

            
            else if(ch=='0'){
                ans+=count*(count+1)/2%mod;
            
                count=0;
            }
        }
        ans+=count*(count+1)/2%mod;

        return (int)ans%mod;


        
    }
}
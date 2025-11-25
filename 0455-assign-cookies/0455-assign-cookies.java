class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n=g.length;
        int m=s.length;
        int res=0;
        int ans=0;
        Arrays.sort(g);
        Arrays.sort(s);
       while(res<n && ans<m){
        if(g[res]<=s[ans]){
            res++;
        }
        

      ans++;
       


        }
        return res;
        
    }
}

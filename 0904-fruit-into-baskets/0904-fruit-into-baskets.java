class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int l=0;
        int r=0;
        int ans=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        while(r<n){
           
            mp.put(fruits[r],mp.getOrDefault(fruits[r],0)+1);
            while(mp.size()>2){
               mp.put(fruits[l],mp.get(fruits[l])-1);
               if(mp.get(fruits[l])==0){
                 mp.remove(fruits[l]);

               }
              
               l++;
             

            }
             int wind_size=r-l+1;
            ans=Math.max(ans,wind_size);
            r++;
        }
        return ans;
        
    }
}
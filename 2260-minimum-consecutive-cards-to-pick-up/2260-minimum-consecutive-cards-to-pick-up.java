class Solution {
    public int minimumCardPickup(int[] cards) {
        int n=cards.length;
      
        int r=0;
        int ans=Integer.MAX_VALUE;
        int l=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        while(r<n){
            if(mp.containsKey(cards[r])){
                l=mp.get(cards[r]);
                ans=Math.min(ans,r-l+1);
               
                
                


            }
           
            
            mp.put(cards[r],r);

            r++;
        }
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
        
    }
}
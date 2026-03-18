class Solution {
    public int minimumCardPickup(int[] cards) {
        int l=0;
        int r=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=cards.length;
        int ans=Integer.MAX_VALUE;
        
        while(r<n){
            while(mp.containsKey(cards[r])){
                ans=Math.min(ans,r-l+1);
                mp.remove(cards[l]);
                l++;


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
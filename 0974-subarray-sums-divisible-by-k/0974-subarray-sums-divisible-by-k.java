class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        int count=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int rs=sum%k;
            if(rs<0){
                rs+=k;
            }
            if(mp.containsKey(rs)){
                
                count+=mp.get(rs);

            }
            mp.put(rs,mp.getOrDefault(rs,0)+1);

        }
        return count;
        
    }
}
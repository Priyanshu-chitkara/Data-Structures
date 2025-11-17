class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int n=nums1.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum=nums1[i]+nums2[j];
                mp.put(sum,mp.getOrDefault(sum,0)+1);
            }
        }
        for(int k=0;k<n;k++){
            for(int l=0;l<n;l++){
                int target=-(nums3[k]+nums4[l]);
                if(mp.containsKey(target)){
                    count+=mp.get(target);
                }
            }
        }
        return count;
    }
}
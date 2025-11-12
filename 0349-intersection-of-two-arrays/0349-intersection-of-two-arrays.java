class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> sets=new HashSet<>();
        int n=nums1.length;
        int m=nums2.length;
        for(int i=0;i<n;i++){
            sets.add(nums1[i]);
        }
        HashSet<Integer> res=new HashSet<>();
        for(int i=0;i<m;i++){
            if(sets.contains(nums2[i])){
                res.add(nums2[i]);
            }
        }
        int siz=res.size();
        int [] arr=new int[siz];
        int ind=0;
        for(int k:res){
            arr[ind]=k;
            ind++;
        }
        return arr;
        
    }
}
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        HashSet<Integer> set1=new HashSet<>();
        for(int i=0;i<n;i++){
            set1.add(nums1[i]);
        }
        HashSet<Integer> res=new HashSet<>();
       
        for(int i=0;i<m;i++){
            if(set1.contains(nums2[i])){
                res.add(nums2[i]);
            }
        }
        int siz=res.size();
        int [] arr=new int[siz];
        int ind=0;
        for(int ans:res){
            arr[ind++]=ans;
        }
        return arr;
        
    }
}
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int index=0;
        int rindex=0;
        for(int i=0;i<m+n;i++){
            if(nums1[i]==0 && rindex<n){
                index=i;
                nums1[index]=nums2[rindex];
                rindex++;
                

            }
           

        }
        Arrays.sort(nums1);
    }
}
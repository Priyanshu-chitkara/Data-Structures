class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int x=n+m;
        int [] res=new int[x];
       int k=0;
       for(int i=0;i<m;i++){
        res[k]=nums1[i];
        k++;
       }
       for(int i=0;i<n;i++){
        res[k]=nums2[i];
        k++;
       }
       Arrays.sort(res);
        k=res.length;
       if(k%2==0){
        int low=0;
        int high=k-1;
        int mids=(low+high)/2;
        double mid=(double)(res[mids]+res[mids+1])/2;
        return mid;

        
       }
       else{
        int midl=(0+k-1)/2;
       

       double mid=res[midl];
        return mid;
       }

       }
        
    }

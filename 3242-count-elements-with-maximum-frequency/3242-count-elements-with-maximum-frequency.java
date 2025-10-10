class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        int [] freq=new int [101];
        
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        
        int ans=0;
        int res=0;
        for(int i=0;i<freq.length;i++){
            ans=Math.max(ans,freq[i]);
            
            

        }
        int count=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]==ans){
                count++;

            }
        }

            
            
         return count*ans;    
        }
       
        
        
        
    }


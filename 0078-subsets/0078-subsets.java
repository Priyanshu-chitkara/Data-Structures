class Solution {
    public void printf(int [] nums,List<List<Integer>> res, List<Integer> st,int ind){
        int n=nums.length;
        if(ind==n){
             res.add(new ArrayList<>(st));
             return;
        }
          st.add(nums[ind]);
        printf(nums,res,st,ind+1);
      
        st.remove(st.size()-1);
        printf(nums,res,st,ind+1);
        

    }
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> st=new ArrayList<>();
        printf(nums,res,st,0);
        return res;

        
       
    }
       
        
        
    }

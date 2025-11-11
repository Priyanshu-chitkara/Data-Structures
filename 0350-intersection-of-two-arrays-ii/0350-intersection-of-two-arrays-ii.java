class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         HashMap<Integer,Integer> mp=new HashMap<>();
        List<Integer> ls=new ArrayList<>();
       
        for(int i=0;i<nums1.length;i++){
            mp.put(nums1[i],mp.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            if(mp.containsKey(nums2[i])){
               ls.add(nums2[i]);
               mp.put(nums2[i],mp.get(nums2[i])-1);
               if(mp.get(nums2[i])==0){
                mp.remove(nums2[i]);
               }
            }
        }
        int [] arr=new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            arr[i]=ls.get(i);
        }
        return arr;
    }
        
    }

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] arr=new int [k];
        int ind=0;
        int n=nums.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)-> mp.get(b)-mp.get(a));
        for(int l:mp.keySet()){
            pq.add(l);
        }
        // Collections.sort(mp,(a,b) -> b.getValue()-a.getValue());
       for(int i=0;i<k;i++){
        arr[i]=pq.poll();

       }
        return arr;
        
    }
}
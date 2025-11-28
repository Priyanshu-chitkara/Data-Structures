class Solution {
    public int minimumRounds(int[] tasks) {
        // Arrays.sort(tasks);
        int rounds=0;
        HashMap<Integer,Integer> mp=new HashMap<>();

        int n=tasks.length;
        for(int i=0;i<n;i++){
            mp.put(tasks[i],mp.getOrDefault(tasks[i],0)+1);


        }

        for(int k:mp.keySet()){
            int val=mp.get(k);
            if(val==1){
                return -1;

            }
            else if(val%3==0){
                rounds+=val/3;
            }
            else{
                rounds+=val/3+1;
            }
         
        }
        return rounds;
        
    }
}
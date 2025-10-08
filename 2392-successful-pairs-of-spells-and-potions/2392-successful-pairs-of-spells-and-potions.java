class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n=spells.length;
        int m=potions.length;
        int count=0;
        int [] res=new int[n];
       
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=spells[i];
        }
        Arrays.sort(arr);
        Arrays.sort(potions);
        HashMap<Integer,Integer> map=new HashMap<>();

        int j=m-1;
        for(int i=0;i<n;i++){
            while(j>=0 && (long)arr[i]*potions[j]>=success){
                count++;
                j--;

            }
            map.put(arr[i],count);

            
        }
        for(int i=0;i<n;i++){
            res[i]=map.get(spells[i]);
            
        }
        return res;
       
        
    }
}
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int n=groupSizes.length;
        Map<Integer,Integer> map=new HashMap<>();
        Map<Integer,Integer> freqMap=new HashMap<>();

        for(int i=0; i<n; i++){
            freqMap.put(groupSizes[i],freqMap.getOrDefault(groupSizes[i],0)+1);
        }

        for(int i=0; i<n; i++){
            map.put(i,groupSizes[i]);
        }

        List<List<Integer>> result=new ArrayList<>();

        for(Map.Entry<Integer,Integer> mpp:freqMap.entrySet()){
            int grp=mpp.getKey();
            int size=mpp.getValue();
            // i need to fetch size/grp times from map
            int fetch=size/grp;
            while(fetch>0){
                List<Integer> list=new ArrayList<>();
                int mainGRP=grp;
                for(Map.Entry<Integer,Integer> mp:map.entrySet()){
                    if(mainGRP==0) break;
                    if(mp.getValue()==grp){
                        list.add(mp.getKey());
                        map.put(mp.getKey(),-1);
                        mainGRP--;
                    }
                }
                result.add(new ArrayList<>(list));
                fetch--;
            }
        }
        return result;
    }
}
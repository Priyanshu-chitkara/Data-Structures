class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> res=new ArrayList<>();
        int n=words.length;
        HashMap<String,Integer> map=new HashMap<>();
        
        for(int i=0;i<n;i++){
        
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        PriorityQueue<String> pq=new PriorityQueue<>((a,b)->{
            if (map.get(a).equals(map.get(b))) {
            return a.compareTo(b);
        }
        return map.get(b) - map.get(a); 
    }
        );
        for(String l:map.keySet()){
            pq.add(l);
        }
        for(int i=k;i>0;i--){
            String s=pq.poll();
            res.add(s);
        }
        return res;


        
    }
}
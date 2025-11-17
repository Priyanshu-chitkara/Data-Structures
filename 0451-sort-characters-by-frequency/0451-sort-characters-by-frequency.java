class Solution {
    public String frequencySort(String s) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
         HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);

        }
         PriorityQueue<Character> pq=new PriorityQueue<>((a,b) ->{
            if(mp.get(a).equals(mp.get(b))){
                return a.compareTo(b);

            }
            return mp.get(b)-mp.get(a);
        });
       
        for(char k:mp.keySet()){
            pq.add(k);
        }
        while(!pq.isEmpty()){
            char res=pq.poll();
            int freq=mp.get(res);
            for(int i=0;i<freq;i++){
                sb.append(res);
            }
            
        }
        return sb.toString();

        
    }
}
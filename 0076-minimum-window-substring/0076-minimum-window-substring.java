class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int m=t.length();
        int count=m;
       
        if(n<m){
            return "";

        }
        int l=0;
        int r=0;
        int start=0;
        int minlen=Integer.MAX_VALUE;
       HashMap<Character,Integer> mp=new HashMap<>();
       for(int i=0;i<m;i++){
        mp.put(t.charAt(i),mp.getOrDefault(t.charAt(i),0)+1);
       }
       while(r<n){
        if(mp.containsKey(s.charAt(r))){
            mp.put(s.charAt(r),mp.get(s.charAt(r))-1);
            if(mp.get(s.charAt(r))>=0){
                count--;

            }
        }
        while(count==0){
            if(r-l+1<minlen){
                minlen=r-l+1;
                start=l;
            }
            if(mp.containsKey(s.charAt(l))){
                mp.put(s.charAt(l),mp.get(s.charAt(l))+1);
                if(mp.get(s.charAt(l))>0){
                    count++;
                }
            }
            l++;
        }
       
    

        r++;
       }
       if(minlen==Integer.MAX_VALUE) return "";
       return s.substring(start,start+minlen);

        
    }
}
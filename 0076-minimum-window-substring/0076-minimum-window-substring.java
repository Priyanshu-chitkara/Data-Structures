class Solution {
    public String minWindow(String s, String t) {
        int slen=s.length();
        int tlen=t.length();
        if(tlen>slen){
            return "";
        }
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<tlen;i++){
            mp.put(t.charAt(i),mp.getOrDefault(t.charAt(i),0)+1);
        }
        int l=0;
        int r=0;
        int start=0;
        int cnt=tlen;
        int ans=0;
        int end=Integer.MAX_VALUE;
        
        while(r<slen){
            if(mp.containsKey(s.charAt(r))){
                mp.put(s.charAt(r),mp.get(s.charAt(r))-1);
                if(mp.get(s.charAt(r))>=0){
                     cnt--;

                }
               

            }
            while(cnt==0){
                if(r-l+1<end){
                    end=r-l+1;
                    start=l;

                }
                if(mp.containsKey(s.charAt(l))){
                    mp.put(s.charAt(l),mp.get(s.charAt(l))+1);
                    if(mp.get(s.charAt(l))>0){
                        cnt++;
                    }
                }
                l++;

            }
           
            
            
            r++;
        }
        if(end==Integer.MAX_VALUE) return "";
        return s.substring(start,start+end);
        
    }
}
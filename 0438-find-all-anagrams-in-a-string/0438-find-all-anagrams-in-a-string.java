class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ls=new ArrayList<>();
        int [] freqs=new int[26];
        int [] freqp=new int[26];
        int l=s.length();
        int r=p.length();
        for(int i=0;i<r;i++){
            freqp[p.charAt(i)-'a']++;
        }
        for(int i=0;i<l;i++){
            freqs[s.charAt(i)-'a']++;
        
        if(i>=p.length()){
            freqs[s.charAt(i-p.length())-'a']--;
        }
        if(Arrays.equals(freqs,freqp)){
            ls.add(i-p.length()+1);
        }
       
        }
         return ls;

        
    }
}
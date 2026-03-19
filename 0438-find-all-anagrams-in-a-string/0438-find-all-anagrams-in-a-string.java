class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ls=new ArrayList<>();
        int n=s.length();
        int l=0;
        int [] freq=new int[26];
        int [] freqq=new int[26];
        for(int i=0;i<p.length();i++){
            freq[p.charAt(i)-'a']++;
        }
       for(int r=0;r<n;r++){
        freqq[s.charAt(r)-'a']++;
        if(r>=p.length()){
            freqq[s.charAt(r-p.length())-'a']--;

        }
        if(Arrays.equals(freq,freqq)){
            ls.add(r-p.length()+1);
        }



       }
       return ls;
    }
}
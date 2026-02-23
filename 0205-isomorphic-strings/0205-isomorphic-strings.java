class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n!=m){
            return false;
        }
        HashMap<Character,Character> mp=new HashMap<>();
        HashMap<Character,Character> mpp=new HashMap<>();
        for(int i=0;i<n;i++){
           if(mp.containsKey(s.charAt(i))){
            if(mp.get(s.charAt(i))==t.charAt(i)){
                continue;
            }
            else{
                return false;
            }
           }
           else{
            mp.put(s.charAt(i),t.charAt(i));
           }
        }
        for(int j=0;j<m;j++){
            if(mpp.containsKey(t.charAt(j))){
                if(mpp.get(t.charAt(j))==s.charAt(j)){
                    continue;
                }
                else{
                    return false;
                }
            }
            else{
                mpp.put(t.charAt(j),s.charAt(j));
            }
        }
       
        return true;

    }
}
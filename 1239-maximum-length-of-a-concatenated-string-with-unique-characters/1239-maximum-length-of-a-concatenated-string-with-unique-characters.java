class Solution {
    public boolean isvalid(String s,Set<Character> set){
        Set<Character> temp=new HashSet<>(set);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(temp.contains(ch)){
                return false;
            }
            temp.add(ch);
        } 
        return true;

    }
    public int f(List<String> arr,int n,int i,Set<Character> set){
        if(i==n){
            return 0;
        }
        int pk=0;
        if(isvalid(arr.get(i),set)){
            for(int j=0;j<arr.get(i).length();j++){
                set.add(arr.get(i).charAt(j));
            }
            pk=arr.get(i).length()+f(arr,n,i+1,set);
            for(int j=0;j<arr.get(i).length();j++){
                set.remove(arr.get(i).charAt(j));
            }
        }
        int npk=f(arr,n,i+1,set);
        return Math.max(pk,npk);
    }
    public int maxLength(List<String> arr) {
        int n=arr.size();
        Set<Character> set=new HashSet<>();
        return f(arr,n,0,set);
        
    }
}
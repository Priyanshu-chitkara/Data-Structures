class Solution {
    public boolean doesAliceWin(String s) {
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;

            }
        }
        if(count%2==0 && count>0){
            return true;
        }
        else if(count==0){
            return false;
        }
        else if(count%2!=0 && (1<=count && count<1000000)){
            return true;
        }
        else{
            return false;
        }
        
    }
}
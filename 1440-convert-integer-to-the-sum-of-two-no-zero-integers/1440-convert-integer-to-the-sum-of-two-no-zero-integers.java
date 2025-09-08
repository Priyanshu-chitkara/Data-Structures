class Solution {
    public int[] getNoZeroIntegers(int n) {
        int a=n-1;
        int b=1;
        while(a>=b){
            if(!Integer.toString(a).contains("0") && !Integer.toString(b).contains("0")){
                return new int[] {a,b};

            } 

            a--;
            b++;
        }
        return null;
        
    }
}
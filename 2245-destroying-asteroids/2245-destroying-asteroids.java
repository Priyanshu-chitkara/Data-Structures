class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long masss=(long)mass;
        int n=asteroids.length;
        Arrays.sort(asteroids);
        for(int i=0;i<n;i++){
            if(asteroids[i]<=masss){
                masss+=asteroids[i];
            }
             else{
                return false;
            }
        
           
        }
        return true;
        
    }
}
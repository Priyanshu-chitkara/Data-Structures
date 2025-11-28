class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n=people.length;
       int light=0;
       int heavy=n-1;
       int boats=0;
       while(light<=heavy){
        if(people[light]+people[heavy]<=limit){
            light++;
            heavy--;


        }
        else{
            heavy--;
        }
        boats++;
       }
       return boats;
       
    }
}
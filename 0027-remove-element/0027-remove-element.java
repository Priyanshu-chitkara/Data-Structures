class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int arr[] = new int[n];
        int p = 0; 

        
        for (int i = 0; i < n; i++) {
            if (nums[i] == val) {
                continue; 
            }
            arr[p] = nums[i];
            p++;
        }

    
        for (int i = 0; i < p; i++) {
            nums[i] = arr[i];
        }

        return p; 
    }
}

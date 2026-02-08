class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        // Step 1: store left products directly in ans[]
        int leftProd = 1;
        for (int i = 0; i < n; i++) {
            ans[i] = leftProd;
            leftProd *= nums[i];
        }

        // Step 2: multiply right products using one variable
        int rightProd = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= rightProd;
            rightProd *= nums[i];
        }

        return ans;
    }
}

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            ans[idx++] = nums[i];       // x part
            ans[idx++] = nums[i + n];   // y part
        }
        return ans;
    }
}

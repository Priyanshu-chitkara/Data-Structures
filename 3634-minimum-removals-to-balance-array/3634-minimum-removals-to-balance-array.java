class Solution {
    public int minRemoval(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        int ans = n;
        int i = 0;

        for (int j = 0; j < n; j++) {
            while (nums[j] > (long) k * nums[i]) {
                i++;
            }
            ans = Math.min(ans, n - (j - i + 1));
        }
        return ans;
    }
}

class Solution {
    public void f(int[] nums, int n, int target, int i, int ans, int[] arr) {
        if (n == i) {
            if (ans == target) {
                arr[0]++;
                

            }
            return;

        }
        f(nums, n, target, i + 1, ans + nums[i], arr);
        f(nums, n, target, i + 1, ans - nums[i], arr);
    }

    public int findTargetSumWays(int[] nums, int target) {
        int[] arr = new int[1];
        int n = nums.length;
        f(nums, n, target, 0, 0, arr);
        return arr[0];

    }
}
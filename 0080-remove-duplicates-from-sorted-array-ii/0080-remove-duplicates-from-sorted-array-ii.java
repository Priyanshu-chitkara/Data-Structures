class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int i = 2; // start from index 2, since first two are always allowed

        for (int j = 2; j < nums.length; j++) {
            // Only copy if current number is not equal to the number at i-2 position
            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}


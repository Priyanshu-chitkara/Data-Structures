class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;

        for (int num : nums) {
            // First appearance:
            // add num to ones if it's not there in twos
            ones = (ones ^ num) & ~twos;

            // Second appearance:
            // add num to twos if it's not there in ones
            twos = (twos ^ num) & ~ones;
        }

        return ones; // The element that appears only once
    }
}

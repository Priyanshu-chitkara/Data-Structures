class Solution {
    public int[] plusOne(int[] digits) {
        // Start from the last digit and move left
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                // No carry needed: just add 1 and return
                digits[i]++;
                return digits;
            }
            // digits[i] == 9 → becomes 0 and carry goes to the next digit to the left
            digits[i] = 0;
        }

        // If we are here, all digits were 9 (e.g., 9, 99, 999 → 10, 100, 1000)
        int[] res = new int[digits.length + 1];
        res[0] = 1; // rest are 0 by default
        return res;
    }
}

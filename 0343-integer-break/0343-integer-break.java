class Solution {
    public int integerBreak(int n) {
        if (n == 2) return 1;  // 1 + 1
        if (n == 3) return 2;  // 2 + 1

        int product = 1;
        while (n > 4) {
            product *= 3;   // take out 3
            n -= 3;
        }
        return product * n; // multiply the leftover
    }
}

class Solution {
    public int addDigits(int num) {
        while (num >= 10) {  // while num has more than 1 digit
            int sum = 0;
            while (num > 0) {
                sum += num % 10;  // extract last digit
                num /= 10;        // remove last digit
            }
            num = sum;
        }
        return num;
    }
}

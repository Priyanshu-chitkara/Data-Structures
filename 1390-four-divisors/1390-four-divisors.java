class Solution {
    public int sumFourDivisors(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int fans = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int x = nums[i];

            for (int j = 1; j <= x; j++) {
                if (x % j == 0) {
                    sum += j;
                    count++;
                }
                 if (count > 4) {
                break;
            }
            }
            if (count == 4) {
                fans += sum;

            }
           

            sum = 0;
            count = 0;
        }

        return fans;

    }
}
import java.util.Arrays;

class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices); // sort prices ascending
        int cost = prices[0] + prices[1]; // two cheapest

        if (cost > money) {
            return money; // cannot buy
        }
        return money - cost; // leftover money after buying
    }
}

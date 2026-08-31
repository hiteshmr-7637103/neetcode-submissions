class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int i=0,j=1;
        int profit = -1;

        while (i<prices.length-1 && j<prices.length)  {
            profit = prices[j] - prices[i];
            if (profit < 0) {
                i=j;
                j++;
                continue;
            }
            if (profit > max) {
                max = profit;
            }
            j++;
        }

        return max;
    }
}

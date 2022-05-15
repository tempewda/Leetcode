class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int n = prices.length;
        int left = 0;   //buy
        int right = 1;  //sell
        int max_profit = 0;
        int profit = 0;
        
        while (right < n)
        {
            if (prices[left] < prices[right])
            {
                profit = prices[right] - prices[left];
                if (profit > max_profit)
                    max_profit = profit;
            }
            else
            {
                left = right;
            }
            ++right;
        }
        return max_profit;
    }
}
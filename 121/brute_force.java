class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int n = prices.length;
        int profit = 0;
        
        for (int buy = 0; buy < (n - 1); ++buy)
        {
            for (int sell = (buy + 1); sell < n; ++sell)
            {
                int diff = prices[sell] - prices[buy];
                if (diff > profit)
                    profit = diff;
            }
        }
        return profit;
    }
}
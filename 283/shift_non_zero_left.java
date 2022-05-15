class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        int right = 0;
        int left = 0;
        int swap = 0;
        int ln = nums.length;
        
        // num = nom-zero --> swap, left++, right++
        // num = zero --> right++
        while (right < ln)
        {
            switch(nums[right])
            {
                case 0:
                    ++right;
                    break;
                
                default:
                    swap = nums[left];
                    nums[left] = nums[right];
                    nums[right] = swap;
                    ++left;
                    ++right;
            }
        }
        
        
    }
}
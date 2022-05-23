class Solution 
{
    public int findDuplicate(int[] nums) 
    {
        int n = nums.length - 1;
        for (int i = 0; i < (n + 1); ++i)
        {
            int index = Math.abs(nums[i]) - 1;
            
            if (nums[index] < 0)
                return index + 1;
            else
                nums[index] = -nums[index];
        }
        return 0;
    }
}
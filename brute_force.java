class Solution 
{
    public int findDuplicate(int[] nums) 
    {
        int n = nums.length - 1;
        Arrays.sort(nums);
        
        for (int index = 0; index < n; ++index)
        {
            if (nums[index] == nums[index + 1])
                return nums[index];
        }
        return 0;
    }
}
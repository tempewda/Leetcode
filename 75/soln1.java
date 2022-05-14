class Solution 
{
    public void sortColors(int[] nums) 
    {
        int n = nums.length;
        int index0 = 0;
        int index1 = -1;
        
        // sort all 0's to the beginning of the array
        for(int index = 0; index < n; ++index)
        {
            if(nums[index] == 0)
            {
                if(index == 0)
                {
                    ++index0;
                    continue;
                }
                
                int swap = nums[index0];
                nums[index0] = nums[index];
                nums[index] = swap;
                if((index0 + 1) < n)
                    ++index0;
            }
        }
        
        index1 = index0;
        // sort all 1's to the middle of the array
        for(int index = index1; index < n; ++index)
        {
            if(nums[index] == 1)
            {
                if(index == index1)
                {
                    ++index1;
                    continue;
                }
                
                int swap = nums[index1];
                nums[index1] = nums[index];
                nums[index] = swap;
                if((index1 + 1) < n)
                    ++index1;
            }
        }
    }
}
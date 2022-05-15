class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        int ins_index = -1;
        int n = nums.length;
        int srch_ele = -1;
        
        for(int index = 0; index < n; ++index)
        {
            if(index == 0)
            {
                srch_ele = nums[index];
                ins_index = 1;
                continue;
            }
            if(nums[index] != srch_ele)    
            {
                srch_ele = nums[index];
                nums[ins_index] = nums[index];
                ++ins_index;
            }    
        }
        return ins_index;
    }
}
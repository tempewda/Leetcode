class Solution 
{
    public int findDuplicate(int[] nums) 
    {
        int n = nums.length - 1;
        int num = 0;
        int dupes = -1;
        for(int index = 0; index < n; ++index)
        {
            num = nums[index];
            dupes = 0;
            for (int srch_index = index + 1; srch_index <= n; ++ srch_index)
                if (nums[srch_index] == num)
                {
                    ++dupes;
                    break;
                }
           if (dupes == 1)
               break;
        } 
        return num;
    }
}
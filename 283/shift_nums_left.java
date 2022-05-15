class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        int [] arr = new int[nums.length];
        arr = Arrays.copyOf(nums, nums.length);
        int index = 0;
        
        for (int i=0; i<arr.length; i++)
        {
            if(arr[i] != 0)
            {
                nums[index] = arr[i];
                index++;
            }
        }
        
        for (int j=index; j<nums.length; j++)
        {
            nums[j] = 0;
        }
    }
}

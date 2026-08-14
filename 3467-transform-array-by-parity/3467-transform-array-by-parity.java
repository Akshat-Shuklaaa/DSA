class Solution 
{
    public int[] transformArray(int[] nums) 
    {
        int left = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] % 2 == 0)
            {
                nums[i] = 0;
            }
            else nums[i] = 1;
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != 1)
            {
                int temp = nums[left];
                nums[left] = nums[i];
                nums[i] = temp;

                left++;
            }
        }
        return nums;
    }
}
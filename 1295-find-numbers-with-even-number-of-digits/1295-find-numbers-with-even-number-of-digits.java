class Solution {
    public int findNumbers(int[] nums) {
        int temp =0,count=0;
        for(int i =0;i<nums.length;i++){
            while(nums[i]>0)
                {
                    temp++;
                    nums[i]/=10;
                }
            if(temp%2==0)
            {
                count++;
            }
            temp=0;
        }
        return count;
    }
}
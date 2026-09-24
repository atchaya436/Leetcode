class Solution 
{
    public int missingNumber(int[] nums) 
    {
        int i=0;
        while(i<nums.length)
        {
            int index = nums[i];
            if (index < nums.length && nums[i] != nums[index])
            {
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
            }
            else
            {
                i++;
            }
        }
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=i)
            {
                return i;
            }
        }
        return i;
    }
}
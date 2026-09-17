class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        int k = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != 0)
            nums[k++] = nums[i];
        }
        while (k < nums.length)
            nums[k++] = 0;
    }
    public static void main(String[] args) 
    {
        Solution s= new Solution();
        int num[]={0,1,3,12};
        s.moveZeroes(num); 
        System.out.println(Arrays.toString(num));
    }
}
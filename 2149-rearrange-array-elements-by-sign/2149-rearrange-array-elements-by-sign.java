class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] temp = new int[nums.length];
        int p=0;
        int n=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] < 0)
            {
                temp[n]=nums[i];
                n+=2;
            }

            else
            {
                temp[p]= nums[i];
                p+=2;
            }
        }

        return temp;

    }
}
class Solution {
    public int maxSubArray(int[] nums) {
        int currSum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            currSum+=nums[i];
            maxsum = Math.max(currSum,maxsum);

            if(currSum < 0)
            {
                currSum = 0;
            }
        }

        return maxsum;
    }
}
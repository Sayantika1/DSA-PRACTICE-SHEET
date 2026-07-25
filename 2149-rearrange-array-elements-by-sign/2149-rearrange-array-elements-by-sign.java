class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] positive  = new int[nums.length/2];
        int[] negetive  = new int[nums.length/2];

        int p=0;
        int n=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] < 0)
            {
                negetive[n++]=nums[i];
            }

            else
            {
                positive[p++]=nums[i];
            }
        }

        p=0;
        n=0;
        int j=0;
        while(j<nums.length)
        {
            nums[j++] = positive[p++];
            nums[j++] = negetive[n++];
        }

        return nums;

    }
}
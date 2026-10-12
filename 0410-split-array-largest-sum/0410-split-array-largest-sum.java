class Solution {
    public int splitArray(int[] nums, int k) {
        
        int sum =0;
        int high = 0;

        for(int num:nums)
        {
            high = Math.max(num,high);
            sum += num;
        }

        
        while(high <= sum)
        {
            int mid = high + (sum - high)/2;

            if(correct(nums,k,mid))
            {
                sum = mid-1;
            }
            else
            {
                high = mid +1;
            }
        }
        return high;

    }

    public boolean correct(int[] nums, int k, int ans)
    {
        int subarray=1;
        int total =0;
        for(int num :nums)
        {
            if(total+num <= ans)
            {
                total+=num;
            }
            else
            {
                subarray ++;
                total = num;
            }
        }

        return (subarray <= k);
    }
}
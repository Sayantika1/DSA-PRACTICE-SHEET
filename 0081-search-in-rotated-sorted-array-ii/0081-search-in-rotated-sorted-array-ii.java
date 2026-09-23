class Solution {
    public boolean search(int[] nums, int k) {
        int first=0;
       int last=nums.length-1;
       while(first<=last)
       {
        int mid=(first+last)/2;
        if(nums[mid]==k)
        {
            return true;
        }

        if (nums[first] == nums[mid] && nums[mid] == nums[last]) {
                first++;
                last--;
            }

        else if(nums[mid]>=nums[first])
        {
            if (nums[first] <= k && k < nums[mid]) {
                    last = mid - 1;
                }
                else {
                    first = mid + 1;
                }
        }
        else{
            if (nums[mid] < k && k <= nums[last]) {
                    first = mid + 1;
                }
                else {
                    last = mid - 1;
                }
        }
       }

       return false;
    }
}
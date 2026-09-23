class Solution {
    public int findMin(int[] nums) {
        int first = 0;
        int last = nums.length - 1;

        while (first < last) {

            int mid = first + (last - first) / 2;

            if (nums[mid] > nums[last]) {
                // Minimum is on the right
                first = mid + 1;
            }
            else {
                // Minimum is at mid or on the left
                last = mid;
            }
        }

        return nums[first];
    }
}
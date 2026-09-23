class Solution {
    public int mySqrt(int x) {

        int left = 1;
        int right = x;
        int ans = 0;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (mid <= x / mid)   //instead of writing this mid <= x / mid
            {
                // mid is a possible answer
                ans = mid;
                left = mid + 1; // Try for a bigger value
            } 
            else {
                // mid is too large
                right = mid - 1;
            }
        }

        return ans;
    }
}
class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];

            if (curr < 0) {
                int temp = minProduct;
                minProduct = maxProduct;
                maxProduct = temp;
            }

            minProduct = Math.min(curr, curr * minProduct);
            maxProduct = Math.max(curr, curr * maxProduct);

            ans = Math.max(maxProduct, ans);
        }

        return ans;
    }
}
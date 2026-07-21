class Solution {
    public void rotate(int[] nums, int k) {
            int[] arr=new int[nums.length];
            int n = nums.length;
            k = k % n;
            
            for(int i = 0; i < n; i++) {
            arr[(i + k) % n] = nums[i];
        }

        for(int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }
    }
}
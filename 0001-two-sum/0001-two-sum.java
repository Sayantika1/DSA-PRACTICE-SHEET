class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hp = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            int comple = target - nums[i];

            if(hp.containsKey(comple))
            {
                return new int[]{hp.get(comple),i};
            }
            hp.put(nums[i],i);
        }

        return new int[]{};
    }
}
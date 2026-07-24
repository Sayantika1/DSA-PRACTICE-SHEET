class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer, Integer> hp = new HashMap<>();

       for(int i=0;i<nums.length;i++)
       {
            if(hp.containsKey(nums[i]))
            {
                hp.put(nums[i] , hp.get(nums[i])+1);
            }

            else
                hp.put(nums[i], 1);
       } 

       for (int key : hp.keySet()) {
            if (hp.get(key) > nums.length / 2) {
                return key;
            }
        }

        return -1;
    }
}
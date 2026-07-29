class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hp = new HashMap<>();
        hp.put(0,1);
        int prefixsum=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            prefixsum+=nums[i];
            int required = prefixsum - k;
            if(hp.containsKey(required))
            {
                count += hp.get(required);
            }

            if(hp.containsKey(prefixsum))
            {
                hp.put(prefixsum , hp.get(prefixsum)+1);
            }

            else
            {
                hp.put(prefixsum ,1);
            }
        }

        return count;
    }
}
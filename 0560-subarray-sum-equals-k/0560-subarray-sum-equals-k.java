class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hp = new HashMap();

        hp.put(0,1);

        int prefixSum =0;
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            prefixSum += nums[i];

            int required = prefixSum - k ; 


            if(hp.containsKey(required)){
                count += hp.get(required);
            }

                hp.put(prefixSum,hp.getOrDefault(prefixSum,0)+1);

               
        }
         return count;
    }
}
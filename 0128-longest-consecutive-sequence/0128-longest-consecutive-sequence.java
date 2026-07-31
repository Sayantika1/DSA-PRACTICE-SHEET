class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> hs = new HashSet<>();
        for ( int i : nums)
            {
                hs.add(i);
            }

        
        int longest= 0; 
        int count =0;

        for ( int j : hs)
            {
                if(!hs.contains(j-1))
                {
                    int current= j;
                    count = 1;


                    while(hs.contains(current+1))
                        {
                            current++;
                            count++;
                        }
                }

                longest= Math.max(longest,count);
            }

        return longest;
    }
}
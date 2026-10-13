
import java.util.*;

class Solution {
    public int[] numberOfPairs(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int pairs = 0;

        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num); // Pair found: remove the previous number
                pairs++;
            } else {
                set.add(num); // First occurrence: store it
            }
        }

        return new int[]{pairs, set.size()};
    }
}

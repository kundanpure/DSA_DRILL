import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Find the required number

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i}; // Found the pair
            }

            map.put(nums[i], i); // Store current number with its index
        }

        return new int[]{}; // No solution found (won't happen as per constraints)
    }
}

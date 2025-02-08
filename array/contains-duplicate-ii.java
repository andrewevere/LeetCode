class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> distance = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            if (distance.containsKey(nums[i]) && i - distance.get(nums[i]) <= k ){
                return true;
            }
            distance.put(nums[i], i);
        }
        return false;
    }
}
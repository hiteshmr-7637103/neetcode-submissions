class Solution {
    public int subarraySum(int[] nums, int k) {
        int total = 0,prefix = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(prefix,1);
        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];
            if (map.containsKey(prefix - k)) total+=map.get(prefix-k);
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        return total;
    }
}
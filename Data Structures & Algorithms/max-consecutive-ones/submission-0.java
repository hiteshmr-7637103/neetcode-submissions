class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int curr = 0;
        int max = 0;

        for (int i=0;i<nums.length;i++) {
           if (nums[i] == 1) {
            curr++;
            max = Math.max(curr,max);
            continue;
           }
           curr = 0;
        }

        return max;
    }
}
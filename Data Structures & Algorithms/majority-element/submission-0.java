class Solution {
    public int majorityElement(int[] nums) {
        int candidate  = nums[0];
        int votes = 1;
        
        for (int i=0;i<nums.length;i++) {
            if (votes==0) {
                candidate = nums[i];
            }
            if (candidate!=nums[i]) {
                votes--;
            } else {
                votes++;
            }
        }

        return candidate;
    }
}
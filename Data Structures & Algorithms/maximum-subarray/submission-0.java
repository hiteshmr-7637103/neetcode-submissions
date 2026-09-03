class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int i = 0;
        int sum = 0;

        while (i < nums.length)  {
            sum += nums[i];
            maxSum =  Math.max(maxSum,sum); 
            if (sum < 0) {
                sum = 0;
            }
            i++;
        }

        return maxSum;
    }
}

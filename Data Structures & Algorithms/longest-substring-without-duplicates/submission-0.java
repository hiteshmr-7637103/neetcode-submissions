class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[128];
        int maxLen = 0;
        int l = 0;

        for (int r=0;r<s.length();r++) {
            while (freq[s.charAt(r)] > 0) {
                freq[s.charAt(l)]--;
                l++;
            }
            freq[s.charAt(r)]++;
            maxLen = Math.max(maxLen,r-l+1);
        }

        return maxLen;
    }
}

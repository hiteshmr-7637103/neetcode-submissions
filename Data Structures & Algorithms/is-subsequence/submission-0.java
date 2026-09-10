class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        
        if (s.length()==0) return true;
        while (i < t.length() && j < s.length()) {
            if (t.charAt(i)==s.charAt(j)) {
                i++;j++;
                continue;
            } else {
                i++;
            }
        }
        if (j > s.length() - 1) {
            return true;
        } 
        
        return false;
    }
}
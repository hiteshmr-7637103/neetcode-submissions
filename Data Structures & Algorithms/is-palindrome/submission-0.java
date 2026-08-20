class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i=s.length()-1;i>=0;i--) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) { 
                sb.append(Character.toLowerCase(c));
            }
        }
        String str2 =  s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String str1 = sb.toString();
        if (str1.equals(str2)) {
            return true;
        } 
        return false;
    }
}

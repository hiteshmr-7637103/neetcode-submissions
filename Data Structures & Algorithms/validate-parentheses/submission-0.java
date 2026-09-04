class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;
        char[] stack = new char[s.length()];
        int top = 0;
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                stack[top] = s.charAt(i); top ++;
            } else {
                if (top == 0) return false;
                top--;
                if (s.charAt(i) == '}' && stack[top] != '{') return false;
                else if (s.charAt(i) == ']' && stack[top] != '[') return false;  
                else if (s.charAt(i) == ')' && stack[top] != '(') return false; 
            }
        }
        return top==0;
    }
}

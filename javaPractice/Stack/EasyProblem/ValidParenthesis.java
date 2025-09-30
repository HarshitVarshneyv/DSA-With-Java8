package javaPractice.Stack.EasyProblem;

import java.util.Stack;

public class ValidParenthesis {
     public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "([])";
        System.out.println(s1 + " is valid: " + solution.isValid(s1)); // true
        
        String s2 = "([)]";
        System.out.println(s2 + " is valid: " + solution.isValid(s2)); // false
        
        String s3 = "()[]{}";
        System.out.println(s3 + " is valid: " + solution.isValid(s3)); // true
        
        String s4 = "){";
        System.out.println(s4 + " is valid: " + solution.isValid(s4)); // false
    }
}

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char val : s.toCharArray()) {
            if (val == '(' || val == '[' || val == '{') {
                st.push(val);
            } else {
                if (st.isEmpty()) {
                    return false;
                }

                char top = st.pop();
                if ((val == ')' && top != '(') ||
                    (val == ']' && top != '[') ||
                    (val == '}' && top != '{')) {
                    return false;
                }
            }
        }
        
        return st.isEmpty();
    }
}
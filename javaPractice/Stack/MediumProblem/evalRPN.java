package javaPractice.Stack.MediumProblem;

import java.util.Set;
import java.util.Stack;

public class evalRPN {
    
}


class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        Set<String> set = Set.of("+", "-", "*", "/");
        for (String ch : tokens) {

            if (set.contains(ch)) {
                int b = st.pop();
                int a = st.pop();

                switch (ch) {
                    case "+" -> st.push(a + b);
                    case "-" -> st.push(a - b);
                    case "/" -> st.push(a / b);
                    case "*" -> st.push(a * b);
                }
            } else {
                st.push(Integer.valueOf(ch));
            }
        }
        return st.pop();
    }
}


//New Solution
class Solution1 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String ch : tokens) {

            if (ch.equals("+") || ch.equals("-") || ch.equals("/") 
            || ch.equals("*") ) {
                int b = st.pop();
                int a = st.pop();

                switch (ch) {
                    case "+" -> st.push(a+b);
                    case "-" -> st.push(a-b);
                    case "/" -> st.push(a/b);
                    case "*" -> st.push(a*b);
                }
            } else {
                st.push(Integer.valueOf(ch));
            }
        }
        return st.pop();
    }
}
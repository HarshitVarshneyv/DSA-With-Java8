package javaPractice.numberproblem;

import java.util.Stack;

public class StackRemoveDupli {
     public static void main(String[] args) {
        String s = "haarss";
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if(!st.isEmpty() && st.peek() == ch){
                st.pop();
            } else{
                st.push(ch);
            }
        }
        System.out.println(st);

        String re = "";
        while(!st.isEmpty()){
            re = st.pop() + re ;
        }
        System.out.println(re);
    }
}

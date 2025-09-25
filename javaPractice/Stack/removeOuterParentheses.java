package javaPractice.Stack;
import java.util.*;

class Main {  // There is one more approach exists where we can use 2 pointers increase one if we have that one approach
    public static void main(String[] args) {
      String str = "(()())(())";
      Solution s = new Solution();
      System.out.println(s.removeOuterParentheses(str));
  }
}

class Solution{
  public String removeOuterParentheses(String str){
    String ans = "";
    Stack<Character> st = new Stack<>();
    for(char ch : str.toCharArray()){
      if(ch == '('){
        if(!st.isEmpty()) ans += ch;
        st.push(ch);
      } else{
        st.pop();
        if(!st.isEmpty()) ans +=ch;
      }
  }
  return ans;
}
}

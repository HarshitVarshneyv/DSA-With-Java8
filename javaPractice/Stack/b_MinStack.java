package javaPractice.Stack;

import java.util.Stack;

class b_MinStack{
    private Stack<Integer> st;
    private Stack<Integer> minStack;

    public b_MinStack(){
        st = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val){
        st.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        } else minStack.push(minStack.peek());  // duplicate current min
    }

    public void pop(){
        minStack.pop();
        st.pop();
    }

    public int top(){
        return st.peek();
    }

    public int getMin(){
        return minStack.peek();
    }
}

class MinStackMain {
   public static void main(String[] args) {
    
    b_MinStack st = new b_MinStack();
    st.push(5);
    st.push(3);
    st.push(7);
    st.push(2);
    System.out.println(st.getMin()); // 2
    st.pop();
    System.out.println(st.getMin()); // 3
    System.out.println("Good problem");
   }
}

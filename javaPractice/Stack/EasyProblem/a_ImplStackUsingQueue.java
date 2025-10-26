//👉 So:
//Pop-Costly version = Push is cheap (O(1)), Pop/Top are costly (O(n)).
//Push-Costly version = Pop/Top are cheap (O(1)), Push is costly (O(n)).
//We will do push costly version.....
package javaPractice.Stack.EasyProblem;

import java.util.*;
 class Main {
    public static void main(String[] args) {
      StackUsingQueues stack = new StackUsingQueues();
      stack.push(10);
      stack.push(20);
      stack.push(30);

        System.out.println("Top element: " + stack.top()); // 30
        System.out.println("Popped: " + stack.pop()); // 30
        System.out.println("Top element: " + stack.top()); // 20
        System.out.println("Is empty? " + stack.isEmpty()); // false
  }
}

class StackUsingQueues  {
    private Queue<Integer> q1; //main
    private Queue<Integer> q2;
    public StackUsingQueues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int val) {
        q2.add(val);
        
        while(!q1.isEmpty()){
          q2.add(q1.poll());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        
    }
    
    public int pop() {
        // if(q1.isEmpty()){
        //   throw new RuntimeException("Stack is empty!");
        // } optional
        return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean isEmpty() {
        return q1.isEmpty();
    }
    
}



/*
 Push(10)

q2.add(10) → q2 = [10]
Move all from q1 to q2 → q1 empty, nothing moves.
Swap q1 & q2 →
q1 = [10], q2 = []
👉 Now q1’s front is 10.

Push(20)
q2.add(20) → q2 = [20]
Move all from q1 → move 10 to q2 → q2 = [20, 10]
Swap q1 & q2 →
q1 = [20, 10], q2 = []
👉 Now q1’s front is 20 (the latest pushed).

Push(30)
q2.add(30) → q2 = [30]
Move all from q1 → move 20, 10 into q2 → q2 = [30, 20, 10]
Swap q1 & q2 →
q1 = [30, 20, 10], q2 = []
👉 Now q1’s front is 30.
Why This Works?
After every push, the latest element is always moved to the front of q1.
So:
pop() just removes q1.poll() → last pushed element.
top() just returns q1.peek() → last pushed element.
 */
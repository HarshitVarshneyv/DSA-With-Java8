package javaPractice.Stack;

import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();

        for (String opr : operations) {
            switch (opr) {
                case "C":
                    s.pop();
                    break;

                case "D":
                    s.push(s.peek() * 2);
                    break;

                case "+":
                    int last = s.get(s.size() - 1);
                    int secondLast = s.get(s.size() - 2);
                    s.push(last + secondLast);
                    break;

                default:
                    //st.push(Integer.parseInt(op)); //Returns a primitive int.// x = 123 autoboxing is done in this case;
                    // valueOf =>Returns an Integer object (wrapper class).
                    s.push(Integer.valueOf(opr)); // directly retrun INTEGER
            }
        }
    //return s.stream().mapToInt(Integer::intValue).sum();

        // 2. Sum up all the scores remaining in the stack.
        int totalSum = 0;
        for (int score : s) {
            totalSum += score;
        }
        return totalSum;
    }
}


class Solution1 {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();

        for (String opr : operations) {
            switch (opr) {
                case "C" -> s.pop();
                case "D" -> s.push(s.peek() * 2);
                case "+" -> {
                    int last = s.get(s.size() - 1);
                    int secondLast = s.get(s.size() - 2);
                    s.push(last + secondLast);
                }

                default -> s.push(Integer.valueOf(opr));
            }
        }
        return s.stream().mapToInt(Integer::intValue).sum();
    }
}
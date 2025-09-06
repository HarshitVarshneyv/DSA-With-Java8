package javaPractice.StringProblem;

public class NextAlpha {
    public static void main(String[] args) {
        String s = "abcdxyz";
        StringBuilder s1 = new StringBuilder();
        for(char ch : s.toCharArray()){
            s1.append(++ch);
        }
        System.out.println(s1.toString());
    }
}

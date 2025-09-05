package javaPractice.StringProblem;

public class ChangeCase {
    public static void main(String[] args) {
        String s1 = "Harshit";
        StringBuilder s = new StringBuilder();

        for(char ch : s1.toCharArray()){
               if('a' <= ch && ch <= 'z'){
                    s.append(Character.toUpperCase(ch)); //you can also use Character.isLowerCase(ch)
               } else{
                s.append(Character.toLowerCase(ch));
               }
        }
        System.out.print(s.toString());
    }
}

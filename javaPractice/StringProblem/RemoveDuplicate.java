package javaPractice.StringProblem;
    import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "harshit";
        Set<Character> s = new LinkedHashSet<>(); //maintain order
        for(char ch : str.toCharArray()){
            s.add(ch);

        }
        for(Character ch : s){
            System.out.print(ch);
        }
    }
}

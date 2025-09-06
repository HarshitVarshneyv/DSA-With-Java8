package javaPractice.StringProblem;
import java.util.LinkedHashMap;

public class DupliWithOccur {
    public static void main(String[] args) {
        String str = "sinstriiintng";
        LinkedHashMap<Character,Integer> freq = new LinkedHashMap<>();

        for(char ch : str.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0) + 1);
        }
        for(Character k : freq.keySet()){
            if(freq.get(k) > 1){
                System.out.println(k + "=>" + freq.get(k));
            }
        }
    }
}

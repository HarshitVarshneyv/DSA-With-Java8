package javaPractice.StringProblem;

import java.util.HashMap;
import java.util.Map;

public class MaxOcuurence {
    public static void main(String[] args) {
        String str = "Harrrshit";
        HashMap<Character,Integer> freq = new HashMap<>();

        for(char ch : str.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0) + 1);
        }

        int max = -1;
        char real = '\0';
        for(Map.Entry<Character,Integer> entry : freq.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                real = entry.getKey();
            }
        }
        System.out.println("Character with max frequency: " + real);
    }
}

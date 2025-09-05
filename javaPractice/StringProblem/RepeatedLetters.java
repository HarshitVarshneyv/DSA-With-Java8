/*
Find word with highest number of repeated letters in string Example 1: 
Input:string=”abcdefghij google microsoft” Output: google 
Explanation: In “google” g appears 2 times, o appears 2 times which is highest among all words
 */

package javaPractice.StringProblem;

import java.util.HashMap;

public class RepeatedLetters {
    public static void main(String[] args) {
        String s = "abcdefghij google microsoft";
        String[] words = s.split(" ");
        String resultWord = "";
        int maxRepeatCount = 0;

        for(String word : words){
            HashMap<Character,Integer> map = new HashMap<>();
            for(char ch : word.toCharArray()){
                map.put(ch, map.getOrDefault(ch,0) + 1);
            }
            int currMax = 0;
            for(int count : map.values()){
                if(count > currMax) currMax = count;
            }
            if(currMax > maxRepeatCount){
                resultWord = word;
                maxRepeatCount = currMax;
            }
        }
        System.out.println(resultWord);
    }
}
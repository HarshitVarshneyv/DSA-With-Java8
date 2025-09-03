package javaPractice.StringProblem;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        try (// String str ="this is an amazing program";
        Scanner s = new Scanner(System.in)) {
            String str = s.nextLine();
            effcetiveApproach(str);
            String revStr = new StringBuilder(str).reverse().toString();
            //System.out.println("Original string get reversed => " + "\n" + revStr);

            String result = "" , word = "";
            for(int i=0;i<revStr.length()-1;i++){
                    while(i < revStr.length() && revStr.charAt(i) != ' '){
                        word += revStr.charAt(i);
                        i++;
                    }
                String revWord = new StringBuilder(word).reverse().toString();
                result += " " + revWord;
                word = "";
            }
            System.out.println(result.substring(1));
        }
    }

    public static void effcetiveApproach(String str){
        String[] words = str.split(" ");
        String result = "";

        for(int i = words.length - 1 ; i >= 0;i--){
            result += words[i];
            if(i != 0){
                result += " ";
            }
        }
        System.out.println(result);
    }
}
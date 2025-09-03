package javaPractice.StringProblem;

import java.util.Scanner;

public class FindSubstring {
    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        // String str1 = s.nextLine();
        // String str2 = ss.nextLine();
        //  s.close();
        String str1 = "takeuforward";
        String str2 = "forward";
        int i = 0 , j = 0;
        int ans = -1;
        while(i < str1.length()){
            if(str1.charAt(i) == str2.charAt(j)){
                if(j == 0) ans = i;
                j++;
                if(j == str1.length()){
                    System.out.println("Substring found at index: " + ans);
                }
            } else {
                if(j > 0) i = ans;
                j = 0;
                ans = -1;
            }
            i++;
        }
    }
}

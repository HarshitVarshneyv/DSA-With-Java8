package javaPractice.StringProblem;

import java.util.Arrays;

public class SortCharacter {
    public static void main(String[] args) {
        String str = "zxcbg";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sortedStr1 = new String(chars);
        String strRev = new StringBuilder(sortedStr1).reverse().toString();
        System.out.println(strRev);
    }
}

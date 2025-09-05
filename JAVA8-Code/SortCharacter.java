import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class SortCharacter {
    public static void main(String[] args) {
        String s = "harshit";
        withRealJava8(s);
        Character[] chars = new Character[s.length()];
        for(int i=0;i<s.length();i++){
            chars[i] = s.charAt(i);
        }
        Arrays.sort(chars,Collections.reverseOrder());
         // Build back string
        StringBuilder sortedStr = new StringBuilder();
        for (char c : chars) {
            sortedStr.append(c);
        }
         System.out.println("Sorted Descending: " + sortedStr.toString());
    }

    private static void withRealJava8(String s) {
        String str = Arrays.stream(s.split(""))
                    .sorted(Collections.reverseOrder())
                    .collect(Collectors.joining());
        System.out.println(str);
    }
}

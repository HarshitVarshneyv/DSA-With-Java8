package javaPractice.StringProblem;

public class CountVowelConsoSpac {
    public static void main(String[] args) {
        String str = "Take u forward is Awesome";
        int v = 0 , c = 0 , s = 0;
        for(char ch : str.toCharArray()){
            if(checkVowel(ch)){
                v++;
            } else if(ch == ' '){
                s++;
            } else{
                c++;
            }
        }
        System.out.println(v + " " + c + " " + s);
    }
    private static boolean checkVowel(char ch) {
        char c = Character.toLowerCase(ch);
       return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}

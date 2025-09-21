package javaPractice.StringProblem;
public class Capital1andLast {
    public static void main(String[] args) {
        String str = "Take u Forward is Awesome";
        String[] words = str.split(" ");

        StringBuilder s = new StringBuilder();

        for(String word : words ){
            for(int i=0;i<word.length();i++){
                if(i == 0 || i == word.length() - 1){
                    s.append(Character.toUpperCase(word.charAt(i)));
                } else s.append(word.charAt(i));
            }
            s.append(" ");
        }
        System.out.println(s.toString());
        System.out.println(s.toString());
    }
}

package javaPractice.numberproblem;

class replace0With1 {

    public static void convert(int n){
        String r = "";
        // String str = String.valueOf(n);
        String str = Integer.toString(n);
        for (char ch : str.toCharArray()) {
            if (ch == '0') {
                r += '1';
//Strings in Java are immutable, so every time you “change” one, you're actually creating a new one.
            } else {
                r += ch;
            }
        }
        System.out.println(r);
    }
    public static void main(String[] args) {
        int n = 102003;
        convert(n);
        convertWithbuilder(n);
    }
    private static void convertWithbuilder(int n) {
        String str = String.valueOf(n);
        StringBuilder s = new StringBuilder();

        for (char ch : str.toCharArray()){
                s.append(ch == '0' ? '1' : ch);
        }
            String result = s.toString();
            System.out.println(result);
    }
}
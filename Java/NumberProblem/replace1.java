package Java.NumberProblem;

class replace1WithZero {

    public static void main(String[] args) {
        int n = 102003;
        String r = "";
        String str = String.valueOf(n);
        for (char ch : str.toCharArray()) {
            if (ch == '0') {
                r += '1';
            } else {
                r += ch;
            }
        }
        System.out.println(r);
    }
}
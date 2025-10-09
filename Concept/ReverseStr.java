public class ReverseStr {
    public static void main(String[] args) {
        String str = "Harshit";
        reverseStr(str);
        reverseStrMutable(str);
    }

    private static void reverseStrMutable(String str) {
        String s = new StringBuilder(str).reverse().toString();
        System.out.println(s);
    }

    private static void reverseStr(String str) {
        String r = "";
        for(int i=str.length()-1;i>=0;i--){
            r += str.charAt(i);
        }
        System.out.println(r);
    }
}

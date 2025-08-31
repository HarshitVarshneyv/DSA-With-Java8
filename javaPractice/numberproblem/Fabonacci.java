package javaPractice.numberproblem;

public class Fabonacci {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0;i<n;i++){
        System.out.println(Fib(i));
        }
    }

    private static int Fib(int num) {
       if(num == 0 ) return 0;
       if(num == 1) return 1;
       return Fib(num-1) + Fib(num-2);
    }
}
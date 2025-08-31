package javaPractice.numberproblem;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {   // Surround with try-with-resource, Automatically closes.
            //s.close(); warning wil go off;
            int n = s.nextInt();
            System.out.println(findFactorial(n));
        }  
    }

    private static int findFactorial(int n) {
        if(n == 0) return 1;
        return n * findFactorial(n-1);
    }
}

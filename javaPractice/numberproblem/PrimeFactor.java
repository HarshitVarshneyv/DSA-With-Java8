package javaPractice.numberproblem;

public class PrimeFactor {
    public static void main(String[] args) {
        int n = 35;
        for(int i=1;i<=n;i++){
            if(n % i == 0){
                if(findPrime(i)){
            System.out.println(i);
            }}
        }
    }

    private static boolean findPrime(int num) {
        if(num < 2 ) {
            return false;
        }
        for(int i=2;i*i<=num;i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}
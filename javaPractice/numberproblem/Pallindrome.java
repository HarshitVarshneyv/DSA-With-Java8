package javaPractice.numberproblem;

public class Pallindrome {
    public static void main(String[] args) {
        int n = 4554;
        int realNum = n , rem , reverse = 0;

        while (n > 0) {
            rem = n % 10; 
            reverse = (reverse * 10) + rem;
            n /= 10;    
        }
        if(reverse == realNum){
            System.out.println("P");
        } else System.out.println("NP");
    }
}

package javaPractice.numberproblem;

class SumInRange {
    public static void main(String[] args) {
        int a = 2,b = 7;
        int sum = 0;
        for(int i=a;i<=b;i++){
            sum += i;
        }
        System.out.println(sum);
    }
}

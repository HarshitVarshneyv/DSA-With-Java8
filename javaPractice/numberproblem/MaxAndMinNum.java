package javaPractice.numberproblem;

public class MaxAndMinNum {
    public static void main(String[] args) {
        int n = 12345 , rem;
        int min = 9 , max = 0;

        while( n > 0 ){
            rem = n % 10;
            //findMinMax(rem,min,max); // if you want to keep this method use a wrapper object. See below
            if(rem < min) min = rem;
            if(rem > max) max = rem;
            n /= 10;
        }
        System.out.println(min);
        System.out.println(max);
    }

    private static void findMinMax(int rem, int min, int max) {
//Java is pass-by-value, even for primitives. So when you pass min and max into findMinMax(...), you're 
//passing copies,not references.Any changes inside the method won’t affect the original variables in main.
       if(rem < min) min = rem;
       if(rem > max) max = rem;
    }
}


/* 
 class MinMax {
    int min = 9;
    int max = 0;
}

public class MaxAndMinNum {
    public static void main(String[] args) {
        int n = 12345;
        MinMax result = new MinMax();

        while (n > 0) {
            int rem = n % 10;
            findMinMax(rem, result);
            n /= 10;
        }

        System.out.println("Min digit: " + result.min);
        System.out.println("Max digit: " + result.max);
    }

    private static void findMinMax(int rem, MinMax result) {
        if (rem < result.min) result.min = rem;
        if (rem > result.max) result.max = rem;
    }
}

 */
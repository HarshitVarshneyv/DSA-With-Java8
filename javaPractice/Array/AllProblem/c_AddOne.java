package javaPractice.Array.AllProblem;

public class c_AddOne {
    public static void main(String[] args) {
        //make fuc call HERE
    }
    public static int[] plusOne(int[] digits) {
    int n = digits.length;

    for (int i = n - 1; i >= 0; i--) {
        if (digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        digits[i] = 0;
    }

    // All digits were 9 — need a new array with one extra digit
    int[] result = new int[n + 1];
    result[0] = 1;
    return result;
}
}

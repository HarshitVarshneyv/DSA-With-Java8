package javaPractice.Stack.MediumProblem;

import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 50, 10, 70, 30};
        int[] result = maxOfMinBrute(arr);
        System.out.println(Arrays.toString(result));
    }

    //This is a brute force approach
    public static int[] maxOfMinBrute(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];

        for (int k = 1; k <= n; k++) {
            int maxMin = Integer.MIN_VALUE;

            for (int i = 0; i <= n - k; i++) {
                int minVal = Integer.MAX_VALUE;

                for (int j = i; j < i + k; j++) {
                    minVal = Math.min(minVal, arr[j]);
                }

                maxMin = Math.max(maxMin, minVal);
            }

            res[k - 1] = maxMin;
        }

        return res;
    }
}

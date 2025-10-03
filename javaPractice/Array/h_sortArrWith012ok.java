package javaPractice.Array;

import java.util.*;

class Main {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int z = 0, one = 0, two = 0;

        for (int i : arr) {
            switch (i) {
                case 0 -> z++;
                case 1 -> one++;
                case 2 -> two++;
            }
        }

        // Overwrite arr with sorted values: all 0s, then 1s, then 2s
        int index = 0;
        for (int i = 0; i < z; i++) arr[index++] = 0;
        for (int i = 0; i < one; i++) arr[index++] = 1;
        for (int i = 0; i < two; i++) arr[index++] = 2;

        System.out.println(Arrays.toString(arr));
    }
}

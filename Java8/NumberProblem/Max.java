package NumberProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

class MaxNumber {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ArrayList<Integer> arr1 = takeUserInput();
        //findMax(arr);
        findMaxWithUserInput(arr1);
    }

    private static ArrayList<Integer> takeUserInput() {
        Scanner s = new Scanner(System.in);
         ArrayList<Integer> arr1 = new ArrayList<>();
         System.out.print("Enter number of elements: ");
         int n = s.nextInt();
         System.out.println("Enter " + n + " integers:");
         for(int i=0;i<n;i++){
            arr1.add(s.nextInt());
         }
         return arr1;
    }

    private static void findMaxWithUserInput(ArrayList<Integer> arr1) {
        int max = arr1.stream().max(Integer::compare).orElse(null);
        OptionalInt max1 = arr1.stream().mapToInt(Integer::intValue).max();
        System.out.println(max);
        // So in short: you use .mapToInt(Integer::intValue) only when starting from boxed types like
        //List<Integer>. If you're already using a primitive array, you're good to go with Arrays.stream(arr).max().
    }

    private static void findMax(int[] arr) {
        OptionalInt max = Arrays.stream(arr).max();
        System.out.println(max.getAsInt());
    }
}

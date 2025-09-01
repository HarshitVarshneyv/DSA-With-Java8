import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverseArr(arr);
        reverseArrWithStream(arr);
        Integer[] arr1 = {1,2,3,4,5};
        collectionReverse(arr1);

    }

    private static void reverseArrWithStream(int[] arr) {
        int[] reversed = IntStream.range(0, arr.length)
                                  .map(i -> arr[arr.length - 1 - i])
                                  .toArray();
        System.out.println(Arrays.toString(reversed));  //[1, 2, 3, 4, 5] Output is this because it reverse reversed arr Which you've done in the first step
    }

    private static void collectionReverse(Integer[] arr1) {
        List<Integer> list = Arrays.asList(arr1);
        Collections.reverse(list);
        System.out.println(list);
    }

    private static void reverseArr(int[] arr) {
       for(int i=0;i<arr.length / 2 ;i++){
        int temp = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length -1 -i] = temp;
       }
       //System.out.println(Arrays.toString(arr));
       System.out.println(Arrays.toString(arr));
    }
}

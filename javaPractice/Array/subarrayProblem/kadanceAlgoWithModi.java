package javaPractice.Array.subarrayProblem;
//✅ Modified Kadane’s Algorithm with Subarray Tracking
public class kadanceAlgoWithModi {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        optimalWithSubarray(arr);
    }
    private static void optimalWithSubarray(int[] arr) {
    int n = arr.length;
    int maxSum = Integer.MIN_VALUE, currSum = 0;
    int start = 0, end = 0, tempStart = 0;

    for (int i = 0; i < n; i++) {
        currSum += arr[i];

        if (currSum > maxSum) {
            maxSum = currSum;
            start = tempStart;
            end = i;
        }

        if (currSum < 0) {
            currSum = 0;
            tempStart = i + 1;
        }
    }

    System.out.println("Maximum Subarray Sum: " + maxSum);
    System.out.print("Subarray: [");
    for (int i = start; i <= end; i++) {
        System.out.print(arr[i]);
        if (i < end) System.out.print(", ");
    }
    System.out.println("]");
}

}

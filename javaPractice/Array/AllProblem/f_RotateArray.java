package javaPractice.Array.AllProblem;

public class f_RotateArray {
    public static void main(String[] args) {
        
    }
}


class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // handle cases where k >= n
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[(i + k) % n] = nums[i]; // rotate right by k
        }

        for (int i = 0; i < n; i++) {
            nums[i] = ans[i]; // copy back to original array
        }
    }
}

class Solution2{
public void rotate1(int[] nums, int k) {
    int n = nums.length;
    k = k % n;

    reverse(nums, 0, n - 1);       // reverse entire array
    reverse(nums, 0, k - 1);       // reverse first k elements
    reverse(nums, k, n - 1);       // reverse remaining elements
}

private void reverse(int[] nums, int start, int end) {
    while (start < end) {
        int temp = nums[start];
        nums[start++] = nums[end];
        nums[end--] = temp;
    }
}
}

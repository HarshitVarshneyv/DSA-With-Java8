package javaPractice.Array;

import java.util.Arrays;

public class d_MissingNum {
    public static void main(String[] args) {
        
    }
}


class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n * (n + 1) / 2;
        int numsSum = Arrays.stream(nums).sum();
        return totalSum - numsSum;
    }
}

class Solution1 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for(int i : nums){
            if(count != i) return i-1;
            count++;
        }
        return count;
    }
}
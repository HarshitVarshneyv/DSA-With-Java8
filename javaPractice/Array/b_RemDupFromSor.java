package javaPractice.Array;

import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        
        int j= 0; //slow-runner
        for(int i = 1;i<arr.length;i++){ //fast-runner
            if(arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        int[] r = Arrays.copyOf(arr,j + 1); 
        System.out.println(Arrays.toString(r));
    }
}
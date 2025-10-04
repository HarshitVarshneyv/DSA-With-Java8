package javaPractice.Array.AllProblem;
import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int t = 9;
        System.out.println(Arrays.toString(findTwoSum(arr,t)));
    }
    
    public static int[] findTwoSum(int[] arr,int t){
        Map<Integer,Integer> map = new HashMap<>();// 2  0  
        for(int i=0;i<arr.length;i++){  
            int first = arr[i];
            int second = t - first;
            
            if(map.containsKey(second)){
                return new int[] {map.get(second),i};   
            }
            map.put(first , i);
        }
        return new int[0]; // Return empty array if no solution found
    }
}


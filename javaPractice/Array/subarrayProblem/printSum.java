package javaPractice.Array.subarrayProblem;

public class printSum {
    public static void main(String[] args) {
      int[] arr = {1,2,3};
      printSubArray(arr);
      bruteForceApproachTofindSum(arr);
      optimal(arr);
    }

    private static void optimal(int[] arr) {
      int maxSum = Integer.MIN_VALUE,currSum = 0;
      
      for(int val : arr){
        currSum += val;
        maxSum = Integer.max(maxSum,currSum);
        
        if(currSum < 0 ){
          currSum = 0;
        }
      }
      System.out.println(maxSum);
  }

    private static void bruteForceApproachTofindSum(int[] arr) {
       int n = arr.length;
       int maxSum = Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
        int currSum = 0;
          for(int j=0;j<n;j++){
              currSum += arr[j];
              maxSum = Integer.max(maxSum,currSum);
            }
       }
    System.out.println(maxSum);
    }

    private static void printSubArray(int[] arr) {
    int n = arr.length;
    
      for(int st=0;st<n;st++){
        for(int end=st;end<n;end++){
          for(int k=st;k<=end;k++){
            System.out.print(arr[k] + " ");
          }
          System.out.println();
        }
      }
    }


}

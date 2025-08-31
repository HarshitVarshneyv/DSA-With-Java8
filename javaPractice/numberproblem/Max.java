package javaPractice.numberproblem;

class DSA {

    private static void findMax(int[] arr){
      int max = arr[0];
      for(int i : arr){
        if(i > max){
          max = i;
        }
      }
      System.out.println(max);
    }
    public static void main(String[] args) {
      int[] arr = {1,2,3,4,5};
      findMax(arr);
  }
}
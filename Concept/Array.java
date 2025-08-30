public class Array {

    public static void fun(int arr[]){
        arr[3] = 40;
        arr[4] = 50;
    }
   public static void main(String[] args) {
    int arr[] = new int[5];
    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;
    fun(arr);
    for(int val : arr){
        System.out.println(val);
    }
   }    
}

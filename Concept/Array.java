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

/*
 Java 8
Now we have got the option of Stream and lambda to print the array.

Printing One dimensional Array:

public static void main(String[] args) {
    int[] intArray = new int[] {1, 2, 3, 4, 5};
    String[] strArray = new String[] {"John", "Mary", "Bob"};

    //Prior to Java 8
    System.out.println(Arrays.toString(intArray));
    System.out.println(Arrays.toString(strArray));

    // In Java 8 we have lambda expressions
    Arrays.stream(intArray).forEach(System.out::println);
    Arrays.stream(strArray).forEach(System.out::println);
}
The output is:

[1, 2, 3, 4, 5]
[John, Mary, Bob]
1 2 3 4 5
John Mary Bob


Printing Multi-dimensional Array Just in case we want to print multi-dimensional array we can use Arrays.deepToString(array) as:

public static void main(String[] args) {
    int[][] int2DArray = new int[][] { {11, 12}, { 21, 22}, {31, 32, 33} };
    String[][] str2DArray = new String[][]{ {"John", "Bravo"} , {"Mary", "Lee"}, {"Bob", "Johnson"} };

    //Prior to Java 8
    System.out.println(Arrays.deepToString(int2DArray));
    System.out.println(Arrays.deepToString(str2DArray));

    // In Java 8 we have lambda expressions
    Arrays.stream(int2DArray).flatMapToInt(x -> Arrays.stream(x)).forEach(System.out::println);
    Arrays.stream(str2DArray).flatMap(x -> Arrays.stream(x)).forEach(System.out::println);
} 
Now the point to observe is that the method Arrays.stream(T[]), which in case of int[] returns us Stream<int[]> and then method flatMapToInt() maps each element of stream with the contents of a mapped stream produced by applying the provided mapping function to each element.

The output is:

[[11, 12], [21, 22], [31, 32, 33]]
[[John, Bravo], [Mary, Lee], [Bob, Johnson]]
11
12
21
22
31
32
33
John
Bravo
Mary
Lee
Bob
Johnson
 */
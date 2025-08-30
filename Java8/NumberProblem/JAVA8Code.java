import java.util.Arrays;
import java.util.List;

class Myclass{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("A","B","C");
        List<Integer> numList = Arrays.asList(1,2,3,4,5);
        //Myclass.printList(names,numList);
        //Myclass.findEven(numList);
        findMax(numList);
    }

     private static void findMax(List<Integer> numList) {
        
    }

     private static void printList(List<String> names, List<Integer> numList){
        names.forEach(System.out::println); //Consumer<String>
        numList.forEach(i -> System.out.print(i + " "));
    //  names.forEach(n -> System.out.println(n));
    }

    private static void findEven(List<Integer> numList) {
        numList.stream()
        .filter(i -> i % 2 == 0 )
        .forEach(System.out::print);
    }
}
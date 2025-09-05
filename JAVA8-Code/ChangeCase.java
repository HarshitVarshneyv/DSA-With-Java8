import java.util.stream.Collectors;

public class ChangeCase {
    public static void main(String[] args) {
        String s1 = "HarShIt";

//With mapToObj: You can easily convert a stream of primitive 
//values into a stream of objects, allowing you to use the full range of Stream<T> operations.

        String s2 = s1.chars() //return IntStream that is why always cast to char
        .mapToObj(s -> Character.isUpperCase(s) ? Character.toLowerCase((char)s) : Character.toUpperCase((char)s))  
        .map(String::valueOf)
        .collect(Collectors.joining());

        System.out.println(s2);
    }
}

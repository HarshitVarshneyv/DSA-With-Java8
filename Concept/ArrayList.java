import java.util.*;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.println(list + " -> " + list.size());

        // Add elements
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list + " -> " + list.size());

        // Insert at index 1
        list.add(1, 1000);
        System.out.println(list + " -> " + list.size());

        // Access element
        int val = list.get(1); // not list[1]
        System.out.println(val);

        // Update element
        list.set(1, 2000); // not list[1] = 2000
        System.out.println(list + " -> " + list.size());

        // Remove element at index 1
        list.remove(1);
        System.out.println(list + " -> " + list.size());
    }
}

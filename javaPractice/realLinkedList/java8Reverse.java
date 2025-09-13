package javaPractice.realLinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class java8Reverse {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println("LinkedList is : " + ll);
        Collections.reverse(ll);
        System.out.println("Reversed LinkedList is : " + ll);
    }
}

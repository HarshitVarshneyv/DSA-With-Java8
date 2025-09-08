package javaPractice.LinkedList;

class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
        this.next = null;
    }
}

class LinkedList{
    Node head;
    Node tail;
    private int size;
    
    LinkedList(){
        head = tail = null;
        size = 0;
    }

}
class Main {
    
}

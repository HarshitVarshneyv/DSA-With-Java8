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

    public void addAtHead(int val){
        Node newNode = new Node(val);
        size++;
        if(head == null){ 
            head = tail = newNode;
            return;
        } else{ // New noorka next pointer head ke Taraf point karega tabi connection build hoga.
        newNode.next = head;
        head = newNode;
        }  
    }

    public void addAtTail(int val){
        Node newNode = new Node(val);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void addAtIndex(int idx, int val){
        if(idx < 0 || idx > size) return;
        if(idx == 0) {
            addAtHead(val);
        } else if(idx == size){
            addAtTail(val);
        } else{
            Node newNode = new Node(val);
            size++;
            Node temp = head;
            for (int i = 0; i < idx - 1; i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            
        }
    }
}
class Main {
    
}

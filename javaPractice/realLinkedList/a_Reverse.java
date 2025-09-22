package javaPractice.realLinkedList;

class ListNode {
    ListNode next;
    int val;

    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
};

class Solution{

}

class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        for(int i=0;i<arr.length;i++){
            System.out.println("This is the loop");
        }
    }
}

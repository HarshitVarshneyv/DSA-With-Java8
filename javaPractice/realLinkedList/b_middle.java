package javaPractice.realLinkedList;

public class b_middle {
    public static void main(String[] args) {
        
    }
}

/**
 * Step-by-step:
Traverse the list once to count the total number of nodes (size).
Calculate the middle index: size / 2
If size is even, this gives the second middle (as required).

Traverse again to reach the middle node.
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode temp = head;

        while(temp != null){
            temp = temp.next;
            size++;
        }

        int middle = size / 2 ;
        temp = head;
        for(int i=0;i<middle;i++){
                temp = temp.next;
        }
        return temp;
    }
}


class Solution1 {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
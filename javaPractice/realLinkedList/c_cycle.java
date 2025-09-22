package javaPractice.realLinkedList;

public class c_cycle {
    public static void main(String[] args) {
        
    }
}

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

 // In this we're checking if cycle exists then we have return the first node where the cycle starts..
 class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}

// In this we break the cycle
class Solution1 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                ListNode prev = null;
                while(slow != fast){
                    slow = slow.next;   
                    prev = fast;
                    fast = fast.next;
                }
                prev.next = null; //remove cycle
                return slow;
            }
        }
        return null;
    }
}
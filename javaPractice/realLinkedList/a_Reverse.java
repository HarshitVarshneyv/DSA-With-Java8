// Definition for singly-linked list
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head, next = null;

        while (curr != null) {
            next = curr.next;   // store next node
            curr.next = prev;   // reverse pointer
            prev = curr;        // move prev forward
            curr = next;        // move curr forward
        }
        return prev; // new head
    }

    // Helper method to print linked list
    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution sol = new Solution();

        System.out.println("Original List:");
        sol.printList(head);

        // Reverse the list
        ListNode reversed = sol.reverseList(head);

        System.out.println("Reversed List:");
        sol.printList(reversed);
    }
}

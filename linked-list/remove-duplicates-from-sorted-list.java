/**
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;

        while (head != null){
            if (head.next != null && head.val == head.next.val){
                head = head.next;
            }else{
                ListNode newNode = new ListNode(head.val);
                current.next = newNode;
                current = current.next;
                head = head.next;
            }
        }

        return dummy.next;
    }
}
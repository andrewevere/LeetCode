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

import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String list1 = convertoString(l1);
        String list2 = convertoString(l2);

        BigInteger num1 = new BigInteger(list1);
        BigInteger num2 = new BigInteger(list2);
        BigInteger sum = num1.add(num2);

        String result = sum.toString();

        String reversed = new StringBuilder(result).reverse().toString();

        ListNode dummy = new ListNode(0);
        ListNode output = dummy;

        for (int i = 0; i < reversed.length(); i++){
            output.next = new ListNode(reversed.charAt(i)-'0');
            output = output.next;
        }

        return dummy.next;

    }
        
    public String convertoString(ListNode list){
        StringBuilder listString = new StringBuilder();
        while (list != null){
            listString.append(list.val);
            list = list.next; 
        }

        String result = listString.reverse().toString();

        return result;
    }
}
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
    public ListNode reverseList(ListNode head) {
        int size = 0;
        ListNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }
        int[] arr = new int[size];
        int i = 0;
        current = head;
        while (current != null) {
            arr[i++] = current.val;
            current = current.next;
        }
        ListNode newHead = null;
        for (int j = size - 1; j >= 0; j--) {
            newHead = new ListNode(arr[arr.length-j-1], newHead);
        }

        return newHead;
    }
}

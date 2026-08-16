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
    public boolean isPalindrome(ListNode head) {
        int size = 0;
        ListNode pointer = head;
        ListNode pointer2 = head;
        while(pointer != null){
        
            pointer = pointer.next;

            size++;
        }
        int[] ll = new int[size];
        int i = 0;
        int j =0;
        // int k =1;
        while(pointer2 !=null){
            ll[i] = pointer2.val;
            pointer2 = pointer2.next;
            i++;
        }

        // while(head != null){
        for(int z=0; z<size; z++){
            if(ll[j] != ll[size-1]){
                return false;
            }
            if(ll[j]==ll[size-1]){
                j++;
                size--;
            }
        }
        return true;
    }
}
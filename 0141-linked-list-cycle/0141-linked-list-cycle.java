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
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp=head;
        ListNode remp=head;
        while(remp!=null && remp.next!=null){
            temp=temp.next;
            remp=remp.next.next;
            if(temp==remp){
                return true;
            }
        }
        return false;
        
    }
}
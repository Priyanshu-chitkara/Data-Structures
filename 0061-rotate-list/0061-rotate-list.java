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
    public int count(ListNode head){
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;

        }
        return count;
    }
    public ListNode rotate(ListNode head){
        ListNode temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        
        ListNode newHead=temp.next;
        temp.next=null;
        newHead.next=head;
        
        
      
        
          return newHead;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0){
            return head;
        }
        int n=count(head);
        if(k%n==0){
            return head;
        }
        k=k%n;
        while(k>0){

           head= rotate(head);
           k--;

        }
        return head;
        

    }
}
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
    public ListNode mid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
            

        }
        return prev;
    }
    public int pairSum(ListNode head) {
        
        
        ListNode mid=mid(head);
        ListNode rev=reverse(mid);
        ListNode t1=head;
        ListNode t2=rev;
        int ans=-1;
        
        while(t1!=null && t2!=null){
            int sum=t1.val+t2.val;
            
            ans=Math.max(sum,ans);
            t1=t1.next;
            t2=t2.next;

        }
        return ans;

        
    }
}
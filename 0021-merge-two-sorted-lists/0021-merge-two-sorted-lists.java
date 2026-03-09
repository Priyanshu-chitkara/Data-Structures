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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode dum=new ListNode(-1);
        ListNode dm=dum;
        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                dm.next=temp1;
                temp1=temp1.next;
                dm=dm.next;

            }else{
                dm.next=temp2;
                temp2=temp2.next;
                dm=dm.next;
            }

        }
        while(temp1!=null){
            dm.next=temp1;
            temp1=temp1.next;
            dm=dm.next;
        }
        while(temp2!=null){
            dm.next=temp2;
            temp2=temp2.next;
            dm=dm.next;
        }
        return dum.next;
        
    }
}
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
    public ListNode reverseKGroup(ListNode head, int k) {
        int c=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        if(c<k) return head;
        int i=0;
        ListNode cur=head;
        ListNode pre=null;
        ListNode next=null;
        while(i<k){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
            i++;
        }
        head.next=reverseKGroup(next,k);
        return pre;
    }
}